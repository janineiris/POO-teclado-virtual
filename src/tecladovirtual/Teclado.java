package tecladovirtual;

import java.util.ArrayList;

public class Teclado {
	private ArrayList<Oitava> oitavas;
	private static int qntdOitavas;
	private String timbre;

	public Teclado(int qntdOitavas, String timbre) {
	    this.qntdOitavas = qntdOitavas;
            this.timbre = timbre;
            
            ArrayList<Oitava> oitavas = new ArrayList<Oitava>();
            for(int i = 1; i <= qntdOitavas; i++) {
                Oitava oitava = new Oitava(i);
                oitavas.add(oitava);
            }
            
            this.oitavas = oitavas;
	}
        
        public Teclado(int qntdOitavas) {
            this(qntdOitavas, "original");
        }
	
	public void setOitavas(ArrayList<Oitava> oitavas) { 
		this.oitavas = oitavas;
		qntdOitavas = oitavas.size();
		
	}
	public void setTimbre(String timbre) { this.timbre = timbre; }
	public ArrayList<Oitava> getOitavas() { return this.oitavas; }
	public int getQntdOitavas() { return qntdOitavas; }
	public String getTimbre() { return this.timbre; }
        
        public Oitava getOitava(int tipo) {
            Oitava oitava = this.oitavas.get(0);
            if(oitava.getTipo() == tipo) {
                return oitava;
            }
            for(int i = 1; i < this.qntdOitavas; i++) {
                oitava = this.oitavas.get(i);
                if(oitava.getTipo() == tipo) {
                    break;
                }
            }
            return oitava;
        }
}
