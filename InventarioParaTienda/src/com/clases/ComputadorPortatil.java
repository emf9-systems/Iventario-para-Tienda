package com.clases;

public class ComputadorPortatil extends ProductoElectrodomestico{
	
	private String marca;
	private String procesador;
	private String tarjetaGrafica;
	private boolean gpuDedicada;
	private double memoriaRam;
	private double almacenamiento;
	private String tipoDeAlmacenamiento;
	private String sistemaOperativo;
	private double resolucionPantalla;
	private double tamanoPantalla;
	private double tasaDeRefresco;
	
	public ComputadorPortatil(String nombre, double precio, int cantidadDisponible, String marca, String procesador,
			String tarjetaGrafica, boolean gpuDedicada, double memoriaRam, double almacenamiento,
			String tipoDeAlmacenamiento, String sistemaOperativo, double resolucionPantalla, double tamanoPantalla,double tasaDeRefresco) {
		super(nombre, precio, cantidadDisponible);
		this.marca = marca;
		this.procesador = procesador;
		this.tarjetaGrafica = tarjetaGrafica;
		this.gpuDedicada = gpuDedicada;
		this.memoriaRam = memoriaRam > 0 ? memoriaRam : 0;
		this.almacenamiento = almacenamiento > 0 ? almacenamiento : 0;
		this.tipoDeAlmacenamiento = tipoDeAlmacenamiento;
		this.sistemaOperativo = sistemaOperativo;
		this.resolucionPantalla = resolucionPantalla > 0 ? resolucionPantalla : 0;
		this.tamanoPantalla = tamanoPantalla > 0 ? tamanoPantalla : 0;
		this.tasaDeRefresco = tasaDeRefresco > 0 ? tasaDeRefresco : 0;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getTarjetaGrafica() {
		return tarjetaGrafica;
	}

	public void setTarjetaGrafica(String tarjetaGrafica) {
		this.tarjetaGrafica = tarjetaGrafica;
	}

	public boolean isGpuDedicada() {
		return gpuDedicada;
	}

	public void setGpuDedicada(boolean gpuDedicada) {
		this.gpuDedicada = gpuDedicada;
	}

	public double getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(double memoriaRam) {
		this.memoriaRam = memoriaRam > 0 ? memoriaRam : 0;
	}

	public double getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(double almacenamiento) {
		this.almacenamiento = almacenamiento > 0 ? almacenamiento : 0;
	}

	public String getTipoDeAlmacenamiento() {
		return tipoDeAlmacenamiento;
	}

	public void setTipoDeAlmacenamiento(String tipoDeAlmacenamiento) {
		this.tipoDeAlmacenamiento = tipoDeAlmacenamiento;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public double getResolucionPantalla() {
		return resolucionPantalla;
	}

	public void setResolucionPantalla(double resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla > 0 ? resolucionPantalla : 0;
	}

	public double getTamanoPantalla() {
		return tamanoPantalla;
	}

	public void setTamanoPantalla(double tamanoPantalla) {
		this.tamanoPantalla = tamanoPantalla > 0 ? tamanoPantalla : 0;
	}
	
	public double getTasaDeRefresco() {
		return tasaDeRefresco;
	}

	public void setTasaDeRefresco(double tasaDeRefresco) {
		this.tasaDeRefresco = tasaDeRefresco > 0 ? tasaDeRefresco : 0;
	}
	
	@Override
	public void mostrarInformacion() {
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Modelo del Portatil: "+this.getNombre());
		System.out.println("Marca del Portatil: "+this.marca);
		System.out.println("Procesador: "+this.procesador);
		System.out.println("Tarjeta Grafica: "+this.tarjetaGrafica);
		
		if(this.gpuDedicada == true) {
			System.out.println("GPU dedicada: Si");
		}else {
			System.out.println("GPU dedicada: No");
		}
		
		System.out.println("Memoria RAM: "+this.memoriaRam+" GB");
		
		double almacenamientoAMostrar = this.almacenamiento;
		if (almacenamientoAMostrar >= 1000) {
		    almacenamientoAMostrar /= 1000;
		    System.out.println("Espacio de almacenamiento y tipo de almacenamiento: " + almacenamientoAMostrar + "TB, " + this.tipoDeAlmacenamiento);
		} else {
		    System.out.println("Espacio de almacenamiento y tipo de almacenamiento: " + almacenamientoAMostrar + "GB, " + this.tipoDeAlmacenamiento);
		}
		
		System.out.println("SO: "+this.sistemaOperativo);
		System.out.println("Caracteristicas de la pantalla: "+"\nTamano: "+this.tamanoPantalla+" pulgadas"+"\nResolucion: "+this.resolucionPantalla+"p"+"\nTasa de refresco: "+this.tasaDeRefresco+" Hz");
		System.out.println("Precio del Portatil: $"+this.getPrecio());
		System.out.println("Cantidad en tienda: "+this.getCantidadDisponible());
		System.out.println("-------------------------------------------------------------------------------");


	}
	
	
	
	
}
