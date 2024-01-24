package junitlab;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubscripcionTest {

	@Test
	public void testprecioPorMes() {
		double esperado=100;
		Subscripcion s = new Subscripcion(200,2) ; 
		double resultado = s.precioPorMes();
		assertEquals(esperado, resultado,0) ;
	}

	@Test
	public void testprecioPorMes2() {
		double esperado=67.666666666666667;
		Subscripcion s = new Subscripcion(200,3) ; 
		double resultado= s.precioPorMes();
		assertEquals(esperado, resultado, 0) ;
	}
	
	@Test
	public void testprecioPorMes3() {
		double esperado= 0;
		Subscripcion s = new Subscripcion(0,0) ; 
		double resultado= s.precioPorMes();
		assertEquals(esperado, resultado, 0) ;
	}
	
	@Test
	public void testcancel() {
		Subscripcion s = new Subscripcion(0,0);
		s.cancel();
	}
}
