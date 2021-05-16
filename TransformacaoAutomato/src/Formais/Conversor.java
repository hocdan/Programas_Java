package Formais;

public class Conversor{

	public void converterAfe(Afe afe) {
		int[] fecho2 = new int[afe.estados.length];
		for ( int m=0; m<afe.estados.length; m++) {
			System.out.println("Estado q" + m);
			int[] fecho1 = afe.fecho1(m); //calculando o fecho1 do estado m
			for ( int i=0; i<afe.simbolos.size(); i++) { //percorrendo todos os simbolos do alfabeto
				String simb = afe.simbolos.get(i); // pegando um simbolo (atual)
				System.out.println("Simbolo " + simb + ":\n");
				for ( int j=0; j<fecho1.length; j++) { //percorrendo todos os estados do fecho1 de m
					fecho1 = afe.fecho1(m); //recalculando o fecho1 para n ser sobrescrito
					if ( fecho1[j] == 1) { //se o estado faz parte do fecho1 de 0 entao...
						System.out.print("q" + j + ": { ");
						int [] fecho2Temp = afe.fecho2(fecho1, j, simb); //calculando fecho2 para o estado j com simbolo simb
						//colocando os estados encontrados no fecho2 temporario para o fecho2 definitivo
						for ( int k=0; k<fecho2Temp.length; k++) {
							if ( fecho2Temp[k] == 1) {
								fecho2[k] = 1;
								System.out.print("q" + k + " ");
							}
						}
						System.out.println("}");
					}
				}
				//fecho que tem os estados que iremos calcular o fecho vazio de cada um para gerar as novas transições
				System.out.print("Fecho Simbolo: { ");
				for ( int l=0; l<fecho2.length; l++) {
					if ( fecho2[l] == 1) System.out.print("q" + l + " ");
				}
				System.out.println("}");
				//calculando fecho vazio de cada um deles e armazenando em outro fecho
				int[] fecho3 = new int[afe.estados.length];
				for( int l=0; l<fecho3.length; l++) {
					if ( fecho2[l] == 1) {
						fecho1 = afe.fecho1(l);
						//adicionando estados do fecho vazio do estado L no fecho final
						for ( int n=0; n<fecho3.length; n++) {
							if ( fecho1[n] == 1) fecho3[n] = 1;
						}
					}
				}
				//setando as novas transições de acordo com o fecho final
				for ( int l=0; l<fecho3.length; l++) {
					if ( fecho3[l] == 1) {
						afe.setTransicao(m, simb, l); // m = estado que fizemos o fecho e l o estado do fecho final
					}
				}
				//verificando se o estado M pertence ao conjunto dos estados finais
				for ( int l=0; l<afe.estadosFinais.length; l++) {
					if ( afe.estadosFinais[l] == 1 && fecho3[l] == 1) afe.setEstadoFinal(m);
				}
				//mostrando fecho final q irá dizer as novas transições
				System.out.print("Fecho final: { ");
				for ( int l=0; l<fecho3.length; l++) {
					if ( fecho3[l] == 1) System.out.print("q" + l + " ");
				}
				System.out.println("}\n\n");
				//zerando fecho final
				for ( int l=0; l<fecho2.length; l++) {
					fecho2[l] = 0;
				}
			}
		}
		//ao fim de tudo, excluimos tds os simbolos vazios das transições do automato
		for ( int i=0; i<afe.estados.length; i++) {
			for ( int j=0; j<afe.estados.length; j++) {
				if ( afe.estados[i][j].toLowerCase().contains("&")) {
					afe.estados[i][j] = afe.estados[i][j].replace("&", "");
				}
			}
		}
	}

}
