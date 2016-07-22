package aula_0722.seboso;

import java.util.ArrayList;
import java.util.List;

public class CadastroLivros {
	private List<Livro> livros;
	private Biblioteca proprietaria;

	public CadastroLivros(Biblioteca biblioteca) {
		this.proprietaria = biblioteca;
		this.livros = new ArrayList<>();
	}

	public List<Livro> getLivros() {
		return livros;
	}
}
