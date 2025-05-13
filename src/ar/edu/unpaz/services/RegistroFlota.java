package ar.edu.unpaz.services;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unpaz.model.Vehiculos;

public class RegistroFlota {
	private static RegistroFlota instance = null;
//	ArrayList<Auto> regAutos = new ArrayList<Auto>();
//	ArrayList<Combi> regCombis = new ArrayList<Combi>();
//	ArrayList<Trafic> regTrafics = new ArrayList<Trafic>();
//	ArrayList<Colectivo> regColectivos = new ArrayList<Colectivo>();
	
	private List<Vehiculos> regVehiculos = new ArrayList<>();
	
	private RegistroFlota() {};
	
	public void guardarVehiculo(Vehiculos vehiculo) {
		this.regVehiculos.add(vehiculo);
	}
	
	public static RegistroFlota getInstance(){
		if (RegistroFlota.instance != null) {
			return RegistroFlota.instance;
		}
		
		RegistroFlota.instance = new RegistroFlota();	
		return RegistroFlota.instance;
	}
	
}
