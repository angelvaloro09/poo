package ejercicio_2_2.models;

import ejercicio_2_2.abstracts.Figura2D;

public abstract class FiguraRecta extends Figura2D {
    protected int alto;
    protected int ancho;

    public FiguraRecta(int alto, int ancho) {
        if (alto <= 0) {
            throw new IllegalArgumentException("Error: el alto debe ser mayor a cero");
        }

        if (ancho <= 0) {
            throw new IllegalArgumentException("Error: el ancho debe ser mayor a cero");
        }
        this.alto = alto;
        this.ancho = ancho;
    }

    public int getAlto() {
        return this.alto;
    }

    public FiguraRecta setAlto(int alto) {
        if (alto <= 0) {
            throw new IllegalArgumentException("Error: el alto debe ser mayor a cero");
        }
        this.alto = alto;
        return this;
    }

    public int getAncho() {
        return this.ancho;
    }

    public FiguraRecta setAncho(int ancho) {
        if (ancho <= 0) {
            throw new IllegalArgumentException("Error: el ancho debe ser mayor a cero");
        }
        this.ancho = ancho;
        return this;
    }
}
