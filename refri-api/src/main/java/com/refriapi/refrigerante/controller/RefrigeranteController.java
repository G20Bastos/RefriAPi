package com.refriapi.refrigerante.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.refriapi.refrigerante.model.Refrigerante;
import com.refriapi.refrigerante.repository.RefrigeranteRepository;

@CrossOrigin
@RestController
@RequestMapping("/refrigerantes")
public class RefrigeranteController {
    
	@Autowired
	private RefrigeranteRepository refrigeranteRepository;
	
	
	@GetMapping
	public List<Refrigerante> listar() {
	return refrigeranteRepository.findAll();	
	
	}
	
	@GetMapping("/{id}")
	public Optional<Refrigerante> buscar(@PathVariable Long id) {
		
		
		
		return refrigeranteRepository.findById(id);	
		
		
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Refrigerante adicionar(@Valid @RequestBody Refrigerante refrigerante) {
		
		Optional<Refrigerante> refrigeranteMarcaLitragemExistente = refrigeranteRepository
				.findByMarcaAndLitragem(refrigerante.getMarca(), refrigerante.getLitragem());
		
		if (refrigeranteMarcaLitragemExistente.isPresent()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
					"Já existe um refrigerante da marca " +
			refrigerante.getMarca() + " com a litragem " +
			refrigerante.getLitragem() + " cadastrado!");
		}
		
		return refrigeranteRepository.save(refrigerante);
	}
}
