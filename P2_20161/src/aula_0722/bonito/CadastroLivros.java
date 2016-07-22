package aula_0722.bonito;

import java.util.ArrayList;
import java.util.List;

public class CadastroLivros {
	private ArrayList<Livro> livros;

	public CadastroLivros() {
		this.livros = new ArrayList<Livro>();
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}
	
	public void adicionaLivro(String titulo, String autor){
		Livro livro = new Livro(titulo, autor);
		livros.add(livro);
	}
	
	public boolean contemLivro(String tituloChave){
		//for each: for(Tipo referencia
		for (Livro livro : this.livros) {
			if (livro.getTitulo().equals(tituloChave))
				return true;
		}
		return false;
	}
	
}
