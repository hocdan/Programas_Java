import java.util.ArrayList;
/* c) Classe: Edificio Atributos: cor, totalDePortas, totalDeAndares, portas[] 
   M�todos: void pinta(String s), int quantasPortasEstaoAbertas(), void adicionaPorta(Porta p),
   int totalDePortas(), void adicionarAndar(), int totalDeAndares()  
   Para testar, crie um edif�cio, pinte-o. 
   Crie seis portas e coloque-as no edif�cio atrav�s do m�todo adicionaPorta, abra e feche-as 
   como desejar. Utilize o m�todo quantasPortasEstaoAbertas para imprimir o n�mero de portas abertas
   e o m�todo totalDePortas para imprimir o total de portas em seu edif�cio. 
   Cria alguns andares utilizado o m�todo adicionarAndar e retorne o n�mero total de andares utilizando
   o m�todo totalDeAndares.
 */
public class Edficio extends Casa{
	private String cor;
	private int totalDePortas;
	private int totalDeAndares;
	
	Edficio( Casa c, int n ){
		super(n);
		c.portas = new Porta[n];
	}
	
	public void adicionaPorta( Porta p) {
		portas[this.totalDePortas] = p;
		this.totalDePortas++;
	}
	
	public void adicionarAndar() {
		this.totalDeAndares++;
	}
	
	public int totalDeAndares() {
		return this.totalDeAndares;
	}
	
}
