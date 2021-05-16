package maeDeCleiton;

class Fatorial{
	public double getFatorial(int n) {
		int fat = 1;
		for(int i=1; i<=n; i++) {
			fat *= i;
		}
		return fat;
	}
	
}

public class Questao3Prova {
	
	public static void main(String[] args) {
		Fatorial fat = new Fatorial();
		
		double euler = 1;
		double den;
		for(int i=1; i<35; i++) {
			den = fat.getFatorial(i);
			System.out.println("Valor aproximado:"+euler);
			euler += 1/den;
		}
	}

}
