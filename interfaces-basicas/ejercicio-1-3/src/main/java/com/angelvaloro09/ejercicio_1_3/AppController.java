package com.angelvaloro09.ejercicio_1_3;

import java.util.ArrayList;
import java.util.List;

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
    private TextField digitCountTextField;

    @FXML
    private TextField oddSumTextField;

    @FXML
    private TextField evenSumTextField;

    @FXML
    private TextField totalSumTextField;

    @FXML
    private TextField maxDigitTextField;

    @FXML
    private TextField minDigitTextField;

    @FXML
    private TextArea divisorsTextArea;

    private List<Integer> digits = new ArrayList<>();

    @FXML
    public void onAnalyze(ActionEvent event) {
        this.digits.clear();
        Integer number = this.parseNumber();
        if (number != null) {
            int absNumber = Math.abs(number);

            if (absNumber == 0) {
                this.digitCountTextField.setText("1");
                this.oddSumTextField.setText("0");
                this.evenSumTextField.setText("0");
                this.totalSumTextField.setText("0");
                this.maxDigitTextField.setText("0");
                this.minDigitTextField.setText("0");
                this.divisorsTextArea.setText("0");
                return;
            }

            this.digitCountTextField.setText(String.valueOf(this.digitCount(absNumber)));
            this.oddSumTextField.setText(String.valueOf(this.oddDigitsSum(absNumber)));
            this.evenSumTextField.setText(String.valueOf(this.evenDigitsSum(absNumber)));
            this.totalSumTextField.setText(String.valueOf(this.digitsSum(absNumber)));
            this.maxDigitTextField.setText(String.valueOf(this.getMaxDigit(absNumber)));
            this.minDigitTextField.setText(String.valueOf(this.getMinDigit(absNumber)));
            this.divisorsTextArea.setText(this.getDivisors(absNumber));
        }
    }

    @FXML
    public void onClear(ActionEvent event) {
        this.numberTextField.clear();
        this.digitCountTextField.clear();
        this.oddSumTextField.clear();
        this.evenSumTextField.clear();
        this.totalSumTextField.clear();
        this.maxDigitTextField.clear();
        this.minDigitTextField.clear();
        this.divisorsTextArea.clear();
        this.digits.clear();
    }

    private Integer parseNumber() {
        int num = 0;
        try {
            num = Integer.parseInt(this.numberTextField.getText());
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

    private int digitCount(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            this.digits.add(num % 10);
            num /= 10;
        }
        return count;
    }

    private int oddDigitsSum(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            num /= 10;
        }
        return sum;
    }

    private int evenDigitsSum(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            num /= 10;
        }
        return sum;
    }

    private int digitsSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    private int getMaxDigit(int num) {
        int max = this.digits.get(0);
        for (int digit : this.digits) {
            max = (max < digit) ? digit : max;
        }
        return max;
    }

    private int getMinDigit(int num) {
        int min = this.digits.get(0);
        for (int digit : this.digits) {
            min = (min > digit) ? digit : min;
        }
        return min;
    }

    private String getDivisors(int num) {
        StringBuilder divisors = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisors.append(i).append("\n");
            }
        }
        return divisors.toString();
    }
}
