package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		List<Employer> employer = new ArrayList<>();
		
		System.out.println("Quantos empregados você deseja cadastrar ?");
		int quantidade = scan.nextInt();
		
		for(int i = 0 ; i< quantidade ; i++) {
			System.out.println();
			System.out.println("EMPREGADO #" + (i +1));
			System.out.print("ID: ");
			Integer id = scan.nextInt();
			while (hasId(employer, id)) {
				System.out.println("ID já existe! tente novamente: ");
				id = scan.nextInt();				
			}
						
			System.out.print("NOME: ");
			scan.nextLine(); //limpar o buffer
			String nome = scan.nextLine();
			System.out.print("SALÁRIO: ");
			double salario = scan.nextDouble();
			
			Employer emp = new Employer(id, nome, salario);
			
			employer.add(emp);
		}
		
		System.out.println();
		System.out.println("Digite o ID do empregado que terá seu salário aumentado: ");
		int idEmployer = scan.nextInt();
		
		Employer emp = employer.stream().filter(x -> x.getId() == idEmployer).findFirst().orElse(null);	
		
		if(emp == null ) {
			System.out.println("Este ID não existe");
		}else {
			System.out.println("Entre com a porcentagem: ");
			double percent = scan.nextDouble();
			//employer.get(pos).increaseSalary(percent);
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("LISTA DE EMPREADOS: ");
		for(Employer e : employer)
			System.out.println(e);
		
	
		scan.close();
	}
	
	public static Integer position(List<Employer> employer, int id) {
		for(int i = 0 ; i < employer.size(); i++) {
			if(employer.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Employer> employer, int id) {
		Employer emp = employer.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
