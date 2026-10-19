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
        digits.clear();
        Integer number = this.parseNumber();
        if (number != null) {
            int absNumber = Math.abs(number);

            if (absNumber == 0) {
                digitCountTextField.setText("1");
                oddSumTextField.setText("0");
                evenSumTextField.setText("0");
                totalSumTextField.setText("0");
                maxDigitTextField.setText("0");
                minDigitTextField.setText("0");
                divisorsTextArea.setText("0");
                return;
            }

            digitCountTextField.setText(String.valueOf(this.digitCount(absNumber)));
            oddSumTextField.setText(String.valueOf(this.oddDigitsSum(absNumber)));
            evenSumTextField.setText(String.valueOf(this.evenDigitsSum(absNumber)));
            totalSumTextField.setText(String.valueOf(this.digitsSum(absNumber)));
            maxDigitTextField.setText(String.valueOf(this.getMaxDigit(absNumber)));
            minDigitTextField.setText(String.valueOf(this.getMinDigit(absNumber)));
            divisorsTextArea.setText(this.getDivisors(absNumber));
        }
    }

    @FXML
    public void onClear(ActionEvent event) {
        numberTextField.clear();
        digitCountTextField.clear();
        oddSumTextField.clear();
        evenSumTextField.clear();
        totalSumTextField.clear();
        maxDigitTextField.clear();
        minDigitTextField.clear();
        divisorsTextArea.clear();
        digits.clear();
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

    private int digitCount(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            digits.add(num % 10);
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
        int max = digits.get(0);
        for (int digit : digits) {
            max = (max < digit) ? digit : max;
        }
        return max;
    }

    private int getMinDigit(int num) {
        int min = digits.get(0);
        for (int digit : digits) {
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
