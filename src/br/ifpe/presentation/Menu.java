package br.ifpe.presentation;

import java.util.Scanner;

public class Menu extends Functions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("");
			System.out.println(" _________________________________________________________________________________________________");
			System.out.println("|__________________________________Welcome to Function Menu_______________________________________|");
			System.out.println("|                                                                                                 |");
			System.out.println("|¬type it [1]  - To see the name and email address of all customers:                              |");
			System.out.println("|¬type it [2]  - To see the customer name and the average balance of your accounts:               |");
			System.out.println("|¬type it [3]  - To see the most wealthy clients in Brazil and the United States:                 |");
			System.out.println("|¬type it [4]  - To print on the screen the average balance of agency accounts:                   |");
			System.out.println("|¬type it [5]  - To print on the screen the name of all customers who have a savings account:     |");
			System.out.println("|¬type it [6]  - To view all of the agency's customer states:                                     |");
			System.out.println("|¬type it [7]  - To view country account numbers:                                                 |");
			System.out.println("|¬type it [8]  - To see the sum of the balances of the customer accounts in question(clientEmail):|");
			System.out.println("|¬type it [9]  - To make a withdrawal from your account:                                          |");
			System.out.println("|¬type it [10] - To make a deposit for all customers in the country in question:                  |");
			System.out.println("|¬type it [11] - To perform a transfer between two accounts of an agency:                         |");
			System.out.println("|¬type it [12] - To view all of your customer accounts:                                           |");
			System.out.println("|¬type it [13] - To see all sums of state account balances:                                       |");
			System.out.println("|¬type it [14] - To view the emails of all customers who have joint accounts:                     |");
			System.out.println("|¬type it [15] - To see if the number is prime or not:                                            |");
			System.out.println("|¬type it [16] - To return the factorial of the number:                                           |");
			System.out.println("|¬type it [17] - Exit the function menu                                                           |");
			System.out.println(" -------------------------------------------------------------------------------------------------");

			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				imprimirNomesClientes();
				break;
			case 2:
				imprimirMediaSaldos();
				break;
			case 3:
				imprimirPaisClienteMaisRico();
				break;
			case 4:
				imprimirSaldoMedio(opcao);
				break;
			case 5:
				imprimirClientesComPoupanca();
				break;
			case 6:
				getEstadoClientes(opcao);
			case 7:
				getNumerosContas(null);
				break;
			case 8:
				getMaiorSaldo(null);
				break;
			case 9:
				sacar(opcao, opcao, opcao);
				break;
			case 10:
				depositar(null, opcao);
				break;
			case 11:
				transferir(opcao, opcao, opcao, opcao);
				break;
			case 12:
				getContasConjuntas(null);
				break;
			case 13:
				getSomaContasEstado(null);
				break;
			case 14:
				getEmailsClientesContasConjuntas();
				break;
			case 15:
				isPrimo(opcao);
				break;
			case 16:
				getFatorial(opcao);
				break;

			default:
				System.out.println("");
				System.out.println("You Left Function Menu!");
				break;
			}
		} while (opcao <= 16);
	}

}
