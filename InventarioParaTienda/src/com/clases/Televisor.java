package com.clases;

public class Televisor extends ProductoElectrodomestico {
	
	private double tamanoTelevisorPulgadas;
	private double resolucionTelevisor;
	private String marcaTelevisor;
	private boolean smartTV;
	
	
	public Televisor(String nombre, double precio, int cantidadDisponible, double tamanoTelevisorPulgadas,
			double resolucionTelevisor, String marcaTelevisor, boolean smartTV) {
		super(nombre, precio, cantidadDisponible);
		this.tamanoTelevisorPulgadas = tamanoTelevisorPulgadas > 0 ? tamanoTelevisorPulgadas : 0;
		this.resolucionTelevisor = resolucionTelevisor > 0 ? resolucionTelevisor : 0;
		this.marcaTelevisor = marcaTelevisor;
		this.smartTV = smartTV;
	}
	
	
	
	public double getTamanoTelevisorPulgadas() {
		return tamanoTelevisorPulgadas;
	}



	public void setTamanoTelevisorPulgadas(double tamanoTelevisorPulgadas) {
		this.tamanoTelevisorPulgadas = tamanoTelevisorPulgadas > 0 ? tamanoTelevisorPulgadas : 0;
	}



	public double getResolucionTelevisor() {
		return resolucionTelevisor;
	}



	public void setResolucionTelevisor(double resolucionTelevisor) {
		this.resolucionTelevisor = resolucionTelevisor > 0 ? resolucionTelevisor : 0;
	}



	public String getMarcaTelevisor() {
		return marcaTelevisor;
	}



	public void setMarcaTelevisor(String marcaTelevisor) {
		this.marcaTelevisor = marcaTelevisor;
	}



	public boolean isSmartTV() {
		return smartTV;
	}



	public void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}



	@Override
	public void mostrarInformacion() {
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Modelo Televisor: "+this.getNombre());
		System.out.println("Marca del televisor: "+this.marcaTelevisor);
		System.out.println("Tamano y resolucion del televisor: "+this.tamanoTelevisorPulgadas+" pulgadas, "+this.resolucionTelevisor+"p");
		
		if(this.smartTV == true) {
			System.out.println("Smart TV: Si");
		}else {
			System.out.println("Smart TV: No");
		}
		
		System.out.println("Precio del televisor: $"+this.getPrecio());
		System.out.println("Cantidad en tienda: "+this.getCantidadDisponible());
		System.out.println("-------------------------------------------------------------------------------");

	}
	
	

}
