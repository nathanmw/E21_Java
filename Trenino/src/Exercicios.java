import java.util.Scanner;

public class Exercicios {  
									// OK
	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		double valor1, valor2;
		
		try {
			System.out.println("Digito o Primeiro Valor:");
			valor1 = entradaDados.nextDouble();
			System.out.println("Digite o Segundo Valor:");
			valor2 = entradaDados.nextDouble();

			if (valor1 >= valor2) {
				System.out.println("O Maior valor é o primeiro:[" + valor1 + "]");
			} else {
				System.out.println("O Maior valor é o segundo:[" + valor2 + "]");

			}
		} catch (Exception e) {
			System.out.println("Caracter INVALIDO, Digite apenas nuneros!");
		}

		entradaDados.close();
	}

}
