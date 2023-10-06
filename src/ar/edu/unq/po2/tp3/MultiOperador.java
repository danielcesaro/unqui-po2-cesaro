package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class MultiOperador {
	List<Integer> listaEnteros = new ArrayList<Integer>();
	
	public int sumaDeTodos() {
		int totalSuma = 0;
		for (int entero:listaEnteros) {
			totalSuma += entero;
		}
		return totalSuma;
	}
	
	public int restaDeTodos() {
		int totalResta = 0;
		for (int entero:listaEnteros) {
			totalResta -= entero;
		}
		return totalResta;
	}
	
	public int productoDeTodos() {
		int totalProducto = 1;
		for (int entero:listaEnteros) {
			totalProducto *= entero;
		}
		return totalProducto;
	}	
	
	public void addValue(int valor) {
		listaEnteros.add(valor);
	}
}
