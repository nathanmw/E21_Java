import java.util.Scanner;

public class Exercicios07 {
									//OK
	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		int qtdMacas;
	try {
		System.out.println("Digete a quantidade de maças:");
		qtdMacas = entradaDados.nextInt();
		
		if(qtdMacas <= 12) {
			System.out.println("Quantidade "+ qtdMacas + " Maças/ Valor:R$ "+ qtdMacas*0.30);
		}else {
			System.out.println("Quantidade "+ qtdMacas + " Maças/ Valor:R$ "+ qtdMacas*0.25);
		}
	} catch (Exception e) {
		System.out.println("CARACTER INVALIDO (Digitar apenas numeros inteiros!)");
	}
		
		
	entradaDados.close();	
	}

}
