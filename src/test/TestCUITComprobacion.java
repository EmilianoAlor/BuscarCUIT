package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.CUIT;

class TestCUITComprobacion {

	@Test
	void test() {

		CUIT cuitPrueba = new CUIT("20-12345678-9");
		assertEquals(true,cuitPrueba.isInexistente());
		
		CUIT cuitPrueba2 = new CUIT("asdasdasdadsd");
		assertEquals(true,cuitPrueba2.isInexistente());
		
		assertEquals("",cuitPrueba2);

	}


	

	@Test
	void cuitNegativo() {
	
		// tiene 11 caracteres y es negativo. es ERROR = true
		CUIT cuitPrueba = new CUIT("-4564567891");
		
		assertEquals(true, cuitPrueba.isErrorFormato());
		
	}

}
