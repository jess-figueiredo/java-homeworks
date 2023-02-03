package br.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double valor = 0;
		double conta = 0;
		int cont = 1;
		System.out.println("---------- CARDÁPIO ----------");
		System.out.println("1 - R$4,00 - cachorro quente");
		System.out.println("2 - R$4,50 - b-salada");
		System.out.println("3 - R$5,00 - x-bacon");
		System.out.println("4 - R$2,00 - torrada simples");
		System.out.println("5 - R$1,50 - refrigerante");
		System.out.println("---------- ######## ----------");
		System.out.println("");
		
		Scanner scan = new Scanner(System.in);
		
		/*Enquanto cont for diferente de 0 faça*/
		while (cont != 0) {
			System.out.print("Digite o código do produto: ");
			int code = scan.nextInt();
			System.out.print("Digite a quantidade: ");
			int quantidade_produto = scan.nextInt();
			
			if(code == 1) {
				valor = 4.0;
			}else if(code == 2) {
				valor = 4.5;
			}else if(code == 3) {
				valor = 5.0;
			}else if(code == 4) {
				valor = 2.0;
			}else if(code == 5) {
				valor = 1.5;
			}
			
			conta += (valor * quantidade_produto);
			
			System.out.println("---------- ##### ----------\nDeseja adicionar mais produtos no carrinho?\n1 - Sim\n2 - Não\n---------- ##### ----------");
			cont = scan.nextInt();
			
			if(cont == 2) cont =0;
			
		}
		

		scan.close();
		System.out.println("---------- TICKET ---------");
		System.out.printf("Total: R$ %.2f", conta);
	}

}
