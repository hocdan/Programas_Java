package mae_de_cleiton;
import java.util.Scanner; //importa a classe Scanner, �til para ler/guardar valores

//inicio da classe Adicao
public class Adicao {
	
	//inicio do m�todo main
	public static void main(String[]args) {
		//Criando um Scanner para leitura
		Scanner in = new Scanner(System.in);
				
		System.out.println("Calculando N�meros!");
		//Obtendo informa��es
		System.out.print("Digite um n�mero:");
		int n1 = in.nextInt(); //armazenando um valor inteiro na variavel n1
		System.out.print("Digite um outro n�mero:");
		int n2 = in.nextInt(); //armazenando um valor inteiro na vari�vel n2
		int soma = n1 + n2; //criando uma variavel que armazene o valor da soma de n1 e n2
		//Devolvendo resultados
		System.out.print("Soma de " + n1 + " + " + n2 + " igual a: " + soma);
		
	}//fim do m�todo main

}//fim da classe Adicao
