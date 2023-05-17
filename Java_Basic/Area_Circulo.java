import java.util.Scanner;

public class Area_Circulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Qual o raio do circulo? ");
		double raio = teclado.nextFloat();
		double pi = 3.14159;
		double area = pi * Math.pow(raio, 2);
		System.out.printf("A = %.4f", area);
		teclado.close();

	}

}
