package ar.edu.unq.po2.tp4;

public class ProductoEsencial2 extends Producto {
	public ProductoEsencial2(String nom, double preBa, double desc) {
		nombre = nom;
		precioBase = preBa;
		precioFinal = precioBase * (1-desc/100);
	}
}
