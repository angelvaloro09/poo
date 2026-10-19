package com.angelvaloro09.ejercicio_1_5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class AppController {

    @FXML
    private TextField foodTextField;

    @FXML
    private TextField snacksTextField;

    @FXML
    private TextField transportTextField;

    @FXML
    private TextField phoneTextField;

    @FXML
    private TextField othersTextField;

    @FXML
    private TextField weeklyTotalTextField;

    @FXML
    private TextField highestExpenseTextField;

    @FXML
    public void onCalculateStatistics(ActionEvent event) {
        Integer food = this.parseNumber(this.foodTextField);
        if (food == null)
            return;
        Integer snacks = this.parseNumber(this.snacksTextField);
        if (snacks == null)
            return;
        Integer transport = this.parseNumber(this.transportTextField);
        if (transport == null)
            return;
        Integer phone = this.parseNumber(this.phoneTextField);
        if (phone == null)
            return;
        Integer others = this.parseNumber(this.othersTextField);
        if (others == null)
            return;

        this.weeklyTotalTextField.setText(String.valueOf(food + snacks + transport + phone + others));

        int[] amounts = { food, snacks, transport, phone, others };
        String[] categories = { "Alimentación", "Refrigerios", "Transporte", "Telefonía", "Otros" };

        int maxIndex = 0;
        for (int i = 0; i < amounts.length; i++) {
            if (amounts[maxIndex] < amounts[i]) {
                maxIndex = i;
            }
        }

        this.highestExpenseTextField.setText(categories[maxIndex]);
    }

    @FXML
    public void onClear(ActionEvent event) {
        this.foodTextField.clear();
        this.snacksTextField.clear();
        this.transportTextField.clear();
        this.phoneTextField.clear();
        this.othersTextField.clear();
        this.weeklyTotalTextField.clear();
        this.highestExpenseTextField.clear();
    }

    private Integer parseNumber(TextField field) {
        int num = 0;
        try {
            num = Integer.parseInt(field.getText().trim());
        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error de formato");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, ingrese una cifra numérica entera");
            alert.showAndWait();
            return null;
        }
        return num;
    }
}
