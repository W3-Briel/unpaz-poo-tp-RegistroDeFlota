package ar.edu.unpaz.creadores;

import java.util.HashMap;
//import java.util.List;
import java.util.Map;

import ar.edu.unpaz.model.Trafic;

public class CreadorTrafic {
	public CreadorTrafic() {}
	
	public static Map<String, Object> parser(String data) {
	    String[] splitedData = data.split(",");
	    
	    // Verificar si el array tiene el número esperado de elementos
	    if (splitedData.length != 6) {
	        throw new IllegalArgumentException("El formato de datos es incorrecto.");
	    }
	    
	    Map<String, Object> traficData = new HashMap<>();
	    
	    // Procesar los datos
	    traficData.put("patente", splitedData[0]);
	    traficData.put("marca", splitedData[1]);
	    traficData.put("modelo", splitedData[2]);
	    try {
	        traficData.put("anio", Integer.parseInt(splitedData[3])); // Convertir año a int
	        traficData.put("km", Integer.parseInt(splitedData[4]));   // Convertir kilometraje a int
	        traficData.put("equipaje", Boolean.parseBoolean(splitedData[5]));  // Convertir a booleano
	    } catch (NumberFormatException e) {
	        throw new IllegalArgumentException("Error al convertir los datos numéricos.", e);
	    }
	    
	    return traficData;
	}

	public static Trafic crear(String data) {
	    Map<String, Object> t = parser(data);
	    
	    // Obtener los valores del mapa de manera segura
	    String patente = (String) t.get("patente");
	    String marca = (String) t.get("marca");
	    String modelo = (String) t.get("modelo");
	    int anio = (int) t.get("anio");
	    int km = (int) t.get("km");
	    boolean equipaje = (boolean) t.get("equipaje");
	    
	    // Crear el objeto Trafic con los valores obtenidos
	    return new Trafic(patente, marca, modelo, anio, km, equipaje);
	}
}
