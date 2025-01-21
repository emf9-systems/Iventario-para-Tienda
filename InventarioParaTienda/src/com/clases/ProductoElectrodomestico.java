package com.clases;

public class ProductoElectrodomestico {
	
	private String nombre;
	private double precio;
	private int cantidadDisponible;
	
	
	public ProductoElectrodomestico(String nombre, double precio, int cantidadDisponible) {
		this.nombre = nombre;
		this.precio = precio > 0 ? precio : 0;
		this.cantidadDisponible = cantidadDisponible > 0 ? cantidadDisponible : 0;
	}


	public ProductoElectrodomestico(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadDisponible = 0;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
        this.precio = precio > 0 ? precio : this.precio;
	}


	public int getCantidadDisponible() {
		return cantidadDisponible;
	}


	public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible >= 0 ? cantidadDisponible : this.cantidadDisponible;
	}
	
	public void mostrarInformacion() {
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Nombre del producto: "+this.nombre);
		System.out.println("Precio del producto: $"+this.precio);
		System.out.println("Cantidad disponible: "+this.cantidadDisponible);
		System.out.println("-------------------------------------------------------------------------------");
	}
	
}
