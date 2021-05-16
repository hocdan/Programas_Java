import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Arquivo arquivo = new Arquivo();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Bloco de Notas 2000!\n");
		
		while (true) {
			//caminho básico que o usuario pode usar para salvar os arquivos
			String caminho = "C:\\Users\\Danie\\OneDrive\\Documentos\\2018.2\\Paradigmas de Programação\\exercicios\\Area de trabalho\\BlocoDeNotas\\notas";
			//Comandos disponiveis
			System.out.println("Ações disponíveis:");
			System.out.println("1- Criar nova anotação");
			System.out.println("2- Excluir anotação");
			System.out.println("3- Visualizar anotação");
			System.out.println("4- Sair");
			System.out.print("---> ");
			int acao = in.nextInt();
			//se sim, qual opção...
			if ( acao == 1 ) {
				
				//setando caminho para manipular o arquivo
				System.out.print("Titulo da anotação: ");
				in.nextLine();
				String titulo = in.nextLine();
				caminho += "\\" + titulo + ".txt";
				
				//armazenando conteudo da anotação
				System.out.println("Conteúdo da anotação:");
				String texto = in.nextLine();
				
				//verificando se o arquivo foi salvo com sucesso no caminho dado com o conteudo
				if ( arquivo.Write(caminho, texto)) {
					System.out.println("Anotação salva com sucesso!");
				}
				else {
					System.err.println("Erro ao salvar anotação");
				}
				
			}
			else if ( acao == 2 ) {
				//verificando qual anotação sera excluida
				System.out.print("Nome da anotação: ");
				in.nextLine();
				String nomeArq = in.nextLine();
				
				//criando o caminho para a possivel anotação
				caminho += "\\" + nomeArq + ".txt";
				
				//excluindo a anotação
				if ( arquivo.Delete(caminho) ) {
					System.out.println("Anotação deletada com sucesso!");
				}
				else {
					System.err.println("Arquivo não encontrado....");
				}
				
			}
			else if ( acao == 3 ) {
				
				//verificando qual anotação sera visualizada
				System.out.print("Nome da anotação: ");
				in.nextLine();
				String nomeArq = in.nextLine();
				
				//criando o caminho para a possivel anotação
				caminho += "\\" + nomeArq + ".txt";
				
				//imprimindo conteudo caso anotação exista
				String conteudo = arquivo.Read(caminho);
				if (!conteudo.isEmpty()) {
					System.out.println(conteudo);
				}
				
			}
			else if ( acao == 4) {
				System.out.println("Encerrando aplicação...");
				break;
			}
			else {
				System.err.println("Comando inválido!!!");
			}
		}
		
	}

}
