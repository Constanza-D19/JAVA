package com.example.views;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class SaludoView extends VBox{
    private Label lblContador = new Label("Contador: 0");
    private Button btnSumar = new Button("Añadir +1");
    private Button btnRestar = new Button("Restar -1");
    public SaludoView(){
        setSpacing(10);
        setPadding(new Insets(20));
        setAlignment(Pos.CENTER);
        getChildren().addAll(lblContador, btnSumar, btnRestar);
    }

    public Label getLblContador() {
        return lblContador;
    }

    public Button getBtnSumar() {
        return btnSumar;
    }

    public Button getBtnRestar() {
        return btnRestar;
    }
}
