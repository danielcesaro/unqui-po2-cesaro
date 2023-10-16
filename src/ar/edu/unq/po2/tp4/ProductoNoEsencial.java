package ar.edu.unq.po2.tp4;

public class ProductoNoEsencial extends Producto {
	public ProductoNoEsencial(String nom, double preBa) {
		nombre = nom;
		precioBase = preBa;
		precioFinal = precioBase;
	}
}
