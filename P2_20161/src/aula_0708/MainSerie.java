package aula_0708;

import java.util.Scanner;

import aula_0701.programa_scanner.TesteScanner;

public class MainSerie {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {		
		
		int qtdSeries = TesteScanner.leInteiro("Quantas series deseja cadastrar: ");
		Serie[] cadastroSeries = new Serie[qtdSeries];
		
		//trocar por um do/while;
		for(int i = 0; i < cadastroSeries.length; i = i + 1){
			
			System.out.print("Digite o nome da serie: ");
			String nomeSerie = scanner.nextLine();
			System.out.print("Digite o genero da serie: ");
			String generoSerie = scanner.nextLine();
			int qtdTemporadas = TesteScanner.leInteiro("Digite a qtd de temporadas: ");
						
			Serie serie = new Serie(nomeSerie, generoSerie, qtdTemporadas);
			cadastroSeries[i] = serie;
		}
		
		for(int i = 0; i < cadastroSeries.length; i = i +1){
			Serie serie = cadastroSeries[i];			
			System.out.println(serie.toString());
		}
		
		/*
		Serie got = new Serie("Game of Thrones", "Drama", 6);
		Serie csi = new Serie("Crime Scene Investigation - Cyber", "Policial", 9);
		Serie malhacao = new Serie("Malhacao", "Comedia", 90);
		
		System.out.println(got.nome);
		System.out.println(got.getNome());
		
		System.out.println(csi.getNome());
		
		csi.setNome("Crime Scene Investigation - Campina Grande");
		
		System.out.println(csi.getNome());
		
		System.out.println(malhacao.getNome());*/
	}
	
}
