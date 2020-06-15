//Paquetes:
package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


 @Document


public class CategoriaPlato extends BaseEntity {

	// Atributos:
	
	private String denominacion;
	
	private String descripcion;

	// Relaciones:
@DBRef
	private List<CategoriaPlato> categoriaPlato = new ArrayList<CategoriaPlato>();

	// Constructor por defecto:
	public CategoriaPlato() {
	}

	// Constructor Sobrecargado:
	public CategoriaPlato(String denominacion, String descripcion

	) {

		this.denominacion = denominacion;
		this.descripcion = descripcion;

	}

	// Getters:
	public String getDenominacion() {
		return this.denominacion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}


	// Setters:
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	// Metodos:

	public void agregarCategoriaPlato(CategoriaPlato categoriaPlato) {
		this.categoriaPlato.add(categoriaPlato);
	}

	public void removerCategoriaPlato(CategoriaPlato categoriaPlato) {
		this.categoriaPlato.add(categoriaPlato);
	}

	public List<CategoriaPlato> getCategoriaPlato() {
		return categoriaPlato;
	}

	public void setCategoriaPlato(List<CategoriaPlato> categoriaPlato) {
		this.categoriaPlato = categoriaPlato;
	}



}
