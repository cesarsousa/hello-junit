package br.com.cesarprojs.conversorRomanos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.cesarprojs.conversorRomanos.ConversorDeNumeroRomano;

public class ConversorDeNumeroRomanoTest {

	@Test
	public void deveEntenderOSimboloI() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("I");
		assertEquals(1, numero);
	}

	@Test
	public void deveEntenderOSimboloV() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("V");
		assertEquals(5, numero);
	}

	@Test
	public void deveEntenderOSimboloX() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("X");
		assertEquals(10, numero);
	}

	@Test
	public void deveEntenderOSimboloL() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("L");
		assertEquals(50, numero);
	}

	@Test
	public void deveEntenderOSimboloC() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("C");
		assertEquals(100, numero);
	}

	@Test
	public void deveEntenderOSimboloM() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("M");
		assertEquals(1000, numero);
	}

	@Test
	public void deveEntenderDoisSimbolosComoII() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("II");
		assertEquals(2, numero);
	}

	@Test
	public void deveEntenderQuatroSimbolosDoisADoisComoXXII() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("XXII");
		assertEquals(22, numero);
	}

	@Test
	public void deveEntenderNumerosComoIX() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("IX");
		assertEquals(9, numero);
	}

	@Test
	public void deveEntenderNumerosComplexosComoXXIV() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("XXIV");
		assertEquals(24, numero);
	}

}
