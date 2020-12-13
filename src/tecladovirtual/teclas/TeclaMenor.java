/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecladovirtual.teclas;

import tecladovirtual.bichos.*;
import tecladovirtual.sound.SoundController;

/**
 *
 * @author iris
 */
public class TeclaMenor extends Tecla{
    private Animal animal;
    private boolean hasAnimal;
    
    public Animal getAnimal() { return this.animal; }
    public boolean getHasAnimal() { return this.hasAnimal; }
    public void setAnimal(Animal animal) { this.animal = animal; }
    public void setHasAnimal(boolean hasAnimal) { this.hasAnimal = hasAnimal; }
    
    public TeclaMenor(int oitava, String cifra, String timbre) {
        String caminho = "";
        this.setCifra(cifra + "#");
        
        if(timbre.equals("original")){
            caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/" + cifra + "#" + ".mp3";
            this.setCaminhoSom(caminho);
            this.setSom(new SoundController(caminho));
            this.hasAnimal = false;
        }else {
            this.hasAnimal = true;
            switch (oitava) {
                case 1:
                    if(cifra.equals("A" + oitava)) {
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/A1#_beija-flor.mp3";
                        this.animal = new Ave("Beija-flor", "Animal belo e colorido", caminho, true, true);
                    } else if(cifra.equals("C" + oitava)){
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/C1#_sabia.mp3";
                        this.animal = new Ave("Sabiá", "Animal belo", caminho, true, true);
                    } else if(cifra.equals("D" + oitava)){
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/D1#_pato.mp3";
                        this.animal = new Ave("Pato", "Animal demoníaco", caminho, true, false);
                    } else if(cifra.equals("F" + oitava)) {
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/F1#_galinha_angola.mp3";
                        this.animal = new Ave("Galinha da Angola", "Animal que fala 'tô fraco'", caminho, true, true);
                    } else{
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/G1#_galinha.mp3";
                        this.animal = new Ave("Galinha", "Animal belo e colorido", caminho, false, false);
                    }
                    break;
                case 2:
                    if(cifra.equals("A" + oitava)) {
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/A2#_cavalo.mp3";
                        System.out.println(caminho);
                        this.animal = new Bovideo("Cavalo", "Ele trota", caminho, true);
                    } else if(cifra.equals("C" + oitava)){
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/C2#_cabra.mp3";
                        this.animal = new Animal("Cabra", "", caminho);
                    } else if(cifra.equals("D" + oitava)){
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/D2#_porco.mp3";
                        this.animal = new Bovideo("Porco", "oinc", caminho, true);
                    } else if(cifra.equals("F" + oitava)) {
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/F2#_jumento.mp3";
                        this.animal = new Bovideo("Jumento", "Ele trota", caminho, true);
                    } else{
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/G2#_vaca.mp3";
                        this.animal = new Bovideo("Vaca", "Mu", caminho, true);
                    }
                    break;
                case 3:
                    if(cifra.equals("A" + oitava)) {
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/A3#_babuino.mp3";                        
                        this.animal = new Primata("Babuíno", "", caminho);
                    } else if(cifra.equals("C" + oitava)){
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/C3#_macaco_prego.mp3";                        
                        this.animal = new Primata("Macaco Prego", "", caminho);
                    } else if(cifra.equals("D" + oitava)){
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/D3#_gorila.mp3";                        
                        this.animal = new Primata("Gorila", "", caminho);
                    } else if(cifra.equals("F" + oitava)) {
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/F3#_macaco.mp3";                        
                        this.animal = new Primata("Macaco", "", caminho);
                    } else{
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/G3#_sagui.mp3"; 
                        this.animal = new Primata("Sagui", "É pequeno, anda em grupos e rouba comida.", caminho);
                    }
                    break;
                case 4:
                    if(cifra.equals("A" + oitava)) {
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/A4#_hiena.mp3";
                        this.animal = new Felino("Hiena", "", caminho, true);
                    } else if(cifra.equals("C" + oitava)){
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/C4#_leao.mp3";
                        this.animal = new Felino("Leão", "", caminho, true);
                    } else if(cifra.equals("D" + oitava)){
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/D4#_tigre.mp3";
                        this.animal = new Felino("Tigre", "", caminho, true);
                    } else if(cifra.equals("F" + oitava)) {
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/F4#_gato.mp3";
                        this.animal = new Felino("Gato", "Animal belo e mortal", caminho, true);
                    } else{
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/G4#_puma.mp3";
                        this.animal = new Felino("Puma", "", caminho, true);
                    }
                    break;
                default:
                    if(cifra.equals("A" + oitava)) {
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/A5#_cachorro.mp3";
                        this.animal = new Animal("Cachorro", "Ele late", caminho);
                    } else if(cifra.equals("C" + oitava)){
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/C5#_peru.mp3";
                        this.animal = new Animal("Peru", "Glu gliu", caminho);
                    } else if(cifra.equals("D" + oitava)){
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/D5#_papagaio.mp3";
                        this.animal = new Animal("Papagaio", "", caminho);
                    } else if(cifra.equals("F" + oitava)) {
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/F5#_sapo.mp3";
                        this.animal = new Animal("Sapo", "Ele pula", caminho);
                    } else{
                        caminho = "src/tecladovirtual/assets/sound/"+ oitava + "/G5#_cascavel.mp3";
                        this.animal = new Animal("Cascavel", "", caminho);
                    }
                    break;
            }
            this.setCaminhoSom(caminho);
            this.setSom(new SoundController(caminho));
        }
    }
    
}
