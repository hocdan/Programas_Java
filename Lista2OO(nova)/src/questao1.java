import java.util.Scanner;
/*  Crie uma classe Ret�ngulo, a qual deve ter como atributos base e altura, cada um dos quais configurados por padr�o como 1.
 *  Os atributos devem ser privados e acess�veis apenas por m�todos pr�prios. Forne�a m�todos que calculem o per�metro e a �rea
 *  do ret�ngulo. Escreva um programa para testar a classe Retangulo. 
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
		System.out.println("Per�metro do ret�ngulo igual a: " + perimetro);
	}
	
	void calculaArea() {
		double area = base*altura;
		System.out.println("�rea do ret�ngulo igual a: " + area);
	}
}
public class questao1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Retangulo ret = new Retangulo();
		
		System.out.println("Valores padr�es:");
		ret.calculaPerimetro();
		ret.calculaArea();
		
		System.out.println("Informe a base do ret�ngulo:");
		double base = in.nextDouble();
		ret.setBase(base);
		
		System.out.println("Informe a altura do ret�ngulo:");
		double altura = in.nextDouble();
		ret.setAltura(altura);
		
		ret.calculaPerimetro();
		ret.calculaArea();
		
	}

}
