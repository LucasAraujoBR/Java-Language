package questao01;

import java.util.Arrays;

public class Mainteste {

	public static void main(String[] args) {
		int tamanho = 6;
		BilheteDeLoteria bl = new BilheteDeLoteria(tamanho);
		BilheteDeLoteria bl2 = new BilheteDeLoteria(tamanho);
		MinhaLoteria ml = new MinhaLoteria(bl.executaBilheteDeLoteria(tamanho));
		bl.executaBilheteDeLoteria(tamanho);
		bl2.executaBilheteDeLoteria(tamanho);
		System.out.println("Primeiro BilheteDeLoteria tamanho 6, numeros = " + bl.toString());
		System.out.println("Segundo BilheteDeLoteria tamanho 6, numeros = " + bl2.toString());
		
		System.out.println("Quantidades de valores comuns entre os dois bilhetes: " + bl2.qtdNumerosContidos(bl));
		System.out.println("Bilhete Premiado: "+bl.toString());
		ml.executaLoteria(bl.executaBilheteDeLoteria(tamanho), tamanho);

		System.out.println("Jogos de n�meros " + tamanho + ": voc� apostou " + ml.retornaResultados()
				+ " vezes para ganhar na mega-sena. Dentre esses jogos, voc� acertou " + ml.retornaQuadra()
				+ " quadras e " + ml.retornaQuina() + " quinas.");
		
		tamanho = 7;
		ml.executaLoteria(bl.executaBilheteDeLoteria(tamanho), tamanho);
		System.out.println("Jogos de n�meros " + tamanho + ": voc� apostou " + ml.retornaResultados()
				+ " vezes para ganhar na mega-sena. Dentre esses jogos, voc� acertou " + ml.retornaQuadra()
				+ " quadras e " + ml.retornaQuina() + " quinas.");
		tamanho = 8;
		ml.executaLoteria(bl.executaBilheteDeLoteria(tamanho), tamanho);
		System.out.println("Jogos de n�meros " + tamanho + ": voc� apostou " + ml.retornaResultados()
				+ " vezes para ganhar na mega-sena. Dentre esses jogos, voc� acertou " + ml.retornaQuadra()
				+ " quadras e " + ml.retornaQuina() + " quinas.");
		tamanho = 9;
		ml.executaLoteria(bl.executaBilheteDeLoteria(tamanho), tamanho);
		System.out.println("Jogos de n�meros " + tamanho + ": voc� apostou " + ml.retornaResultados()
				+ " vezes para ganhar na mega-sena. Dentre esses jogos, voc� acertou " + ml.retornaQuadra()
				+ " quadras e " + ml.retornaQuina() + " quinas.");
		tamanho = 10;
		ml.executaLoteria(bl.executaBilheteDeLoteria(tamanho), tamanho);
		System.out.println("Jogos de n�meros " + tamanho + ": voc� apostou " + ml.retornaResultados()
				+ " vezes para ganhar na mega-sena. Dentre esses jogos, voc� acertou " + ml.retornaQuadra()
				+ " quadras e " + ml.retornaQuina() + " quinas.");
		tamanho = 11;
		ml.executaLoteria(bl.executaBilheteDeLoteria(tamanho), tamanho);
		System.out.println("Jogos de n�meros " + tamanho + ": voc� apostou " + ml.retornaResultados()
				+ " vezes para ganhar na mega-sena. Dentre esses jogos, voc� acertou " + ml.retornaQuadra()
				+ " quadras e " + ml.retornaQuina() + " quinas.");
		tamanho = 12;
		ml.executaLoteria(bl.executaBilheteDeLoteria(tamanho), tamanho);
		System.out.println("Jogos de n�meros " + tamanho + ": voc� apostou " + ml.retornaResultados()
				+ " vezes para ganhar na mega-sena. Dentre esses jogos, voc� acertou " + ml.retornaQuadra()
				+ " quadras e " + ml.retornaQuina() + " quinas.");
		tamanho = 13;
		ml.executaLoteria(bl.executaBilheteDeLoteria(tamanho), tamanho);
		System.out.println("Jogos de n�meros " + tamanho + ": voc� apostou " + ml.retornaResultados()
				+ " vezes para ganhar na mega-sena. Dentre esses jogos, voc� acertou " + ml.retornaQuadra()
				+ " quadras e " + ml.retornaQuina() + " quinas.");
		tamanho = 14;
		ml.executaLoteria(bl.executaBilheteDeLoteria(tamanho), tamanho);
		System.out.println("Jogos de n�meros " + tamanho + ": voc� apostou " + ml.retornaResultados()
				+ " vezes para ganhar na mega-sena. Dentre esses jogos, voc� acertou " + ml.retornaQuadra()
				+ " quadras e " + ml.retornaQuina() + " quinas.");
		tamanho = 15;
		ml.executaLoteria(bl.executaBilheteDeLoteria(tamanho), tamanho);
		System.out.println("Jogos de n�meros " + tamanho + ": voc� apostou " + ml.retornaResultados()
				+ " vezes para ganhar na mega-sena. Dentre esses jogos, voc� acertou " + ml.retornaQuadra()
				+ " quadras e " + ml.retornaQuina() + " quinas.");

	}

}
