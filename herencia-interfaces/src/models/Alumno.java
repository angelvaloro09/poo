package src.models;

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