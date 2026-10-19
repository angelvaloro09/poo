package com.angelvaloro09.ejercicio_3_1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class AppController {

    @FXML
    private TextField countTextField;

    @FXML
    private Button countButton;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private Button waitButton;

    private int clickCounter;

    @FXML
    public void onCountClicked(ActionEvent event) {
        this.clickCounter++;
        this.countTextField.setText(String.valueOf(this.clickCounter));
    }

    @FXML
    public void onWaitClicked(ActionEvent event) {
        this.waitButton.setDisable(true);
        this.progressBar.setProgress(0.0d);

        Thread progressThread = new Thread(() -> {
            int totalSteps = 100;
            int stepDelayMs = 100;

            for (int step = 1; step <= totalSteps; step++) {
                try {
                    Thread.sleep(stepDelayMs);
                } catch (InterruptedException e) {
                    Platform.runLater(() -> {
                        Alert alert = new Alert(AlertType.ERROR);
                        alert.setTitle("Hilo Interrumpido");
                        alert.setHeaderText(null);
                        alert.setContentText("El hilo fue interrumpido de forma inesperada");
                        alert.showAndWait();
                    });
                }

                double currentProgress = (double) step / totalSteps;
                Platform.runLater(() -> {
                    this.progressBar.setProgress(currentProgress);
                });
            }
            Platform.runLater(() -> {
                this.waitButton.setDisable(false);
            });
        });

        progressThread.setDaemon(true);
        progressThread.start();
    }
}
