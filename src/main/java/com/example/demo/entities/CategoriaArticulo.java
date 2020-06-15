//Paquetes:
package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

 @Document

public class CategoriaArticulo extends BaseEntity {

	// Atributos:
	
	private String denominacion;
	
	private String descripcion;

	// Relaciones:

	
@DBRef
	private List<CategoriaArticulo> categoriaArticulo = new ArrayList<CategoriaArticulo>();

	// Constructor por defecto:
	public CategoriaArticulo(
	
	) {
	}

	// Constructor Sobrecargado:
	public CategoriaArticulo(String denominacion, String descripcion

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

	public List<CategoriaArticulo> getCategoriaArticulo() {
		return this.categoriaArticulo;
	}

	// Setters:
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	// Metodos:

	public void agregarCategoriaArticulo(CategoriaArticulo categoriaArticulo) {
		this.categoriaArticulo.add(categoriaArticulo);
	}

	public void removerCategoriaArticulo(CategoriaArticulo categoriaArticulo) {
		this.categoriaArticulo.add(categoriaArticulo);
	}

	public void setCategoriaArticulo(List<CategoriaArticulo> categoriaArticulo) {
		this.categoriaArticulo = categoriaArticulo;
	}


	
}
