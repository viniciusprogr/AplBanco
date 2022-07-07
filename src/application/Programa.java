package application;

import java.util.Scanner;

import entities.Account;
import excecoes.ExcecaoDeNegocios;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
			System.out.println("Informe os dados da conta");
			
			System.out.println("Numero da conta:");
			Integer numeroDaConta = sc.nextInt();
			
			System.out.println("Titular:");
			String titular = sc.next();
			
			System.out.println("Saldo inicial:");
			Double saldo = sc.nextDouble();
			
			System.out.println("Limite de saque:");
			Double limiteDeSaque = sc.nextDouble();
			
			Account acc = new Account(numeroDaConta, titular, saldo, limiteDeSaque);
			
			System.out.println();
			System.out.println("Informe o valor que deseja sacar: ");
			double valor = sc.nextDouble();
			
			try {
				acc.sacar(valor);
				System.out.println("Novo saldo:" + acc.getSaldo());
			}catch(ExcecaoDeNegocios e) {
				System.out.println(e.getMessage());
			}
			
			
		
		
		
		
		sc.close();
	}

}
