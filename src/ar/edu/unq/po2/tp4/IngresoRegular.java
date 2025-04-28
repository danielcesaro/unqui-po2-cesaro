package ar.edu.unq.po2.tp4;

public class IngresoRegular extends Ingreso {

	public IngresoRegular(int mes, String concepto, Double monto) {
		super(mes, concepto, monto);
	}

	@Override
	public Double getMontoImponible() {
		return this.getMonto();
	}

}
