package br.com;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double salario, imposto = 0;
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o seu salário mensal? ");
		salario = scan.nextDouble();
		
		if(salario <= 2000) {
			System.out.println("Isento");
		}else if(salario <= 3000) {
			imposto = (salario - 2000) * 0.08;
		}else if(salario <= 4500) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		
		if(imposto == 0) {
			System.out.println("Isento");
		}else {
			System.out.printf("Seu imposto de renda é: R$ %.2f", imposto);
		}
		scan.close();
	}

}
