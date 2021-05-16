package mae_de_cleiton;
import java.util.Scanner;
/*Escreva um aplicativo que imprima a seguinte forma de losango. Somente utilize instruções de saída que imprimam um único asterisco,
 *  um único espaço em branco ou um caractere de nova linha. Maximize sua utilização de instruções de repetição e minimize o número de
 *  instruções de saída.
 *  					*
 *  				   ***
 *  				  *****
 *  				 *******
 *  				*********
 *  				 *******
 *  				  *****
 *  				   ***
 *  					*
 *  Modifique o programa do exercício anterior para ler um número ímpar no intervalo de 1 a 19 especificando o número de linhas no losango.
 *  Desenhe então o losango correspondente. 
 */

public class Questao11 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Comprimento(ímpar) do losango: ");
		int comp = in.nextInt();
		
		int meio = comp/2;
		int lado1 = meio;
		int lado2 = meio;
		
		for (int i=0; i<comp; i++) {
			for (int j=0; j<comp; j++) {
				if ( j >= lado1 && j <= lado2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
			if (i < meio) {
				lado1--;
				lado2++;
			}else {
				lado1++;
				lado2--;
			}
		}
		
		
	}

}
