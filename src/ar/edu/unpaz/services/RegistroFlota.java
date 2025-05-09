package ar.edu.unpaz.services;

import ar.edu.unpaz.model.Auto;
import ar.edu.unpaz.model.Colectivo;
import ar.edu.unpaz.model.Combi;
import ar.edu.unpaz.model.Trafic;

import java.util.ArrayList;

public class RegistroFlota {
	private static RegistroFlota instance = null;
	
	ArrayList<Auto> regAutos = new ArrayList<Auto>();
	ArrayList<Combi> regCombis = new ArrayList<Combi>();
	ArrayList<Trafic> regTrafics = new ArrayList<Trafic>();
	ArrayList<Colectivo> regColectivos = new ArrayList<Colectivo>();
	
	private RegistroFlota() {};
	
	public static RegistroFlota getInstance(){
		if (RegistroFlota.instance != null) {
			return RegistroFlota.instance;
		}
		
		RegistroFlota.instance = new RegistroFlota();	
		return RegistroFlota.instance;
	}
	
	public void addAuto(Auto auto) {
		
	}
}
