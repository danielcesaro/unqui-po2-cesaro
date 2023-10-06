package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultioperadorTestCase {
	private MultiOperador multiOperador;
	
	@BeforeEach
	
	public void setup() {
		multiOperador = new MultiOperador();
		
		multiOperador.addValue(3);
		multiOperador.addValue(3);
		multiOperador.addValue(3);
		multiOperador.addValue(3);
	}

/**
* Verifica que se sumen todos los números del Multioperador.
*/
@Test
public void testSum() {
	int amount = multiOperador.sumaDeTodos();
	assertEquals(amount, 12);
}

/**
* Verifica que se resten todos los números del Multioperador.
*/
@Test
public void testSubs() {
	int amount = multiOperador.restaDeTodos();
	assertEquals(amount, -12);
}

/**
* Verifica que se multipliquen todos los números del Multioperador.
*/
@Test
public void testMult() {
	int amount = multiOperador.productoDeTodos();
	assertEquals(amount, 81);
}

}
