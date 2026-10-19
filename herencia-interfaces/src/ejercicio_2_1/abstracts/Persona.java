package ejercicio_2_1.abstracts;

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
        return this.nombre;
    }

    public Persona setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Error: el nombre es obligatorio");
        }
        this.nombre = nombre;
        return this;
    }

    public int getEdad() {
        return this.edad;
    }

    public Persona setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("Error: la edad debe ser mayor o igual a cero");
        }
        this.edad = edad;
        return this;
    }
}