/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tecladovirtual;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


/**
 *
 * @author iris
 */
public class FXMLDocumentController implements Initializable {
    private final Teclado teclado = new Teclado(5);
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void onMousePressed(MouseEvent event) {
        ImageView teclaNode = (ImageView) event.getSource();
//        teclaNode.
        String idTecla = teclaNode.getId().replace("sus", "#");
        String idStringOitava = teclaNode.getParent().getId();
        int idOitava = idStringOitava.equals("um")
            ? 1
            : idStringOitava.equals("dois")
                ? 2
                : idStringOitava.equals("tres")
                    ? 3
                    : idStringOitava.equals("quatro")
                        ? 4
                        : 5;
        System.out.println(idTecla);
        this.teclado.emitirSom(idOitava, idTecla);
    }
    
    @FXML
    public void onMouseReleased(MouseEvent event) {
        ImageView teclaNode = (ImageView) event.getSource();

        String idTecla = teclaNode.getId().replace("sus", "#");
        
        String idStringOitava = teclaNode.getParent().getId();
        int idOitava = idStringOitava.equals("um")
            ? 1
            : idStringOitava.equals("dois")
                ? 2
                : idStringOitava.equals("tres")
                    ? 3
                    : idStringOitava.equals("quatro")
                        ? 4
                        : 5;
        

        this.teclado.pararSom(idOitava, idTecla);
    }
    
    @FXML
    public void onSliderValueChange(MouseEvent event) {
        Slider slider = (Slider) event.getSource();
        int novoVolume = (int) Math.ceil(slider.getValue());
        Teclado.setVolume(novoVolume);
    }
    
}
