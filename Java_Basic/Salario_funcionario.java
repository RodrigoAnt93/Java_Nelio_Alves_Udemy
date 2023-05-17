import java.util.Scanner;

public class Salario_funcionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("N° do funcionário: ");
		int num = teclado.nextInt();
		System.out.print("Horas trabalhadas: ");
		int horas = teclado.nextInt();
		System.out.print("Valor hora trabalho: ");
		double valor_hora = teclado.nextDouble();
		double salario = valor_hora * horas;
		System.out.printf("Numero: %d%nSalário: R$%.2f", num, salario);
		teclado.close();
	}

}
