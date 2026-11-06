package com.example.controller;

import com.example.views.SaludoView;

public class SaludoController {
    private SaludoView vista ;
    private int contador = 0;

    public SaludoController(SaludoView vista){
        this.vista = vista;
        vista.getBtnSumar().setOnAction(e -> sumar());
        vista.getBtnRestar().setOnAction(e -> restar());
    }

    public void sumar(){
        contador++;
        vista.getLblContador().setText("Contador: "+contador);

    }

    public void restar(){
        contador--;
        vista.getBtnRestar().setText("Constador: "+contador);
    }
}
