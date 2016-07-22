package aula_0722.seboso;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private CadastroLivros cadastroLivros;
	//CRIA UMA CLASSE CANTINA
	private ArrayList<String> lanchesCantina;
	
	public Biblioteca() {
		cadastroLivros = new CadastroLivros(this);
		lanchesCantina = new ArrayList<String>();
	}

	public void cadastraLivro(String titulo, String autor, String tipo) throws Exception {
		Livro livro = new Livro(titulo, autor);
		List<Livro> livros = cadastroLivros.getLivros();
		livros.add(livro);
	}

	public boolean contemLivro(String titulo) {
		List<Livro> livrosCadastrados = cadastroLivros.getLivros();
		for (Livro livro : livrosCadastrados) {
			if (livro.getTitulo().equals(titulo))
				return true;
		}
		return false;
	}
	
	public void adicionaLancheCantina(String lanche){
		lanchesCantina.add(lanche);		
	}
	
	public double compraLanche(int qtd){
		return qtd * 3.50;
	}
	
	public boolean contemLanche(String lanche){
		return lanchesCantina.contains(lanche);
	}
	
}
