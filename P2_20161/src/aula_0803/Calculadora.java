package aula_0803;

import java.util.ArrayList;

public class Calculadora {

	public double calculaMedia(ArrayList<Double> numeros){
		double mediaAritmetica = 0.0;
		for(Double numero : numeros){
			mediaAritmetica = mediaAritmetica + numero;
		}
		return mediaAritmetica / (double)(numeros.size());
	}
	
	public void calculaMediaPonderada(){
		//..
	}
	
}
