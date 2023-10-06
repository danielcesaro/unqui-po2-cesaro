package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	List<Integer> numeros = new ArrayList<Integer>();

	public int getEvenOcurrences() {
		int cantPares = 0;
		for (int numero : numeros) {
            if (numero % 2 == 0) {
            	cantPares++;
            }    	
        }
     return cantPares;
	}
	
	public int getOddOcurrences() {
		int cantImpares = 0;
		for (int numero : numeros) {
            if (numero % 2 != 0) {
            	cantImpares++;
            }    	
        }
     return cantImpares;
	}	

	public int getMultiplos(int n) {
		int cantMultiplos = 0;
		for (int numero : numeros) {
            if (numero % n == 0) {
            	cantMultiplos++;
            }    	
        }
     return cantMultiplos;
	}
	
	public void addNumber(int n) {
		numeros.add(n);
	}
	
	public int getElQueTieneMasPares(List<Integer> lista) {
		int elDeMasPares = lista.get(0);
		for (int i : lista) {
			if (this.cantPares(i) > this.cantPares(elDeMasPares) ) {
				elDeMasPares = i;
			}
		}
		return elDeMasPares;
	}
	
	private int cantPares(int n) {
		int pares = 0;
		while (n > 0) {
			int cifra = n % 10;
			if (cifra % 2 == 0) {
				pares++;
			}
			n /= 10;
		}
		return pares;
	}
	
	public int multiploMasAltoEntre(int x, int y) {
		int mulMasAlto = -1;
		for (int i=1; i>=1000; i++) {
			if (i%x == 0 && i%y == 0) {
				mulMasAlto = i;
			}
		}
		return mulMasAlto;
	}
}

