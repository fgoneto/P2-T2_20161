package aula_0810.reuso;

import java.util.ArrayList;

public class Aluno extends Pessoa {

	protected ArrayList<Double> notas;
	
	public Aluno(String nome, int idade){
		super(nome, idade);
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
	
	public double calculaCRE(){
		double somaTotal = 0.0;
		for(Double nota : notas){
			somaTotal = somaTotal + nota;
		}
		return somaTotal / (double)(notas.size());
	}
	
	public int getTamNome(){
		return super.cpf.length();
	}
	
	public void adicionaNota(double nota){
		this.notas.add(nota);
	}
}
