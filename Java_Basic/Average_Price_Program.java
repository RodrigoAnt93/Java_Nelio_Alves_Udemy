import java.util.Scanner;

public class Average_Price_Program {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Quantity of product: ");
		int n = keyboard.nextInt();
		Average_Price_Product[] vect = new Average_Price_Product[n];
		System.out.println("");
		for (int i=0; i<vect.length; i++) {
			System.out.print("Name product: ");
			String name = keyboard.nextLine();
			keyboard.nextLine();
			System.out.print("Price product: ");
			double price = keyboard.nextDouble();
			vect[i] = new Average_Price_Product(name, price);
			System.out.println();
		}
		double sum_price = 0.0;
		
		for (int t=0; t<vect.length; t++) {
			sum_price += vect[t].getPrice();
		}
		double average_price = sum_price / n;
		System.out.printf("The average price is $%.2f", average_price);
		keyboard.close();

	}

}
