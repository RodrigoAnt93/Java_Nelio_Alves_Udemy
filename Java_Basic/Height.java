import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the number of people:");
		int quantity = keyboard.nextInt();
		double [] vect = new double[quantity];
		
		for (int i = 0; i<quantity; i++) {
			System.out.print((i + 1) + "° height: ");
			vect[i] = keyboard.nextDouble();
		} 
		double sum = 0.0;
		for (int i = 0; i<quantity; i++) {
			sum += vect[i];
		}
		sum = sum / quantity;
		System.out.printf("Average height is %.2f", sum);
		
		keyboard.close();
	}

}
