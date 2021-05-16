import java.util.Scanner;
/* Uma companhia a�rea lhe contratou para desenvolver seu novo sistema de reservas. 
 * Inicialmente, foi-lhe solicitado escrever um programa para aloca��o de assentos nos voos. 
 * Considere que cada avi�o possui 20 fileiras com 6 assentos cada, sendo que as fileiras 1-5 est�o reservadas
 * para a Primeira Classe e as de n�meros 6-20 para a Classe Econ�mica. 
 * Os assentos em cada fileira s�o identificados com letras (A, B, C, D, E, F). 
 * Seu programa deve perguntar ao usu�rio se ele deseja reservar assentos na Primeira Classe ou na Econ�mica e
 * em seguida mostrar o mapa de assentos indicando os lugares ocupados e vagos. O usu�rio deve informar o assento
 * desejado utilizando uma combina��o de letra e n�mero (por exemplo: 20A). Ao final, imprima um cart�o de embarque
 * fict�cio com o n�mero do assento e se este � na primeira classe ou na classe econ�mica. Aten��o: seu programa 
 * nunca deve atribuir um passageiro a uma poltrona j� reservada. Armazene o mapa de assentos em um array bidimensional
 * do tipo boolean, inicializando-o com todos os campos iguais a false. 
 */
public class Main3 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//criando matriz(ja inicializada com valores false) com os assentos dispon�veis
		boolean[][] assentos = new boolean[20][6];
		//loop do programa
		while (true) {
			
			//mostrando assentos dispon�veis
			System.out.println("Mae de Cleiton Airlines!!!\nD� uma olhada em nossos assentos dispon�veis:");
			System.out.println("  A     B     C     D     E     F   ");
			for (int i=0; i<assentos.length; i++) {
				for (int j=0; j<assentos[i].length; j++) {
					if (assentos[i][j] == true)
						System.out.print("  X   ");
					else
						System.out.print("  ?   ");
				}
				System.out.println(" " + (i+1));
			}
			
			//solicitando assento desejado
			System.out.print("Deseja viajar na Primeira Classe ou Econ�mica(0/1)? ");
			int classe = in.nextInt();
			System.out.print("Digite o assento desejado(numero+letra): ");
			in.nextLine();
			String lugar = in.nextLine();
			
			//verificando lugar solicitado
			if (lugar.length() == 3) {
				//convertendo string para int
				String num = lugar.charAt(0) + "" + lugar.charAt(1);
				int fileira = Integer.parseInt(num)-1;
				int col = -1;
				if ( lugar.charAt(2) == 'A')
					col = 0;
				else if ( lugar.charAt(2) == 'B')
					col = 1;
				else if ( lugar.charAt(2) == 'C')
					col = 2;
				else if ( lugar.charAt(2) == 'D')
					col = 3;
				else if ( lugar.charAt(2) == 'E')
					col = 4;
				else if ( lugar.charAt(2) == 'F')
					col = 5;
				//verificando possibilidades do assento
				if ( assentos[fileira][col] == false) {
					if ( classe == 1 && fileira >= 5) {
						assentos[fileira][col] = true;
						System.out.println("Passagem aceita com sucesso!\nAssento: " + (fileira+1) + lugar.charAt(2)+ "\nNa classe Econ�mica\n" );
					}
					else if ( classe == 0 && fileira < 5) {
						assentos[fileira][col] = true;
						System.out.println("Passagem aceita com sucesso!\nAssento: " + (fileira+1) + lugar.charAt(2)+ "\nNa Primeira Classe\n" );
					}
					else {
						System.out.println("Assento n�o corresponde com a classe escolhida! Tente novamente...");
					}	
				}
				else {
					System.out.println("Assento ocupado! Tente novamente...");
				}
			}
			else {
				System.out.println("Assento inv�lido! Tente novamente...");
			}
			System.out.print("Continuar reservando assentos(sim/nao)?");
			String r = in.nextLine();
			if (r == "nao" || r == "Nao")
				break;
			
		}

	}
}
