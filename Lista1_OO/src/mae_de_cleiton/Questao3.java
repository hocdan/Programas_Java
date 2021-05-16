package mae_de_cleiton;
import java.util.Scanner;
/* Desenvolva um aplicativo que determine o salário bruto dos empregados de uma empresa. A empresa paga ‘hora normal’ pelas
 * primeiras 40 horas trabalhadas pelo funcionário e 50% para todas as horas trabalhadas além de 40 horas. Você recebe uma
 * lista dos empregados da empresa, o número de horas trabalhadas por empregado na última semana e o salário-hora de cada empregado.
 * Seu programa deverá determinar o salário bruto de cada empregado.
 */

public class Questao3 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Calculador de Salários/hora 1.0");
		System.out.println("Informe 0 para sair!\n");
		
		//verificando o número de funcionários
		System.out.print("Número de empregados: ");
		int n = in.nextInt();
		
		//armazenando valor da 'hora normal'
		System.out.print("Valor da hora normal: ");
		double valorHora = in.nextDouble();
		
		//inicializando variáveis
		double salario = 0;
		int horas = 0;
		
		for (int i=0; i < n; i++) {
			in.nextLine(); //ajustando leitura do teclado
			System.out.print("Nome do empregado: ");
			String nome = in.nextLine();
			System.out.print("Horas trabalhadas: ");
			horas = in.nextInt();
			
			if (horas > 40) {
				int horaExtra = horas - 40;
				salario = (valorHora * 40) + (valorHora * horaExtra / 2);
			}else {
				salario = valorHora * horas;
			}
			
			System.out.println("O empregado " + nome + " irá ganhar R$" + salario);
		}
		
	}

}
