import java.util.Scanner;

public class Sum_Vect {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many numbers will you type? ");
		int quantity = keyboard.nextInt();
		double[] vect = new double[quantity];
		double sum = 0;
		
		for (int i=0; i < quantity; i++) {
			System.out.print("Enter a number: ");
			int number = keyboard.nextInt();
			vect[i] = number;
			sum += number;
		}
		
		double mean = sum / quantity;
		
		System.out.print("Values: ");
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		
		System.out.printf("\nSum: %.1f", sum);
		System.out.printf("\nMean: %.1f", mean);
		keyboard.close();
	}

}
