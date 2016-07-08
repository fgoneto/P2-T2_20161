package aula_0708;

public class Serie {

	// atributos
	String nome;
	String genero;
	int qtdTemporadas;
	int qtdVezesAssistiu;

	// Construtor
	public Serie(String nomeSerie, String generoSerie, int qtdTempSerie) {
		nome = nomeSerie;
		genero = generoSerie;
		qtdTemporadas = qtdTempSerie;
		qtdVezesAssistiu = 0;
	}

	// metodos
	public String getNome() {
		return nome;
	}

	public void setNome(String novoNome) {
		nome = novoNome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String novoGenero) {
		genero = novoGenero;
	}

	public int getQtdTemporadas() {
		return qtdTemporadas;
	}

	public void setQtdTemporadas(int novaQtd) {
		qtdTemporadas = novaQtd;
	}
	
	public String toString(){		
		return "O nome da serie eh "+nome;
	}
}
