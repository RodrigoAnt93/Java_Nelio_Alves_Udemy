import java.util.Scanner;

public class Cores_Secundarias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int cor1, cor2;
		System.out.printf("Escolha as cores:%n1 - Vermelho%n2 - Verde%n3 - Azul%nOpção: ");
		cor1 = teclado.nextInt();
		System.out.printf("Segunda cor: ");
		cor2 = teclado.nextInt();
		if (cor1 == 1 && cor2 == 1) {
			System.out.println("A cor é Vermelha.");
		}
		else if (cor1 == 1 && cor2 == 2) {
			System.out.println("A cor é Amarela.");
		}
		else if (cor1 == 1 && cor2 == 3) {
			System.out.println("A cor é Roxa.");
		}
		else {
			if (cor1 == 2 && cor2 == 1) {
				System.out.println("A cor é Amarela.");
			}
			else if (cor1 == 2 && cor2 == 2) {
				System.out.println("A cor é Verde.");
			}
			else if (cor1 == 2 && cor2 == 3) {
				System.out.println("A cor é Azul Esverdeado.");
			}
			else {
				if (cor1 == 3 && cor2 == 1) {
					System.out.println("A cor é Roxa.");
				}
				else if (cor1 == 3 && cor2 == 2) {
					System.out.println("A cor é Azul Esverdeado.");
				}
				else if (cor1 == 3 && cor2 == 3) {
					System.out.println("A cor é Azul.");
				}
				else {
					System.out.println("Opções inválida.");
				}
			}
		}
		teclado.close();
	}

}
