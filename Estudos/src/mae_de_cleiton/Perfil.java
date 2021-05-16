package mae_de_cleiton;
import java.util.Scanner;

public class Perfil {
	Scanner in = new Scanner(System.in);
	
	String nome;
	String sexo;
	int idade;
	double salario;
	
	public void insereInfo() {
		System.out.println("Armazenando dados...");
		System.out.print("Qual o seu nome? ");
		nome = in.nextLine();
		System.out.print("Qual a sua idade? ");
		idade = in.nextInt();
		in.nextLine(); //ajustando leitura do teclado
		System.out.print("Qual o seu sexo? ");
		sexo = in.nextLine();
		System.out.print("Qual o seu salário? ");
		salario = in.nextDouble();
	}
	
	public void retiraInfo() {
		System.out.println("\nPerfil de " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Salário: " + salario);
	}

}
