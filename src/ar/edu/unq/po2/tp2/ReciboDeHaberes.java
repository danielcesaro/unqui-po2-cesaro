package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReciboDeHaberes {
	private String 	   nombreEmpleado;
	private String 	   direccionEmpleado;
	private LocalDate  fechaDeEmision;
	private float 	   sueldoBrutoEmpleado;
	private float	   sueldoNetoEmpleado;
	private List<Item> items;
	
	public ReciboDeHaberes(String nombreEmpleado, String direccionEmpleado, float sueldoBrutoEmpleado, float sueldoNetoEmpleado) {
		this.nombreEmpleado 	 = nombreEmpleado;
		this.direccionEmpleado 	 = direccionEmpleado;
		this.fechaDeEmision 	 = LocalDate.now();
		this.sueldoBrutoEmpleado = sueldoBrutoEmpleado;
		this.sueldoNetoEmpleado  = sueldoNetoEmpleado;
		this.items 				 = new ArrayList<Item>();
	}

}
