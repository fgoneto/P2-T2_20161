package aula_0810.seboso;

import java.util.ArrayList;

public class Aluno {
	
	private String nome;
	private int idade;
	
	private ArrayList<Double> notas;
	
	
	public Aluno(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
		this.notas = new ArrayList<Double>();
	}

	public double getMaiorNota(){
		double maior = 0.0;
		for(Double nota : notas){
			if(nota > maior){
				maior = nota;
			}
		}
		return maior;
	}
	
	public double calculaMedia(){
		double somaTotal = 0.0;
		for(Double nota : notas){
			somaTotal = somaTotal + nota;
		}
		return somaTotal / (double)(notas.size());
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
