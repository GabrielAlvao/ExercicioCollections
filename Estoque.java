package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String estoque1;
		String estoque2;
		String estoque3;
		String estoque4;
		
		ArrayList<String> estoque = new ArrayList<>();
		
		System.out.println("Adicione 4 itens ao estoque: ");
		
		estoque1 = sc.nextLine();
		estoque2 = sc.nextLine();
		estoque3 = sc.nextLine();
		estoque4 = sc.nextLine();
		
		estoque.add(estoque1);
		estoque.add(estoque2);
		estoque.add(estoque3);
		estoque.add(estoque4);
		
		System.out.println(estoque);
		
		System.out.println("\nAdicione algum item: ");
		String estoque5;
		estoque5 = sc.nextLine();
		estoque.add(estoque5);
		System.out.println("\n" + estoque);
		
		System.out.println("Remova um item do estoque");
		estoque.remove(sc.nextLine());
		
		System.out.println(estoque);
		
		for(String i: estoque) {
			System.out.println("Temos os celulares: " + i);
		}
		
		sc.close();
	}

}

