package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;

public class Controller {
    
    @FXML
    private PasswordField idTextPassword;
    @FXML
    private Label idMostrarPassword;
    @FXML
    private Button idButtonGuardar;

    @FXML
    public void onidMostrarPasswordClicked(MouseEvent event){
        idMostrarPassword.setText(idTextPassword.getText());
    }

    @FXML
    public void onidButtonGuardar(MouseEvent event){
        idButtonGuardar.setText("Botón pulsado");

    }




}
