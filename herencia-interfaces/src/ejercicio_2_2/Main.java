package src.ejercicio_2_2;

import src.ejercicio_2_2.abstracts.Figura2D;
import src.ejercicio_2_2.models.Circulo;
import src.ejercicio_2_2.models.TrianguloRect;

public class Main {
    public static void main(String[] args) {
        Figura2D f = new TrianguloRect(3, 4);
        System.out.println(f.imprimeFigura() + "\n");
        f = new Circulo(3);
        System.out.println(f.imprimeFigura());
    }
}
