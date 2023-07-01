package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int quant = sc.nextInt();
		
		for (int i=0; i<quant; i++) {
			System.out.println("Employee #" + (i + 1) + " data: " );
			System.out.print("Outsourced (y/n)? ");
			char opc = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String eName = sc.nextLine();
			System.out.print("Hours: ");
			int eHour = sc.nextInt();
			System.out.print("Value per hour: ");
			double eVH = sc.nextDouble();
			
			if (opc == 'y') {
				System.out.print("Additional charge: ");
				double emp = sc.nextDouble();
				list.add(new OutsourceEmployee(eName, eHour, eVH, emp));
			}
			else {
				list.add(new Employee(eName, eHour, eVH));
			}
			
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		sc.close();
	}
}
