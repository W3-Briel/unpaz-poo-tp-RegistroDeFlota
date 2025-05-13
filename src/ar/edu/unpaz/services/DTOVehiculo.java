package ar.edu.unpaz.services;

import java.util.HashMap;
import java.util.Map;
//import ar.edu.unpaz.model.Auto;
import ar.edu.unpaz.model.Vehiculos;

public class DTOVehiculo {
	private Map<String,Vehiculos> dicTipos = new HashMap<String, Vehiculos>();
	
	public DTOVehiculo() {
		
	}
	
	public void instanciarData(String data) {
		
	}
	private void guardarVehiculo(Vehiculos vehiculo) {
		RegistroFlota.getInstance().guardarVehiculo(vehiculo);
	}
}
