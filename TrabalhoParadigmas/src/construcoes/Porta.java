package construcoes;
/*a) Classe: Porta Atributos: aberta, cor, dimensaoX, dimensaoY, dimensaoZ 
 * Métodos: void abre(), void fecha(), void pinta(String s), boolean estaAberta()
 * 
 * ESTADO DE DESENVOLVIMENTO: OK!
 */
public class Porta {
	private boolean aberta;
	private String cor;
	private int andar;
	private double dimensaoX, dimensaoY, dimensaoZ;
	
	Porta(double x, double y, double z){
		this.dimensaoX = x;
		this.dimensaoY = y;
		this.dimensaoZ = z;
	}
	
	Porta(){
		this.dimensaoX = 2;
		this.dimensaoY = 2;
		this.dimensaoZ = 2;
		this.cor = "marrom";
		this.andar = 0;
	}
	
	public void abre() {
		if ( !aberta ) this.aberta = true;
		System.out.println("A porta foi aberta...\n");
	}
	
	public void fecha() {
		if ( aberta) this.aberta = false;
		System.out.println("A porta foi fechada...\n");
	}
	
	public void pinta(String s) {
		this.cor = s;
		System.out.println("Nova cor igual a: " + s + "\n");
	}
	
	public boolean estaAberta() {
		return this.aberta;
	}
	
	public void setAndar(int a) {
		this.andar = a;
	}
	
	public int getAndar() {
		return this.andar;
	}

}
