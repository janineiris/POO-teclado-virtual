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
                        caminho = "";   // TODO
                        this.animal = new Ave("Beija-flor", "Animal belo e colorido", caminho, true, true);
                    } else if(cifra.equals("C" + oitava)){
                        caminho = "";   // TODO
//                        this.animal = new Ave("Beija-flor", "Animal belo e colorido", caminho, true, true);
                    } else if(cifra.equals("D" + oitava)){
                        caminho = "";   // TODO
//                        this.animal = new Ave("Beija-flor", "Animal belo e colorido", caminho, true, true);
                    } else if(cifra.equals("F" + oitava)) {
                        caminho = "";   // TODO
//                        this.animal = new Ave("Beija-flor", "Animal belo e colorido", caminho, true, true);
                    } else{
                        caminho = "";   // TODO
//                        this.animal = new Ave("Beija-flor", "Animal belo e colorido", caminho, true, true);
                    }
                    break;
                case 2:
                    if(cifra.equals("A" + oitava)) {
                        caminho = "";   // TODO
                        this.animal = new Felino("Gato", "Animal belo e mortal", caminho, true);
                    } else if(cifra.equals("C" + oitava)){
                        caminho = "";   // TODO
//                        this.animal = new Felino("Gato", "Animal belo e mortal", caminho, true);
                    } else if(cifra.equals("D" + oitava)){
                        caminho = "";   // TODO
//                        this.animal = new Felino("Gato", "Animal belo e mortal", caminho, true);
                    } else if(cifra.equals("F" + oitava)) {
                        caminho = "";   // TODO
//                        this.animal = new Felino("Gato", "Animal belo e mortal", caminho, true);
                    } else{
                        caminho = "";   // TODO
//                        this.animal = new Felino("Gato", "Animal belo e mortal", caminho, true);
                    }
                    break;
                case 3:
                    if(cifra.equals("A" + oitava)) {
                        caminho = "";   // TODO
                        this.animal = new Bovideo("Vaca", "Ela muge e é preta e branca", caminho, true);
                    } else if(cifra.equals("C" + oitava)){
//                        this.animal = new Bovideo("Vaca", "Ela muge e é preta e branca", caminho, true);
                    } else if(cifra.equals("D" + oitava)){
//                        this.animal = new Bovideo("Vaca", "Ela muge e é preta e branca", caminho, true);
                    } else if(cifra.equals("F" + oitava)) {
                        caminho = "";   // TODO
//                        this.animal = new Bovideo("Vaca", "Ela muge e é preta e branca", caminho, true);
                    } else{
                        caminho = "";   // TODO
//                        this.animal = new Bovideo("Vaca", "Ela muge e é preta e branca", caminho, true);
                    }
                    break;
                case 4:
                    if(cifra.equals("A" + oitava)) {
                        caminho = "";   // TODO
                        this.animal = new Primata("Mico", "É pequeno, anda em grupos e rouba comida.", caminho);
                    } else if(cifra.equals("C" + oitava)){
                        caminho = "";   // TODO
//                        this.animal = new Primata("Mico", "É pequeno, anda em grupos e rouba comida.", caminho);
                    } else if(cifra.equals("D" + oitava)){
                        caminho = "";   // TODO
//                        this.animal = new Primata("Mico", "É pequeno, anda em grupos e rouba comida.", caminho);
                    } else if(cifra.equals("F" + oitava)) {
                        caminho = "";   // TODO
//                        this.animal = new Primata("Mico", "É pequeno, anda em grupos e rouba comida.", caminho);
                    } else{
                        caminho = "";   // TODO
//                        this.animal = new Primata("Mico", "É pequeno, anda em grupos e rouba comida.", caminho);
                    }
                    break;
                default:
                    if(cifra.equals("A" + oitava)) {
                        caminho = "";   // TODO
                        this.animal = new Animal("Cavalo", "Ele troca", caminho);
                    } else if(cifra.equals("C" + oitava)){
                        caminho = "";   // TODO
//                        this.animal = new Animal("Cavalo", "Ele troca", caminho);
                    } else if(cifra.equals("D" + oitava)){
                        caminho = "";   // TODO
//                        this.animal = new Animal("Cavalo", "Ele troca", caminho);
                    } else if(cifra.equals("F" + oitava)) {
                        caminho = "";   // TODO
//                        this.animal = new Animal("Cavalo", "Ele troca", caminho);
                    } else{
                        caminho = "";   // TODO
//                        this.animal = new Animal("Cavalo", "Ele troca", caminho);
                    }
                    break;
            }        
        }
    }
    
}
