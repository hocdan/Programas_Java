import java.util.Scanner;
/* Uma companhia aérea lhe contratou para desenvolver seu novo sistema de reservas. 
 * Inicialmente, foi-lhe solicitado escrever um programa para alocação de assentos nos voos. 
 * Considere que cada avião possui 20 fileiras com 6 assentos cada, sendo que as fileiras 1-5 estão reservadas
 * para a Primeira Classe e as de números 6-20 para a Classe Econômica. 
 * Os assentos em cada fileira são identificados com letras (A, B, C, D, E, F). 
 * Seu programa deve perguntar ao usuário se ele deseja reservar assentos na Primeira Classe ou na Econômica e
 * em seguida mostrar o mapa de assentos indicando os lugares ocupados e vagos. O usuário deve informar o assento
 * desejado utilizando uma combinação de letra e número (por exemplo: 20A). Ao final, imprima um cartão de embarque
 * fictício com o número do assento e se este é na primeira classe ou na classe econômica. Atenção: seu programa 
 * nunca deve atribuir um passageiro a uma poltrona já reservada. Armazene o mapa de assentos em um array bidimensional
 * do tipo boolean, inicializando-o com todos os campos iguais a false. 
 */
public class Main3 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//criando matriz(ja inicializada com valores false) com os assentos disponíveis
		boolean[][] assentos = new boolean[20][6];
		//loop do programa
		while (true) {
			
			//mostrando assentos disponíveis
			System.out.println("Mae de Cleiton Airlines!!!\nDê uma olhada em nossos assentos disponíveis:");
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
			System.out.print("Deseja viajar na Primeira Classe ou Econômica(0/1)? ");
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
						System.out.println("Passagem aceita com sucesso!\nAssento: " + (fileira+1) + lugar.charAt(2)+ "\nNa classe Econômica\n" );
					}
					else if ( classe == 0 && fileira < 5) {
						assentos[fileira][col] = true;
						System.out.println("Passagem aceita com sucesso!\nAssento: " + (fileira+1) + lugar.charAt(2)+ "\nNa Primeira Classe\n" );
					}
					else {
						System.out.println("Assento não corresponde com a classe escolhida! Tente novamente...");
					}	
				}
				else {
					System.out.println("Assento ocupado! Tente novamente...");
				}
			}
			else {
				System.out.println("Assento inválido! Tente novamente...");
			}
			System.out.print("Continuar reservando assentos(sim/nao)?");
			String r = in.nextLine();
			if (r == "nao" || r == "Nao")
				break;
			
		}

	}
}
