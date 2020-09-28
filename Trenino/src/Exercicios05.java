import java.util.Scanner;

public class Exercicios05 {
						// PRONTO
	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		int idade;

		System.out.println("Digite sua idade:");
		idade = entradaDados.nextInt();

		if (idade >= 16) {
			System.out.println("Voce tem: " + idade + " anos voce pode votar!");
		} else {
			System.out.println("Voce não pode votar ainda [Idade minima 16 anos]");
		}

		entradaDados.close();

	}

}
