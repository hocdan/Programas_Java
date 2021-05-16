import java.util.ArrayList;
/* c) Classe: Edificio Atributos: cor, totalDePortas, totalDeAndares, portas[] 
   Métodos: void pinta(String s), int quantasPortasEstaoAbertas(), void adicionaPorta(Porta p),
   int totalDePortas(), void adicionarAndar(), int totalDeAndares()  
   Para testar, crie um edifício, pinte-o. 
   Crie seis portas e coloque-as no edifício através do método adicionaPorta, abra e feche-as 
   como desejar. Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas abertas
   e o método totalDePortas para imprimir o total de portas em seu edifício. 
   Cria alguns andares utilizado o método adicionarAndar e retorne o número total de andares utilizando
   o método totalDeAndares.
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
