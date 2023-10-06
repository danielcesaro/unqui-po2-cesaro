package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {

	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	* Verifica que los constructores devuelvan lo esperado.*/
	@Test
	void testConstructores() {
		Point puntoEjemplo = new Point(2,3);
		Point puntoInicial = new Point();
		assertEquals(puntoEjemplo.getX(), 2);
		assertEquals(puntoEjemplo.getY(), 3);
		assertEquals(puntoInicial.getX(), 0);
		assertEquals(puntoInicial.getY(), 0);
	}

	/**
	* Verifica que un punto se mueva a la posición dada.*/
	@Test
	void testMovimiento() {
		Point puntoEjemplo = new Point(2,3);
		puntoEjemplo.moveToPoint(5, 8);
		assertEquals(puntoEjemplo.getX(), 5);
		assertEquals(puntoEjemplo.getY(), 8);
	}

	/**
	* Verifica que un punto se sume con otro punto dado.*/
	@Test
	void testSuma() {
		Point puntoEjemplo = new Point(2,3);
		Point otroPunto = new Point(4,6);
		Point nuevoPunto = puntoEjemplo.sumWithPoint(otroPunto);
		assertEquals(nuevoPunto.getX(), 6);
		assertEquals(nuevoPunto.getY(), 9);
	}	
	
}
