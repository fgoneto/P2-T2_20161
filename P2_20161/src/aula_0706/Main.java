package aula_0706;

import aula_0706.calculadora.Calculadora;

public class Main {


	public static Calculadora calculadora = new Calculadora();
	public static void main(String[] args) {
		
		// 1. criando uma referencia do tipo calculadora; 
		// 2. apontando pro objeto calculadora;
		// 'calculadora' eh o nome da referencia;
		Calculadora banana = new Calculadora();
		double altura1 = 1.50;
		double altura2 = 2.30;
		
		double resSoma = banana.somaNumeros(altura1, altura2);
		banana.somaNumeros(15.6, 20.0);
		
		System.out.println(resSoma);
		
		
		
		
	}
	
}
