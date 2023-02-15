package br.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos números vc vai digitar ? ");
		int qnt_num = scan.nextInt();
		int[] num = new int[qnt_num];
		int[] negativos = new int[10];
		int cont = 0;
		
		
		if(qnt_num < 10 ) {
			for ( int i = 0 ; i < num.length ; i++) {
				System.out.print("Digite um número: ");
				num[i] = scan.nextInt();
				
				if(num[i] < 0) {
					negativos[cont] = num[i];
					cont++;
				}
			}
		}else {
			System.err.println("O número máximo é 10.");
		}
		
		//printar numeros negativos
		System.out.println("NUMEROS NEGATIVOS: ");
		for(int i = 0 ; i < negativos.length; i ++) {
			if(negativos[i] < 0) {
				System.out.println(negativos[i]);
			}
		}

		
		scan.close();
	}

}
