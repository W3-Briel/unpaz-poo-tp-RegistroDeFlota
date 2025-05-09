package ar.edu.unpaz.model;

public abstract class Vehiculos {
	private String patente;
	private String marca;
	private String modelo;
	private int añoFabricacion;
	private int kilometraje;
	
	public Vehiculos(String patente, String marca, String modelo, int añoFabricacion, int kilometraje){
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.añoFabricacion = añoFabricacion;
		this.kilometraje = kilometraje;
	}
	
	protected String mostrarInfoGeneral() {
		return String.format("patente: %s, marca: %s, modelo: %s, año de fabricacion: %d, kilometraje: %d",
				this.patente,this.marca,this.modelo,this.añoFabricacion,this.kilometraje); 
	};
	abstract void mostrarInfo();
}
