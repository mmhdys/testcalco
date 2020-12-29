package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Controller {

    @FXML
    private TextField ecran;

    @FXML
    private Button btn1;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if(event.getSource() == btn1){
            ecran.setText(ecran.getText() + "1");
        }
    }

}