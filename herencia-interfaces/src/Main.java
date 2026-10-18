package src;

import src.models.Alumno;
import src.models.Profesor;

public class Main {
    public static void main(String[] args) {
        Alumno a = new Alumno();
        Profesor p = new Profesor(10008000);
        System.out.println(a);
        System.out.println(p);
    }
}
