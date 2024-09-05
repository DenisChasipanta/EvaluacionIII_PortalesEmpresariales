package com.quintods.consultoria.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Hidden
	private int id;
	
	@Column(length=10)
	private String nombre;
	
	@Column(length=10)
	private String apellido;
	
	private String email;
	
	@Embedded
	Direccion direccion;
}
