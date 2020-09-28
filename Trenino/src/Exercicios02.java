import java.util.Scanner;

public class Exercicios02 {
								// NÃO TA PRONTO
	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);	
	double valor1, valor2, valor3, valor4;
	double maior = 0;
	System.out.println("Digete o Primeiro Valor:");
	valor1 = entradaDados.nextDouble();
	System.out.println("Digete o Segundo Valor:");	
	valor2 = entradaDados.nextDouble();
	System.out.println("Digete o Terceiro Valor:");
	valor3 = entradaDados.nextDouble();
	System.out.println("Digete o Quarto Valor:");
	valor4 = entradaDados.nextDouble();
	
	if((valor1<valor2) && (valor3<valor4) || (valor2 > valor1) && (valor4 > valor3) ) {
		System.out.println("O maior valor é:" );
		
	}
	
	}
	
}
