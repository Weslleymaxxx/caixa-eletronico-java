package contaBancariaExer02;

public class ContaBancaria {

	private String titular;
	private int numeroConta;
	private double saldo;
	
	public ContaBancaria(String titular, int numeroConta) {
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.saldo = 0;
	}
	
	public void depositar(double valor) {
		if(valor >= 0) {
			saldo += valor;
		}
	}
	
	public void sacar(double valor) {
		if(valor >= 0 && saldo >= valor) {
			saldo -= valor;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
}
