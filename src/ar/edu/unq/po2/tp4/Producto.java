package ar.edu.unq.po2.tp4;

abstract class Producto {
	protected String nombre;
	protected double precioBase;
	private Boolean esCuidado;
	protected double precioFinal;
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public Boolean getCuidado() {
		return esCuidado;
	}
	
	public double getPrecioFinal() {
		return precioFinal;
	}
	
	public void hacerCuidado() {
		esCuidado = true;
	}
	
	public void deshacerCuidado() {
		esCuidado = false;
	}
}
