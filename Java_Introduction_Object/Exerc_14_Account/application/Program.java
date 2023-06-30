package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// Account acc = new Account(1001, "Rodrigo", 0.0); abs
		BusinessAccount bacc = new BusinessAccount(1002, "Rubbia", 0.0, 500.0);

		// UPCASTING

		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Kassia", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Paula", 0.0, 100.0);

		// DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

		// BusinessAccount acc5 = (BusinessAccount)acc3;

		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(10.0);
			System.out.println("LOan!!");
		}

		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!!");

			System.out.println();
		}
		// *******************************************************
		// Usando a sobreposição no método 'withdraw' no SavingsAccount e no
		// BusinessAccount com o super.
		// Introdução a polimorfismo

		// Account acc6 = new Account(101, "Alex", 1000.0); abs
		// acc6.withdraw(200); abs
		// System.out.println(acc6.getBalance());abs

		Account acc7 = new SavingsAccount(102, "Maria", 1000.0, 0.0);
		acc7.withdraw(200);
		System.out.println(acc7.getBalance());

		Account acc8 = new BusinessAccount(103, "Bob", 1000.0, 0.0);
		acc8.withdraw(200);
		System.out.println(acc8.getBalance());

		// *********************************************************
		// Instrodução a abstração

		// Account acc9 = new Account(444, "Douglas", 55.0); abs
		Account acc10 = new SavingsAccount(777, "Diego", 0.0, 500.0);
		Account acc11 = new BusinessAccount(654, "Sadro", 100.0, 55.4);

	}

}
