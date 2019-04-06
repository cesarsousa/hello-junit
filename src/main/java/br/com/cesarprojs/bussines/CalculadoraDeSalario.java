package br.com.cesarprojs.bussines;

import br.com.cesarprojs.model.Cargo;
import br.com.cesarprojs.model.Funcionario;

public class CalculadoraDeSalario {

	public double calculaSalario(Funcionario funcionario) {
		if (funcionario.getCargo().equals(Cargo.DESENVOLVEDOR)) {
			if (funcionario.getSalario() > 3000) {
				return funcionario.getSalario() * 0.8;
			}
			return funcionario.getSalario() * 0.9;
		} else if (funcionario.getCargo().equals(Cargo.DBA)) {
			if (funcionario.getSalario() < 2500) {
				return funcionario.getSalario() * 0.85;
			}
			return funcionario.getSalario() * 0.75;
		}
		throw new RuntimeException("Funcionario invalido");
	}
}
