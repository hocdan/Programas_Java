package maeDeCleiton;
import java.util.Scanner;
import java.util.Random;

class Forca {
	Random alet = new Random();
	
	public char[] palavra = {'e', 'l', 'e', 'f', 'a', 'n', 't', 'e'};
	public char[] palavra1 = {'a', 'b', 'a', 'c', 'a', 'x', 'i'};
	public char[] palavra2 = {'c', 'i', 'd', 'a', 'd', 'e'};
	public char[] palavraJ;
	
	//escolhe uma das palavras disponiveis
	char[] geraPalavra() {
		int x = alet.nextInt(3);
		if (x == 0) {
			palavraJ = new char[8];
			return palavra;
		}
		else if (x == 1) {
			palavraJ = new char[7];
			return palavra1;
		}
		else {
			palavraJ = new char[6];
			return palavra2;
		}
	}
	
	//procura a letra na palavra e tambem retorna a situação da vida
	int procuraPalavra(char[] palavra, char letra) {
		int vezes = 0;
		for (int i=0; i<palavra.length; i++) {
			if ( letra == palavra[i]) {
				System.out.println("A letra " + "'" + letra + "'" + " foi encontrada na posição " + (i+1));
				palavraJ[i] = letra;
				vezes++;
			}
		}
		if ( vezes == 0) {
			System.out.println("Sinto muito! A letra " + letra + " não foi encontrada...");
			return -1;
		}
		return 0;
	}
	
	//retorna o vetor de letras do jogador
	char[] retornaPalavra() {
		return palavraJ;
	}
	
	//faz o print na tela da situação das letras conhecidas
	void printPalavra(char[] palavra) {
		for ( int i=0; i< palavra.length; i++) {
			if (palavraJ[i] == palavra[i]) {
				System.out.print(palavra[i] + " ");
			}
			else {
				System.out.print("? ");
			}
		}
	}
	
	//verifica vitoria do jogador
	boolean vitoriaJogador(char [] palavra, char[] palavraJ) {
		int vezes = 0;
		
		for ( int i=0; i<palavra.length; i++) {
			if ( palavraJ[i] == palavra[i]) {
				vezes++;
			}
		}
		
		if ( vezes == palavra.length) return true;
		else return false;
		
	}
	
}

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Forca forca = new Forca();
		
		System.out.println("Jogo da Forca 1.0\n");
		System.out.println("Você tem direito a 5 vidas!");
		
		int vidas = 5;
		char[] palavra = forca.geraPalavra();
		System.out.println("Sua palavra tem " + palavra.length + " letras!");
		while ( true ) {
			
			System.out.println("\nVocê tem " + vidas + " vidas");
			
			System.out.print("Escolha  uma letra: ");
			char letra = in.next().trim().charAt(0);
			
			int attVida = forca.procuraPalavra(palavra, letra);
			vidas += attVida;
			char[] palavraJogador = forca.retornaPalavra();
			
			System.out.println("\nSituação atual:");
			forca.printPalavra(palavra);
			
			if (forca.vitoriaJogador(palavra, palavraJogador)) {
				System.out.println("\nVOCÊ GANHOU!!!!");
				break;
			}else if (vidas == 0) {
				System.out.println("\nVOCÊ PERDEU!!!!");
				System.out.println("A resposta certa era: ");
				for ( int i=0; i<palavra.length; i++) {
					System.out.print(palavra[i]);
				}
				break;
			}
			
		}
		
		
	}

}
