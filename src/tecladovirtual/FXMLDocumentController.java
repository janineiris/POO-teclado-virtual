/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tecladovirtual;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import tecladovirtual.sound.SoundController;

/**
 *
 * @author iris
 */
public class FXMLDocumentController implements Initializable {
    private final SoundController C1 = new SoundController("src/tecladovirtual/assets/sound/1/C1.mp3");
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
