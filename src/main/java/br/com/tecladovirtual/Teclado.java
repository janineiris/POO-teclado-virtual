package br.com.tecladovirtual;

import java.util.ArrayList;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

public class Teclado extends WebPage{
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
