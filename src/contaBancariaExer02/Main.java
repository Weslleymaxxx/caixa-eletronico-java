package contaBancariaExer02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número da conta: ");
		int numeroDaConta = input.nextInt();
		input.nextLine();	//Limpar quebra de linha;
		
		System.out.println("Digite o nome do titular: ");
		String nomeDoTitular = input.nextLine();
		
		ContaBancaria c1 = new ContaBancaria(nomeDoTitular, numeroDaConta);
		MenuCaixaEletronico caixaEletronico = new MenuCaixaEletronico();
		caixaEletronico.exibirMenu(c1);
		
		input.close();
		
	}
}