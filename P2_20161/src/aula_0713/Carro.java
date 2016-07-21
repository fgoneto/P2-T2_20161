package aula_0713;

public class Carro {

	private String nomeCarro; //variaveis = atributos = informacoes do objeto;
	private double precoDiaria;
	
	public Carro(String nome, double precoDiaria){
		this.nomeCarro = nome; 		
		this.precoDiaria = precoDiaria;
	}

	public double alugaCarro(int qtdDias){
		double totalAluguel = qtdDias * precoDiaria;
		return totalAluguel;
	}	
	
	//getters and setters
	public String getNome(){
		return this.nomeCarro;
	}
	
	public double getPreco(){
		return precoDiaria;
	}
	
	public void setNome(String novoNome, String senha){
		final String senhaPadrao = "java_eh_lindo!";
		if(senha.equals(senhaPadrao)){
			setNome(novoNome);
		}		
	}
	
	void setNome(String novoNome){
		final String senhaPadrao = "java_eh_lindo!";
		nomeCarro = novoNome;	
	}

	public void setPreco(double novoPreco){
		if(novoPreco > 0){
			precoDiaria = novoPreco;	
		}		
	}
	
}
