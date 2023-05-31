import java.util.Scanner;

public class Names {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many names? ");
		int quantity_name = keyboard.nextInt();
		String[] vect = new String[quantity_name];
		
		for (int i=0; i < vect.length; i++) {
		System.out.print("Name: ");
		String name = keyboard.next();
		keyboard.nextLine();
		vect[i] = name;
		}
		
		System.out.println("-----------------------------------");
		
		for (String name : vect) {
			System.out.println(name);
		}
		keyboard.close();

	}

}
