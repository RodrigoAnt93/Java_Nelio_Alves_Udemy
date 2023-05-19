import java.util.Scanner;

public class Media_Aluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		float nota1, nota2, media;
		System.out.print("Primeira nota: ");
		nota1 = teclado.nextFloat();
		System.out.print("Segunda nota: ");
		nota2 = teclado.nextFloat();
		media = (nota1 + nota2) / 2;
		if (media >= 7) {
			System.out.println("O aluno está aprovado.");
	}
		else if (media >= 5) {
			System.out.println("O aluno está em recuperação.");
		}
		else {
			System.out.println("O aluno está reprovado.");
		} 
		teclado.close();
}

}
