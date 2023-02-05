package cardapio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int codigo, quantidade;
		double valor, total = 0;
		char cont = 0;
		
		System.out.println("---------- CARDÁPIO ----------");
		System.out.println("[1] - R$ 2.50 - misto quente");
		System.out.println("[2] - R$ 2.00 - pipoca");
		System.out.println("[3] - R$ 1.50 - refrigerante");
		System.out.println("[4] - R$ 4.00 - x-bacon");
		System.out.println("[5] - R$ 3.50 - torta doce");
		System.out.println("------------------------------");

		Scanner scan = new Scanner(System.in);

		do {
		System.out.print("Digite o código do produto: ");
		codigo = scan.nextInt();
		
		System.out.print("Quantas unidade? ");
		quantidade = scan.nextInt();
		
		switch (codigo) {
		case 1:
			valor = 2.50;
			total += valor*quantidade;
			break;
		case 2:
			valor = 2.00;
			total += valor* quantidade;
			break;
		case 3:
			valor = 1.50;
			total +=valor* quantidade;
			break;
		case 4:
			valor = 4.00;
			total+= valor*quantidade;
			break;
		case 5:
			valor = 3.50;
			total+= valor*quantidade;
			break;
		default:
			System.out.println("Código invalido! Verifique os códigos disponíveis e tente novamente.");
		}
		
		System.out.print("Deseja continuar? (s/n): ");
		cont = scan.next().charAt(0);
		
		}while(cont != 'n');
		
		scan.close();
		System.out.printf("---------- NOTA FISCAL ----------\nTotal: R$ %.2f", total);
	}
}
