import java.util.Random;
import java.util.Scanner;
/*Escreva um programa para simular o lançamento de dois dados.
 *  Deve ser utilizada a classe Random para gerar os valores do primeiro e do segundo dado e em seguida deve ser
 *  calculada a soma dos dois valores. Como um dado pode assumir valores de 1 a 6 somente, então a soma deve variar
 *  de 2 a 12, com 7 sendo a soma mais frequente e 2 e 12 as menos frequentes. 
 *  Seu programa deve lançar os dados 36 mil vezes e utilizar um array para contar o número de vezes que cada soma aparece. 
 *  Analise os resultados e verifique se parecem razoáveis: por exemplo, veja na tabela abaixo que há seis maneiras de se 
 *  obter uma soma 7, portanto aproximadamente 1/6 de todos os lançamentos deve resultar numa soma igual a 7.
 */

public class Main2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random alet = new Random();
		
		System.out.print("Simulador de lançamento de dados!\nDigite o número de simulações: ");
		int n = in.nextInt();
		
		//criando vetor para armazenar ocorrências
		int[] vezes = new int[11];
		
		//criando laço para simulação
		for (int i=0; i<n; i++) {
			
			int n1 = alet.nextInt(6) + 1;
			int n2 = alet.nextInt(6) + 1;
			int soma = n1 + n2;
			
			//verificando posição do valor no vetor
			if (soma == 2)
				vezes[0]++;
			else if (soma == 3)
				vezes[1]++;
			else if (soma == 4)
				vezes[2]++;
			else if (soma == 5)
				vezes[3]++;
			else if (soma == 6)
				vezes[4]++;
			else if (soma == 7)
				vezes[5]++;
			else if (soma == 8)
				vezes[6]++;
			else if (soma == 9)
				vezes[7]++;
			else if (soma == 10)
				vezes[8]++;
			else if (soma == 11)
				vezes[9]++;
			else if (soma == 12)
				vezes[10]++;
			else
				System.out.println("ERRO!!!");
					
		}
		System.out.println("Total de ocorrências:");
		System.out.println(" 2 --> " + vezes[0] + " | " + ((double)vezes[0]/n*100) + "%");
		System.out.println(" 3 --> " + vezes[1] + " | " + ((double)vezes[1]/n*100) + "%");
		System.out.println(" 4 --> " + vezes[2] + " | " + ((double)vezes[2]/n*100) + "%");
		System.out.println(" 5 --> " + vezes[3] + " | " + ((double)vezes[3]/n*100) + "%");
		System.out.println(" 6 --> " + vezes[4] + " | " + ((double)vezes[4]/n*100) + "%");
		System.out.println(" 7 --> " + vezes[5] + " | " + ((double)vezes[5]/n*100) + "%");
		System.out.println(" 8 --> " + vezes[6] + " | " + ((double)vezes[6]/n*100) + "%");
		System.out.println(" 9 --> " + vezes[7] + " | " + ((double)vezes[7]/n*100) + "%");
		System.out.println("10 --> " + vezes[8] + " | " + ((double)vezes[8]/n*100) + "%");
		System.out.println("11 --> " + vezes[9] + " | " + ((double)vezes[9]/n*100) + "%");
		System.out.println("12 --> " + vezes[10] + "  | " + ((double)vezes[10]/n*100) + "%");
		
	}

}
