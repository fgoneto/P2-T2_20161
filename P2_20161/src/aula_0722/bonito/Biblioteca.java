package aula_0722.bonito;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private CadastroLivros cadastroLivros;
	
	public Biblioteca() {
		cadastroLivros = new CadastroLivros();
	}

	//fere coesao E expert;
	public void cadastraLivro(String titulo, String autor) throws Exception {
		cadastroLivros.adicionaLivro(titulo, autor);
	}

	public boolean contemLivro(String titulo) {
		//correto;
		boolean contemLivro = cadastroLivros.contemLivro(titulo);
		return contemLivro;				
	}
	
	
}
