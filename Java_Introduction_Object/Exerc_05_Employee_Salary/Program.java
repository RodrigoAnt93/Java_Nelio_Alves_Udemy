package application;

import java.util.Scanner;

import entities.Salary;

public class Program {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Salary employee = new Salary();
		System.out.print("Name: ");
		employee.name = keyboard.nextLine();
		System.out.print("Gross salary: ");
		employee.gross_salary = keyboard.nextDouble();
		System.out.print("Tax: ");
		employee.tax = keyboard.nextDouble();
		
		System.out.println("Employee: " + employee.name + "$ " + employee.net_salary());
		System.out.print("Which percentage to increase salary? ");
		double percentage = keyboard.nextDouble();
		employee.increase_salary(percentage);
		System.out.println("Updated date: " + employee.name + "$ " + employee.net_salary());
		keyboard.close();

	}

}
