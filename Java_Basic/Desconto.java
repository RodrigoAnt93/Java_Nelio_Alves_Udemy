import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double preco, desconto;
		System.out.print("Digite o valor: R$");
		preco = teclado.nextDouble();
		desconto = (preco >= 100) ? preco / 100 * 20 : preco / 100 * 10;
		System.out.printf("O valor do desconto é R$%.2f", desconto);
		teclado.close();
	}

}
