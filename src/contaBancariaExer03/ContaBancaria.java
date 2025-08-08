package contaBancariaExer03;

public class ContaBancaria {

	private String titular;
	private int numeroConta;
	private double saldo;
	private String [] historico = new String[5];
	private int indexHistorico;
	
	public ContaBancaria(String titular, int numeroConta) {
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.saldo = 0;
	}
	
	public void depositar(double valor) {
		if(valor >= 0) {
			saldo += valor;
			registrarHistorico("Depósito de R$ " + valor);
		}
	}
	
	public void sacar(double valor) {
		if(valor >= 0 && saldo >= valor) {
			saldo -= valor;
			registrarHistorico("Saque de R$ " + valor);
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void registrarHistorico(String mensagem) {
		historico[indexHistorico] = mensagem;
		indexHistorico = (indexHistorico + 1) % 5;
	}
	
	public void exibirHistorico() {
		for(int i = 0; i < historico.length; i++) {
			if(historico[i] != null) {
				System.out.println(historico[i]);
			}
		}
	}
	
}
