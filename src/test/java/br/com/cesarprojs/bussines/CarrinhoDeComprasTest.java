package br.com.cesarprojs.bussines;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.cesarprojs.model.Item;

public class CarrinhoDeComprasTest {

	private CarrinhoDeCompras carrinho;

	@Before
	public void inicializa() {
		this.carrinho = new CarrinhoDeCompras();
	}

	@Test
	public void deveRetornarZeroSeCarrinhoVazio() {
		carrinho = new CarrinhoDeCompras();
		assertEquals(0.0, carrinho.maiorValor(), 0.0001);
	}

	@Test
	public void deveRetornarValorDoItemSeCarrinhoCom1Elemento() {
		carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Item("Geladeira", 1, 900.0));
		assertEquals(900.0, carrinho.maiorValor(), 0.0001);
	}

	@Test
	public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {
		carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Item("Geladeira", 1, 900.0));
		carrinho.adiciona(new Item("Fogão", 1, 1500.0));
		carrinho.adiciona(new Item("Máquina de Lavar", 1, 750.0));
		assertEquals(1500.0, carrinho.maiorValor(), 0.0001);
	}
}
