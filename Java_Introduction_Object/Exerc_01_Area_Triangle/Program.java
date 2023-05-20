package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		System.out.println("Enter the measures of triangle X: ");
		xA = keyboard.nextDouble();
		xB = keyboard.nextDouble();
		xC = keyboard.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		yA = keyboard.nextDouble();
		yB = keyboard.nextDouble();
		yC = keyboard.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		String largerArea = (areaX > areaY) ? "X" : "Y";
		System.out.printf("Larger area: %s", largerArea);
		keyboard.close();
	}

}
