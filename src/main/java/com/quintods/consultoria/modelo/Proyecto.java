package com.quintods.consultoria.modelo;

import java.time.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Proyecto {
	@Id
	@GeneratedValue(generator="system-uuid")
	@Hidden
	@GenericGenerator(name="system-uuid",strategy="uuid")
	private String codigo;
	
	@Column(length=10)
	private String nombre;
	
	@TextArea
	private String descripcion;
	
	private LocalDate fechaInicio;
	
	private LocalDate fechaFin;
	
	@Column(length=10)
	private String estado;
	
	@ManyToOne
	(fetch=FetchType.LAZY,optional=true)
	@JoinColumn(name="id_cliente")
	@DescriptionsList
	Cliente cliente;

}
