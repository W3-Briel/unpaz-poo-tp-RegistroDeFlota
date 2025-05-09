package ar.edu.unpaz.model;

public class Auto extends Vehiculos{
	private int cantPuertas;
	
	public Auto(String patente, String marca, String modelo, int añoFabricacion, int kilometraje,int cantPuertas) {
		super(patente, marca, modelo, añoFabricacion, kilometraje);
		
		this.cantPuertas = cantPuertas;
	}

	@Override
	public void mostrarInfo() {
		System.out.println(this.mostrarInfoGeneral() + ", cantidad de puertas: " + this.cantPuertas);
	}
	
}
