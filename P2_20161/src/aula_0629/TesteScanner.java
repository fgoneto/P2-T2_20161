package aula_0629;

import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		//le a idade;
		System.out.print("Digite sua idade: ");		
		int idade = scanner.nextInt();
		scanner.nextLine();
		
		//le o nome;
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();		
		
		System.out.println("A idade de " + nome + " eh " + idade);
		
		
	}	
}
