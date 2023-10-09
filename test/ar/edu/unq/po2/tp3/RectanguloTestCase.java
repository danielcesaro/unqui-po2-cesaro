package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	private Rectangulo rectanguloPrueba;

	@BeforeEach
	void setUp() throws Exception {
		final Point p1 = new Point(1,5);
		final Point p2 = new Point(4,1);
		rectanguloPrueba = new Rectangulo(p1,p2);
		
	}

	@Test
	void testArea() {
		int amount = rectanguloPrueba.area();
		assertEquals(amount, 12);
	}
	
	void testPerimetro() {
		int amount = rectanguloPrueba.perimetro();
		assertEquals(amount, 14);
	}
	
	void testPosicion() {
		String amount = rectanguloPrueba.posicion();
		assertEquals(amount, "vertical");
	}

}
