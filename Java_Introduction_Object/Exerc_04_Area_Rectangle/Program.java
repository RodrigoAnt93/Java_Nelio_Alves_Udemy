package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		System.out.print("Width: ");
		rectangle.width = keyboard.nextDouble();
		System.out.print("Height: ");
		rectangle.height = keyboard.nextDouble();
		
		System.out.println("Area = " + rectangle.area());
		System.out.println("Diagonal = " + rectangle.diagonal());
		System.out.println("Perimeter = " + rectangle.perimeter());
		
		keyboard.close();
	}

}
