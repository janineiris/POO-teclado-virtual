package tecladovirtual;

import tecladovirtual.teclas.*;

public class Oitava {
    private Tecla[] teclas;
    private int tipo;

    public Oitava(int tipo, String timbre) {
        this.tipo = tipo;
        Tecla[] teclas = new Tecla[12];
        teclas[0] = new TeclaMaior(tipo, "C" + tipo);
        teclas[1] = new TeclaMenor(tipo, "C" + tipo, timbre);
        teclas[2] = new TeclaMaior(tipo, "D" + tipo);
        teclas[3] = new TeclaMenor(tipo, "D" + tipo, timbre);
        teclas[4] = new TeclaMaior(tipo, "E" + tipo);
        teclas[5] = new TeclaMaior(tipo, "F" + tipo);
        teclas[6] = new TeclaMenor(tipo, "F" + tipo, timbre);
        teclas[7] = new TeclaMaior(tipo, "G" + tipo);
        teclas[8] = new TeclaMenor(tipo, "G" + tipo, timbre);
        teclas[9] = new TeclaMaior(tipo, "A" + tipo);
        teclas[10] = new TeclaMenor(tipo, "A" + tipo, timbre);
        teclas[11] = new TeclaMaior(tipo, "B" + tipo);
        this.teclas = teclas;            
    }
    
    public Oitava(int tipo) {
        this(tipo, "original");
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
