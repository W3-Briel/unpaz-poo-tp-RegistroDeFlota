package ar.edu.unpaz.model;

public class Colectivo extends Vehiculos{
	private int cantPasajeros;
	
	public Colectivo(String patente, String marca, String modelo, int añoFabricacion, int kilometraje, int cantPasajeros) {
		super(patente, marca, modelo, añoFabricacion, kilometraje);
		// TODO Auto-generated constructor stub
		this.cantPasajeros = cantPasajeros;
	}

	@Override
	public void mostrarInfo() {
		System.out.println(this.mostrarInfoGeneral() + ", cantidad de pasajeros: " + this.cantPasajeros);
	}

}
