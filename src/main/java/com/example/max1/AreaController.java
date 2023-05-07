package com.example.max1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AreaController {
    @FXML
    private TextField a;
    @FXML
    private TextField b;
    @FXML
    private TextField c;
    @FXML
    private TextField R;
    @FXML
    private Label result;
    @FXML
    private Label result1;

    private String calculate() {
        double A = Double.parseDouble(a.getText());
        double B = Double.parseDouble(b.getText());
        double C = Double.parseDouble(c.getText());
        double p = (A + B + C) / 2;
        double t = p * (p - A) * (p - B) * (p - C);
        if (t < 0) {
            return "Невірно введені дані!";
        } else {
            return String.valueOf(Math.sqrt(t));
        }
    }

    private String calculate1() {
        double r = Double.parseDouble(R.getText());
        return String.valueOf(Math.pow(r, 2) * Math.PI);
    }

    @FXML
    protected void onButton1Click() {
        result.setText(calculate());
    }

    @FXML
    protected void onButton2Click() {
        result1.setText(calculate1());
    }
}