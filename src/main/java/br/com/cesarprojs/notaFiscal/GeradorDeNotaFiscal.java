package br.com.cesarprojs.notaFiscal;

import java.util.List;

public class GeradorDeNotaFiscal {

	private final List<AcaoAposGerarNota> acoes;
	private final Relogio relogio;
	private Tabela tabela;

	public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
		this(acoes, new RelogioDoSistema());
	}
	
	public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes, Relogio relogio) {
		this.acoes = acoes;
		this.relogio = relogio;
	}
	
	public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes, Tabela tabela) {
		this.acoes = acoes;
		this.tabela = tabela;
		this.relogio = new RelogioDoSistema();
	}
	
	public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes, Relogio relogio, Tabela tabela) {
		this.acoes = acoes;
		this.relogio = relogio;
		this.tabela = tabela;
	}

	public NotaFiscal gera(Pedido pedido) {

		NotaFiscal nf = new NotaFiscal(
				pedido.getCliente(), 
				pedido.getValorTotal() * tabela.paraValor(pedido.getValorTotal()), 
				relogio.hoje());

		for (AcaoAposGerarNota acao : acoes) {
			acao.executa(nf);
		}

		return nf;
	}

}
