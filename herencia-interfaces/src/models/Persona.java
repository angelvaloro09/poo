package src.models;

public abstract class Persona {
    private String nombre;
    private int edad;

    public Persona() {
        this("Sin nombre", 0);
    }

    public Persona(String nombre, int edad) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Error: el nombre es obligatorio");
        }
        if (edad < 0) {
            throw new IllegalArgumentException("Error: la edad debe ser mayor o igual a cero");
        }
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("Se crea un " + this.getClass().getSimpleName() + "...");
    }

    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int getEdad() {
        return edad;
    }

    public Persona setEdad(int edad) {
        this.edad = edad;
        return this;
    }
}