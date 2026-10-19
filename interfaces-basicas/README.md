# Interfaces Básicas con JavaFX

Colección de ejercicios prácticos de interfaces gráficas básicas desarrollados con **JavaFX**, **FXML** y gestionados mediante **Apache Maven**.

Cada ejercicio está estructurado como un proyecto independiente para garantizar compatibilidad total con cualquier entorno de desarrollo (IntelliJ IDEA, Apache NetBeans, Eclipse, VS Code o línea de comandos).

---

## Requisitos Generales

- **Java Development Kit (JDK)**: Versión 21 LTS o superior.
- **Apache Maven**: Versión 3.9 o superior.
- **Scene Builder** (opcional, para diseño visual de vistas FXML).

---

## Índice de Ejercicios

| Ejercicio | Descripción | Tecnologías Clave | Estado |
| :--- | :--- | :--- | :---: |
| [**Ejercicio 1.1**](./ejercicio-1-1/) | Cálculo de edad en años y meses a partir de la fecha de nacimiento. | JavaFX, FXML, `java.time` (`LocalDate`, `Period`), `Alert` | ✅ Concluido |
| [**Ejercicio 1.2**](./ejercicio-1-2/) | Desglose de dinero en billetes y monedas en orden descendente. | JavaFX, FXML, Greedy Algorithm (división y módulo), `Alert` | ✅ Concluido |
| [**Ejercicio 1.3**](./ejercicio-1-3/) | Análisis de cifras (pares, impares, mayor, menor) y cálculo de divisores. | JavaFX, FXML, `GridPane`, descomposición numérica, divisibilidad | ✅ Concluido |
| [**Ejercicio 1.4**](./ejercicio-1-4/) | Generación de la tabla de multiplicar de un entero. | JavaFX, FXML, iteraciones, formato de texto, `Alert` | ✅ Concluido |

---

## Detalle de Ejercicios

### [Ejercicio 1.1: Cálculo de Edad](./ejercicio-1-1/)

#### Descripción
Aplicación gráfica con ventana titulada *"Edad de una persona"*, que permite ingresar una fecha de nacimiento en formato `dd/mm/aaaa`, calcular los años y meses cumplidos a la fecha actual y mostrarlos en pantalla. Incluye función para limpiar los campos y validación ante campos vacíos, fechas futuras o formatos incorrectos mediante cuadros de diálogo modales (`Alert`).

#### Estructura del proyecto
```text
ejercicio-1-1/
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── com/angelvaloro09/ejercicio_1_1/
        │       ├── App.java            # Punto de entrada de JavaFX (carga view.fxml)
        │       ├── AppController.java  # Controlador con eventos y lógica de cálculo
        │       └── Main.java           # Lanzador estándar compatible con cualquier IDE
        └── resources/
            └── com/angelvaloro09/ejercicio_1_1/
                └── view.fxml           # Vista declarativa diseñada con Scene Builder
```

#### Ejecución

- **Vía Terminal (Maven)**:
  ```bash
  cd interfaces-basicas/ejercicio-1-1
  mvn clean javafx:run
  ```

- **Vía IDE (IntelliJ IDEA / NetBeans / Eclipse / VS Code)**:
  1. Abrir la carpeta `ejercicio-1-1` como proyecto Maven (o abrir el repositorio completo y dejar que el IDE detecte el `pom.xml`).
  2. Ejecutar la clase `Main.java` o `App.java` haciendo clic derecho ➔ **Run**.

---

### [Ejercicio 1.2: Desglose de Dinero](./ejercicio-1-2/)

#### Descripción
Aplicación gráfica con ventana titulada *"Desglose de dinero"*, que recibe una cantidad entera de dinero e indica la cantidad de billetes y monedas de cada denominación ($500, $200, $100, $50, $20, $10, $5, $2, $1) ordenados de manera descendente. Incluye botón para limpiar campos y validaciones con `Alert` ante entradas no numéricas o valores menores o iguales a cero.

