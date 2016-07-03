package aula_0701.programa_scanner;

import java.util.Scanner;

public class TesteScanner {
	public static final String SIM_PORTUGUES = "Nao";
	public static final String SIM_INGLES = "Yes";
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		iniciaPrograma();
	}
	
	public static int leInteiro(String mensagem){		
		System.out.print(mensagem);
		int inteiroQualquer = scanner.nextInt();
		scanner.nextLine();
		return inteiroQualquer;
	}
	
	public static void iniciaPrograma(){
		
		String desejaLer;
		do{			
			//le o nome;
			System.out.print("Digite seu nome: ");
			String nome = scanner.nextLine();		

			//codigo modularizado. Note que a legibilidade tb melhorou.				
			int anoAtual = leInteiro("Digite o ano atual: ");
			int anoNascimento = leInteiro("Digite o ano de nascimento: ");
			
			int idade = anoAtual - anoNascimento;
			System.out.println("A idade de " + nome + " eh " + idade);
			
			System.out.print("Deseja ler um usuario? ");
			desejaLer = scanner.nextLine();
		
		//para ignorar maiusculas e minusculas use: .equalsIgnoreCase(...)
		}while(desejaLer.equals(SIM_PORTUGUES));
	}
}
