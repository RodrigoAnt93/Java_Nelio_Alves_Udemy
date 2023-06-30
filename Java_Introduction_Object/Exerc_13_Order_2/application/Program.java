package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String cName = sc.nextLine();
		System.out.print("Email: ");
		String cEmail = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date cBirthDate = sdf.parse(sc.next());
		Client cClient = new Client(cName, cEmail, cBirthDate);
		
		System.out.println();
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus oStatus = OrderStatus.valueOf(sc.next());
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		Order pOrder = new Order(cClient, new Date(), oStatus);
		for (int i=0; i<n; i++) {
			System.out.println("Enter #" + (i+1) + " item data: ");
			System.out.print("Product name: ");
			String pName = sc.next();
			System.out.print("Product price: ");
			double pPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int pQuantity = sc.nextInt(); 
			
			Product pProduct = new Product(pName, pPrice);
			OrderItem od = new OrderItem(pQuantity, pPrice, pProduct);
			pOrder.addItem(od);
			
		}
		System.out.println();
		System.out.println(pOrder);
		
		
		sc.close();

	}

}
