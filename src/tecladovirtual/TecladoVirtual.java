/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tecladovirtual;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author iris
 */
public class TecladoVirtual extends Application {
    
    private Stage stage;
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        Parent root = loader.load();
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        stage.setMaxHeight(stage.getHeight());
        stage.setMinHeight(stage.getHeight());
//        stage.setMaxWidth(stage.getWidth());
//        stage.setMinWidth(stage.getWidth());

        stage.setMaxWidth((double) 1106.0);
        stage.setMinWidth((double) 1106.0);
        
        this.stage = stage;
        
        loader.<FXMLDocumentController>getController().setTecladoVirtual(this);
    }
    
    public Stage getStage() {
        return this.stage;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
