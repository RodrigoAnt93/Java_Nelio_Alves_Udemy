package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = keyboard.nextDouble();
		x.b = keyboard.nextDouble();
		x.c = keyboard.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = keyboard.nextDouble();
		y.b = keyboard.nextDouble();
		y.c = keyboard.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		String largerArea = (areaX > areaY) ? "X" : "Y";
		System.out.printf("Larger area: %s", largerArea);
		keyboard.close();
	}

}
