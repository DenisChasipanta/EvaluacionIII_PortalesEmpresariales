package com.quintods.consultoria.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Tarea {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Hidden
	private int id;
	
	@Column(length=10)
	private String titulo;
	
	@TextArea
	private String descripcion;
	
	private LocalDate fechaVencimiento;
	
	private int preoridad;
	
	@Column(length=10)
	private String estado;
	
	@ManyToOne
	(fetch=FetchType.LAZY,optional=true)
	@JoinColumn(name="codigo_proyecto")
	@DescriptionsList
	Proyecto proyecto;
	
	@Embedded
	TiempoInvertido tiempoInvertido;

}
