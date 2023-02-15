package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int  qnt_produtos = scan.nextInt();
		Product[] product = new Product[qnt_produtos];
		
		for(int i = 0; i < product.length ; i++) {
			scan.nextLine();
			String name = scan.nextLine();
			double price = scan.nextDouble();
			product[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for(int i = 0; i < product.length ; i++) {
			sum += product[i].getPrice();
		}
		
		double avg = sum / product.length;
		
		System.out.printf("AVAREGE PRICE = %.2f%n", avg );
		
		scan.close();
		

	}

}
