# Herencia e Interfaces en Java

Proyecto de Programación Orientada a Objetos para demostrar el uso de herencia, clases abstractas, interfaces y paquetes en Java.

## Requisitos

- Java Development Kit (JDK 21 o superior)

## Estructura del Proyecto

El código fuente se encuentra en el directorio raíz estándar `src/`. Esto garantiza compatibilidad nativa con cualquier IDE (IntelliJ IDEA, Apache NetBeans, Eclipse, VS Code) y compilación desde línea de comandos.

```text
herencia-interfaces/
├── src/
│   ├── ejercicio_2_1/
│   │   ├── abstracts/
│   │   ├── models/
│   │   └── Main.java
│   └── ejercicio_2_2/
│       ├── abstracts/
│       ├── interfaces/
│       ├── models/
│       └── Main.java
└── README.md
```

## Compilación y Ejecución desde Terminal

Desde la carpeta raíz del proyecto (`herencia-interfaces`), abre una terminal y ejecuta los comandos correspondientes a cada ejercicio:

### Ejercicio 2.1 (`ejercicio_2_1`)

#### 1. Compilar

```bash
javac -d bin -sourcepath src src/ejercicio_2_1/Main.java
```

#### 2. Ejecutar

```bash
java -cp bin ejercicio_2_1.Main
```

#### Salida esperada:

```text
Se crea un Alumno...
Se crea un Profesor...
Un alumno llamado Sin nombre
Un profesor de edad 0, con clave 10008000
```

---

### Ejercicio 2.2 (`ejercicio_2_2`)

#### 1. Compilar

```bash
javac -d bin -sourcepath src src/ejercicio_2_2/Main.java
```

#### 2. Ejecutar

```bash
java -cp bin ejercicio_2_2.Main
```

#### Salida esperada:

```text
Se imprime una FiguraPlana...

Se imprime un Triangulo con alto: 3, ancho: 4, area: 6.00, perimetro: 12.00

Se imprime una FiguraPlana...

Se imprime un Circulo con radio: 3, area: 28.27, perimetro: 18.85
```

---

### Ejecución en IDEs (IntelliJ IDEA / NetBeans / Eclipse / VS Code)

1. Abre la carpeta `herencia-interfaces` como proyecto Java.
2. Asegúrate de que la carpeta `src/` esté marcada como carpeta de fuentes (*Sources Root*).
3. Navega a la clase `Main.java` del ejercicio deseado (`ejercicio_2_1` o `ejercicio_2_2`) y haz clic derecho en **Run**.
