import java.util.Scanner;
/*  Crie uma classe Retângulo, a qual deve ter como atributos base e altura, cada um dos quais configurados por padrão como 1.
 *  Os atributos devem ser privados e acessíveis apenas por métodos próprios. Forneça métodos que calculem o perímetro e a área
 *  do retângulo. Escreva um programa para testar a classe Retangulo. 
 */
class Retangulo{
	
	private double base;
	private double altura;
	
	public Retangulo() {
		base = 1;
		altura = 1;
	}
	
	void setBase(double n) {
		base = n;
	}
	
	void setAltura(double n) {
		altura = n;
	}
	
	void calculaPerimetro() {
		double perimetro = (2*base)+(2*altura);
		System.out.println("Perímetro do retângulo igual a: " + perimetro);
	}
	
	void calculaArea() {
		double area = base*altura;
		System.out.println("Área do retãngulo igual a: " + area);
	}
}
public class questao1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Retangulo ret = new Retangulo();
		
		System.out.println("Valores padrões:");
		ret.calculaPerimetro();
		ret.calculaArea();
		
		System.out.println("Informe a base do retãngulo:");
		double base = in.nextDouble();
		ret.setBase(base);
		
		System.out.println("Informe a altura do retângulo:");
		double altura = in.nextDouble();
		ret.setAltura(altura);
		
		ret.calculaPerimetro();
		ret.calculaArea();
		
	}

}
