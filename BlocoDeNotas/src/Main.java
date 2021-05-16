import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Arquivo arquivo = new Arquivo();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Bloco de Notas 2000!\n");
		
		while (true) {
			//caminho b�sico que o usuario pode usar para salvar os arquivos
			String caminho = "C:\\Users\\Danie\\OneDrive\\Documentos\\2018.2\\Paradigmas de Programa��o\\exercicios\\Area de trabalho\\BlocoDeNotas\\notas";
			//Comandos disponiveis
			System.out.println("A��es dispon�veis:");
			System.out.println("1- Criar nova anota��o");
			System.out.println("2- Excluir anota��o");
			System.out.println("3- Visualizar anota��o");
			System.out.println("4- Sair");
			System.out.print("---> ");
			int acao = in.nextInt();
			//se sim, qual op��o...
			if ( acao == 1 ) {
				
				//setando caminho para manipular o arquivo
				System.out.print("Titulo da anota��o: ");
				in.nextLine();
				String titulo = in.nextLine();
				caminho += "\\" + titulo + ".txt";
				
				//armazenando conteudo da anota��o
				System.out.println("Conte�do da anota��o:");
				String texto = in.nextLine();
				
				//verificando se o arquivo foi salvo com sucesso no caminho dado com o conteudo
				if ( arquivo.Write(caminho, texto)) {
					System.out.println("Anota��o salva com sucesso!");
				}
				else {
					System.err.println("Erro ao salvar anota��o");
				}
				
			}
			else if ( acao == 2 ) {
				//verificando qual anota��o sera excluida
				System.out.print("Nome da anota��o: ");
				in.nextLine();
				String nomeArq = in.nextLine();
				
				//criando o caminho para a possivel anota��o
				caminho += "\\" + nomeArq + ".txt";
				
				//excluindo a anota��o
				if ( arquivo.Delete(caminho) ) {
					System.out.println("Anota��o deletada com sucesso!");
				}
				else {
					System.err.println("Arquivo n�o encontrado....");
				}
				
			}
			else if ( acao == 3 ) {
				
				//verificando qual anota��o sera visualizada
				System.out.print("Nome da anota��o: ");
				in.nextLine();
				String nomeArq = in.nextLine();
				
				//criando o caminho para a possivel anota��o
				caminho += "\\" + nomeArq + ".txt";
				
				//imprimindo conteudo caso anota��o exista
				String conteudo = arquivo.Read(caminho);
				if (!conteudo.isEmpty()) {
					System.out.println(conteudo);
				}
				
			}
			else if ( acao == 4) {
				System.out.println("Encerrando aplica��o...");
				break;
			}
			else {
				System.err.println("Comando inv�lido!!!");
			}
		}
		
	}

}
