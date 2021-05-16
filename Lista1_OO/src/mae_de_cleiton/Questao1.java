package mae_de_cleiton;
import java.util.Scanner;
/* Os motoristas se preocupam com a quilometragem dos seus autom�veis. Um motorista monitorou v�rios tanques cheios de gasolina 
 * registrando a quilometragem dirigida e a quantidade de combust�vel em litros utilizados para cada tanque cheio.
 * Desenvolva um programa Java que receba como entrada os quil�metros dirigidos e os litros de gasolina consumidos
 * (ambos como inteiros) para cada tanque cheio. O programa deve calcular e exibir o consumo em quil�metros/litro 
 * para cada tanque cheio e imprimir a quilometragem combinada e a soma total de litros de combust�vel consumidos 
 * at� esse ponto. Todos os c�lculos de m�dia devem produzir resultados de ponto flutuante.
 * Utilize um la�o para obter os dados do usu�rio. 
 */
public class Questao1 {
	
	public static void main(String[ ]args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Analisador de Cosumo 1.0");
		int totalLitros = 0;
		int totalKm = 0;
		int resposta = 0;
		
		do {
			System.out.print("Quantos quil�metros foram percorridos? ");
			int km = in.nextInt();
			System.out.print("Litros de gasolina consumidos? ");
			int litros = in.nextInt();
			
			float consumo = (km/litros);
			totalLitros += litros;
			totalKm += km;
			
			System.out.println("Consumo: " + consumo + " km/L" );
			System.out.println("Quil�metros avaliados at� agora: " + totalKm + " km");
			System.out.println("Litros consumidos at� agora: " + totalLitros + " L\n" );
			
			System.out.print("Continuar calculando(1-sim 0-nao)?");
			resposta = in.nextInt();
		}while(resposta == 1);
	}

}
