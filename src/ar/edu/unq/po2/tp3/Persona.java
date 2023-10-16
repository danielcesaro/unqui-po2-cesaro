package ar.edu.unq.po2.tp3;

import java.time.*;

public class Persona {
	private String nombre;
	private LocalDate fechaNacimiento;
	private int edad; //en años
	
	public Persona(String nom, LocalDate fecNac) {
		nombre=nom;
		fechaNacimiento=fecNac;
		edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();
	}
	
	public String nombre() {
		return nombre;
	}
	
	public LocalDate fecNac() {
		return fechaNacimiento;
	}
	
	public int edad() {
		return edad;
	}
	
	public boolean esMenorQue(Persona persona) {
		return (persona.edad() > edad);
	}
}
