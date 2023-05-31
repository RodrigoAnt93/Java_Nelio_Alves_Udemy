import java.util.Scanner;

public class Negative_Number {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many numbers will you type?");
		int quantity = keyboard.nextInt();
		int[] vect = new int[quantity];
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Enter a number: ");
			int num = keyboard.nextInt();
			vect[i] = num;
		}
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);}
		}
		keyboard.close();

	}

}
