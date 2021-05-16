package mae_de_cleiton;

/*Escreva um programa que exibe os seguintes padr�es separadamente, um embaixo do outro. Utilize loops para gerar os padr�es.
 * Todos os asteriscos devem ser gerados por uma �nica instru��o do tipo System.out.print(�*�);. Al�m desta, voc� poder� utilizar
 * apenas instru��es na forma System.out.println(); e System.out.print(� �); para imprimir quebras de linha e espa�os em branco.
 * a) *            b) **********     c)**********     d)         *
 * 	  **			  *********         *********				**
 * 	  ***			  ********  		 ********			   ***
 * 	  ****			  *******			  *******			  ****
 * 	  *****			  ******			   ******			 *****
 * 	  ******		  *****					*****			******
 * 	  *******		  ****					 ****		   *******
 * 	  ********		  ***					  ***   	  ********
 * 	  *********		  **					   **  		 *********
 * 	  ********** 	  *							* 		**********
 */

public class Questao8 {
	
	public static void main(String[] args) {
		int i =0;
		int j = 0;
		
		System.out.println("A)");
		for ( i=0; i<10; i++) {
			for ( j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("B)");
		for ( i=10; i>0; i--) {
			for ( j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("C)");
		for (i=0; i<10; i++) {
			for (j=0; j<10; j++) {
				if (j < i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		System.out.println("D)");
		for (i=10; i>0; i--) {
			for (j=1; j<=10; j++) {
				if ( j >= i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	}

}
