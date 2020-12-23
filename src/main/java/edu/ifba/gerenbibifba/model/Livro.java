package edu.ifba.gerenbibifba.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "livro")
@Getter
@Setter



public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name= "nome")
	private String name;
	
	@Column(name= "descricao")
	private String descricao;
	
	@Column(name= "quantitade")
	private Integer quantity;
	
	@Column(name= "referencia")
	private Integer referencia;
	
	@Column(name = "registration")
	private Date registration;
}
