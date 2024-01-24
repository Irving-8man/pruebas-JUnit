package junitlab;

import static org.junit.Assert.*;

import org.junit.Test;

public class PilaTest {

	@Test
	public void testPush() {
		Pila s = new Pila();
		boolean resultado = s.push(123);
		assertTrue(resultado);
	}
	
	@Test
	public void testPush2() {
		Pila s = new Pila();
		boolean resultado = s.push(1000);
		assertFalse(resultado);
	}
	
	@Test
	public void testPush3() {
		Pila s = new Pila();
		boolean resultado = s.push(-1);
		assertFalse(resultado);
	}
	
	
	@Test
	public void testPop() {
		int esperado = 123;
		Pila s = new Pila();
		s.push(123);
		int resultado = s.pop();
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testPop2() {
		int esperado = -1;
		Pila s = new Pila();
		int resultado = s.pop();
		assertEquals(esperado,resultado);
	}

	@Test
	public void testIsEmpty() {
		Pila s = new Pila();
		boolean resultado = s.isEmpty();
		assertTrue(resultado);
	}

	@Test
	public void testTop() {
		int esperado = 123;
		Pila s = new Pila();
		s.push(13);
		s.push(123);
		int resultado = s.top();
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testTop2() {
		int esperado = -1;
		Pila s = new Pila();
		int resultado = s.top();
		assertEquals(esperado,resultado);
	}

	@Test
	public void testImprimirPila() {
		Pila s = new Pila();
		s.imprimirPila();
	}
	
	@Test
	public void testImprimirPila2() {
		Pila s = new Pila();
		s.push(990);
		s.imprimirPila();
	}

}
