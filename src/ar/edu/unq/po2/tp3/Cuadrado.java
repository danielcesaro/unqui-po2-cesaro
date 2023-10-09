package ar.edu.unq.po2.tp3;

public class Cuadrado {
	private Point esqSupIzq;
	private Point esqInfDer = new Point(esqSupIzq.getX()+this.tamanio, this.esqSupIzq.getY()+this.tamanio);
	private int tamanio;
	
	public Cuadrado (Point a, int tam) {
		esqSupIzq = a;
		tamanio= tam;
	}
	
	public int area() {
		return tamanio*tamanio;
	}
	
	public int perimetro() {
		return tamanio*4;
	}

}