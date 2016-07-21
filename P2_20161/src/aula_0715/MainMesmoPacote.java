package aula_0715;

import java.util.ArrayList;
import java.util.HashSet;

public class MainMesmoPacote {

	public static void main(String[] args) {
		
		//brincando com os objetos;
		

		Carro hilux = new Carro("Hilux",250.0);
		Carro fusquinha = new Carro("Fusquinha", 13.5);
		
		Carro celta1 = new Carro("Celta",50.0);
		Carro celta2 = new Carro("Celta",558460.0);
		Carro celta3 = celta1;
		
		//celta3.setNome("Celta Turbinado");
		
		System.out.println("Celta 1:"+celta1.getNome());
		System.out.println("Celta 2:"+celta2.getNome());
		System.out.println("Celta 3:"+celta3.getNome());
		System.out.println(hilux.getNome());
		
		System.out.println(celta1 == celta2);
		System.out.println(celta1.equals(celta2));
		
		String tarsila = "Tarsila";
		String camila = "Camila";
		String gabriel = "Gabriel";
		String yovanny = "Yovany";
		String matheusMaciel = "Matheus";
		String matheusLeal = "Matheus";
		
		ArrayList lista = new ArrayList();
		lista.add(tarsila);
		lista.add(gabriel);
		lista.add(camila);
		lista.add(matheusMaciel);
		lista.add(matheusMaciel);
		lista.add(matheusMaciel);
		lista.add(matheusMaciel);
		lista.add(matheusMaciel);
		lista.add(matheusMaciel);
		lista.add(0, matheusLeal);
		lista.add(yovanny);
		
		System.out.println(lista);
		
		lista.remove(tarsila);
		System.out.println(lista.size());
		lista.add(tarsila);
		System.out.println(lista.remove(matheusMaciel));
		System.out.println(lista);
		lista.add(celta3);		
		lista.add(hilux);
		System.out.println(lista.get(0));
		
		HashSet conjunto = new HashSet();
		System.out.println("Adicionei: "+conjunto.add(tarsila));
		System.out.println("Adicionei: "+conjunto.add(matheusLeal));
		System.out.println("Adicionei: "+conjunto.add(matheusMaciel));
		conjunto.add(matheusMaciel);
		System.out.println("Adicionei: "+conjunto.add(matheusMaciel));
		conjunto.add(matheusMaciel);
		conjunto.add(matheusMaciel);
		conjunto.add(matheusMaciel);
		conjunto.add(matheusMaciel);//hashcode
		conjunto.add(celta1);
		conjunto.add(celta2);
		
		System.out.println(conjunto.contains("Tarsila"));
		
		//foreach
		for(Object objeto : conjunto){
			System.out.println(objeto);
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
