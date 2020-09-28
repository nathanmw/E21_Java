import java.util.Scanner;

public class Exercicios06 {
							// OK
	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		int senha = 1234;

		System.out.println("Digite a senha:");
		senha = entradaDados.nextInt();

		if (senha == 1234) {
			System.out.println("ACESSO PERMITIDO");
		} else {
			System.out.println("ACESSO NEGADO");
		}

		entradaDados.close();
	}

}
