package br.com;

import java.util.Locale;
import java.util.Scanner;

import br.com.entities.Product;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Product product = new Product();
		System.out.print("Name: ");
		product.name = scan.nextLine();
		System.out.print("Price: ");
		product.price = scan.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = scan.nextInt();
		
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = scan.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Product data: "+ product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		product.quantity = scan.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Product data: "+ product);
		
		scan.close();
	}
}
