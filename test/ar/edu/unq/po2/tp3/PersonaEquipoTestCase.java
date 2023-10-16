package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaEquipoTestCase {

	private EquipoDeTrabajo equipoDePrueba;
	private PersonaEquipo personaPrueba1;
	private PersonaEquipo personaPrueba2;
	private PersonaEquipo personaPrueba3;
	private PersonaEquipo personaPrueba4;
	private LocalDate fecNac1;
	private LocalDate fecNac2;
	private LocalDate fecNac3;
	private LocalDate fecNac4;

	@BeforeEach
	void setUp() throws Exception {
		fecNac1 = LocalDate.of(2015, 3, 27);
		fecNac2 = LocalDate.of(2011, 1, 5);
		fecNac3 = LocalDate.of(1976, 8, 1);
		fecNac4 = LocalDate.of(1967, 11, 18);
		personaPrueba1 = new PersonaEquipo("Paco", "Rollo", fecNac1);
		personaPrueba2 = new PersonaEquipo("Peco", "Rallo", fecNac2);
		personaPrueba3 = new PersonaEquipo("Poco", "Rello", fecNac3);
		personaPrueba4 = new PersonaEquipo("Pico", "Rillo", fecNac4);
		equipoDePrueba = new EquipoDeTrabajo();
		equipoDePrueba.addPersona(personaPrueba1);
		equipoDePrueba.addPersona(personaPrueba2);
		equipoDePrueba.addPersona(personaPrueba3);
		equipoDePrueba.addPersona(personaPrueba4);
		
	}

	@Test
	void testSumaEdades() {
		assertEquals(equipoDePrueba.sumaDeEdades(), 122);
	}
	
	@Test
	void testPromedioEdad() {
		assertEquals(equipoDePrueba.promedioDeEdad(), 30,5);
	}
}
