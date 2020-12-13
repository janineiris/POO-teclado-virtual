package tecladovirtual.teclados;

import java.util.ArrayList;
import tecladovirtual.Oitava;
import tecladovirtual.teclas.*;

public abstract class Teclado {
	private ArrayList<Oitava> oitavas;
	private static int qntdOitavas;
	private static String timbre;
        private static int volume = 30;

	public Teclado(int qnt, String timbreStr) {
	    qntdOitavas = qnt;
            timbre = timbreStr;
            
            ArrayList<Oitava> oitavas = new ArrayList<Oitava>();
            for(int i = 1; i <= qntdOitavas; i++) {
                Oitava oitava = new Oitava(i, timbreStr);
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
	public void setTimbre(String timbreStr) { timbre = timbreStr; }
        public static void setVolume(int vol) { volume = vol; }
	public ArrayList<Oitava> getOitavas() { return this.oitavas; }
	public int getQntdOitavas() { return qntdOitavas; }
	public String getTimbre() { return timbre; }
        public static int getVolume() { return volume; }
        
        public Oitava getOitava(int tipo) {
            Oitava oitava = this.oitavas.get(0);
            if(oitava.getTipo() == tipo) {
                return oitava;
            }
            for(int i = 1; i < qntdOitavas; i++) {
                oitava = this.oitavas.get(i);
                if(oitava.getTipo() == tipo) {
                    break;
                }
            }
            return oitava;
        }
        
        public Tecla getTecla(int tipo, String cifra){
            Oitava oitava = this.getOitava(tipo);
            return oitava.getTecla(cifra);
        }
        
        public void emitirSom(int tipo, String cifra){
            Tecla tecla = this.getTecla(tipo, cifra);
            tecla.emitirSom();
        }
        
        public void pararSom(int tipo, String cifra) {
            Tecla tecla = this.getTecla(tipo, cifra);
            tecla.pararSom();
        }
}
