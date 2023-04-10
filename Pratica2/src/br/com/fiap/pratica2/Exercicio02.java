package br.com.fiap.pratica2;

import java.util.Scanner;

import br.com.fiap.pratica2.Endereco;
import br.com.fiap.pratica2.Cliente;
import br.com.fiap.pratica2.ContaCorrente;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente();
		ContaCorrente contaCorrente = new ContaCorrente();

		double valor;
		
		System.out.println("Digite o seu logradouro:");
		endereco.logradouro = user.next();
		
		System.out.println("Digite o numero de sua residencia:");
		endereco.numero = user.next();
		
		System.out.println("Digite o complemento de seu endereco:");
		endereco.complemento = user.next();
		
		System.out.println("Digite o cep de sua residencia:");
		endereco.cep = user.next();
		
		System.out.println("Digite seu nome:");
		cliente.nome = user.next();
		System.out.println("Digite seu cpf:");
		cliente.cpf = user.next();
		
		System.out.println("Digite seu saldo bancario:");
		contaCorrente.saldo = user.nextDouble();
		
		System.out.println("Digite o valor para ser adicionado ao seu saldo bancario:");
		valor = user.nextDouble();
		
		contaCorrente.adicionar(valor);
		double ValorAdicionado = contaCorrente.retornarSaldo();
		System.out.println("Saldo Final:" + contaCorrente.saldo);	
		
		System.out.println("Digite o valor para ser retirado do seu saldo bancario:");
		valor = user.nextDouble();
		
		contaCorrente.retirar(valor);
		double ValorRetirado = contaCorrente.retornarSaldo();
		System.out.println("Saldo Final:" + contaCorrente.saldo);	
			
		
		String[] dados = cliente.retornarDados();
		System.out.println("Nome:" + dados[0] + "\nCPF:" + dados[1] + "\n");	
		
		String[] EnderecoCompleto = endereco.retornarEndereco();
		System.out.println("Logradouro:" + EnderecoCompleto[0] + "\nNumero:" + EnderecoCompleto[1] + "\nComplemento:" + EnderecoCompleto[2] + "\nCEP:" + EnderecoCompleto[3]);
		
		
	}
	
}
