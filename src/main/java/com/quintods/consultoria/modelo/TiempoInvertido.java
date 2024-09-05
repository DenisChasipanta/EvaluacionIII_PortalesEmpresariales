package com.quintods.consultoria.modelo;

import java.time.*;

import javax.persistence.*;

import lombok.*;

@Embeddable
@Getter
@Setter
public class TiempoInvertido {
	private LocalDate fecha;	
	private int horasTrabajadas;

}
