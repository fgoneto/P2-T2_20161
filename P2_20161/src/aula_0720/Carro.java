package aula_0720;

public class Carro {

	private String nomeCarro; //variaveis = atributos = informacoes do objeto;
	private double precoDiaria;
	
	public Carro(String nome, double precoDiaria) throws Exception{
		if(nome.equals("")){
			throw new Exception("Caro cliente, vc eh tao lindo! Mas o nome nao pode ser vazio.");
		}
		
		if(precoDiaria < 0){
			throw new Exception("Caro lindo usuario, nao coloque preco emnor que zero.");
		}
		
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeCarro == null) ? 0 : nomeCarro.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())//instanceof
			return false;
		Carro other = (Carro) obj;
		if (nomeCarro == null) {
			if (other.nomeCarro != null)
				return false;
		} else if (!nomeCarro.equals(other.nomeCarro))
			return false;
		return true;
	}
	
	public String toString() {
		return "Carro: "+this.getNome();
	}
	
	
	
}
