//Paquetes:
package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


 @Document


public class DetallePlato extends BaseEntity {

	// Atributos:
	
	private int cantidad;

	// Relaciones:

@DBRef
	private Articulo articulo;

@DBRef
	private MedidaPlato medidaPlato;

	// Constructor por defecto:
	public DetallePlato() {
	}

	// Constructor Sobrecargado:
	public DetallePlato(int cantidad

	) {

		this.cantidad = cantidad;

	}

	// Getters:
	public int getCantidad() {
		return this.cantidad;
	}

	

	// Setters:
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public void setMedidaPlato(MedidaPlato medidaPlato) {
		this.medidaPlato = medidaPlato;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public MedidaPlato getMedidaPlato() {
		return medidaPlato;
	}
	
	
	// Metodos:

}
