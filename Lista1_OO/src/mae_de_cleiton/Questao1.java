package mae_de_cleiton;
import java.util.Scanner;
/* Os motoristas se preocupam com a quilometragem dos seus automóveis. Um motorista monitorou vários tanques cheios de gasolina 
 * registrando a quilometragem dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio.
 * Desenvolva um programa Java que receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos
 * (ambos como inteiros) para cada tanque cheio. O programa deve calcular e exibir o consumo em quilômetros/litro 
 * para cada tanque cheio e imprimir a quilometragem combinada e a soma total de litros de combustível consumidos 
 * até esse ponto. Todos os cálculos de média devem produzir resultados de ponto flutuante.
 * Utilize um laço para obter os dados do usuário. 
 */
public class Questao1 {
	
	public static void main(String[ ]args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Analisador de Cosumo 1.0");
		int totalLitros = 0;
		int totalKm = 0;
		int resposta = 0;
		
		do {
			System.out.print("Quantos quilômetros foram percorridos? ");
			int km = in.nextInt();
			System.out.print("Litros de gasolina consumidos? ");
			int litros = in.nextInt();
			
			float consumo = (km/litros);
			totalLitros += litros;
			totalKm += km;
			
			System.out.println("Consumo: " + consumo + " km/L" );
			System.out.println("Quilômetros avaliados até agora: " + totalKm + " km");
			System.out.println("Litros consumidos até agora: " + totalLitros + " L\n" );
			
			System.out.print("Continuar calculando(1-sim 0-nao)?");
			resposta = in.nextInt();
		}while(resposta == 1);
	}

}
