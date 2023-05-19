import java.util.Scanner;

public class Validador_Senha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int login, cl_login, senha, cl_senha;
		login = 1234;
		senha = 2023;
		cl_login = 0;
		cl_senha = 0;
		boolean conf = true;
		while (conf) {
			System.out.print("Login: ");
			cl_login = teclado.nextInt();
			System.out.print("Senha: ");
			cl_senha = teclado.nextInt();
			if (login == cl_login && senha == cl_senha) {
				conf = false;}
			else {
				System.out.println("Acesso negado.");
			}}
		System.out.println("Acesso autorizado.");
		teclado.close();
}
}
