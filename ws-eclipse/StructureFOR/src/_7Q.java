import java.util.Locale;
import java.util.Scanner;

public class _7Q {
	/*
	 * Fazer um programa para ler um n�mero inteiro positivo N. O programa deve
	 * ent�o mostrar na tela N linhas, come�ando de 1 at� N. Para cada linha,
	 * mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme
	 * exemplo
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor N: ");
		int N = sc.nextInt();

		for (int cont = 1; cont <= N; cont++) {
			System.out.println(cont + " " + (int) Math.pow(cont, 2) + " " + (int) Math.pow(cont, 3));
		}
		sc.close();
	}

}
