package br.com.calculadora.controller;

import br.com.calculadora.model.Calculos;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;

public class JFXCalculadora {

    public TextField tfNumero1;

    public TextField tfNumero2;

    public Button bCalcular;

    public Button bSair;
    public TextField tfResultado;

    // criação do objeto da classe de modelagem
    Calculos calculos = new Calculos();

    public void calcular(ActionEvent actionEvent) {
        double num1 = Double.parseDouble(tfNumero1.getText());
        double num2 = Double.parseDouble(tfNumero2.getText());


        tfResultado.setText(String.valueOf(calculos.somar(num1, num2)));

    }

    public void sair(ActionEvent actionEvent) {
        System.exit(0);
    }
}
