package mae_de_cleiton;
import java.util.Scanner;
/*Uma empresa que faz negócios por reembolso postal vende cinco produtos cujos preços são:
 *  Produto 1 - $2,98; Produto 2 - $4,50; Produto 3 - $9,98; Produto 4 - $4,49; Produto 5 - $6,87. 
 *  Escreva um programa que leia uma série de pares de números da forma [número do produto; quantidade vendida]. 
 *  Seu programa deve utilizar a instrução switch para calcular o total de vendas por produto e exibir esse resultado ao final.
 */

public class Questao9 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Venda de Produtos!!!");
		System.out.println("Produto 1 - $2,98/ Produto 2 - $4,50/ Produto 3 $9,98/ Produto 4 - $4,49/ Produto 5 - $6,87/ 6 - Sair");
		
		double valor = 0;
		boolean cont = true;
		
		while (cont) {
			
			System.out.print("Qual o produto?");
			int cod = in.nextInt();
			System.out.print("Quantidade vendida:");
			int quant = in.nextInt();
			
			switch (cod) {
				case 1:
					valor = 2.98 * quant;
					System.out.println("Total a pagar: R$" + valor);
					break;
				case 2:
					valor = 4.50 * quant;
					System.out.println("Total a pagar: R$" + valor);
					break;
				case 3:
					valor = 9.98 * quant;
					System.out.println("Total a pagar: R$" + valor);
					break;
				case 4:
					valor = 4.49 * quant;
					System.out.println("Total a pagar: R$" + valor);
					break;
				case 5:
					valor = 6.87 * quant;
					System.out.println("Total a pagar: R$" + valor);
					break;
				case 6:
					System.out.println("Volte sempre!");
					cont = false;
					break;
				default: System.out.println("Código inválido...tente novamente!");
			}
			
		}
		
	}

}
