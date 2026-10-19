package ejercicio_2_2.abstracts;

import ejercicio_2_2.interfaces.FiguraPlana;

public abstract class Figura2D implements FiguraPlana {
    public String imprimeFigura() {
        return "Se imprime una FiguraPlana...\n\n";
    }
}
