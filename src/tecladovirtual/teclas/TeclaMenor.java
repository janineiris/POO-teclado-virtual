/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecladovirtual.teclas;

/**
 *
 * @author iris
 */
public class TeclaMenor extends Tecla{
    
    public TeclaMenor(int oitava, String cifra) {
        super(cifra + "#", "src/tecladovirtual/assets/sound/"+ oitava + "/" + cifra + "#" + ".mp3");
    }
    
}
