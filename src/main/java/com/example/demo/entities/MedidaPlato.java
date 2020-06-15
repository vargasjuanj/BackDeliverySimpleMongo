//Paquetes:
package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

 @Document


public class MedidaPlato extends BaseEntity {

	// Atributos:
	
	private String denominacion;

	// Relaciones:

	// Constructor por defecto:
	public MedidaPlato() {
	}

	// Constructor Sobrecargado:
	public MedidaPlato(String denominacion

	) {

		this.denominacion = denominacion;

	}

	// Getters:
	public String getDenominacion() {
		return this.denominacion;
	}

	// Setters:
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}


	
	// Metodos:

}
