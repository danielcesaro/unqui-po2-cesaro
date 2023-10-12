package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuadradoTestCase {
	private Cuadrado cuadradoPrueba;

	@BeforeEach
	void setUp() throws Exception {
		final Point p1 = new Point(1,5);
		cuadradoPrueba = new Cuadrado(p1,5);
	}

	@Test
	void testArea() {
		int amount = cuadradoPrueba.area();
		assertEquals(amount, 25);
	}
	
	void testPerimetro() {
		int amount = cuadradoPrueba.perimetro();
		assertEquals(amount, 20);
	}

}