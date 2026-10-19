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
