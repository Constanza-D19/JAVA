package cl.duoc.nora.cony;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLOutput;

public class HelloController {
    @FXML public TextField valor_a;
    @FXML public TextField valor_b;
    @FXML public Label resultado;

    @FXML
    public void sumar(){
        Integer a = Integer.parseInt(valor_a.getText());
        Integer b = Integer.parseInt(valor_b.getText());
        Integer r = a + b;
        resultado.setText(r.toString());

    }
    @FXML
    public void restar() {
        Integer a = Integer.parseInt(valor_a.getText());
        Integer b = Integer.parseInt(valor_b.getText());
        Integer r = a - b;
        resultado.setText(r.toString());
    }
    @FXML
    public void dividir() {
        Integer a = Integer.parseInt(valor_a.getText());
        Integer b = Integer.parseInt(valor_b.getText());
        Integer r = a / b;
        resultado.setText(r.toString());
    }
    @FXML
    public void multiplicar() {
        Integer a = Integer.parseInt(valor_a.getText());
        Integer b = Integer.parseInt(valor_b.getText());
        Integer r = a * b;
        resultado.setText(r.toString());
    }

    protected void mostaralerta(String mensaje, Alert.AlertType tipoAlerta){


    }

}
