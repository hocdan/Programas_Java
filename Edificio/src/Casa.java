import java.util.ArrayList;
/* b) Classe: Casa Atributos: cor, porta1, porta2, porta3 
 * M�todo: void pinta(String s), totalDePortas()
   int quantasPortasEstaoAbertas(), int totalDePortas() 
   Para testar, crie uma casa e pinte-a. 
   Crie tr�s portas e coloque-as na casa; abra e feche as mesmas como desejar. 
   Utilize o m�todo quantasPortasEstaoAbertas para imprimir o n�mero de portas abertas.
  */
public class Casa extends Porta{
	private String cor;
	public Porta[] portas;
	
	Casa(int n) {
		portas = new Porta[n];
		for( int i=0; i<n; i++) {
			Porta p = new Porta();
			portas[i] = p;
		}
	}
	
	Casa(){
		
	}
	
	public int totalDePortas() {
		return portas.length;
	}
	
	public int quantasPortasEstaoAbertas() {
		int cont = 0;
		for( int i=0; i<this.portas.length; i++) {
			if ( this.portas[i].estaAberta()) cont++;
		}
		return cont;
	}
	
}
