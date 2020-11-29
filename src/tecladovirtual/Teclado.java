package tecladovirtual;

import java.util.ArrayList;

public class Teclado {
	private ArrayList<Oitava> oitavas;
	private static int qntdOitavas;
	private String timbre;

	public Teclado() {
		
	}
	
	public void setOitavas(ArrayList<Oitava> oitavas) { 
		this.oitavas = oitavas;
		qntdOitavas = oitavas.size();
		
	}
	public void setQntdOitavas(int qntd) { qntdOitavas = qntd; }
	public void setTimbre(String timbre) { this.timbre = timbre; }
	public ArrayList<Oitava> getOitavas() { return this.oitavas; }
	public int getQntdOitavas() { return qntdOitavas; }
	public String getTimbre() { return this.timbre; }
	
	public void mudaQtndOitavas(int quantidade) {
		
	}
	
}
