/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package appusotextoboton;

import componente_guillermoBenitez.CampoTextoBoton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author usuario
 */
public class AppUsoTextoBotonViewController implements Initializable {    

    @FXML
    private Label mostrarLabel;
    @FXML
    private CampoTextoBoton grabarPrimero;
    @FXML
    private CampoTextoBoton grabarSegundo;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        grabarPrimero.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                mostrarLabel.setText("Se ha grabado: " + grabarPrimero.getText());
            }
        });
        
        grabarSegundo.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                mostrarLabel.setText("Se ha grabado: " + grabarSegundo.getText());
            }
        });
        
    }  
    
}
