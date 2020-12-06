/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tecladovirtual;

import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import tecladovirtual.sound.SoundController;
import tecladovirtual.teclas.*;

/**
 *
 * @author iris
 */
public class FXMLDocumentController implements Initializable {
    private final SoundController C1 = new SoundController("src/tecladovirtual/assets/sound/1/C1.mp3");
    private final Teclado teclado = new Teclado(5);
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void onMousePressed(MouseEvent event) {
        ImageView teclaNode = (ImageView) event.getSource();
        String idTecla = teclaNode.getId();
        int idOitava = parseInt(teclaNode.getParent().getId());
        
        Oitava oitava = this.teclado.getOitava(idOitava);
        Tecla tecla = oitava.getTecla(idTecla);
        tecla.emitirSom();
    }
    
}
