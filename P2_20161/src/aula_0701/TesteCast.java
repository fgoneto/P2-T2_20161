package aula_0701;

import aula_0701.programa_scanner.TesteScanner;

public class TesteCast {
	
	public static void main(String[] args) {
		
		System.out.println(args);
		
		//Reuso de um metodo de outra classe.
		int idade = TesteScanner.leInteiro("Digite sua idade: ");		
		System.out.println(idade);
		
		//reuso do outro programa inteiro.
		System.out.println("inicio do main do outro programa");
		TesteScanner.iniciaPrograma();		
	}	
}
