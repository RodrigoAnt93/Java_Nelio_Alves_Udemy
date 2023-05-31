import java.util.Scanner;

public class Heights {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("how many people will be typed? ");
		int quantity = keyboard.nextInt();
		
		String[] vect_str = new String[quantity];
		int[] vect_int = new int[quantity];
		double[] vect_double = new double[quantity];
		
		for (int i=0; i < quantity; i++) {
			System.out.printf("Data of the %d° person: \n", i + 1);
			System.out.print("Name: ");
			String name = keyboard.nextLine();
			keyboard.nextLine();
			System.out.print("Age: ");
			int age = keyboard.nextInt();
			System.out.print("Height: ");
			double height = keyboard.nextDouble();
			System.out.println();
			vect_str[i] = name;
			vect_int[i] = age;
			vect_double[i] = height;
		}
		
		double mean_height = 0.0;
		for (int i=0; i < vect_double.length; i++) {
			mean_height += vect_double[i];
		}
		mean_height = mean_height / vect_double.length;
		
		int person16 = 0;
		for (int i=0; i < vect_int.length; i++) {
			if (vect_int[i] < 16) {
				person16 += 1;}
		}
		double percentage = ((double)person16 / quantity) * 100;
		
		System.out.printf("\nMean height: %.1f\n", mean_height);
		System.out.printf("People under 16 years old: %.1f\n", percentage);
		for (int i=0; i<vect_str.length; i++) {
			if (vect_int[i] < 16) {
				System.out.printf("%s\n", vect_str[i]);
			}
		}
		keyboard.close();
		

	}

}
