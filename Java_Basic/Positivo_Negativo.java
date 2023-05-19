import java.util.Scanner;

public class Positivo_Negativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um valor inteiro: ");
		int valor = teclado.nextInt();
		if (valor >= 0) {
			System.out.print("NÃO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		teclado.close();
	}

}