#### Estructura del proyecto
```text
ejercicio-1-2/
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── com/angelvaloro09/ejercicio_1_2/
        │       ├── App.java            # Punto de entrada de JavaFX (carga view.fxml)
        │       ├── AppController.java  # Controlador con lógica de desglose y eventos
        │       └── Main.java           # Lanzador estándar compatible con cualquier IDE
        └── resources/
            └── com/angelvaloro09/ejercicio_1_2/
                └── view.fxml           # Vista con TextArea alineado a la derecha
```

#### Ejecución

- **Vía Terminal (Maven)**:
  ```bash
  cd interfaces-basicas/ejercicio-1-2
  mvn clean javafx:run
  ```

- **Vía IDE (IntelliJ IDEA / NetBeans / Eclipse / VS Code)**:
  1. Abrir la carpeta `ejercicio-1-2` como proyecto Maven.
  2. Ejecutar la clase `Main.java` o `App.java` haciendo clic derecho ➔ **Run**.

---

### [Ejercicio 1.3: Cifras y Divisores de un Número](./ejercicio-1-3/)

#### Descripción
Aplicación gráfica con ventana titulada *"Cifras y Divisores de un Número"*. Al ingresar un número entero positivo (o cero), calcula la cantidad de cifras, la suma de cifras impares, la suma de cifras pares, la suma total de cifras, la cifra mayor y la cifra menor presentadas en un formulario organizado mediante `GridPane`. Además, genera y enlista todos sus divisores ordenados de forma ascendente en un `TextArea` con scroll. Incluye función de limpiado de todos los campos y validación con `Alert`.

#### Estructura del proyecto
```text
ejercicio-1-3/
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── com/angelvaloro09/ejercicio_1_3/
        │       ├── App.java            # Punto de entrada de JavaFX (carga view.fxml)
        │       ├── AppController.java  # Controlador con análisis numérico y eventos
        │       └── Main.java           # Lanzador estándar compatible con cualquier IDE
        └── resources/
            └── com/angelvaloro09/ejercicio_1_3/
                └── view.fxml           # Vista organizada con GridPane y TextArea
```

#### Ejecución

- **Vía Terminal (Maven)**:
  ```bash
  cd interfaces-basicas/ejercicio-1-3
  mvn clean javafx:run
  ```

- **Vía IDE (IntelliJ IDEA / NetBeans / Eclipse / VS Code)**:
  1. Abrir la carpeta `ejercicio-1-3` como proyecto Maven.
  2. Ejecutar la clase `Main.java` o `App.java` haciendo clic derecho ➔ **Run**.

---

### [Ejercicio 1.4: Tabla de Multiplicar](./ejercicio-1-4/)

#### Descripción
Aplicación gráfica con ventana titulada *"Ejemplo"*, que recibe un número entero en un campo compacto y genera su tabla de multiplicar completa (del 1 al 10) mostrada renglón por renglón en un `TextArea` de solo lectura. Incluye botón para limpiar campos y validación ante formatos no numéricos mediante `Alert`.

#### Estructura del proyecto
```text
ejercicio-1-4/
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── com/angelvaloro09/ejercicio_1_4/
        │       ├── App.java            # Punto de entrada de JavaFX (carga view.fxml)
        │       ├── AppController.java  # Controlador con cálculo de tabla de multiplicar
        │       └── Main.java           # Lanzador estándar compatible con cualquier IDE
        └── resources/
            └── com/angelvaloro09/ejercicio_1_4/
                └── view.fxml           # Vista vertical con campo de entrada y TextArea
```

#### Ejecución

- **Vía Terminal (Maven)**:
  ```bash
  cd interfaces-basicas/ejercicio-1-4
  mvn clean javafx:run
  ```

- **Vía IDE (IntelliJ IDEA / NetBeans / Eclipse / VS Code)**:
  1. Abrir la carpeta `ejercicio-1-4` como proyecto Maven.
  2. Ejecutar la clase `Main.java` o `App.java` haciendo clic derecho ➔ **Run**.
