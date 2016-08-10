package aula_0810.reuso;

public class AlunoEstrangeiro extends Aluno {
	
	public AlunoEstrangeiro(String nome, int idade){
		super(nome, idade);
	}
	
	@Override 
	public double calculaCRE(){
		double cre = 0.0;
		for(Double nota : notas){
			if(nota > cre){
				cre = nota;
			}
		}
		return cre;
	}
}
