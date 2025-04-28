package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public abstract class Empleado {
	private String 	  nombre;
	private String 	  direccion;
	private String 	  estadoCivil;
	private LocalDate fechaNacimiento;
	private float 	  sueldoBasico;
	
	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento,
			float sueldoBasico) {
		this.nombre 		 = nombre;
		this.direccion 		 = direccion;
		this.estadoCivil 	 = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico 	 = sueldoBasico;
	}

	public int edad() {
		return 0;
	}
	
	public abstract float sueldoBruto();
	
	public float retenciones() {
		return this.obraSocial() + this.aportesJubilatorios();
	}
	
	public float sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
	
	public abstract float obraSocial();
	
	public abstract float aportesJubilatorios();

	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public float getSueldoBasico() {
		return this.sueldoBasico;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

}
