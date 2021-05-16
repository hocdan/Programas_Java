package mae_de_cleiton;
import java.util.Scanner; // importando a classe Scanner para leitura/armazenamento de informações

//inicio da classe Comparacao
public class Comparacao {
	
	//inicio do método main
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);//criando um objeto Scanner para utilização
		
		//Adquirindo informações
		System.out.println("Comparador de Números!!!");
		System.out.print("Informe o primeiro numero: ");
		int n1 = in.nextInt();
		System.out.print("Informe o segundo numero: ");
		int n2 = in.nextInt();
		//Fazendo as comparações
		if ( n1 == n2) {
			System.out.println(n1 + " é igual a " + n2);
		}
		if ( n1 != n2) {
			System.out.println(n1 + " é diferente de " + n2);
		}
		if ( n1 >= n2) {
			System.out.println(n1 + " é maior ou igual a " + n2);
		}
		if ( n1 <= n2) {
			System.out.println(n1 + " é menor ou igual a " + n2);
			
		}
		if ( n1 > n2) {
			System.out.println(n1 + " é maior que " + n2);
		}
		if ( n1 < n2) {
			System.out.println(n1 + " é menor que " + n2);
		}
		
	}//fim do método main

}//fim da classe Comparacao 
