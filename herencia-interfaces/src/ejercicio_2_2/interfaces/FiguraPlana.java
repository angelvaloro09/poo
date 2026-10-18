package src.ejercicio_2_2.interfaces;

public interface FiguraPlana {
    double calcularArea();

    double calcularPerimetro();

    default String mensajeFiguraPlana() {
        return "Se imprime una FiguraPlana...";
    }
}