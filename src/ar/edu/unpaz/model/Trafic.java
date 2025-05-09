package ar.edu.unpaz.model;

public class Trafic extends Vehiculos{
	private boolean espacioEsquipaje;
	public Trafic(String patente, String marca, String modelo, int añoFabricacion, int kilometraje, boolean espacioEquipaje) {
		super(patente, marca, modelo, añoFabricacion, kilometraje);
		// TODO Auto-generated constructor stub
		this.espacioEsquipaje = espacioEquipaje;
	}

	@Override
	void mostrarInfo() {
		// TODO Auto-generated method stub
		System.out.println(this.mostrarInfoGeneral() + ", espacio de equipaje: " + this.espacioEsquipaje);
	}
}
