package br.com.fiap.pratica2;


public class ContaCorrente {
	
	double saldo;
	Cliente titular;
	
	void adicionar(double valor) {
		saldo = valor + saldo;
	}
	
	void retirar(double valor) {
		saldo = saldo - valor;
	}

	double retornarSaldo() {
		return saldo;
	}

}
