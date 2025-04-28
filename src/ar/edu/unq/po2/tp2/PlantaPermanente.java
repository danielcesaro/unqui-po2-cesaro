package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class PlantaPermanente extends Empleado {
	private int cantidadHijos;
	private int antiguedad;
	
	public PlantaPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento, float sueldoBasico,
							int cantidadHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.cantidadHijos = cantidadHijos;
		this.antiguedad	   = antiguedad;
	}
	
	public float salarioFamiliar() {
		return this.asignacionPorHijo() + this.asignacionPorConyuge();
	}
	
	public float asignacionPorHijo() {
		return 150*this.cantidadHijos;
	}
	
	public float asignacionPorConyuge() {
		return (this.esCasado()) ? 100 : 0;
	}
	
	private Boolean esCasado() {
		return super.getEstadoCivil().equals("Casado");
	}
	
	public float pagoAntiguedad() {
		return 50*this.antiguedad;
	}

	@Override
	public float sueldoBruto() {
		return super.getSueldoBasico() + this.salarioFamiliar();
	}

	@Override
	public float obraSocial() {
		return (float) (this.sueldoBruto()*0.1 + 20*this.cantidadHijos);
	}

	@Override
	public float aportesJubilatorios() {
		return (float) (this.sueldoBruto()*0.15);
	}

}
