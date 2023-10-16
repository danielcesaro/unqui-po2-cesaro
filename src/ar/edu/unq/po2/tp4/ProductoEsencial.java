package ar.edu.unq.po2.tp4;

class ProductoEsencial extends Producto {
	public ProductoEsencial(String nom, double preBa) {
		nombre = nom;
		precioBase = preBa;
		precioFinal = precioBase * 0.9;
	}
}
