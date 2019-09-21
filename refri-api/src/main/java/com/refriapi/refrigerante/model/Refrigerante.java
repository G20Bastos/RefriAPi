package com.refriapi.refrigerante.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
public class Refrigerante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@Size(max = 30)
	@Column(name= "marca")
	private String marca;
	
	@NotEmpty
	@Size(max = 30)
	@Column(name= "tipo")
	private String tipo;
	
	@NotEmpty
	@Size(max = 30)
	@Column(name= "sabor")
	private String sabor;
	
	@NotEmpty
	@Size(max = 10)
	@Column(name= "litragem")
	private String litragem;
	
	@Min(0)
	@Column(name= "valor")
	private BigDecimal valor;
	
	@Column(name= "quantidade")
	private int qtdeEstoque;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getLitragem() {
		return litragem;
	}
	public void setLitragem(String litragem) {
		this.litragem = litragem;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public int getQtdeEstoque() {
		return qtdeEstoque;
	}
	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Refrigerante other = (Refrigerante) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	

}
