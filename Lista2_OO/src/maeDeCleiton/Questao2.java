package maeDeCleiton;
import java.util.Scanner;
/*Crie	uma	classe	chamada	Racional	para	realizar	opera��es	aritm�ticas	com	fra��es.
 * 	Use	vari�veis	inteiras	para	representar	os	atributos	privados	da	classe	�	o	numerador	e	o	denominador.
 * 	Forne�a	um	construtor	para	inicializar	um	objeto	dessa	classe.	O	construtor	deve	armazenar	a	fra��o	na	forma
 * 	reduzida,	isto	�,	a	fra��o						2	/	4	
 *  �	equivalente	a	1	/	2	e	seria	armazenada	com	o	valor	1	no	numerador	e	o	valor	2	no	denominador.
 *  Forne�a	tamb�m	um	construtor	sem	argumentos	no	caso	do	n�mero	racional	ser	inicializado	com	valores	nulos.	
 *  Escreva	m�todos	p�blicos	que	realizem	as	seguintes	opera��es:	
 *  a) Somar	dois	n�meros	Racionais:	o	resultado	deve	ser	armazenado	na	forma	reduzida.	
 *  b) Subtrair	dois	n�meros	Racionais:	o	resultado	deve	ser	armazenado	na	forma	reduzida.	
 *  c) Multiplicar	dois	n�meros	Racionais:	o	resultado	deve	ser	armazenado	na	forma	reduzida.	
 *  d) Dividir	dois	n�meros	Racionais:	o	resultado	deve	ser	armazenado	na	forma	reduzida.	
 *  e) Imprimir	o	n�mero	Racional	na	forma	a	/	b.	
 *  f) Imprimir	o	n�mero	Racional	na	forma	de	ponto	flutuante	com	quatro	d�gitos	de	precis�o.
 */		

class Racional{
	public int num, den, mmc;
	public double numS, denS;
	
	Racional(int n1, int n2){
		
		int menor;
		if ( n1 <= n2) menor = n1;
		else menor = n2;
		
		for (int i=1; i<=menor; i++) {
			if ( n1%i == 0 && n2%i == 0) {
				num = n1/i;
				den = n2/i;
			}
		}
		
	}
	
	public void mmc(int den, int den2) {
		int menor;
		int entrou = 0;
		if ( den <= den2) menor = num;
		else menor = den2;
		
		for (int i=1; i<=menor; i++) {
			if ( den%i == 0 && den2%i == 0) {
				mmc = i;
				entrou++;
			}
		}
		if ( entrou <= 1) {
			mmc = den * den2;
		}
	}
	
	public void somaRacionais(int num2, int den2) {
		if (den == den2) {
			numS = num + num2;
			denS = den;
		}
		else {
			mmc(den, den2);
			denS = mmc;
			numS = (mmc/den) * num;
			numS += (mmc/den2) * num2;
		}

	}
	
	public void subRacionais(int num2, int den2) {
		if (den == den2) {
			numS = num - num2;
			denS = 0;
		}
		else {
			mmc(den, den2);
			denS = mmc;
			numS = (mmc/den) * num;
			numS -= (mmc/den2) * num2;
		}
		
	}
	
	public void multRacionais(int num2, int den2) {
		numS = num * num2;
		denS = den * den2;
		
	}
	
	public void divRacionais(int num2, int den2) {
		numS = num * den2;
		denS = den * num2;
		
	}
	
	public void getRacional() {
		System.out.println((int)numS + "/" + (int)denS);
	}
	
	public void getConvRacional() {
		System.out.println( numS/denS );
	}
	
}

public class Questao2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Racional fracao = new Racional(2, 4);
		System.out.println("Fra��o inicial igual a 1/2");
		
		System.out.print("Digite um outro numerador:");
		int num2 = in.nextInt();
		System.out.print("Digite um outro denominador:");
		int den2 = in.nextInt();
		
		System.out.println("Iniciando opera��es...");
		
		System.out.print("\nSoma:");
		fracao.somaRacionais(num2, den2);
		fracao.getRacional();
		fracao.getConvRacional();
		
		System.out.print("\nSubtra��o:");
		fracao.subRacionais(num2, den2);
		fracao.getRacional();
		fracao.getRacional();
		
		System.out.print("\nMultiplica��o:");
		fracao.multRacionais(num2, den2);
		fracao.getRacional();
		fracao.getConvRacional();
		
		System.out.print("\nDivis�o:");
		fracao.divRacionais(num2, den2);
		fracao.getRacional();
		fracao.getConvRacional();
		
	}

}
