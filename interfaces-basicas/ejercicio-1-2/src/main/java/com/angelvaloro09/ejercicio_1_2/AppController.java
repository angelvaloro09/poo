package com.angelvaloro09.ejercicio_1_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AppController {

    private final int[] denominations = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };

    @FXML
    private TextField amountTextField;

    @FXML
    private TextArea resultsTextArea;

    @FXML
    public void onBreakdown(ActionEvent event) {
        StringBuilder result = new StringBuilder();
        int amount = this.calculateAmounts();
        if (amount > 0) {
            for (int denomination : denominations) {
                int quantity = amount / denomination;
                amount %= denomination;
                result.append(quantity).append("\n");
            }
            resultsTextArea.setText(result.toString());
        }
    }

    @FXML
    public void onClear(ActionEvent event) {
        amountTextField.clear();
        resultsTextArea.clear();
    }

    private int calculateAmounts() {
        int amount = -1;
        try {
            amount = Integer.parseInt(amountTextField.getText());
            if (amount <= 0) {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error de cantidad");
                alert.setHeaderText(null);
                alert.setContentText("Por favor, ingrese una cantidad mayor a cero");
                alert.showAndWait();
                return -1;
            }
        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error de formato");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, ingrese una cantidad númerica y entera");
            alert.showAndWait();
            return -1;
        }
        return amount;
    }
}
