package mae_de_cleiton;
import java.util.Scanner;
/*Escreva um aplicativo que imprima a seguinte forma de losango. Somente utilize instru��es de sa�da que imprimam um �nico asterisco,
 *  um �nico espa�o em branco ou um caractere de nova linha. Maximize sua utiliza��o de instru��es de repeti��o e minimize o n�mero de
 *  instru��es de sa�da.
 *  					*
 *  				   ***
 *  				  *****
 *  				 *******
 *  				*********
 *  				 *******
 *  				  *****
 *  				   ***
 *  					*
 *  Modifique o programa do exerc�cio anterior para ler um n�mero �mpar no intervalo de 1 a 19 especificando o n�mero de linhas no losango.
 *  Desenhe ent�o o losango correspondente. 
 */

public class Questao11 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Comprimento(�mpar) do losango: ");
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
