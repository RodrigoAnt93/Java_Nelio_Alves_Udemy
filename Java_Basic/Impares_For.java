import java.util.Scanner;

public class Impares_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Até: ");
		int x = teclado.nextInt();
		for (int y=1; y <= x;) {
			System.out.printf("%d%n", y);
			y += 2;}
		System.out.println("Fim.");
		teclado.close();
		
	}

}
