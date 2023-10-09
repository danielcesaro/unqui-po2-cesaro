package ar.edu.unq.po2.tp3;

public class Rectangulo {
	private Point esqSupIzq;
	private Point esqInfDer;
	
	public Rectangulo (Point a, Point b) {
		esqSupIzq = a;
		esqInfDer = b;
	}
	
	public int ancho() {
		return esqInfDer.getX() - esqSupIzq.getX();
	}
	
	public int alto() {
		return esqSupIzq.getY() - esqInfDer.getY();
	}
	
	public int area() {
		return this.ancho() * this.alto();
	}
	
	public int perimetro() {
		return 2*this.ancho() + 2*this.alto();
	}
	
	public String posicion() {
		if (this.ancho() > this.alto()) {
			return ("horizonal");
		} else {
			return ("vertical");
		}
	}
}
