package construcoes;
import java.util.ArrayList;
/* Atributos: cor, totalDePortas, totalDeAndares, portas[] 
 * Métodos: void pinta(String s), int quantasPortasEstaoAbertas(), void adicionaPorta(Porta p), int totalDePortas(), 
 * void adicionarAndar(), int totalDeAndares()  Para testar, crie um edifício, pinte-o. 
 * Crie seis portas e coloque-as no edifício através do método adicionaPorta, abra e feche-as como desejar. 
 * Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas abertas e o método totalDePortas para
 * imprimir o total de portas em seu edifício e o número de portas por andar. 
 * Cria alguns andares utilizado o método adicionarAndar e retorne o número total de andares utilizando o método 
 * totalDeAndares.
 * 
 * ESTADO DE DESENVOLVIMENTO: OK!
*/

public class Edificio extends Imovel{
	private String cor;
	private int totalDePortas, totalDeAndares;
	
	public void adicionarPorta(Porta p, int andar) {
		
		if ( andar < this.totalDeAndares && andar >= 0) {
			//adicionando porta caso andar seja válido
			p.setAndar(andar);
			this.portas.add(p);
			this.totalDePortas++;
			System.out.println("Porta adicionada com sucesso...\n");
			//incrementando número de portas
		}
		else System.err.print("Andar inválido!!!!");
	}
	
	public void adicionaAndar() {
		this.totalDeAndares++;
		System.out.println("Andar adicionado!\n");
	}
	
	public int totalDeAndares() {
		return this.totalDeAndares;
	}
	
	public int totalDePortas() {
		return this.totalDePortas;
	}
	
	public void totalDePortasPorAndar(int andar) {
		int total = 0;
		if ( andar < totalDeAndares && andar >= 0) {
			for ( int i=0; i<this.portas.size(); i++) {
				if (portas.get(i).getAndar() == andar) total++;
			}
			System.out.print("Existem " + total + " portas no andar " + andar + "!");
		}
		else {
			System.err.print("Andar inválido!!!!");
		}
	}

}
