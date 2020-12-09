package tecladovirtual.teclas;

import tecladovirtual.sound.SoundController;

public abstract class Tecla {
	private String cifra;
	private String caminhoSom;
        private SoundController som;
	
        protected Tecla(){}
        
	public Tecla(String cifra, String caminho) {
		this.cifra = cifra;
		this.caminhoSom = caminho;
                this.som = new SoundController(caminho);
	}
	
	public void setCifra(String cifra) { this.cifra = cifra; }
	public void setCaminhoSom(String caminho) { this.caminhoSom = caminho; }
        public void setSom(SoundController som) { this.som = som; }
	public String getCifra() { return this.cifra; }
	public String getCaminhoSom() { return this.caminhoSom; }
        public SoundController getSom() { return this.som; }
	
	public void emitirSom() {
	    this.som.play();
	}
        
        public void pararSom() {
            this.som.pause();
        }
}
