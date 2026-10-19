package com.angelvaloro09.ejercicio_3_2;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class AppController {

    @FXML
    private Button startRaceButton;

    @FXML
    private Label hareStatusLabel;

    @FXML
    private ProgressBar hareProgressBar;

    @FXML
    private Label tortoiseStatusLabel;

    @FXML
    private ProgressBar tortoiseProgressBar;

    @FXML
    public void onStartRaceClicked(ActionEvent event) {
        this.startRaceButton.setDisable(true);
        Runner.resetRace();
        Runner hare = new HareRunner(this.hareProgressBar, this.hareStatusLabel);
        Runner tortoise = new TortoiseRunner(this.tortoiseProgressBar, this.tortoiseStatusLabel);

        Thread hareThread = new Thread(hare);
        Thread tortoiseThread = new Thread(tortoise);

        hareThread.setDaemon(true);
        tortoiseThread.setDaemon(true);

        hareThread.start();
        tortoiseThread.start();

        Thread coordinatorThread = new Thread(() -> {
            try {
                hareThread.join();
                tortoiseThread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            Platform.runLater(() -> {
                this.startRaceButton.setDisable(false);
            });
        });

        coordinatorThread.setDaemon(true);
        coordinatorThread.start();
    }
}
