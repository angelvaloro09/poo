package com.angelvaloro09.ejercicio_1_1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AppController {
    @FXML
    private TextField birthDateTextField;

    @FXML
    private Label resultLabel;

    @FXML
    public void onCalculate(ActionEvent event) {
        Period period = this.calculatePeriod();
        if (period != null) {
            int years = period.getYears();
            int months = period.getMonths();
            this.resultLabel.setText("Tiene " + years + " años con " + months + " meses");
        }
    }

    @FXML
    public void onClean(ActionEvent event) {
        this.birthDateTextField.clear();
        this.resultLabel.setText("");
    }

    private Period calculatePeriod() {
        String birthDateString = this.birthDateTextField.getText();

        if (birthDateString == null || birthDateString.isBlank()) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("La fecha es obligatoria");
            alert.showAndWait();
            return null;
        }

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate birthDate;
        try {
            birthDate = LocalDate.parse(birthDateString, dateFormatter);
        } catch (Exception e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error de formato");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, ingresa una fecha válida en formato dd/mm/aaaa.");
            alert.showAndWait();
            return null;
        }

        LocalDate today = LocalDate.now();

        if (birthDate.isAfter(today)) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error de fecha");
            alert.setHeaderText(null);
            alert.setContentText("La fecha de nacimiento no puede ser posterior a la fecha actual.");
            alert.showAndWait();
            return null;
        }

        return Period.between(birthDate, today);
    }
}
