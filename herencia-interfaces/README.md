# Herencia e Interfaces en Java

Prácticas de Programación Orientada a Objetos para demostrar el uso de herencia, clases abstractas, interfaces y polimorfismo en Java.

---

## Clonar el repositorio

```bash
git clone https://github.com/angelvaloro09/poo.git
cd poo/herencia-interfaces
```

---

## Requisitos

- **Java Development Kit (JDK)**: 21 LTS o superior.

---

## Índice de Ejercicios

| Ejercicio | Descripción |
| :--- | :--- |
| [**Ejercicio 2.1**](./src/ejercicio_2_1/) | Modelado de jerarquía de personas con clases abstractas (`Persona`, `Alumno`, `Profesor`). |
| [**Ejercicio 2.2**](./src/ejercicio_2_2/) | Cálculo geométrico de área y perímetro mediante interfaces y herencia (`FiguraPlana`, `Figura2D`, `Circulo`, `TrianguloRect`). |

---

## Compilación y Ejecución desde Terminal

Desde el directorio `herencia-interfaces`, ejecuta según el ejercicio:

### Ejercicio 2.1
```bash
javac -d bin -sourcepath src src/ejercicio_2_1/Main.java
java -cp bin ejercicio_2_1.Main
```

### Ejercicio 2.2
```bash
javac -d bin -sourcepath src src/ejercicio_2_2/Main.java
java -cp bin ejercicio_2_2.Main
```

---

## Ejecución en IDEs (IntelliJ IDEA / NetBeans / Eclipse / VS Code)

1. Abre la carpeta `herencia-interfaces` en tu IDE.
2. Asegúrate de que `src/` esté marcado como raíz de fuentes (*Sources Root*).
3. Navega al archivo `Main.java` del ejercicio deseado y haz clic derecho ➔ **Run**.
