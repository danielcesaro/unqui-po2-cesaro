package ar.edu.unq.po2.tp3;

import java.time.*;

public class PersonaEquipo {
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private int edad; //en años
	
	public PersonaEquipo(String nom, String ape, LocalDate fecNac) {
		nombre			= nom;
		apellido	    = ape;
		fechaNacimiento = fecNac;
		edad 			= Period.between(fechaNacimiento, LocalDate.now()).getYears();
	}
	
	public String nombre() {
		return nombre;
	}
	
	public String apellido() {
		return apellido;
	}
	
	public LocalDate fecNac() {
		return fechaNacimiento;
	}
	
	public int edad() {
		return edad;
	}
}
