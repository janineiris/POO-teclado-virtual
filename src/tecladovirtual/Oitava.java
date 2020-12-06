package tecladovirtual;

import tecladovirtual.teclas.*;

public class Oitava {
    private Tecla[] teclas;
    private int tipo;

    public Oitava(int tipo) {
        this.tipo = tipo;
        Tecla[] teclas = new Tecla[12];
        teclas[0] = new Do(tipo, "C"+tipo);
        teclas[1] = new Do(tipo, "C"+tipo+"#");
        teclas[2] = new Re(tipo, "D"+tipo);
        teclas[3] = new Re(tipo, "D"+tipo+"#");
        teclas[4] = new Mi(tipo, "E"+tipo);
        teclas[5] = new Fa(tipo, "F"+tipo);
        teclas[6] = new Fa(tipo, "F"+tipo+"#");
        teclas[7] = new Sol(tipo, "G"+tipo);
        teclas[8] = new Sol(tipo, "G"+tipo+"#");
        teclas[9] = new La(tipo, "A"+tipo);
        teclas[10] = new La(tipo, "A"+tipo+"#");
        teclas[11] = new Si(tipo, "B"+tipo);
        this.teclas = teclas;            
    }

    public void setTeclas(Tecla[] teclas) { this.teclas = teclas; }
    public void setTipo(int tipo) { this.tipo = tipo; }
    public Tecla[] getTeclas() { return this.teclas; }
    public int getTipo() { return this.tipo; }
    
    public Tecla getTecla(String cifra) {
        Tecla tecla = this.teclas[0];
        if(tecla.getCifra().equals(cifra)){
            return tecla;
        }
        for(int i = 0; i < 12; i++) {
            tecla = this.teclas[i];
            if(tecla.getCifra().equals(cifra)){
            break;
            }
        }
        return tecla;
    }
}
