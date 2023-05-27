package application;

import java.util.Scanner;

import entities.Accounts;

public class Program {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Accounts account;
		System.out.print("Enter account number: ");
		int account_number = keyboard.nextInt();
		System.out.print("Enter account holder: ");
		keyboard.nextLine();
		String name = keyboard.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = keyboard.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double values = keyboard.nextDouble();
			account = new Accounts(account_number, name, values);}
		else {
			account = new Accounts(account_number, name);
		}
		
		System.out.println(" ");
		System.out.println("Account: ");
		System.out.println(account);
		
		System.out.print("Enter a deposit value: ");
		double value_deposit = keyboard.nextDouble();
		account.deposit(value_deposit);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		double value_draw = keyboard.nextDouble();
		account.draw(value_draw);
		System.out.println("Updated account data: ");
		System.out.println(account);
		keyboard.close();
		

	}

}
