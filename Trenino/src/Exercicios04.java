import java.util.Scanner;

public class Exercicios04 {
                            			// NAO TA PRONTO
	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		int numero = 001;
		try {
			System.out.println("--------------------------");
			System.out.println("Digite o codigo 001 - Arroz");
			System.out.println("Digite o codigo 002 - Feijão");
			System.out.println("Digite o codigo 003 - Farinha");
			System.out.println("--------------------------");
			numero = entradaDados.nextInt();
			
			if (numero == 001) {
				System.out.println("Voce escolheu 001 - Arroz");
			}
			if (numero == 002) {
				System.out.println("Voce escolheu 002 - Feijão");
			}
			if (numero == 003) {
				System.out.println("Voce escolheu 003 - Farinha");
			}
		} catch (Exception e) {
			System.out.println("Diversos");
		}
	
		
		entradaDados.close();
	}

}

