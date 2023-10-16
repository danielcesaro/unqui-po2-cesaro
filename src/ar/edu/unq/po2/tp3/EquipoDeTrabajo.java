package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	private String nombre;
	List<PersonaEquipo> integrantes = new ArrayList<PersonaEquipo>(); 
	
	public String nombre() {
		return nombre;
	}
	
	public int sumaDeEdades() {
		int sumaEdades = 0;
		for (int i=0; i<integrantes.size(); i++) {
			sumaEdades += integrantes.get(i).edad();
		}
		return sumaEdades;
	}
	
	public float promedioDeEdad() {
		return this.sumaDeEdades() / integrantes.size(); 
	}
	
	public void addPersona(PersonaEquipo p) {
		integrantes.add(p);
	}
}
