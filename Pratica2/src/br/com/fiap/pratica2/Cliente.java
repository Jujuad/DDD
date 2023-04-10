package br.com.fiap.pratica2;

public class Cliente {
	
	String nome;
	String cpf;
	String endereco;
	
	String[] retornarDados() {
		
		String[] dados = {nome, cpf, endereco};
		return dados;
		
	}

}
