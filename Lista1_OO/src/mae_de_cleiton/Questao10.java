package mae_de_cleiton;
/*  Um tri�ngulo ret�ngulo pode ter lados cujos comprimentos s�o todos inteiros. O conjunto de tr�s valores inteiros para os
 *  comprimentos dos lados de um tri�ngulo ret�ngulo � chamado de Tripla de Pit�goras. Os comprimentos dos tr�s lados devem
 *  obedecer � rela��o de que a soma dos quadrados de dois dos lados � igual ao quadrado da hipotenusa.
 *  Escreva um programa para identificar todas as triplas de Pit�goras para lado1, lado2 e hipotenusa,
 *  n�o maiores que 500. Utilize um m�todo de for�a bruta, com um loop for triplamente aninhado que tenta todas as possibilidades.
 */

public class Questao10 {
	
	public static void main(String[] args) {
		
		System.out.println("M�todo de for�a bruta pra triplas de pit�goras <= 500!");
		int total = 0;
		
		for (int i=1; i<=500; i++) {
			for ( int j=1; j<=500; j++) {
				for (int k=1; k<=500; k++) {
					if ( (k*k) == ( (i*i) + (j*j) ) || (j*j) == ( (i*i) + (k*k) ) || (i*i) == ( (k*k) + (j*j) ) ) {
						System.out.println("Tripla encontrada: " + i + " " + j + " " + k);
						total++;
					}
				}
			}
		}
		System.out.println("Total de possibilidades: " + total);
		
	}

}
