package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {
	private Persona personaPrueba1;
	private Persona personaPrueba2;
	private LocalDate fecNac1;
	private LocalDate fecNac2;

	@BeforeEach
	void setUp() throws Exception {
		fecNac1 = LocalDate.of(2015, 3, 27);
		fecNac2 = LocalDate.of(2011, 1, 5);
		personaPrueba1 = new Persona("Paco", fecNac1);
		personaPrueba2 = new Persona("Poca", fecNac2);
	}

	@Test
	void testEdad() {
		int amount1 = personaPrueba1.edad();
		int amount2 = personaPrueba2.edad();
		assertEquals(amount1, 8);
		assertEquals(amount2, 12);
	}
	
	void testMenorQue() {
		boolean esMenor = personaPrueba1.esMenorQue(personaPrueba2);
		assertEquals(esMenor, true);
	}
	
}