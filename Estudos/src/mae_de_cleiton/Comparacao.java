package mae_de_cleiton;
import java.util.Scanner; // importando a classe Scanner para leitura/armazenamento de informa��es

//inicio da classe Comparacao
public class Comparacao {
	
	//inicio do m�todo main
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);//criando um objeto Scanner para utiliza��o
		
		//Adquirindo informa��es
		System.out.println("Comparador de N�meros!!!");
		System.out.print("Informe o primeiro numero: ");
		int n1 = in.nextInt();
		System.out.print("Informe o segundo numero: ");
		int n2 = in.nextInt();
		//Fazendo as compara��es
		if ( n1 == n2) {
			System.out.println(n1 + " � igual a " + n2);
		}
		if ( n1 != n2) {
			System.out.println(n1 + " � diferente de " + n2);
		}
		if ( n1 >= n2) {
			System.out.println(n1 + " � maior ou igual a " + n2);
		}
		if ( n1 <= n2) {
			System.out.println(n1 + " � menor ou igual a " + n2);
			
		}
		if ( n1 > n2) {
			System.out.println(n1 + " � maior que " + n2);
		}
		if ( n1 < n2) {
			System.out.println(n1 + " � menor que " + n2);
		}
		
	}//fim do m�todo main

}//fim da classe Comparacao 
