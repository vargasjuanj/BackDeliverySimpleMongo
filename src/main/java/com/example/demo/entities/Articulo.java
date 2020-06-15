//Paquetes:
package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


 @Document


public class Articulo extends BaseEntity {

	// Atributos:
	
	private String denominacion;

	
	private String descripcion;
	
	
	private int stockMin;
	
	private int stockMax;
	
	private int stockActual;
	
	private boolean esInsumo;
	
	private String imagen;
	
	private float precioCompra;
	
	private float precioVenta;

@DBRef
	private CategoriaArticulo categoriaArticulo;
	
@DBRef
	private MedidaArticulo medidaArticulo;

	// Relaciones:

	// Constructor por defecto:
	public Articulo() {
	}
	


	// Constructor Sobrecargado:

	// Getters:
	public String getDenominacion() {
		return this.denominacion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public int getStockMin() {
		return this.stockMin;
	}

	public int getStockMax() {
		return this.stockMax;
	}

	public int getStockActual() {
		return this.stockActual;
	}

	public boolean getEsInsumo() {
		return this.esInsumo;
	}

	public String getImagen() {
		return this.imagen;
	}

	public float getPrecioCompra() {
		return this.precioCompra;
	}

	public float getPrecioVenta() {
		return this.precioVenta;
	}

	

	// Setters:
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setStockMin(int stockMin) {
		this.stockMin = stockMin;
	}

	public void setStockMax(int stockMax) {
		this.stockMax = stockMax;
	}

	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}

	public void setEsInsumo(boolean esInsumo) {
		this.esInsumo = esInsumo;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	public void setCategoriaArticulo(CategoriaArticulo categoriaArticulo) {
		this.categoriaArticulo = categoriaArticulo;
	}

	public void setMedidaArticulo(MedidaArticulo medidaArticulo) {
		this.medidaArticulo = medidaArticulo;
	}

	public MedidaArticulo getMedidaArticulo() {
		return medidaArticulo;
	}

	public CategoriaArticulo getCategoriaArticulo() {
		return categoriaArticulo;
	}


	// Metodos:

}
