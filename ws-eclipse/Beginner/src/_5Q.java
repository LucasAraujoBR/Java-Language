import java.util.Locale;
import java.util.Scanner;

public class _5Q {
	/*
	 * Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o
	 * valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e
	 * o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int peca1,peca2,codigo1,codigo2;
		double valor1,valor2;
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite codigo,o numero e o valor de uma peca: ");
		codigo1 = sc.nextInt();
		peca1 = sc.nextInt();
		valor1 = sc.nextDouble();
		System.out.println("Digite codigo,o numero e o valor de outra peca: ");
		codigo2 = sc.nextInt();
		peca2 = sc.nextInt();
		valor2 = sc.nextDouble();
		System.out.println("O valor a ser pago da primeira peca eh R$: " + (peca1*valor1));
		System.out.println("O valor a ser pago da segunda peca eh R$: " + (peca2*valor2));
		System.out.println("Valor total a ser pago R$: " + (peca1*valor1+peca2*valor2));
	}

}
