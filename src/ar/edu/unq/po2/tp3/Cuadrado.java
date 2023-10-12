package ar.edu.unq.po2.tp3;

public class Cuadrado {
	private Point esqSupIzq;
	private Point esqInfDer;
	private int tamanio;
	
	public Cuadrado (Point a, int tam) {
		esqSupIzq = a;
		tamanio= tam;
		esqInfDer = new Point(esqSupIzq.getX()+this.tamanio, this.esqSupIzq.getY()+this.tamanio);
	}
	
	public int area() {
		return tamanio*tamanio;
	}
	
	public int perimetro() {
		return tamanio*4;
	}

}