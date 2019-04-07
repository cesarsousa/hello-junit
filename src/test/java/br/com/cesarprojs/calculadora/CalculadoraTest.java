package br.com.cesarprojs.calculadora;

import org.junit.Test;
import org.mockito.Mockito;

import br.com.cesarprojs.copiadora.Copiadora;
import br.com.cesarprojs.copiadora.Escritor;
import br.com.cesarprojs.copiadora.Leitor;

public class CalculadoraTest {

	@Test
	public void deveLerEEnviarOConteudoLido() {
		Escritor e = Mockito.mock(Escritor.class);
		Leitor l = Mockito.mock(Leitor.class);
		
		Mockito.when(l.temCaracteres()).thenReturn(true, false);
		Mockito.when(l.leCaracteres()).thenReturn("mauricio");
		
		Copiadora c = new Copiadora(l, e);
		c.copiar();
		
		Mockito.verify(e).escreve("mauricio");
	}

}
