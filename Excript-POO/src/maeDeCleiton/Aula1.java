package maeDeCleiton;
import java.util.Scanner;

class Calculadora{
	public double op1, op2, exp;
	public String[] historico = new String[10];
	int vezes = 0;
	
	void soma(double op1, double op2) {
		System.out.println(op1+op2);
	}
	
	void subtrair(double op1, double op2) {
		System.out.println(op1-op2);
	}
	
	void multiplica(double op1, double op2) {
		System.out.println(op1*op2);
	}
	
	void divide(double op1, double op2) {
		System.out.println(op1/op2);
	}
	
	void elevar(double op1, double exp) {
		System.out.println(Math.pow(op1, exp));
	}
	
	void setOperacao(String operacao) {
		for (int i=0; i<10; i++) {
			if (historico[i] == null) {
				historico[i] = operacao;
				break;
			}else if (i == 9 && historico[i] != null) {
				historico[vezes] = operacao;
				vezes++;
				break;
			}
		}
	}
	
	void getOperacao() {
		for (int i=0; i<10; i++) {
			if (historico[i] != null) {
			System.out.println("Opera��o " + (i+1) + ": " + historico[i]);
			}
		}
	}
	
}

public class Aula1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Calculadora operacao = new Calculadora();
		
		System.out.println("Calculadora 2000!");
		System.out.println("1-Soma\n2-Subtra��o\n3-Multiplica��o\n4-Divis�o\n5-Exponencia��o");
		
		char resposta;
		do {
			
			System.out.print("\nDigite o operando 1: ");
			double n1 = in.nextDouble();
			System.out.print("Digite a opera��o: ");
			int op = in.nextInt();
			System.out.print("Digite o operando 2: ");
			double n2 = in.nextDouble();
			
			switch (op) {
				case 1:
					operacao.soma(n1, n2);
					operacao.setOperacao(n1 + " + " + n2 + " = " + (n1+n2));
					break;
				case 2:
					operacao.subtrair(n1, n2);
					operacao.setOperacao(n1 + " - " + n2 + " = " + (n1-n2));
					break;
				case 3:
					operacao.multiplica(n1, n2);
					operacao.setOperacao(n1 + " X " + n2 + " = " + (n1*n2));
					break;
				case 4:
					operacao.divide(n1, n2);
					operacao.setOperacao(n1 + " / " + n2 + " = " + (n1/n2));
					break;
				case 5:
					operacao.elevar(n1, n2);
					operacao.setOperacao(n1 + " ^ " + n2 + " = " + (Math.pow(n1, n2)));
					break;
			}
			
			System.out.println("\nHist�rico de calculos:");
			operacao.getOperacao();
			
			System.out.print("Deseja continuar calculando(s/n)?");
			resposta = in.next().trim().charAt(0); //pega exatamente  o primeiro caractere e exclui qualquer espa�o em branco
			
		} while ( resposta == 's' || resposta == 'S');
		
	}

}
