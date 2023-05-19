import java.util.Scanner;

public class Valor_Imposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite seu salário: R$");
		double salario = teclado.nextDouble();
		if (0 < salario && salario <= 2000) {
			System.out.println("Isento.");
		}
		else if (salario <= 3000) {
			double salario_ = salario - 2000;
			double imposto = salario_ / 100 * 8;
			System.out.printf("Vai pagar R$%.2f de imposto.", imposto);
		}
		else if (salario <= 4500) {
			double salario_ = salario - 2000;
			double imposto = salario_ / 100 * 18;
			System.out.printf("Vai pagar R$%.2f de imposto.", imposto);
		}
		else {
			double salario_ = salario - 2000;
			double imposto = salario_ / 100 * 28;
			System.out.printf("Vai pagar R$%.2f de imposto.", imposto);
		}
		teclado.close();

	}

}
