package application;

import java.util.Scanner;


//este programa mostra a linha diagonal e a quantidade de números negatios na matriz
//primeiramente digite o tamanho das linhas e colunas
public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[][] mat = new int[n][n];

		for (int linha = 0; linha < mat.length; linha++) {
			for (int coluna = 0; coluna < mat[linha].length; coluna++) {
				mat[linha][coluna] = scan.nextInt();
			}
		}

		System.out.print("Main diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		//contando os negativos
		int negs = 0;
		for(int i = 0 ; i < mat.length  ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				if(mat[i][j] < 0 ) {
					negs++;
				}
			}
		}
		System.out.println();
		System.out.println("Negative numbers: " + negs);
		

		scan.close();
	}

}
