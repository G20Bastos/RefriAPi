package com.refriapi.refrigerante.repository;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.refriapi.refrigerante.model.Refrigerante;

public interface RefrigeranteRepository extends JpaRepository<Refrigerante, Long>{
	
	Optional<Refrigerante> findByMarca(String marca);
	Optional<Refrigerante> findByLitragem(String litragem);
	Optional<Refrigerante> findByValor(BigDecimal valor);
	Optional<Refrigerante> findByQtdeEstoque(int qtdeEstoque);
	Optional<Refrigerante> findByMarcaAndLitragem(String marca, String litragem);

}
