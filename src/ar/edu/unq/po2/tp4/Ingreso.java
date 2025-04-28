package ar.edu.unq.po2.tp4;

public abstract class Ingreso {
	private int mes;
	private String concepto;
	private Double monto;
	
	protected Ingreso(int mes, String concepto, Double monto) {
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
	}
	
	private Ingreso() {
		
	}

	public int getMes() {
		return mes;
	}

	public String getConcepto() {
		return concepto;
	}

	public Double getMonto() {
		return monto;
	}
	
	abstract public Double getMontoImponible();

}
