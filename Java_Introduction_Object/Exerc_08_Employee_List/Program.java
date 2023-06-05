package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many emplyoees will be registered? ");
		int quantity = keyboard.nextInt();
		
		for (int i=0; i<quantity; i++) {
			System.out.println("Emplyoee #" + (i+1));
			System.out.print("Id:");
			int q_id = keyboard.nextInt();
			System.out.print("Name: ");
			String q_name = keyboard.nextLine();
			keyboard.nextLine();
			System.out.print("Salary: ");
			double q_salary = keyboard.nextDouble();
			
			Employee emp = new Employee(q_id, q_name, q_salary);
			list.add(emp);
		}
		System.out.println("");
		System.out.print("Enter the employee id that will have salary increase: ");
		int id_employee = keyboard.nextInt();
		Integer pos = position(list, id_employee);
		
		if (pos >= 0) {
			System.out.print("Enter the percentage: ");
			double percen = keyboard.nextDouble();
			
			list.get(pos).increaseSalary(percen);
		}
		else {
			System.out.println("This id does not exist!");
		}
		
		for (Employee emp : list) {
			System.out.println(emp);
		}
		keyboard.close();
	}
	public static int position (List<Employee> list, int id) {
		for (int i=0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}
}
