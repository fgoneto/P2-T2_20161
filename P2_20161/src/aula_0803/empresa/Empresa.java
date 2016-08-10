package aula_0803.empresa;

import java.util.ArrayList;

import aula_0803.Calculadora;

public class Empresa {
	private ArrayList<Funcionario> funcionarios;

	public Empresa() {
		funcionarios = new ArrayList<>();
	}
	
	public void empregaFuncionario(String nome, double salario){
		Funcionario funcionario = new Funcionario(nome, salario);
		funcionarios.add(funcionario);
	}
	
	public double calculaMedia(){
		Calculadora calculadora = new Calculadora();
		ArrayList<Double> salarios = new ArrayList<>();
		for(Funcionario funcionario : funcionarios){
			salarios.add(funcionario.getSalario());
		}
		
		return calculadora.calculaMedia( salarios );
				
		/*antes do reuso
		double mediaSalarios = 0.0;
		for(Funcionario funcionario : funcionarios){
			mediaSalarios = mediaSalarios + funcionario.getSalario();
		}
		return mediaSalarios / (double)(funcionarios.size());*/
	}

}
