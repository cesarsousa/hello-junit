package br.com.cesarprojs.exception;

public class ConversorNumeroExecption extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private String mensagem;
	
	public ConversorNumeroExecption() {
		super();
	}

	public ConversorNumeroExecption(String mensagem) {
		super();
		this.mensagem = mensagem;
	}
	
	public String getMensagem() {
		return mensagem;
	}

}
