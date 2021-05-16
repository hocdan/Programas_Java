import java.util.Scanner;
/* Crie uma classe chamada InteiroGrande que utiliza um vetor de 40 elementos para armazenar inteiros com até 40 dígitos. 
 * Implemente os métodos input, output, add e subtract. Escreva um programa para testar sua classe.
 */
class InteiroGrande{
	
	public int[] inteiro1 = new int[40];
	public int[] inteiro2 = new int[40];
	public int[] resultado = new int[41];
	
	void inputInteiro1(String numero) {
		for (int i=0; i<numero.length(); i++)
			inteiro1[i] = Integer.parseInt(String.valueOf(numero.charAt(i))); //convertendo char em int
	}
	
	void inputInteiro2(String numero) {
		for (int i=0; i<numero.length(); i++)
			inteiro2[i] = Integer.parseInt(String.valueOf(numero.charAt(i))); //convertendo char em int
	}
	
	void addInteiros() {
		int valor = 0, resto = 0;
		for (int i=40; i>=1; i--) {
			valor = inteiro1[i-1] + inteiro2[i-1] + resto;
			if (valor > 10) {
				valor = valor%10;
				resto = 1;
			}
			else {
				resto = 0;
			}
			resultado[i] = valor;
		}
		resultado[0] = resto;
	}
	
	void subInteiros() {
		int valor = 0, resto = 0;
		for (int i=40; i>=1; i--) {
			if ( inteiro1[i-1] < inteiro2[i-1] && i >= 2) {
				inteiro1[i-1] += 10;
				inteiro1[i-2] -= 1;
			}
			else if ( inteiro1[i-1] < inteiro2[i-1] && i == 1) {
				inteiro1[i-1] += 10;
			}
			valor = inteiro1[i-1] - inteiro2[i-1] + resto;
			if (valor > 10) {
				valor = valor%10;
				resto = 1;
			}
			else {
				resto = 0;
			}
			resultado[i] = valor;
		}
		resultado[0] = resto;
	}
	
	void outputResultado() {
		for (int i=0; i<41; i++)
			System.out.print(resultado[i]);
	}
	
}
public class Main4 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		InteiroGrande grande = new InteiroGrande();
		
		//armazenando string dos números
		System.out.print("Calculador de números grandes!\n\nInforme o número 1:");
		String n1 = in.nextLine();
		System.out.print("Informe o número 2:");
		String n2 = in.nextLine();
		
		//convertendo strings
		grande.inputInteiro1(n1);
		grande.inputInteiro2(n2);
		
		//realizando e mostrando operações
		grande.addInteiros();
		System.out.println("\nResultado da soma dos números:");
		grande.outputResultado();
		
		grande.subInteiros();
		System.out.println("\nResultado da subtração dos números:");
		grande.outputResultado();
		/* Números para teste:
		 * 0000000000000000000000000000000000000000
		 * 1111111111111111111111111111111111111111 
		 * 2222222222222222222222222222222222222222
		 * 3333333333333333333333333333333333333333
		 * 4444444444444444444444444444444444444444
		 * 5555555555555555555555555555555555555555
		 * 6666666666666666666666666666666666666666
		 * 7777777777777777777777777777777777777777
		 * 8888888888888888888888888888888888888888
		 * 9999999999999999999999999999999999999999
		 */
		
	}

}
