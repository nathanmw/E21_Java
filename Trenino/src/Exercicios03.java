import java.util.Scanner;

public class Exercicios03 {
//OK
	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite o numero:");
		numero = entradaDados.nextInt();

		if (numero % 2 == 0) {
			System.out.println("Numero Digitado é Par:[" + numero + "]");
		} else {
			System.out.println("Numero Digitato é Impar:[" + numero + "]");
		}

		entradaDados.close();
	}

}
