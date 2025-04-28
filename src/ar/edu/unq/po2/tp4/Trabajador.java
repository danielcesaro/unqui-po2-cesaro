package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<Ingreso> ingresosPercibidos;
	
	public Trabajador() {
		this.ingresosPercibidos = new ArrayList<Ingreso>();
	}
	
	public void agregarIngreso(Ingreso ingreso) {
		ingresosPercibidos.add(ingreso);
	}

	public Double getTotalPercibido() {
		return this.ingresosPercibidos.stream().mapToDouble(i -> i.getMonto()).sum();
	}
	
	public Double getMontoImponible() {
		return this.ingresosPercibidos.stream().mapToDouble(i -> i.getMontoImponible()).sum();
	}
	
	public Double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02; 
	}
}
