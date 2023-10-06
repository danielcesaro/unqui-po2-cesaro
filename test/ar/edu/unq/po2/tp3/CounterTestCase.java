package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {

	private Counter counter;
	// Crea un escenario de test básico, que consiste en un contador con 10 enteros

	@BeforeEach

	public void setUp() throws Exception {
	//Se crea el contador
	counter = new Counter();
	//Se agregan los numeros. Un solo par y nueve impares
	counter.addNumber(1);
	counter.addNumber(3);
	counter.addNumber(5);
	counter.addNumber(7);
	counter.addNumber(9);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(4);
	}
	/**
	* Verifica la cantidad de pares
	*/
	@Test
	public void testEvenNumbers() {
		int amount = counter.getEvenOcurrences();
		assertEquals(amount, 1);
	}

	/**
	* Verifica la cantidad de impares
	*/
	@Test	
	public void testOddNumbers() {
		int amount = counter.getOddOcurrences();
		assertEquals(amount, 9);
	}
	
	/**
	* Verifica la cantidad de Multiplos
	*/
	@Test
	public void testMultiplos() {
		int amount = counter.getMultiplos(3);
		assertEquals(amount, 2);
	}
	
	/**
	* Verifica el número que tiene más cifras pares
	*/
	@Test
	public void testElDeMasPares() {
		List<Integer> listaPrueba = new ArrayList<Integer>();
		listaPrueba.add(156146);
		listaPrueba.add(851156);
		listaPrueba.add(415652);
		listaPrueba.add(454123);
		listaPrueba.add(488461);
		int amount = counter.getElQueTieneMasPares(listaPrueba);
		assertEquals(amount, 488461);
	}
	
	/**
	* Verifica el múltiplo más alto.
	*/
	@Test
	public void testMultiploMasAlto() {
		int amount = counter.multiploMasAltoEntre(14, 9);
		assertEquals(amount, -1);
	}
}
