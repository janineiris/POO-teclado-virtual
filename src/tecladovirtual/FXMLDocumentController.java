/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tecladovirtual;

import tecladovirtual.teclados.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


/**
 *
 * @author iris
 */
public class FXMLDocumentController implements Initializable {
    private final Teclado tecladoOriginal = new TecladoClassico(5);
    private final Teclado tecladoBichos = new TecladoAnimal(5);
    private Teclado tecladoAtual = tecladoOriginal;
    
    private TecladoVirtual tecladoVirtual;
    
    @FXML
    private Label lblAnimal;
    
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
        this.tecladoAtual.emitirSom(idOitava, idTecla);
        
        if(this.tecladoAtual instanceof TecladoAnimal){
            String text = ((TecladoAnimal) this.tecladoAtual).getDescricaoAnimal(idOitava, idTecla);
            this.lblAnimal.setText(text);
        }
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

        this.tecladoAtual.pararSom(idOitava, idTecla);
    }
    
    @FXML
    public void onBtnTimbreAction(Event event){
        ToggleButton btn = (ToggleButton) event.getSource();
        Stage stage = this.tecladoVirtual.getStage();
        if(btn.getText().equals("Animais")){
            btn.setText("Clássico");
            this.tecladoAtual = this.tecladoOriginal;
            stage.setMaxWidth((double) 1126.0);
            stage.setMinWidth((double) 1126.0);
            this.lblAnimal.setText("");
        }else{
            btn.setText("Animais");
            this.tecladoAtual = this.tecladoBichos;
            stage.setMaxWidth((double) 1280.0);
            stage.setMinWidth((double) 1280.0);
        }
    }
    
    @FXML
    public void onSliderValueChange(MouseEvent event) {
        Slider slider = (Slider) event.getSource();
        int novoVolume = (int) Math.ceil(slider.getValue());
        Teclado.setVolume(novoVolume);
    }
    
    public void setTecladoVirtual(TecladoVirtual teclado) {
        this.tecladoVirtual = teclado;
    }    
}
