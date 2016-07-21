package aula_0715;

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
	
	public void setNome(String novoNome){
		nomeCarro = novoNome;	
	}

	public void setPreco(double novoPreco){
		if(novoPreco > 0){
			precoDiaria = novoPreco;	
		}		
	}

	public boolean equals(Object outroObjeto){
		if(outroObjeto instanceof Carro){
			//verifique se tem mesmo nome;
			Carro outroCarro = (Carro)outroObjeto; //isso eh um cast;
			if(this.getNome().equals(outroCarro.getNome())){
				return true;
			}else{
				return false;
			}
			
		}else{
			//nao sou do mesmo tipo que a coisa 'outroObjeto'
			return false;
		}
	}
	
	public String toString() {
		return "Carro: "+this.getNome();
	}
	
	
	
}
