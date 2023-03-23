package br.com.fiap.exercicio;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner usuario = new Scanner(System.in);
		
		aluno Aluno = new aluno();
		
		System.out.println("Insira o nome do aluno:");
		Aluno.nome = usuario.next();
		
		System.out.println("Insira o rm do aluno:");
		Aluno.rm = usuario.next();
		
		System.out.println("Insira a nota cp1 do aluno:");
		Aluno.cp1 = usuario.nextDouble();

		System.out.println("Insira a nota cp2 do aluno:");
		Aluno.cp2 = usuario.nextDouble();
		
		System.out.println("Insira a nota cp3 do aluno:");
		Aluno.cp3 = usuario.nextDouble();
		
		System.out.println("Insira a nota challenge do aluno:");
		Aluno.Challenge = usuario.nextDouble();
		
		System.out.println("Insira a nota global do aluno:");
		Aluno.global = usuario.nextDouble();
		
		System.out.println("Media de cps do aluno:" + Aluno.CalculoMediaCheckpoint());
		System.out.println("Media Semestral do aluno:" + Aluno.CalculoMediaSemestre());
		
	}

}
