import java.util.Scanner;

public class Preco_Peca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("N° peça1: ");
		int peca1 = teclado.nextInt();
		System.out.print("Quantidade peça1: ");
		int quant_peca1 = teclado.nextInt();
		System.out.print("Valor unitário peça1: ");
		double valor_peca1 = teclado.nextDouble();
		System.out.print("N° peça2: ");
		int peca2 = teclado.nextInt();
		System.out.print("Quantidade peca2: ");
		int quant_peca2 = teclado.nextInt();
		System.out.print("Valor unitário peça2: ");
		double valor_peca2 = teclado.nextDouble();
		double total = (quant_peca1 * valor_peca1) + (quant_peca2 * valor_peca2);
		System.out.println(" ");
		System.out.printf("Valor a pagar: R$%.2f", total);
		teclado.close();
	}

}
