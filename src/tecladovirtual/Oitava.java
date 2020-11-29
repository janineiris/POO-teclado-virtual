package tecladovirtual;

import tecladovirtual.teclas.*;

public class Oitava {
	private Tecla[] teclas;
	private int tipo;
	
	public Oitava(int tipo) {
		
	}
	
	public void setTeclas(Tecla[] teclas) { this.teclas = teclas; }
	public void setTipo(int tipo) { this.tipo = tipo; }
	public Tecla[] getTeclas() { return this.teclas; }
	public int getTipo() { return this.tipo; }
}
