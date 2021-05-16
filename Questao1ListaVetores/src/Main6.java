import java.util.Scanner;
import java.util.ArrayList;
/* Reescreva o exerc�cio da Caderneta(esp�cie de bloco de notas), passado em sala de aula, 
 * utilizando algum tipo de cole��o de tamanho vari�vel (p. ex., ArrayList). 
 */
class Caderneta{
	private ArrayList notas = new ArrayList();
	
	public void addNota(String nota) {
		notas.add(nota);
		System.out.println("Guardando anota��o...");
	}
	
	public void getNota(int pos) {
		if ( (pos-1) < 0 || (pos-1) >= notas.size()) {
			System.out.println("N�mero de anota��o inv�lido!!!");
		}
		else {
			System.out.println("Anota��o " + (pos) + ":");
			System.out.println(notas.get(pos-1) + "\n");
		}
	}
	
	public void getTotal() {
		System.out.println("Todas as anota��es cadastradas:");
		for(int i=0; i<notas.size(); i++) {
			System.out.println((i+1) + " --> " + notas.get(i));
		}
		System.out.println("Total: " + notas.size() + "\n");
	}
	
	public void removeNota(int pos) {
		if ( (pos-1) < 0 || (pos-1) >= notas.size()) {
			System.out.println("N�mero de anota��o inv�lido!!!");
		}
		else {
			System.out.println(notas.remove(pos-1));
			System.out.println("Anota��o " + (pos) + " removida com sucesso!");
		}
	}
	
}
public class Main6 {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Caderneta anotacao = new Caderneta();
		
		System.out.println("Bem vindo a Caderneta 2000!");
		System.out.println("O que deseja fazer?\n1-Adicionar nota\n2-Remover nota\n3-Ler nota espec�fica\n4-Ler todas as notas\n5-Sair do programa");
		while (true) {
			System.out.print("A��o:");
			int acao = in.nextInt();
			
			if ( acao == 1) {
				System.out.print("Informe a anota��o:");
				in.nextLine();
				String texto = in.nextLine();
				anotacao.addNota(texto);
			}
			else if ( acao == 2) {
				System.out.print("Informe o n�mero da anota��o que ser� apagada:");
				int n = in.nextInt();
				anotacao.removeNota(n);
			}
			else if ( acao == 3) {
				System.out.print("Informe o n�mero da anota��o que ser� visualizada:");
				int n = in.nextInt();
				anotacao.getNota(n);
			}
			else if ( acao == 4) {
				anotacao.getTotal();
			}
			else if ( acao == 5) {
				System.out.println("Encerrando aplica��o...");
				break;
			}
			
		}
		
	}

}
