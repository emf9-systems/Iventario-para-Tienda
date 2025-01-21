package com.clases;

import java.util.ArrayList;

public class TiendaElectronica {
	
	private ArrayList<ProductoElectrodomestico> listaDeProductos = new ArrayList<ProductoElectrodomestico>();
	
	public void mostrarProductos() {
		System.out.println("Listado de productos: ");
		for(ProductoElectrodomestico p : listaDeProductos) {
			p.mostrarInformacion();
		}
	}
	
    public ProductoElectrodomestico buscarProducto(String nombre) {
        for (ProductoElectrodomestico p : listaDeProductos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Producto encontrado!");
                return p;
            }
        }
        return null;
    }
    
	public void agregarProducto(ProductoElectrodomestico producto) {
	    ProductoElectrodomestico productoExistente = buscarProducto(producto.getNombre());
	    if (productoExistente != null) {
	        productoExistente.setCantidadDisponible(
	            productoExistente.getCantidadDisponible() + producto.getCantidadDisponible()
	        );
	        System.out.println("Cantidad actualizada para el producto: " + producto.getNombre());
	    } else {
	        listaDeProductos.add(producto);
	        System.out.println("Producto agregado: " + producto.getNombre());
	    }
	}
	
    public void venderProducto(String nombre) {
        ProductoElectrodomestico producto = buscarProducto(nombre);
        if (producto != null) {
            if (producto.getCantidadDisponible() > 0) {
                producto.setCantidadDisponible(producto.getCantidadDisponible() - 1);
                System.out.println("Venta realizada: " + producto.getNombre());
            } else {
                System.out.println("Producto agotado: " + producto.getNombre());
            }
        }else {
        	System.out.println("No se encontro el producto");
        }
    }

}
