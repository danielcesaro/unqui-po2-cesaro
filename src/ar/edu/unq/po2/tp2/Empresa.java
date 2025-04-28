package ar.edu.unq.po2.tp2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String 		   		  nombre;
	private int 				  cuit;
	private List<Empleado>		  empleados;
	private List<ReciboDeHaberes> recibos;
	
	public Empresa(String nombre, int cuit) {
		this.nombre = nombre;
		this.cuit   = cuit;
		this.empleados = new ArrayList<Empleado>();
		this.recibos   = new ArrayList<ReciboDeHaberes>();
	}
	
	public float totalSueldosNetos() {
		return 0;
	}
	
	public float totalSueldosBrutos() {
		return 0;
	}
	
	public float totalRetenciones() {
		return 0;
	}
	
	public void liquidacionDeSueldos() {
		
	}

}
