import java.util.Scanner;

public class _2Q {
	/*
	 * Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou
	 * �mpar.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		System.out.println("Digite um valor: ");
		valor = sc.nextInt();
		if (valor % 2 == 0) {
			System.out.println("� par!");
		} else {
			System.out.println("� �mpar!");
		}
		sc.close();
	}

}
