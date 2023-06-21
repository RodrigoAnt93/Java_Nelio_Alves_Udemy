package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
	Scanner keyboard = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
	System.out.print("Enter department's name: ");
	String departmentName = keyboard.nextLine();
	System.out.println("Enter worker data: ");
	System.out.print("Name: ");
	String workerName = keyboard.nextLine();
	System.out.print("Level: ");
	String workerLevel = keyboard.nextLine();
	System.out.print("Base salary: ");
	double baseSalary = keyboard.nextDouble();
	Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
	System.out.print("How many contracts to this worket? ");
	int n = keyboard.nextInt();
	
	for (int i=1; i<=n; i++) {
		System.out.println("Enter contract #" + i + " data: ");
		System.out.print("Date (DD/MM/YYYY): ");
		Date contractDate = sdf.parse(keyboard.next());
		System.out.print("Value per hour: ");
		double valuePerHour = keyboard.nextDouble();
		System.out.print("Duration (hours): ");
		int hours = keyboard.nextInt();
		HourContract contract = new HourContract(contractDate, valuePerHour, hours);
		worker.addContract(contract);
	}
	System.out.println();
	System.out.print("Enter month and year to calculate income (MM/YYYY): ");
	String monthAndYear = keyboard.next();
	int month = Integer.parseInt(monthAndYear.substring(0, 2));
	int year = Integer.parseInt(monthAndYear.substring(3));
	System.out.println("Name: " + worker.getName());
	System.out.println("Department: " + worker.getDepartament().getName());
	System.out.println("Income for " + monthAndYear + ": " + String.format("%2.f",worker.income(year, month)));
		
		
	keyboard.close();
	}

}
