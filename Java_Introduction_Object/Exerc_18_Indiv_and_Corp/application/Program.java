package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Corporete;
import entities.Individual;
import entities.Person;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt(); 
		
		for (int i=1; i<=n; i++ ) {
			System.out.println("tax payer #"+ i + " data: ");
			System.out.print("Individual or Corporete? (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double ai = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double he = sc.nextDouble();
				list.add(new Individual(name, ai, he));
			}
			else {
				System.out.print("Number of employees: ");
				int ne = sc.nextInt();
				list.add(new Corporete(name, ai, ne));
			}
		}
		
		System.out.println();
		double total = 0.0;
		System.out.println("TAXES PAID: ");
		for (Person person : list) {
			System.out.println(person.getName() + ": $ " + String.format("%.2f", person.tax()));
			total += person.tax();
		}
		System.out.println();
		System.out.print("TOTAL TAXES: $" + String.format("%.2f", total));
		sc.close();

	}

}
