//bibliotecas usadas para manipulação de arquivo
import java.io.BufferedReader; //buffer de leitura
import java.io.FileNotFoundException; //para possiveis erros ao procurar arquivos
import java.io.FileReader; //para leitura de arquivos
import java.io.FileWriter; //para gravação de arquivos
import java.io.IOException; //para possiveis exceções na entrad/saida de dados
import java.io.PrintWriter; //para mostrar o conteúdo dos arquivos
import java.io.File; // para manipular arquivos no geral

public class Arquivo {
	
	//Metodo responsavel por ler arquivos
	public static String Read(String caminho) {
		String conteudo = "";
		//tenta "pegar" o arquivo desejado no caminho informado
		try {
			FileReader arq = new FileReader(caminho);
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = "";
			//tenta ler cada linha do arquivo ate não haver mais (nulo)
			try {
				linha = lerArq.readLine();
				while (linha != null) {
					conteudo += linha + "\n";
					linha = lerArq.readLine();
				}
				arq.close();
				return conteudo;
			//erro na leitura
			} catch ( IOException ex) {
				System.err.println("Erro na leitura do arquivo!");
				return "";
			}
		//erro na procura do arquivo
		} catch ( FileNotFoundException ex) {
			System.err.println("Erro ao procurar arquivo...");
			return "";
		}
	}
	
	//Metodo responsavel por gravar em arquivos
	public static boolean Write(String caminho, String texto) {
		//tenta criar um arquivo no caminho informado e grava um texto que tambem foi informado
		try {
			FileWriter arq = new FileWriter(caminho);
			PrintWriter gravarArq = new PrintWriter(arq);
			gravarArq.println(texto);
			gravarArq.close();
			return true;
		//erro na leitura
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	//responsavel por apagar arquivos
	public static boolean Delete(String caminho) {
		File arq = new File(caminho);
		if (arq.delete()) return true;
		else return false;
	}

}
