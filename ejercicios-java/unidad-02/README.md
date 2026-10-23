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

## Ejercicio 2: Cálculo del baricentro

**Archivo:** `Baricentro.java`

**Objetivo:** Desarrollar un programa en Java 25 que permita calcular las coordenadas del baricentro de un triángulo.

**Descripción:** El programa solicita las coordenadas de los tres vértices de un triángulo y calcula su baricentro mediante el promedio de las coordenadas.

**Fórmulas utilizadas:**

- Baricentro X = (x1 + x2 + x3) / 3
- Baricentro Y = (y1 + y2 + y3) / 3

**Ejemplo de ejecución:**

- Vértice 1: (0, 0)
- Vértice 2: (6, 0)
- Vértice 3: (3, 9)

**Resultados:**

- Baricentro X: 3.00
- Baricentro Y: 3.00

**Características de Java 25:** Uso de `void main()`, `IO.readln()` e `IO.println()`.

**Conceptos aplicados:** Variables de tipo `double`, operaciones aritméticas, entrada de datos y secuenciación de instrucciones.

## Ejercicio 3: Día de la semana

**Archivo:** `DiaSemana.java`

**Objetivo:** Desarrollar un programa en Java 25 que permita identificar el día de la semana a partir de un número ingresado por el usuario.

**Descripción:** El programa solicita un número entero del 1 al 7 y, mediante una estructura de selección `switch`, determina el día de la semana correspondiente.

**Condiciones:**
- Si el usuario ingresa 1, muestra Lunes.
- Si ingresa 2, muestra Martes.
- Si ingresa 3, muestra Miércoles.
- Si ingresa 4, muestra Jueves.
- Si ingresa 5, muestra Viernes.
- Si ingresa 6, muestra Sábado.
- Si ingresa 7, muestra Domingo.
- Si ingresa un número fuera del rango, muestra un mensaje de error.

**Ejemplo de ejecución:**

Entrada:
`Ingrese un numero del 1 al 7: 5`

Salida:
`Viernes`

**Características de Java 25:** Uso de `void main()`, `IO.readln()`, `IO.println()` y la sintaxis moderna de `switch` con flechas (`->`).

**Conceptos aplicados:** Variables enteras, entrada y salida de datos, estructuras de selección múltiple y validación de rangos.

## Ejercicio 4: Índice de Masa Corporal (IMC)

**Archivo:** `IndiceMasaCorporal.java`

**Objetivo:** Desarrollar un programa en Java 25 que permita calcular el índice de masa corporal de una persona a partir de su peso y altura.

**Descripción:** El programa solicita el peso en kilogramos y la altura en metros. Posteriormente, calcula el IMC y muestra una clasificación según el resultado obtenido.

**Fórmula utilizada:**

<img width="226" height="80" alt="image" src="https://github.com/user-attachments/assets/4911e518-35df-4346-ab3b-88418208ecce" />

**Condiciones:**
- Si el peso o la altura son menores o iguales a cero, muestra un mensaje de error.
- Si el IMC es menor que 18.5, muestra "Bajo peso".
- Si el IMC está entre 18.5 y menos de 25, muestra "Peso normal".
- Si el IMC está entre 25 y menos de 30, muestra "Sobrepeso".
- Si el IMC es 30 o superior, muestra "Obesidad".

**Ejemplo de ejecución:**

Entrada:
- Peso: 70 kg
- Altura: 1.75 m

Salida:
- IMC: 22.86
- Clasificación: Peso normal

**Características de Java 25:** Uso de `void main()`, `IO.readln()`, `IO.println()` y `.formatted()`.

**Conceptos aplicados:** Variables de tipo `double`, operaciones aritméticas, entrada y salida de datos, validación de valores y estructuras condicionales `if`, `else if` y `else`.
