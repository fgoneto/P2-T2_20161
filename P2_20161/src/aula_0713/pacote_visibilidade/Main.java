package aula_0713.pacote_visibilidade;

import aula_0713.Carro;

public class Main {

	public static void main(String[] args) {
		Carro limosine = null;
		//brincando com os objetos;
		
		Carro celta = new Carro("Celta",50.0);
		Carro hilux = new Carro("Hilux",250.0);
		Carro fusquinha = new Carro("Fusquinha", 13.5);
		
		
		
		System.out.println(celta.alugaCarro(5));
		
		System.out.println(celta.alugaCarro(32));
		System.out.println(hilux.alugaCarro(32));
		System.out.println(fusquinha.alugaCarro(32));
		
		System.out.println(celta.getNome());
		System.out.println(hilux.getNome());
		System.out.println(fusquinha.getNome());
		
		
		//Carro limosine = new Carro("Limosine", 650);

		if(limosine != null){
			System.out.println(limosine.getNome());	
		}else{
			System.out.println("O carro nao existe.");
		}
		
		/*
		 //Procedural
		String carroHilux = "Hilux";
		double precoHilux = 250.0;
		
		String carroCelta = "Celta";
		double precoCelta = 50.0;
		
		String carroFusca = "Fusquinha";
		double precoFusca = 13.5;
		
		double aluguelCelta = precoCelta * 32;
		double aluguelHilux = precoHilux * 32;
		double aluguelFusca = precoFusca *32;
		
		System.out.println(aluguelCelta);
		System.out.println(aluguelHilux);
		System.out.println(aluguelFusca);*/
	}
	
}
