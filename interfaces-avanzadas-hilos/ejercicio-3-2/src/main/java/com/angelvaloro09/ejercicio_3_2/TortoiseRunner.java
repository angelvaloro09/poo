package com.angelvaloro09.ejercicio_3_2;

import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class TortoiseRunner extends Runner {

    public TortoiseRunner(ProgressBar progressBar, Label statusLabel) {
        super("La Tortuga", 110, progressBar, statusLabel);
    }

    @Override
    protected void checkSpecialBehavior() {
    }
}
