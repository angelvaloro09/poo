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

            // 1. Mostrar que se durmió
            this.updateUI(this.name + ": ¡Se durmió!", this.progress);

            // 2. Pausar el hilo de la liebre por 7.5 segundos
            try {
                Thread.sleep(7500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            // 3. Mostrar que despertó
            this.updateUI(this.name + ": ¡Despertó y sigue corriendo!", this.progress);
        }
    }
}
