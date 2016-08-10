package aula_0810.reuso;

public class Main {

	public static void main(String[] args) {
		Pessoa nilton = new Pessoa("Nilton", 10);
		System.out.println(nilton.getNome());
		nilton.toString();	
		
		Aluno pabllo = new Aluno("Pabllo",11);
		System.out.println(  pabllo.getNome()   );
		pabllo.toString();
		System.out.println();
		
		AlunoEstrangeiro yovany = new AlunoEstrangeiro("Yovany", 25);
				
		pabllo.adicionaNota(10);
		pabllo.adicionaNota(9);
		pabllo.adicionaNota(9.5);

		yovany.adicionaNota(10);
		yovany.adicionaNota(9);
		yovany.adicionaNota(9.5);
		
		System.out.println(pabllo.calculaCRE());
		System.out.println(yovany.calculaCRE());
		System.out.println(yovany.getMaiorNota());
	}
	
}
