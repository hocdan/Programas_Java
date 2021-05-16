package construcoes;
import java.util.ArrayList;
/* b) Classe: Casa Atributos: cor, porta1, porta2, porta3 
 * M�todo: void pinta(String s), totalDePortas() int quantasPortasEstaoAbertas(), int totalDePortas() 
 * Para testar, crie uma casa e pinte-a. Crie tr�s portas e coloque-as na casa; abra e feche as mesmas como desejar. 
 * Utilize o m�todo quantasPortasEstaoAbertas para imprimir o n�mero de portas abertas.
 * 
 * ESTADO DE DESENVOLVIMENTO: OK!
*/ 
public class Casa extends Imovel{
	private String cor;
	private int totalDePortas;
	
	public void adicionarPorta(Porta p) {
		if ( this.totalDePortas >= 3) System.err.println("Limite de portas alcan�ado! Imposs�vel adicionar...\n");
		else {
			this.portas.add(p);
			this.totalDePortas++;
			System.out.println("Porta adicionada com sucesso...\n");
		}
	}
	
	public void abrirPorta(int i) {
		if ( i > 3 || i < 0 || i > portas.size()-1) System.err.println("�ndice de porta inv�lido!!!\n");
		else this.portas.get(i).abre();
	}
	
	public void fecharPorta(int i) {
		if ( i > 3 || i < 0 || i > portas.size()-1) System.err.println("�ndice de porta inv�lido!!!\n");
		else this.portas.get(i).fecha();
	}
	
	public int totalDePortas() {
		return this.totalDePortas;
	}

}
