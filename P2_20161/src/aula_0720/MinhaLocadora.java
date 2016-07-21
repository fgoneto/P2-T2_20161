package aula_0720;

public class MinhaLocadora {

	public static void main(String[] args) throws Exception {
		
		try{
			Carro umCarro = new Carro("", -85);
			System.out.println(umCarro);
		}catch(Exception excecao){
			//codiog para exibir a mensagem:
			System.out.println(excecao.getMessage());
		}
	}
	
}
