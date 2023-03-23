package br.com.fiap.exercicio;

public class aluno {

	
	String nome;
	
	String rm;
	
	double Challenge, global, cp1, cp2, cp3;
	
	
	double CalculoMediaCheckpoint() {
		double mediaCp = (cp1 + cp2 + cp3)/3;
		return mediaCp;
		
	}
	
	double CalculoMediaSemestre() {
		double pesoCp = CalculoMediaCheckpoint() * 0.2;
		double pesoGlobal = global * 0.2;
		double pesoChallenge = Challenge * 0.6;
		double mediaSem = pesoCp + pesoGlobal + pesoChallenge;
		return mediaSem;
		
	}
}
