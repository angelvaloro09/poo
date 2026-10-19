package ejercicio_2_1.models;

import ejercicio_2_1.abstracts.Persona;

public class Profesor extends Persona {
    private int numEmpleado;

    public Profesor() {
        this(0);
    }

    public Profesor(int numEmpleado) {
        super("Sin nombre", 0);
        if (numEmpleado < 0) {
            throw new IllegalArgumentException("Error: el numero de empleado debe ser mayor o igual a cero");
        }
        this.numEmpleado = numEmpleado;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public Profesor setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
        return this;
    }

    @Override
    public String toString() {
        return "Un profesor de edad " + this.getEdad() + ", con clave " + this.getNumEmpleado();
    }

}
