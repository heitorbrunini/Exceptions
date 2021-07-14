package application;

import java.util.Scanner;

import entidades.Account;
import exceptions.DomainError;

public class mainProgram {

	public static void main(String[] args) {
		System.out.println("Entre com os dados da conta");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Numero da conta: ");
			Integer number=sc.nextInt();
			System.out.println("Propietario da conta: ");
			sc.nextLine();
			String propietario = sc.nextLine();
			System.out.println("Balanço da conta: ");
			Double balanco = sc.nextDouble();
			System.out.println("Limite de saque: ");
			Double limitesaque = sc.nextDouble();
			
			Account conta = new Account(number, propietario, balanco,limitesaque); 
			System.out.println("Valor de saque: ");
			Double value = sc.nextDouble();
			conta.Saque(value);
			
		}
		catch(DomainError erro) {
			System.out.print("Erro: " + erro.getMessage());			
		}
		catch(RuntimeException erro) {
			System.out.print("Erro inesperado");
			
		}
		sc.close();

	}

}
