package aula_0720;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MainLocadora {

	public static void main(String[] args) {
	
		//Note que falta tratar essas Exceptions:
		//para corrigir: coloque um try/catch, ou throws no main.
		//brincando com os objetos;
		Carro hilux = new Carro("Hilux",250.0);
		Carro fusquinha = new Carro("Fusquinha", 13.5);
		Carro opala = new Carro("Opala", 350);
		
		Carro celta1 = new Carro("Celta",50.0);
		Carro celta2 = new Carro("Celta",250.0);
		Carro celta3 = celta1;
		
		System.out.println("Celta 1:"+celta1.getNome());
		System.out.println("Celta 2:"+celta2.getNome());
		System.out.println("Celta 3:"+celta3.getNome());
		
		System.out.println(celta1 == celta2);
		System.out.println(celta1.equals(celta2));

		//CODIGO DA LISTA
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
		
		//OPERACOES NA LISTA
		System.out.println("============== OPERACOES NA LISTA =============");
		lista.remove(tarsila);
		System.out.println(lista.size());
		lista.add(tarsila);
		System.out.println(lista.remove(matheusMaciel));
		System.out.println(lista);
		lista.add(celta3);		
		lista.add(hilux);
		System.out.println(lista.get(0));
		
		System.out.println("============== OPERACOES NO CONJUNTO =============");
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
		System.out.println("Adicionando "+celta1+": "+conjunto.add(celta1));
		System.out.println("Adicionando "+celta2+": "+conjunto.add(celta2));
		
		//foreach
		System.out.println("======= IMPRIMINDO O CONJUNTO ========");
		for(Object objeto : conjunto){
			System.out.println(objeto);
		}
		
		System.out.println("====== MAPAS ========");
		System.out.println();
		
		HashMap mapa = new HashMap();
		mapa.put(tarsila, fusquinha);
		mapa.put(yovanny, opala);
		
		System.out.println(mapa);
		
		mapa.put(yovanny, celta1);
		System.out.println(mapa);
		
		Object coisaDoMapa = mapa.get(tarsila);
		Carro carroAlugado = (Carro)coisaDoMapa;//cast!
		System.out.println(carroAlugado.getNome());
		
		
		//USANDO A LISTA
		System.out.println(" ========== tipos nas colecoes ===========");
		System.out.println("A lista de Matheus: "+lista);
		//each
		for(Object objeto : lista){
			if(objeto instanceof Carro){
				Carro umCarro = (Carro)objeto;
				System.out.println(umCarro.getNome());
			}else{
				System.out.println("nao eh carro.");
			}
		}
		
		ArrayList<Carro> listaCarros = new ArrayList<Carro>();
		listaCarros.add(celta1);
		listaCarros.add(hilux);
		listaCarros.add(hilux);
		listaCarros.add(celta2);
		listaCarros.add(celta3);

		for(Carro objeto : listaCarros){
			if(objeto.getNome().equals("Celta")){
				System.out.println("Preco do Celta: "+objeto.getPreco());
			}
		}
		
		System.out.println("Lista de Carros: ");
		System.out.println(listaCarros);
		
		
		
		
		
		
		
		
		
		
		
		
		
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
