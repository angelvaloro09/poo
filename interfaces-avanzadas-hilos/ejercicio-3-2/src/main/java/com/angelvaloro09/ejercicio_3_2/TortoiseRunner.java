package com.angelvaloro09.ejercicio_3_2;

import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class TortoiseRunner extends Runner {

    public TortoiseRunner(ProgressBar progressBar, Label statusLabel) {
        super("La Tortuga", 120, progressBar, statusLabel);
    }

    @Override
    protected void checkSpecialBehavior() {
        // La tortuga mantiene un paso constante y no realiza pausas especiales.
    }
}
