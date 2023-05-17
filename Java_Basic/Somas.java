import java.util.Scanner;

public class Somas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o 1° valor: ");
		double a = teclado.nextDouble();
		System.out.print("Digite o 2° valor: ");
		double b = teclado.nextDouble();
		System.out.print("Digite o 3° valor: ");
		double c = teclado.nextDouble();
		System.out.print("Digite o 4° valor: ");
		double d = teclado.nextDouble();
		double soma = a * b - c * d;
		System.out.printf("Diferença: %f", soma);
		teclado.close();

	}

}
