package mae_de_cleiton;
import java.util.Scanner;
/* Uma grande empresa paga seu pessoal de vendas com base em comissões. Eles recebem $ 200 por semana mais 9% de suas vendas
 * brutas durante essa semana. Por exemplo, um vendedor que realiza um total de vendas de mercadorias de $ 5.000 em uma semana
 * recebe $ 200 mais 9% de $ 5.000 ou um total de $ 650. Desenvolva um aplicativo que receba a entrada de itens vendidos por 
 * um vendedor durante a última semana e calcule e exiba os rendimentos do vendedor. Não há limite quanto ao número de itens 
 * que podem ser vendidos por um mesmo vendedor. 
 */

public class Questao2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Calculador de Comissões 1.0");
		
		int i = 1;
		double total = 0;
		
		System.out.println("Informe 0 para sair!\n");
		while (true) {
			System.out.print("Valor do produto " + i + " vendido: ");
			double valor = in.nextDouble();
			
			total += valor;
			i++;
			
			if (valor == 0) {
				break;
			}
			
		}
		double rendimento = 200 + (total * 9 /100);
		System.out.println("Rendimento da semana: R$" + rendimento);
	}

}
