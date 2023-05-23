package application;

import java.util.Scanner;

import entities.Grade;

public class Program {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Grade student = new Grade();
		System.out.print("Name: ");
		student.nome = keyboard.nextLine();
		System.out.print("1° grade: ");
		student.grade_one = keyboard.nextDouble();
		System.out.print("2° grade: ");
		student.grade_two = keyboard.nextDouble();
		System.out.print("3° grade: ");
		student.grade_three = keyboard.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.evaluate_grade());
		if (student.evaluate_grade() >= 60) {
			System.out.println("PASS");
		}
			
		else {
			double lack = 60 - student.evaluate_grade();
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", lack);}
		keyboard.close();
	}

}
