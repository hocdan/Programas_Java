package mae_de_cleiton;
/*  Um triângulo retângulo pode ter lados cujos comprimentos são todos inteiros. O conjunto de três valores inteiros para os
 *  comprimentos dos lados de um triângulo retângulo é chamado de Tripla de Pitágoras. Os comprimentos dos três lados devem
 *  obedecer à relação de que a soma dos quadrados de dois dos lados é igual ao quadrado da hipotenusa.
 *  Escreva um programa para identificar todas as triplas de Pitágoras para lado1, lado2 e hipotenusa,
 *  não maiores que 500. Utilize um método de força bruta, com um loop for triplamente aninhado que tenta todas as possibilidades.
 */

public class Questao10 {
	
	public static void main(String[] args) {
		
		System.out.println("Método de força bruta pra triplas de pitágoras <= 500!");
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
