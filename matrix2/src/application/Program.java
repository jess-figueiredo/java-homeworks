package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o número de linhas: ");
		int l = scan.nextInt();
		System.out.print("Digite o npumero de colunas: ");
		int c = scan.nextInt();
		int[][] matriz = new int[l][c];
		System.out.println("Comece a digitar a matriz: ");
		for(int i = 0 ; i < matriz.length ; i++) {
			for(int j = 0 ; j < matriz[i].length ; j++) {
				matriz[i][j] = scan.nextInt();
			}
		}
		
		System.out.print("Digite o número a ser estalkeado: ");
		int num = scan.nextInt();
		
		for(int i = 0 ; i < matriz.length ; i++) {
			for(int j = 0 ; j < matriz[i].length ; j++) {
				if(num == matriz[i][j]) {
					System.out.println("Position: "+ i + ", " + j);
				}
			}
		}
		
		
		
		
		
		scan.close();

	}

}
