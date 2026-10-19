package com.angelvaloro09.ejercicio_3_2;

import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class HareRunner extends Runner {

    private boolean hasNapped;

    public HareRunner(ProgressBar progressBar, Label statusLabel) {
        super("La Liebre", 40, progressBar, statusLabel);
        this.hasNapped = false;
    }

    @Override
    protected void checkSpecialBehavior() {
        if (!this.hasNapped && this.progress >= 0.45) {
            this.hasNapped = true;

            this.updateUI(this.name + ": ¡Se durmió!", this.progress);

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            this.updateUI(this.name + ": ¡Despertó y sigue corriendo!", this.progress);
        }
    }
}
