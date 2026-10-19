package com.angelvaloro09.ejercicio_3_2;

import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public abstract class Runner implements Runnable {

    protected static boolean hasWinner = false;

    protected String name;
    protected int stepDelayMs;
    protected ProgressBar progressBar;
    protected Label statusLabel;
    protected double progress;

    public Runner(String name, int stepDelayMs, ProgressBar progressBar, Label statusLabel) {
        this.name = name;
        this.stepDelayMs = stepDelayMs;
        this.progressBar = progressBar;
        this.statusLabel = statusLabel;
        this.progress = 0.0;
    }

    public static void resetRace() {
        hasWinner = false;
    }

    @Override
    public void run() {
        this.progress = 0.0;
        this.updateUI(this.name + ": ¡Está corriendo!", this.progress);
        while (this.progress < 1.0d) {
            try {
                Thread.sleep(this.stepDelayMs);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
            this.progress += 0.01;
            if (this.progress > 1.0) {
                this.progress = 1.0;
            }
            this.checkSpecialBehavior();
            this.updateUI(null, this.progress);
        }
        synchronized (Runner.class) {
            if (!hasWinner) {
                hasWinner = true;
                this.updateUI(this.name + ": ¡Ganó la carrera!", 1.0);
            } else {
                this.updateUI(this.name + ": ¡Llegó a la meta!", 1.0);
            }
        }
    }

    protected void updateUI(String message, double currentProgress) {
        Platform.runLater(() -> {
            if (message != null) {
                this.statusLabel.setText(message);
            }
            this.progressBar.setProgress(currentProgress);
        });
    }

    protected abstract void checkSpecialBehavior();
}
