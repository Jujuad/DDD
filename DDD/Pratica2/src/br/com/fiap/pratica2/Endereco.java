package br.com.fiap.pratica2;

public class Endereco {
	
	String logradouro;
	String numero;
	String complemento;
	String cep;

	String[] retornarEndereco() {
		
		String[] enderecoCompleto = {logradouro, numero, complemento, cep};
		return enderecoCompleto;
		
	}
}
