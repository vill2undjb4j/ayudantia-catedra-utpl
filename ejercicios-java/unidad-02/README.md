# Unidad 2 - Programación en Java 25

En esta carpeta se documentarán los ejercicios
prácticos correspondientes a la Unidad 2 de
la ayudantía de cátedra.

## Ejercicio 1: Ecuación cuadrática

**Archivo:** `EcuacionCuadratica.java`

**Objetivo:** Desarrollar un programa que permita calcular las soluciones reales de una ecuación cuadrática utilizando Java 25.

**Descripción:** El programa solicita los coeficientes `a`, `b` y `c` de una ecuación de segundo grado y calcula el discriminante mediante la fórmula:

`D = b² - 4ac`

**Condiciones:**
- Si `a = 0`, muestra un mensaje de error porque no es una ecuación cuadrática.
- Si el discriminante es negativo, indica que no existen soluciones reales.
- Si el discriminante es cero o positivo, calcula las raíces utilizando la fórmula general.

**Ejemplo de ejecución:**

- Coeficiente a: 1
- Coeficiente b: -5
- Coeficiente c: 6
- Resultado x1: 3.0000
- Resultado x2: 2.0000

**Características de Java 25:** Uso de `void main()`, `IO.readln()` e `IO.println()`.

**Conceptos aplicados:** Variables, operaciones matemáticas, entrada y salida de datos, estructuras condicionales y uso de `Math.sqrt()`.
