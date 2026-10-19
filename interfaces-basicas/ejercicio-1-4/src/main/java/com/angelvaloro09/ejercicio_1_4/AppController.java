package com.angelvaloro09.ejercicio_1_4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AppController {

    @FXML
    private TextField numberTextField;

    @FXML
    private TextArea tableTextArea;

    @FXML
    public void onCalculate(ActionEvent event) {
        Integer number = this.parseNumber();
        if (number != null) {
            StringBuilder results = new StringBuilder();
            for (int i = 1; i <= 10; i++) {
                results.append(number + " x " + i + " = " + (number * i) + "\n");
            }
            tableTextArea.setText(results.toString());
        }
    }

    @FXML
    public void onClear(ActionEvent event) {
        numberTextField.clear();
        tableTextArea.setText("");
    }

    private Integer parseNumber() {
        int num = 0;
        try {
            num = Integer.parseInt(numberTextField.getText());
        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error de formato");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, ingrese una cifra númerica entera");
            alert.showAndWait();
            return null;
        }
        return num;
    }
}
