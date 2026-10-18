package src.ejercicio_2_2.models;

public class TrianguloRect extends FiguraRecta {
    public TrianguloRect(int alto, int ancho) {
        super(alto, ancho);
    }

    @Override
    public double calcularArea() {
        return (this.ancho * this.alto) / 2.0d;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(((this.alto * this.alto) + (this.ancho * this.ancho)));
        return this.alto + this.ancho + hipotenusa;
    }

    @Override
    public String imprimeFigura() {
        return super.imprimeFigura()
                + String.format("Se imprime un Triangulo con alto: %d, ancho: %d, area: %.2f, perimetro: %.2f",
                        this.alto,
                        this.ancho, this.calcularArea(), this.calcularPerimetro());
    }

}
