import java.util.Scanner;
/* Utilize vetores para resolver o seguinte problema: uma empresa paga seu pessoal de vendas por comissão.
 *  O pessoal de vendas recebe fixo $200 por semana mais 9% de comissão sobre suas vendas brutas durante a semana.
 *   Por exemplo: um vendedor que vende $5000 numa semana recebe $200 mais 9% de $5000, o que dá um total de $650. 
 *   Escreva um programa em Java que determine quantos vendedores foram classificados nos seguintes intervalos, 
 *   segundo o valor total apurado na semana:
 *    ✓ $200 – 299 
 *    ✓ $300 – 399 
 *    ✓ $400 – 499 
 *    o . . .  
 *    ✓ $900 – 999 
 *    ✓ $1000 e acima 
 */

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Registrador de salários!\n\nInforme o número de trabalhadores: ");
		int n = in.nextInt();
		//criando vetor suficiente para armazenar as informações
		int[] vendas = new int[9];
		//preenchendo o vetor
		for (int i=0; i<n; i++) {
			System.out.println("Digite o total vendido pelo trabalhador " + (i+1) + ": ");
			double sal = in.nextDouble();
			//calculando reajuste
			sal = ((9*sal)/100 + 200);
			//selecionando categoria...
			if (sal <= 299) 
				vendas[0]++;
			else if (sal >= 300 && sal <=399)
				vendas[1]++;
			else if (sal >= 400 && sal <= 499)
				vendas[2]++;
			else if (sal >= 500 && sal <= 599)
				vendas[3]++;
			else if (sal >= 600 && sal <= 699)
				vendas[4]++;
			else if (sal >= 700 && sal <= 799)
				vendas[5]++;
			else if (sal >= 800 && sal <= 899)
				vendas[6]++;
			else if (sal >= 900 && sal <= 999)
				vendas[7]++;
			else if (sal >= 1000)
				vendas[8]++;
			else
				System.out.println("Valor inválido!!!");
		}
		//mostrando tabela final com os valores reajustados
		System.out.println("Valor total apurado na semana:");
		System.out.println("✓ $200 – 299 --> " + vendas[0]);
		System.out.println("✓ $300 – 399 --> " + vendas[1]);
		System.out.println("✓ $400 – 499 --> " + vendas[2]);
		System.out.println("✓ $500 – 599 --> " + vendas[3]);
		System.out.println("✓ $600 – 699 --> " + vendas[4]);
		System.out.println("✓ $700 – 799 --> " + vendas[5]);
		System.out.println("✓ $800 – 899 --> " + vendas[6]);
		System.out.println("✓ $900 – 999 --> " + vendas[7]);
		System.out.println("✓ $1000 ...  --> " + vendas[8]);
		
	}

}
