package mae_de_cleiton;
import java.util.Scanner;

public class TesteAccount {
	
	//inicio do m�todo main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //criando objeto Scanner para leitura de dados
		Account usuario = new Account(); //criando um objeto que ir� utilizar os metodos de Account
		
		System.out.println("Digite seu nome: ");
		String nome = in.nextLine();
		usuario.setName(nome); //utilizando o m�todo setName para passar o nome do usuario para o objeto Account usuario
		System.out.printf("Seja bem vindo, %s", usuario.getName());//utilizando m�todo getName para resgatar o nome do usuario

	}//fim do m�todo main

}//fim da classe TesteAccount
