package src.ejercicio_2_2.models;

public class Circulo extends FiguraCircular {

    public Circulo(int radio) {
        super(radio);
    }

    @Override
    public double calcularArea() {
        return Math.PI * this.radio * this.radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    @Override
    public String imprimeFigura() {
        return super.imprimeFigura()
                + String.format("Se imprime un Circulo con radio: %d, area: %.2f, perimetro: %.2f",
                        this.radio, this.calcularArea(), this.calcularPerimetro());
    }
}
