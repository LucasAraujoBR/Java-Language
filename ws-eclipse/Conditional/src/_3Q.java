import java.util.Scanner;

public class _3Q {
	/*
	 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem
	 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o
	 * m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem
	 * crescente ou decrescente.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor1,valor2;
		System.out.println("Digite dois valores: ");
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		sc.close();
		if(valor1%valor2 == 0 || valor2%valor1 == 0 ) {
			System.out.println("S�o Multiplos!");
		}else {
			System.out.println("N�o s�o Multiplos!");
		}
	}

}
