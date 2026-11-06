package com.example.holabuenas;

import com.example.controller.SaludoController;
import com.example.views.SaludoView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        SaludoView vista = new SaludoView();
        new SaludoController(vista);
        Scene scene = new Scene(vista,300,200);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
