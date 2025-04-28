package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;

public class PlantaTemporaria extends Empleado {
	private LocalDate fechaFinPlantaTemp;
	private int 	  cantHorasExtras;
	
	public PlantaTemporaria(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento, float sueldoBasico,
							LocalDate fechaFinPlantaTemp, int cantHorasExtras) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.fechaFinPlantaTemp = fechaFinPlantaTemp;
		this.cantHorasExtras    = cantHorasExtras;
	}
	
	public int horasExtras() {
		return 40*this.cantHorasExtras;
	}

	@Override
	public float sueldoBruto() {
		return super.getSueldoBasico() + this.horasExtras();
	}

	@Override
	public float obraSocial() {
		return (float) (this.sueldoBruto()*0.1 + this.adicionalMayorA50());
	}

	private float adicionalMayorA50() {
		return (this.getEdad() > 49) ? 25 : 0;
	}

	private int getEdad() {
		Period periodo = Period.between(super.getFechaNacimiento(), LocalDate.now());
		return periodo.getYears();
	}

	@Override
	public float aportesJubilatorios() {
		return (float) (this.sueldoBruto()*0.1 + this.cantHorasExtras*5);
	}

}
