import java.util.Scanner;
public class Area_trapezio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Base menor: ");
		double b = teclado.nextFloat();
		System.out.print("Base maior: ");
		double B = teclado.nextFloat();
		System.out.print("Altura: ");
		double h = teclado.nextFloat();
		System.out.println(" ");
		double area = (b + B) / 2.0 * h;
		System.out.printf("A área do trapézio é: %.2f", area);
		teclado.close();

	}

}
