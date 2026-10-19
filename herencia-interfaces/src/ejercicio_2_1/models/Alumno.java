package ejercicio_2_1.models;

import ejercicio_2_1.abstracts.Persona;

public class Alumno extends Persona {

    public Alumno() {
        super();
    }

    public Alumno(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String toString() {
        return "Un alumno llamado " + this.getNombre();
    }
}