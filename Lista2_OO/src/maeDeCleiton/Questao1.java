package maeDeCleiton;
import java.util.Scanner;
/*Crie	uma	classe	chamada	Data	com	as	seguintes	características:	
a) Imprime	a data em múltiplos	formatos:
MM/DD/YYYY 
Junho 14,1992 
DDD	YYYY 
etc.

b) Use construtores	sobrecarregados	para criar objetos Data	inicializados com datas	nos	formatos do	item (a).
No primeiro	caso o construtor deve	receber	três valores inteiros. No segundo caso ele deve	receber	uma	String e dois valores
inteiros. No terceiro caso ele	deve receber dois valores inteiros,	sendo que o	primeiro representa	o número seqüencial	do dia
naquele	ano. (Dica:consulte	a documentação da linguagem	Java para informações sobre	a classe String	bem	como sobre a classe	Date).	
*/
class Formato{
	public double dia;
	public int mes, ano;
	public String []Vet = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
	
	public void formato1() {
		System.out.println(mes + "/" + (int)dia + "/" + ano);
	}
	
	public void formato2() {
		System.out.println(Vet[mes-1] + " " + (int)dia + "," + ano);
	}
	
	public void formato3() {
		dia += (mes-1)* (30.4);
		System.out.println((int)dia + " " + ano);
	}
	
}
public class Questao1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Formato data = new Formato();
		
		System.out.println("Bem vindo ao conversor de datas 2000!");
		
		System.out.print("Digite o dia: ");
		data.dia = in.nextDouble();
		System.out.print("Digite o mês: ");
		data.mes = in.nextInt();
		System.out.print("Digite o ano: ");
		data.ano = in.nextInt();

		System.out.println("Formatos disponíveis:");
		data.formato1();
		data.formato2();
		data.formato3();
		
	}

}
