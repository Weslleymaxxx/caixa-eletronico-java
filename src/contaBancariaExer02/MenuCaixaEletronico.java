package contaBancariaExer02;

import java.util.Scanner;

public class MenuCaixaEletronico {

	public void exibirMenu(ContaBancaria conta) {
		
		Scanner input = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("Escolha opção abaixo:");
			System.out.println("1. Depositar");
			System.out.println("2. Sacar");
			System.out.println("3. Consultar Saldo");
			System.out.println("4. Sair");
			opcao = input.nextInt();
			switch (opcao) {
				case 1: {
					conta.depositar(100);
					break;
				}
				case 2: {
					conta.sacar(50);
					break;
				}
				case 3: {
					System.out.println(conta.getSaldo());
					break;
				}
				case 4: {
					System.out.println("Saindo...");
					break;
				}
				
				default: {
					System.out.println("Opção inválida!");
				}
			} 
			
		} while(opcao != 4);
		
		input.close();
		
		
	}
}
