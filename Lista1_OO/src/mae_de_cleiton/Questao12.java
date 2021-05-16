package mae_de_cleiton;
/* Calcule o valor de π usando a série infinita:
 * pi = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...  
 * Imprima uma tabela que mostre o valor aproximado de π computando inicialmente um termo dessa série, depois dois termos, três termos
 * e assim por diante. Quantos termos da série são necessários utilizar antes de primeiro obter 3,14? 3,141? 3,1415? 3,14159?
*/ 

public class Questao12 {
	
	public static void main(String[] args) {
		
		double pi = 4;
		int vezes = 0;
		double den = 3;
		double num = 4;
		
		while ( pi < 3.14 || pi > 3.15) {
			if (vezes%2 == 0) {
				pi -= (num/den);
			}else {
				pi += (num/den);
			}
			System.out.println("Pi = " + pi + " ----> " + num + "/" + den);
			den += 2;
			vezes++;
		}
		System.out.print("Foram feitas " + vezes + " operações");
		
	}

}
