import java.util.Locale;
import java.util.Scanner;

public class _3Q {
	/*
	 * Um Posto de combust�veis deseja determinar qual de seus produtos tem a
	 * prefer�ncia de seus clientes. Escreva um algoritmo para ler o tipo de
	 * combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina
	 * 3.Diesel 4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de
	 * 1 a 4) deve ser solicitado um novo c�digo (at� que seja v�lido). O programa
	 * ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
	 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
	 * tipo de combust�vel, conforme exemplo.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Tipo de combust�vel: ");
		System.out.println("1.�lcool\n2.Gasolina\n3.Diesel\n4.Fim");
		System.out.println("Digite sua escolha: ");
		int gasolina=0,alcool=0,diesel=0;
		int opcao = sc.nextInt();
		switch(opcao) {
		case 1:
			System.out.println("Voc� escolheu �lcool!");
			alcool++;
			break;
		case 2:
			System.out.println("Voc� escolheu Gasolina!");
			gasolina++;
			break;
		case 3:
			System.out.println("Voc� escolheu Diesel!");
			diesel++;
			break;
		case 4:
			break;
		}
			while(opcao != 4){
			System.out.println("Tipo de combust�vel: ");
			System.out.println("1.�lcool\n2.Gasolina\n3.Diesel\n4.Fim");
			System.out.println("Digite sua escolha: ");
			opcao = sc.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("Voc� escolheu �lcool!");
				alcool++;
				break;
			case 2:
				System.out.println("Voc� escolheu Gasolina!");
				gasolina++;
				break;
			case 3:
				System.out.println("Voc� escolheu Diesel!");
				diesel++;
				break;
			case 4:
				break;
			}
			
		}
		
		System.out.println("Muito Obrigado!");
		System.out.println("�lcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
	}

}
