package aula_0803.banco;

public class ContaBancaria {

	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular) {
		this.titular = titular;
		this.saldo = 0.0;
	}

	public void deposita(double valorDepositado){
		this.saldo = this.saldo + valorDepositado;
	}
	
	public void saque(double valorSacado){
		this.saldo = this.saldo - valorSacado;
	}
	
	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}
}
