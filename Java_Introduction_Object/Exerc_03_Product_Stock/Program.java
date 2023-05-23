package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = keyboard.nextLine();
		System.out.print("Price: ");
		product.price = keyboard.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = keyboard.nextInt();
		
		System.out.println("Product data: " + product);
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = keyboard.nextInt();
		product.addProducts(quantity);
		System.out.println("Updated data: " + product);
		System.out.print("Enter the number of product to be removed from stock: ");
		quantity = keyboard.nextInt();
		product.removeProducts(quantity);
		System.out.println("Update data: " + product);
		
		keyboard.close();

	}

}
