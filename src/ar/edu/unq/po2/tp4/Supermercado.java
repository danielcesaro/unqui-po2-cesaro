package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();
	
	public int cantidadProductos() {
		return productos.size();
	}
	
	public float sumaDePrecios() {
		float sumaPrecios = 0;
		for (int i=0; i<productos.size(); i++) {
			sumaPrecios += productos.get(i).getPrecioFinal();
		}
		return sumaPrecios;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public List<Producto> getProductos() {
		return productos;
	}
	
	public void addProducto(Producto p) {
		productos.add(p);
	}
}
