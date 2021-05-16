/* a) Classe: Porta Atributos: aberta, cor, dimensaoX, dimensaoY, dimensaoZ 
 * Métodos: void abre(), void fecha(), void pinta(String s), boolean estaAberta()
 */
public class Porta {
	private boolean isAberta;
	private String cor;
	private double posX, posY, posZ;
	
	Porta(boolean f, String c, double x, double y, double z){
		this.isAberta = f;
		this.cor = c;
		this.posX = x;
		this.posY = y;
		this.posZ = z;
	}
	
	Porta(){
		
	}
	
	public void abre() {
		if (!isAberta) this.isAberta = true;
	}
	
	public void fecha() {
		if ( isAberta ) this.isAberta = false;
	}
	
	public void pintar(String s) {
		this.cor = s;
		System.out.println("Nova cor: " + this.cor);
	}
	
	public boolean estaAberta() {
		return this.isAberta;
	}
	
	public void situacaoPorta() {
		System.out.println("Aberta: " + this.isAberta + ", Cor: " + this.cor + ", X: " + this.posX + ", Y: " + this.posY + ", Z: " + this.posZ);
	}

}
