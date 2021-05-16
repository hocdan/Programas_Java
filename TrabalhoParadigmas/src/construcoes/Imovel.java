package construcoes;
import java.util.ArrayList;
/* As classes Casa e edif�cio ficaram muito parecidas: Atributos: cor, totalDePortas(apenas 3 na Casa), 
 * totalDeAndares, portas[],  void pinta(String s), int quantasPortasEstaoAbertas(), 
 * void adicionaPorta(Porta p), int totalDePortas().  
 * Crie a classe Imovel e coloque nela tudo o Casa e Edificio tem em comum. 
 * Fa�a Imovel superclasse de Casa e Edificio. 
 * Note que alguns m�todos em comum n�o poder�o ser implementados por Imovel 
 * (e.g., quantasPortasEstaoAbertas e totalDePortas). 
 * Logo, essesdever�o ser declarados como m�todos abstratos. 
 * 
 * ESTADO DE DESENVOLVIMENTO: OK!
 */
public class Imovel {
	public ArrayList<Porta> portas = new ArrayList<Porta>();
	public ArrayList<Casa> casas = new ArrayList<Casa>();
	public ArrayList<Edificio> edificios = new ArrayList<Edificio>();
	private String cor;
	private int totalDePortas;
	
	public void pinta(String s) {
		this.cor = s;
		System.out.println("Nova cor do im�vel: " + s + "\n");
	}
	
	public void pintaPorta( int i, String s) {
		if ( i > this.portas.size()-1 || i < 0) System.err.println("\n�ndice inv�lido!!!");
		else this.portas.get(i).pinta(s);
	}
	
	public int quantasPortasEstaoAbertas() {
		int cont = 0;
		
		for( int i =0; i<this.portas.size(); i++) {
			Porta p = (Porta)this.portas.get(i);
			if ( p.estaAberta()) {
				cont++;
			}
		}
		return cont;
	}
	
	public void adicionarPorta(Porta p) {
		this.portas.add(p);
		System.out.println("Porta adicionada com sucesso...\n");
		this.totalDePortas++;
	}
	
	public void abrirPorta(int i) {
		if ( i < 0 || i > portas.size()-1) System.err.println("�ndice de porta inv�lido!!!\n");
		else this.portas.get(i).abre();
	}
	
	public void fecharPorta(int i) {
		if ( i < 0 || i > portas.size()-1) System.err.println("�ndice de porta inv�lido!!!\n");
		else this.portas.get(i).fecha();
	}
	
	public int totalDePortas() {
		return this.totalDePortas;
	}
	
	public void adicionaCasa(Casa c) {
		this.casas.add(c);
		System.out.println("Nova Casa adicionada com sucesso!");
	}
	
	public void listarCasas() {
		
		if ( this.casas.size() == 0) System.err.println("Sem casas armazenadas no momento!!!");
		else {
			for ( int i=0; i<casas.size(); i++) {
				Casa c = (Casa)casas.get(i);
				System.out.println("\nInforma��es da Casa " + (i+1) + ":");
				System.out.println("Tem um total de: " + c.totalDePortas() + " porta(s)");
				for ( int j=0; j<c.portas.size(); j++) {
					Porta p = (Porta)c.portas.get(j);
					System.out.println("Porta " + (j+1) + " est� aberta? " + p.estaAberta());
				}
				System.out.println("H� " + c.quantasPortasEstaoAbertas() + " porta(s) aberta(s) na casa!\n");
			}
		}
	}
	
	public void adicionaEdificio(Edificio e) {
		this.edificios.add(e);
		System.out.println("Novo Edif�cio adicionado com sucesso!");
	}
	
	public void listarEdificios() {
		
		if (this.edificios.size() == 0) System.err.println("Sem edif�cios armazenados no momento!!!");
		else {
			for ( int i=0; i<edificios.size(); i++) {
				Edificio e = (Edificio)edificios.get(i);
				System.out.println("\nInforma��es do Edif�cio " + (i+1) + ":");
				System.out.println("Tem um total de: " + e.totalDeAndares() + " andares");
				System.out.println("Tem um total de: " + e.totalDePortas() + " porta(s)");
				for ( int j=0; j<e.totalDeAndares(); j++) {
					e.totalDePortasPorAndar(j);
					System.out.println();
				}
				System.out.println("Total de porta(s) aberta(s) no edif�cio: " + e.quantasPortasEstaoAbertas() + "\n");
			}
		}
	}
	
}
