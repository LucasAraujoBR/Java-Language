import java.util.Scanner;

public class _1Q {
	/*
	 * Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero �
	 * negativo ou n�o.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		System.out.println("Digite um valor: ");
		valor = sc.nextInt();
		sc.close();
		if(valor > 0) {
			System.out.println("Valor n�o negativo!");
		}else {
			System.out.println("Valor Negativo!");
		}
	}

}
