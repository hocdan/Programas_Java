package Formais;
import java.util.ArrayList;

public class Afe {
	protected ArrayList<String> simbolos = new ArrayList<String>();
	protected String[][] estados;
	protected int[] estadosFinais;
	
	Afe(int n){
		//inicializando vetores com o tamanho do número de estados do Automato
		estados = new String[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				estados[i][j] = "?";
			}
		}
		estadosFinais = new int[n];
	}
	
	//método que cria uma transição do tipo: (estado anterior, símbolo lido, proximo estado)
	public void setTransicao(int ant, String simb, int prox) {
		if ( estados[ant][prox] == "?") this.estados[ant][prox] = simb;
		else if ( !estados[ant][prox].toLowerCase().contains(simb)) estados[ant][prox] += simb;
	}

	//método que adiciona um estado ao conjunto de estados finais...
	public void setEstadoFinal(int n) {
		this.estadosFinais[n] = 1;
	}
	
	//metodo que adiciona simbolos ao alfabeto do automato
	public void setSimbolo(String simb) {
		this.simbolos.add(simb);
	}
	
	//método que imprime informações do automato
	public void getDados() {
		int n = estados.length;
		//imprime as transições do Automato em formato de matriz
		System.out.println("\nRepresentação matricial:\n");
		for ( int k=-1; k<n; k++) {
			if ( k == -1) System.out.print("  ");
			else System.out.print("  q" + k + " ");
		}
		System.out.println();
		for( int i=0; i<n; i++) {
			System.out.print("q" + i);
			for ( int j=0; j<n; j++) {
				System.out.print("| " + estados[i][j] + " |");
			}
			System.out.println();
		}
		//imprime os estados finais do Automato
		System.out.print("\nEstados finais do Automato: { ");
		for (int k=0; k<n; k++) {
			if ( estadosFinais[k] == 1) System.out.print("q"+ k + " ");
		}
		System.out.println("}");
		//imprime o alfabeto do Automato
		System.out.print("Alfabeto do Automato: { ");
		for (int l=0; l<simbolos.size(); l++) {
			System.out.print(this.simbolos.get(l) + " ");
		}
		System.out.println("}");
	}
	
	//OBS: APENAS FAZ O FECHO-VAZIO DE UM ESTADO Q QUALQUER
	public int[] fecho1(int q) {
		//verificando fecho vazio direto do estado Q fornecido
		int n = estados.length;
		int [] fecho1 = new int[n];
		for (int i=0; i<n; i++) {
			if ( estados[q][i].toLowerCase().contains("&") || i == q) fecho1[i] = 1;
			else fecho1[i] = 0;
		}
		//verificando fecho vazio indireto do estado Q fornecido
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if ( fecho1[i] == 1 && estados[i][j].toLowerCase().contains("&")) fecho1[j] = 1;
			}
		}
		//retornando o fecho-vazio do estado Q fornecido
		return fecho1;
	}
	
	//visualizar FECHO-VAZIO de um estado Q
	public void verFecho1( int[] vet, int q) {
		System.out.print("FECHO-" + q + ": { ");
		for (int i=0; i<vet.length; i++) {
			if ( vet[i] == 1) {
				System.out.print("q" + i + " ");
			}
		}
		System.out.println("}\n");
	}
	
	//OBS: APENAS FAZ O FECHO-X DE UM ESTADO Q LENDO UM SIMBOLO X, para calcular o FECHO total para um estado Q aplique várias vezes
	public int[] fecho2(int[] fecho1, int q, String x) {
		//verificando estados do fecho1 que tem transição com um símbolo X do alfabeto
		int n = estados.length;
		for (int i=0; i<n; i++) {
			if ( estados[q][i].toLowerCase().contains(x) && fecho1[i] == 1) fecho1[i] = 1; //vendo se na transição para o estado i existe o simbolo x
			else fecho1[i] = 0; //se não tiver o estado eh retirado do fecho
		}
		int[] fecho2 = fecho1;
		return fecho2;
	}
	
	//visualizar FECHO-X de um estado Q
	public void verFecho2( int[] vet, int q) {
		System.out.print("FECHO-" + q + ": { ");
		for (int i=0; i<vet.length; i++) {
			if ( vet[i] == 1) System.out.print("q" + i + " ");
		}
		System.out.println("}\n");
	}

}
