package ejercicio_2_2.models;

import ejercicio_2_2.abstracts.Figura2D;

public abstract class FiguraCircular extends Figura2D {
    protected int radio;

    public FiguraCircular(int radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("Error: el radio debe ser mayor a cero");
        }
        this.radio = radio;
    }

    public int getRadio() {
        return this.radio;
    }

    public FiguraCircular setRadio(int radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("Error: el radio debe ser mayor a cero");
        }
        this.radio = radio;
        return this;
    }
}
