# Interfaces Básicas con JavaFX

Prácticas de interfaces gráficas básicas desarrolladas con **JavaFX**, **FXML** y gestionadas con **Apache Maven**.

---

## Requisitos

- **Java Development Kit (JDK)**: 21 LTS o superior.
- **Apache Maven**: 3.9 o superior.

---

## Ejecución

Para ejecutar cualquier ejercicio desde la terminal, accede a su directorio y corre:

```bash
mvn javafx:run
```

O bien, abre el proyecto en tu IDE preferido (IntelliJ IDEA, Eclipse, NetBeans, VS Code) y ejecuta la clase `Main.java` con clic derecho ➔ **Run**.

---

## Ejercicios

| Ejercicio | Descripción | Conceptos / Componentes clave |
| :--- | :--- | :--- |
| [**Ejercicio 1.1**](./ejercicio-1-1/) | Cálculo de edad en años y meses según fecha de nacimiento. | `LocalDate`, `Period`, `Alert`, `TextField` |
| [**Ejercicio 1.2**](./ejercicio-1-2/) | Desglose de dinero en billetes y monedas ordenados de mayor a menor. | Algoritmo codicioso (`/`, `%`), `TextArea` alineado a la derecha |
| [**Ejercicio 1.3**](./ejercicio-1-3/) | Análisis de cifras (pares, impares, total, mayor, menor) y lista de divisores. | `GridPane`, descomposición de dígitos, divisibilidad |
| [**Ejercicio 1.4**](./ejercicio-1-4/) | Generación de la tabla de multiplicar de un entero (del 1 al 10). | Iteración, formato de texto, `TextArea` |
| [**Ejercicio 1.5**](./ejercicio-1-5/) | Control de gastos semanales: cálculo de total semanal y categoría mayor. | `GridPane`, método sobrecargado `parseNumber`, arreglos paralelos |
