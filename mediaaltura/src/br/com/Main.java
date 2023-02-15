package br.com;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		// declarando variavel e vetor
		int quantidade_pessoas = scan.nextInt();
		double[] vetor = new double[quantidade_pessoas];
		double sum = 0.0;
		double avg = 0.0;
		
		for (int i = 0; i < quantidade_pessoas; i++) {
			vetor[i] = scan.nextDouble();
		}
		
		for (int i = 0; i< quantidade_pessoas ; i++) {
			sum += vetor[i];
		}
		
		avg = sum / quantidade_pessoas;
		
		System.out.printf("AVERAGE HEIGHT: %.2f", avg);
		scan.close();
	}

}
