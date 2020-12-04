/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tecladovirtual;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import tecladovirtual.sound.SoundController;

/**
 *
 * @author iris
 */
public class FXMLDocumentController implements Initializable {
    private final SoundController C1 = new SoundController("src/tecladovirtual/sound/assets/1/C1.mp3");
    private final SoundController D1 = new SoundController("src/tecladovirtual/sound/assets/1/D1.mp3");
    
    @FXML
    private void actionBtnPlay(ActionEvent event) {
        C1.play();
    }
    @FXML
    private void actionBtnPlay1(ActionEvent event) {
        D1.play();
    }
    @FXML
    private void actionBtnPause(ActionEvent event) {
        C1.stop();
        D1.stop();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
