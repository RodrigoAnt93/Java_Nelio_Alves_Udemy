import java.util.Scanner;

public class Exerc_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		char sexo;
		System.out.print("Sexo: ");
		sexo = teclado.next().charAt(0);
		System.out.printf("Seu sexo é %s", sexo);
		teclado.close();
		
	}

}
