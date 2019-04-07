package br.com.cesarprojs.calculadoraSalario;

public class QuinzeOuVinteCincoPorCento extends RegraDeCalculo {

	@Override
	protected int limite() {
		return 2500;
	}

	@Override
	protected double porcentagemAcimaDoLimite() {
		return 0.85;
	}

	@Override
	protected double porcentagemBase() {
		return 0.75;
	}

}
