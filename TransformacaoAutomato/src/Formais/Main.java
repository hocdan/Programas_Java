package Formais;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Conversor de Autômatos!!!\n");
		System.out.print("Número de estados: ");
		int n = in.nextInt();
		Afe automato = new Afe(n);
		
		while (true) {
			System.out.print("\nAÇÕES POSSÍVEIS:\n1- Cadastrar transições\n2- Cadastrar estados finais\n3- Informar alfabeto\n"
					+ "4- Converter para AFN\n5- Visualizar Automato\n6- Sair\n--->");
			int acao = in.nextInt();
			System.out.println();
			if ( acao == 1) {
				while ( true) {
					System.out.println("Transição(estado anterior, símbolo lido, novo estado):");
					int est1 = in.nextInt();
					String simb = in.next();
					int est2 = in.nextInt();
					automato.setTransicao(est1, simb, est2);
					System.out.print("Continuar cadastrando transições(0-Sim/1-Nao)?");
					int r = in.nextInt();
					if ( r == 1) break;
				}
			}
			else if ( acao == 2) {
				System.out.print("Informe o estado final: ");
				int estado = in.nextInt();
				automato.setEstadoFinal(estado);
			}
			else if ( acao == 3) {
				System.out.print("Informe o símbolo: ");
				String simb = in.next();
				automato.setSimbolo(simb);
			}
			else if ( acao == 4) {
				System.out.println("Iniciando conversão...");
				Conversor conversor = new Conversor();
				conversor.converterAfe(automato);
			}
			else if ( acao == 5) {
				automato.getDados();
			}
			else if ( acao == 6) {
				System.out.println("Volte sempre...");
				break;
			}
			else {
				System.err.println("COMANDO INVÁLIDO!!!");
			}
		}
		
	}

}
