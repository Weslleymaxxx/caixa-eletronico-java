package contaBancariaExer;

public class Main {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria("Max", 258);
		c1.depositar(100);
		c1.sacar(50);
		System.out.println(c1.getSaldo());
	}
}
