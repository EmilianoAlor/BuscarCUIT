package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.CUIT;
import main.ControlCUIT;

class TestCUITComprobacion {

	@Test
	void test() {

		CUIT cuitPrueba = new CUIT("20-12345678-9");
		assertEquals(true,cuitPrueba.isInexistente());
		
		CUIT cuitPrueba2 = new CUIT("asdasdasdadsd");
		assertEquals(true,cuitPrueba2.isInexistente());
		

		CUIT cuitPrueba3 = new CUIT("20600293918");
		
		ControlCUIT Cont = new ControlCUIT();
		
//		Cont.gestionarCUIT(cuitPrueba3);
//		
//		assertEquals(false,cuitPrueba3.isInexistente());
//		assertEquals(true,cuitPrueba3.isExento());
	}


	

	@Test
	void cuitNegativo() {
	
		// tiene 11 caracteres y es negativo. es ERROR = true
		CUIT cuitPrueba = new CUIT("-4564567891");
		
		assertEquals(true, cuitPrueba.isErrorFormato());
		
	}

}
