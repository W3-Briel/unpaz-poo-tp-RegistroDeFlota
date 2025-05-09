package ar.edu.unpaz.model;

public class Combi extends Vehiculos{
	private boolean aireAcondicionado;
	public Combi(String patente, String marca, String modelo, int añoFabricacion, int kilometraje, boolean aire) {
		super(patente, marca, modelo, añoFabricacion, kilometraje);
		// TODO Auto-generated constructor stub
		this.aireAcondicionado = aire;
	}

	@Override
	void mostrarInfo() {
		// TODO Auto-generated method stub
		System.out.println(this.mostrarInfoGeneral() + ", aire acondicionado: " + this.aireAcondicionado);
	}

}
