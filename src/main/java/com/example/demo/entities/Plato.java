//Paquetes:
package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


 @Document


public class Plato extends BaseEntity {

	// Atributos:
	
	private String denominacion;
	
	private int tiempoPreparacion;
	
	private String imagen;
	
	private float precioVenta;

	// Relaciones:

@DBRef
	private CategoriaPlato categoriaPlato;
@DBRef

	private List<DetallePlato> detallePlato = new ArrayList<DetallePlato>();

	// Constructor por defecto:
	public Plato() {
	}

	// Constructor Sobrecargado:
	public Plato(String denominacion, int tiempoPreparacion, String imagen, float precioVenta

			, ArrayList<DetallePlato> detallePlato

	) {

		this.denominacion = denominacion;
		this.tiempoPreparacion = tiempoPreparacion;
		this.imagen = imagen;
		this.precioVenta = precioVenta;

		this.detallePlato = detallePlato;
	}

	// Getters:
	public String getDenominacion() {
		return this.denominacion;
	}

	public int getTiempoPreparacion() {
		return this.tiempoPreparacion;
	}

	public String getImagen() {
		return this.imagen;
	}

	public float getPrecioVenta() {
		return this.precioVenta;
	}

	// Setters:
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public void setTiempoPreparacion(int tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	public void setCategoriaPlato(CategoriaPlato categoriaPlato) {
		this.categoriaPlato = categoriaPlato;
	}


	// Metodos:

	public void agregarDetallePlato(DetallePlato detallePlato) {
		this.detallePlato.add(detallePlato);
	}

	public void removerDetallePlato(DetallePlato detallePlato) {
		this.detallePlato.add(detallePlato);
	}

	public CategoriaPlato getCategoriaPlato() {
		return categoriaPlato;
	}

	public List<DetallePlato> getDetallePlato() {
		return detallePlato;
	}

	public void setDetallePlato(List<DetallePlato> detallePlato) {
		this.detallePlato = detallePlato;
	}

	
}
