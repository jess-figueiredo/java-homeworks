package application;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		// variaveis e vetores
		int velho = 0;
		String nomevelho = null;
		System.out.print("Quantas pessoas serão digitadas? ");
		int qnt_pessoas = scan.nextInt();
		Pessoa[] pessoa = new Pessoa[qnt_pessoas];
		// recebendo dados
		for (int i = 0; i < pessoa.length; i++) {
			scan.nextLine();
			System.out.println("Dados da " + (i+1) +"a pessoa:");
			System.out.print("Nome: ");
			String nome = scan.nextLine();
			System.out.print("Idade: ");
			int idade = scan.nextInt();
			pessoa[i] = new Pessoa(nome, idade);
			
			if(pessoa[i].getIdade() > velho) {
				velho = pessoa[i].getIdade();
				nomevelho = pessoa[i].getNome();
			}
		}
		
		System.out.println("A PESSOA MAIS VELHA É: " + nomevelho);
		
		scan.close();
	}

}
