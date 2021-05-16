package construcoes;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Imovel imovel = new Imovel();
		
		System.out.println("Criador de Imóveis 2000\n");
		while (true) {
			
			System.out.print("Opções:\n1-Criar Casa\n2-Criar Edifício\n3-Visualizar imóveis criados\n4-Sair\n-->");
			int acao = in.nextInt();
			
			if ( acao == 1) {
				
				Casa casa = new Casa();
				System.out.println("\nNova casa criada com sucesso...");
				while (true) {
					
					System.out.print("\nOpções:\n1-Pintar casa\n2-Pintar porta\n3-Adicionar Porta(máximo de 3)\n"
							+ "4-Abrir porta\n5-Fechar porta\n6-Ver total de portas\n7-Ver total de portas abertas\n"
							+ "8-Sair\n-->");
					int acao1 = in.nextInt();
					
					if ( acao1 == 1) {
						System.out.print("\nInforme a cor: ");
						String cor = in.next();
						casa.pinta(cor);
					}
					else if ( acao1 == 2) {
						System.out.print("\nInforme o índice da porta:");
						int ind = in.nextInt();
						System.out.print("\nCor desejada: ");
						String cor = in.next();
						casa.pintaPorta(ind, cor);
					}
					else if ( acao1 == 3) {
						System.out.print("Criar porta padrão ou personalizada(0/1)? ");
						int r = in.nextInt();
						if ( r == 0) {
							Porta p = new Porta();
							casa.adicionarPorta(p);
						}
						else if ( r == 1) {
							System.out.print("\nDimensão X da porta:");
							double x = in.nextDouble();
							System.out.print("Dimensão Y da porta:");
							double y = in.nextDouble();
							System.out.print("Dimensão Z da porta:");
							double z = in.nextDouble();
							Porta p = new Porta(x, y, z);
							casa.adicionarPorta(p);
						}
						else System.err.println("Opção inválida!!!");
					}
					else if ( acao1 == 4) {
						System.out.print("\nInforme o índice da porta:");
						int ind1 = in.nextInt();
						casa.abrirPorta(ind1);
					}
					else if ( acao1 == 5) {
						System.out.print("\nInforme o índice da porta:");
						int ind2 = in.nextInt();
						casa.fecharPorta(ind2);
					}
					else if ( acao1 == 6) {
						System.out.println("\nTotal de portas na casa:" + casa.totalDePortas());
					}
					else if ( acao1 == 7) {
						System.out.println("\nTotal de portas abertas na casa:" + casa.quantasPortasEstaoAbertas());
					}
					else if ( acao1 == 8) {
						imovel.adicionaCasa(casa);
						System.out.println("\nEncerrando manipulação da casa...");
						break;
					}
					else System.err.println("\nOpção inválida!!!");
					
				}
			}
			else if ( acao == 2) {
				
				Edificio edificio = new Edificio();
				System.out.println("\nNovo edifício criado com sucesso...");
				while (true) {
					System.out.print("\nOpções:\n1-Pintar edifício\n2-Pintar porta\n3-Adicionar Porta\n"
							+ "4-Abrir porta\n5-Fechar porta\n6-Ver total de portas\n7-Ver total de portas abertas\n"
							+ "8-Adicionar andar\n9-Ver total de andares\n10-Ver total de portas por andares\n"
							+ "11-sair\n-->");
					int acao2 = in.nextInt();
					
					if ( acao2 == 1) {
						System.out.print("\nInforme a cor: ");
						String cor = in.next();
						edificio.pinta(cor);
					}
					else if ( acao2 == 2) {
						System.out.print("\nInforme o índice da porta:");
						int ind = in.nextInt();
						System.out.print("Cor desejada: ");
						String cor = in.next();
						edificio.pintaPorta(ind, cor);
					}
					else if ( acao2 == 3) {
						System.out.print("Criar porta padrão ou personalizada(0/1)? ");
						int r = in.nextInt();
						if ( r == 0) {
							Porta p = new Porta();
							System.out.print("Qual o andar da porta? ");
							int andar = in.nextInt();
							edificio.adicionarPorta(p, andar);
						}
						else if ( r == 1) {
							System.out.print("\nDimensão X da porta:");
							double x = in.nextDouble();
							System.out.print("Dimensão Y da porta:");
							double y = in.nextDouble();
							System.out.print("Dimensão Z da porta:");
							double z = in.nextDouble();
							Porta p = new Porta(x, y, z);
							System.out.print("Qual o andar da porta? ");
							int andar = in.nextInt();
							edificio.adicionarPorta(p, andar);
						}
						else System.err.println("Opção inválida!!!");
					}
					else if ( acao2 == 4) {
						System.out.print("\nInforme o índice da porta:");
						int ind1 = in.nextInt();
						edificio.abrirPorta(ind1);
					}
					else if ( acao2 == 5) {
						System.out.print("\nInforme o índice da porta:");
						int ind2 = in.nextInt();
						edificio.fecharPorta(ind2);
					}
					else if ( acao2 == 6) {
						System.out.println("\nTotal de portas no edifício:" + edificio.totalDePortas());
					}
					else if ( acao2 == 7) {
						System.out.println("\nTotal de portas abertas no edifício:" + edificio.quantasPortasEstaoAbertas());
					}
					else if ( acao2 == 8) {
						edificio.adicionaAndar();
					}
					else if ( acao2 == 9) {
						System.out.println("\nTotal de andares no edifício:" + edificio.totalDeAndares());
					}
					else if ( acao2 == 10) {
						System.out.print("Informe o andar:");
						int andar = in.nextInt();
						edificio.totalDePortasPorAndar(andar);
					}
					else if ( acao2 == 11) {
						imovel.adicionaEdificio(edificio);
						System.out.println("\nEncerrando manipulação do edifício...");
						break;
					}
					else System.err.println("\nOpção inválida!!!");
					
				}
			}
			else if ( acao == 3) {
				
				System.out.print("Visualizar Casas ou Edifícios(0/1)? ");
				int r1 = in.nextInt();
				if ( r1 == 0) imovel.listarCasas();
				else if ( r1 == 1) imovel.listarEdificios();
				else System.err.println("Opção inválida!!!");
				
			}
			else if ( acao == 4) {
				System.out.println("\nVolte sempre!!!");
				break;
			}
			else System.err.println("Opção inválida!!!");
		
		}
	}

}
