package aula_0803.banco;

import java.util.ArrayList;

import aula_0803.Calculadora;
import aula_0810.reuso.Pessoa;

//composite/wrapper
public class Banco {

	private ArrayList<ContaBancaria> contas;
	private Calculadora calculadora;
	
	public Banco(){
		contas = new ArrayList<>();				
	}
	
	public void cadastraConta(String titular){
		Pessoa pessoa = new Pessoa("Nilton",11);
		
		ContaBancaria conta = new ContaBancaria(titular);
		contas.add(conta);
	}
	
	public void realizaDeposito(String titularConta, double valorDepositado){
		for(ContaBancaria conta : contas){
			if(conta.getTitular().equals(titularConta)){
				conta.deposita(valorDepositado);
				return;
			}
		}
	}
	
	public double calculaMedia(){
		
		Calculadora calculadora = new Calculadora();
		ArrayList<Double> salarios = new ArrayList<>();
		for(ContaBancaria conta : contas){
			salarios.add(conta.getSaldo());
		}
		//return calculadora.calculaMediaPonderada();
		
		return calculadora.calculaMedia(salarios);
		
		/* antes do reuso
		double mediaContas = 0.0;
		for(ContaBancaria conta : contas){
			mediaContas = mediaContas + conta.getSaldo();
		}
		return mediaContas / (double)(contas.size());*/
	}
	public void plotBoxplot(){		
		
	}
	
	public void desenhaGrafico(){
		
	}
	
	public void fazTesteT(){
		
	}
	
}
