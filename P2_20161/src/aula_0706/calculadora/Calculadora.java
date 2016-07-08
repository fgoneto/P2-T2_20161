package aula_0706.calculadora;

public class Calculadora {
	
	public double somaNumeros(double num1, double num2){
		double resultado = num1 + num2;
		return resultado;		
	}
	
	public double subtraiNumeros(double num1, double num2){
		double resultado = num1 - num2;
		return resultado;
	}
	
	public double multiplicaNumeros(double num1, double num2){
		double resultado = num1 * num2;
		return resultado;
	}
	
	public double divideNumeros(double num1, double num2){
		double resultado = num1 / num2;
		return resultado;
	}
	
	//overload
	public double divideNumeros(int num1, int num2){
		int resultado = num1 / num2;
		return resultado;
	}
	
	
	
}
