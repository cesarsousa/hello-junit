package br.com.cesarprojs.calculadoraSalario;

public abstract class RegraDeCalculo {
	
	double calcula(Funcionario funcionario) {
		if (funcionario.getSalario() > limite()) {
			return
			funcionario.getSalario() * porcentagemAcimaDoLimite();
			}
			return funcionario.getSalario() * porcentagemBase();
	}
	
	protected abstract int limite();
	protected abstract double porcentagemAcimaDoLimite();
	protected abstract double porcentagemBase();

}
