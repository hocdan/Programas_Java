import java.util.Scanner;
/*  Uma maneira comum de impedir a fraude cheques é requerer que o valor do cheque seja escrito por extenso.
 *  Codifique um programa, utilizando strings, que receba um valor numérico e retorne o mesmo por extenso. 
 *  Por exemplo, R$ 1.230,75 seria “um mil duzentos e trinta reais e setenta e cinco centavos”.
 */
public class Main5 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//valores por extenso
		String[] unidades = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
		String[] dezenas  = {"zero", "dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
		String[] centenas = {"zero", "cem", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};
		
		System.out.print("Informe o valor em R$:");
		String valor = in.nextLine();
		
		//decompondo a string
		String p1 = "", p2 = "";
		int j = 0;
		for( int i=0; i<valor.length(); i++) {
			if ( valor.charAt(i) != ',' && j > 0) p2 += valor.charAt(i);
			else if ( valor.charAt(i) != ',') p1 += valor.charAt(i);
			else j++; 
		}

		//verificando milhares, centenas, dezenas, unidades... na parte 1
		if ( p1.length() == 4) {
			
			for( int i=0; i<p1.length(); i++) {
				String x = Character.toString(p1.charAt(i));
				j = Integer.parseInt(x);
				if ( i == 0) System.out.print(unidades[j] + " mil ");
				else if ( i == 1 && j != 0) System.out.print(centenas[j] + " ");
				else if ( i == 2 && j != 0) System.out.print("e " + dezenas[j] + " ");
				else if ( i == 3 && j != 0) System.out.print("e " + unidades[j]);
			}
			System.out.print(" reais ");
			
		}
		else if ( p1.length() == 3) {
			
			for( int i=0; i<p1.length(); i++) {
				String x = Character.toString(p1.charAt(i));
				j = Integer.parseInt(x);
				if ( i == 0 && j != 0) System.out.print(centenas[j] + " ");
				else if ( i == 1 && j!= 0) System.out.print("e " + dezenas[j] + " ");
				else if ( i == 2 && j != 0) System.out.print("e " + unidades[j]);
			}
			System.out.print(" reais ");
			
		}
		else if ( p1.length() == 2) {
			
			for( int i=0; i<p1.length(); i++) {
				String x = Character.toString(p1.charAt(i));
				j = Integer.parseInt(x);
				if ( i == 0 && j != 0) System.out.print("e " + dezenas[j] + " ");
				else if ( i == 1 && j != 0) System.out.print("e " + unidades[j]);
			}
			System.out.print(" reais ");
			
		}
		else if ( p1.length() == 1) {
			
			for( int i=0; i<p1.length(); i++) {
				String x = Character.toString(p1.charAt(i));
				j = Integer.parseInt(x);
				if ( i == 0) System.out.print(unidades[j] + " reais ");
			}
			
		}
		//verificando dezenas e unidades... na parte 2
		if (p2.length() == 2) {
			
			for( int i=0; i<p2.length(); i++) {
				String x = Character.toString(p2.charAt(i));
				j = Integer.parseInt(x);
				if ( i == 0 && j != 0) System.out.print("e " + dezenas[j] + " ");
				else if ( i == 1 && j != 0) System.out.print("e " + unidades[j]);
			}
			System.out.print(" centavos");
			
		}
		else if ( p2.length() == 1) {
			
			for( int i=0; i<p2.length(); i++) {
				String x = Character.toString(p2.charAt(i));
				j = Integer.parseInt(x);
				if ( i == 0) System.out.print("e " + unidades[j] + " centavos");
			}
			
		}
		
	}
	
}
