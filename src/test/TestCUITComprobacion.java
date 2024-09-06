package test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import main.CUIT;
import main.ControlCUIT;
import main.GestorDatos;

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
	void procesarLote()
	{
		TreeSet<CUIT> listaCuit = new TreeSet<>();

		listaCuit.add(new CUIT("20569863214"));
		listaCuit.add(new CUIT("20571264628"));
		listaCuit.add(new CUIT("20570864224"));
		listaCuit.add(new CUIT("20600293918")); //ULTIMO. se fue de rango el contador.

		
		ControlCUIT cCuit = new ControlCUIT();
		cCuit.gestionarCUIT(listaCuit);
		
		for (CUIT cuit : listaCuit) {
			assertEquals(false,cuit.isInexistente());
		}
		
		CUIT noestaCUITFINAL = new CUIT("20600293918");
		
		GestorDatos.buscarCuit(noestaCUITFINAL);
		assertEquals(true,noestaCUITFINAL.isInexistente());
		
	}
	

	@Test
	void cuitNegativo() {
	
		// tiene 11 caracteres y es negativo. es ERROR = true
		CUIT cuitPrueba = new CUIT("-4564567891");
		
		assertEquals(true, cuitPrueba.isErrorFormato());
		
	}

}
