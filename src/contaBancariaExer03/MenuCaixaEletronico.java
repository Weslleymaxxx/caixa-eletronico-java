package contaBancariaExer03;

import java.util.Scanner;

public class MenuCaixaEletronico {

	public void exibirMenu(ContaBancaria conta) {
		
		Scanner input = new Scanner(System.in);
		Scanner deposito = new Scanner(System.in);
		Scanner saque = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("Escolha opção abaixo:");
			System.out.println("1. Depositar");
			System.out.println("2. Sacar");
			System.out.println("3. Consultar Saldo");
			System.out.println("4. Ver histórico");
			System.out.println("5. Sair");
			opcao = input.nextInt();
			switch (opcao) {
				case 1: {
					System.out.println("Qual valor deseja depositar?");
					double depositarDinheiro = deposito.nextDouble();
					
					conta.depositar(depositarDinheiro);
					break;
				}
				case 2: {
					System.out.println("Qual valor deseja sacar?");
					double sacarDinheiro = saque.nextDouble();
					
					conta.sacar(sacarDinheiro);
					break;
				}
				case 3: {
					System.out.println(conta.getSaldo());
					break;
				}
				case 4: {
					conta.exibirHistorico();
					break;
				}
				case 5: {
					System.out.println("Saindo..");
					break;
				}
				
				default: {
					System.out.println("Opção inválida!");
				}
			} 
			
		} while(opcao != 5);
		
		input.close();
		deposito.close();
		saque.close();
		
		
	}
}
