import java.util.Scanner;

public class Nivelamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo, pi;
		System.out.print("A: ");
		a = teclado.nextDouble();
		System.out.print("B: ");
		b = teclado.nextDouble();
		System.out.print("C: ");
		c = teclado.nextDouble();
		pi = 3.14159;
		triangulo = a * c / 2;
		circulo = pi * c *c;
		trapezio = (a+b) / 2 * c;
		quadrado = b * b;
		retangulo = a * b;
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		teclado.close();

	}

}
