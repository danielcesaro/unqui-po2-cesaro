package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {
	
	Trabajador trabajador;
	IngresoRegular ingReg1;
	IngresoRegular ingReg2;
	IngresoPorExtras ingExt1;

	@BeforeEach
	void setUp() throws Exception {
		trabajador = new Trabajador();
		ingReg1 = new IngresoRegular(1, "Haberes enero", 100000.00);
		ingReg2 = new IngresoRegular(2, "Haberes febrero", 100000.00);
		ingExt1 = new IngresoPorExtras(2,"Extras febrero", 20000.00, 2);
		trabajador.agregarIngreso(ingReg1);
		trabajador.agregarIngreso(ingReg2);
		trabajador.agregarIngreso(ingExt1);
	}

	@Test
	void testConstructor() {
		assertNotNull(trabajador);
	}
	
	@Test
	void testGetTotalPercibido() {
		assertEquals(220000.00, trabajador.getTotalPercibido());
	}

	@Test
	void testGetImpuestoAPagar() {
		assertEquals(4000.00, trabajador.getImpuestoAPagar());
	}
	
	
}
