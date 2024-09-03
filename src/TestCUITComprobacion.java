import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCUITComprobacion {

	@Test
	void test() {

		//ControlCUIT cControl = new ControlCUIT();

//		assertEquals("CUIT Inexistente en el listado.", cControl.GestionarCUIT("20-12345678-9"));
		CUIT cuitPrueba = new CUIT("20-12345678-9");
		assertEquals(true,cuitPrueba.isInexistente());
		
		CUIT cuitPrueba2 = new CUIT("asdasdasdadsd");
		assertEquals(true,cuitPrueba2.isInexistente());
		
		assertEquals("",cuitPrueba2);
//		assertEquals("CUIT Inexistente en el listado.", cControl.GestionarCUIT("20123456789"));
//
//		assertEquals("CUIT Invalido:206789", cControl.GestionarCUIT("206789"));
//		assertEquals("CUIT Invalido:20.12345678.9", cControl.GestionarCUIT("20.12345678.9"));
//		assertEquals("CUIT Invalido:asdasdasdadsd", cControl.GestionarCUIT("asdasdasdadsd"));
//		assertEquals("CUIT Invalido:Marta!!!!", cControl.GestionarCUIT("Marta!!!!"));
	}

	// 20569863214
	@Test
	void testBusquedaLineal() {
		//assertEquals("El CUIT:20569863214 Esta Exento del impuesto", gestorDatos.BuscarCuit("20569863214"));
	}

	@Test
	void cuitNegativo() {
	
		// tiene 11 caracteres y es negativo. es ERROR = true
		CUIT cuitPrueba = new CUIT("-4564567891");
		
		assertEquals(true, cuitPrueba.isErrorFormato());
		
		//assertEquals("1234567891", cuitPrueba.getCUIT());
		
	}

}
