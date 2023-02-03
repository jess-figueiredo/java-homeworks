package br.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		
		if(x>0) {
			System.out.println("-----------------------------");
			System.out.printf("%d é MAIOR que zero", x);
		}else if(x<0) {
			System.out.println("-----------------------------");
			System.out.printf("%d é MENOR que zero", x);
		}else {
			System.out.println("-----------------------------");
			System.out.printf("%d é IGUAL a zero", x);
		}
		
		scan.close();

	}

}
