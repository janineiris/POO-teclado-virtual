/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecladovirtual.teclas;

import java.nio.file.Path;
import java.nio.file.Paths;
import tecladovirtual.sound.SoundController;

/**
 *
 * @author iris
 */
public class TeclaMaior extends Tecla{
    
    public TeclaMaior(int oitava, String cifra) {
        super.setCifra(cifra);
        super.setCaminhoSom("src/tecladovirtual/assets/sound/"+ oitava + "/" + cifra + ".mp3");
        super.setSom(
            new SoundController(super.getCaminhoSom())
        );
    }
}
