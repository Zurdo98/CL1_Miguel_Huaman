package org.cibertec.edu.pe.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	private String IdProducto;
	private String Descripcion;
	private String PrecioUnidad;
	private int Stock;
	private char Estado;
	
	
	
	public Producto() {
	}


	public Producto(String idProducto, String descripcion, String precioUnidad, int stock, char estado) {
	
		IdProducto = idProducto;
		Descripcion = descripcion;
		PrecioUnidad = precioUnidad;
		Stock = stock;
		Estado = estado;
	}


	public String getIdProducto() {
		return IdProducto;
	}


	public void setIdProducto(String idProducto) {
		IdProducto = idProducto;
	}


	public String getDescripcion() {
		return Descripcion;
	}


	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}


	public String getPrecioUnidad() {
		return PrecioUnidad;
	}


	public void setPrecioUnidad(String precioUnidad) {
		PrecioUnidad = precioUnidad;
	}


	public int getStock() {
		return Stock;
	}


	public void setStock(int stock) {
		Stock = stock;
	}


	public char getEstado() {
		return Estado;
	}


	public void setEstado(char estado) {
		Estado = estado;
	}
	
	
	
	
	

}
