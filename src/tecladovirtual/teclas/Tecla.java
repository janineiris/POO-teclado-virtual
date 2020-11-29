package tecladovirtual.teclas;

public abstract class Tecla {
	private String cifra;
	private String caminhoSom;
	
	public Tecla(String cifra, String caminho) {
		this.cifra = cifra;
		this.caminhoSom = caminho;
	}
	
	public void setCifra(String cifra) { this.cifra = cifra; }
	public void setCaminhoSom(String caminho) { this.caminhoSom = caminho; }
	public String getCifra() { return this.cifra; }
	public String getCaminhoSom() { return this.caminhoSom; }
	
	public void emitirSom() {
		
	}
}
