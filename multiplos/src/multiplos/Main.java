package multiplos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a%b == 0 || b%a == 0) {
			System.out.println("São multiplos");
		}else {
			System.out.println("Não são múltiplos");
		}
	
		scan.close();

	}

}
