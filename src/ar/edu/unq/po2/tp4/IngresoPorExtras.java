package ar.edu.unq.po2.tp4;

public class IngresoPorExtras extends Ingreso {
	private int cantidadHoras;

	public IngresoPorExtras(int mes, String concepto, Double monto, int cantidadHoras) {
		super(mes, concepto, monto);
		this.cantidadHoras = cantidadHoras;
	}

	@Override
	public Double getMontoImponible() {
		return 0.0;
	}

}
