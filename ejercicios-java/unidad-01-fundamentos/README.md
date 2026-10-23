
# Unidad 1 - Fundamentos de Java

## Objetivo
Comprender los tipos de datos básicos en Java y
comparar la sintaxis tradicional con las
características disponibles en Java 25.

## Ejercicio 1: Tipos de datos

Se desarrolla un programa que utiliza variables
para representar información de un estudiante.

Tipos de datos utilizados:
- int: edad del estudiante.
- double: promedio académico.
- char: paralelo.
- boolean: estado de aprobación.

## Versión tradicional
Archivo: TiposDatos.java

Utiliza una clase pública y el método
public static void main(String[] args).

## Versión actualizada
Archivo: TiposDatosModerno.java

Utiliza el método main simplificado y
IO.println(), disponibles en Java 25.

## Comparación
Ambas versiones muestran los mismos datos.

La versión moderna permite escribir programas
sencillos con menos código estructural.

## Entorno de desarrollo
- Lenguaje: Java
- JDK: Eclipse Temurin 25
- Sistema operativo: Windows
- Repositorio: GitHub

## Ejecución
Desde una terminal con Java 25 instalado:

java TiposDatos.java

java TiposDatosModerno.java

## Resultado esperado
=== DATOS DEL ESTUDIANTE ===
Edad: 20
Promedio: 9.5
Paralelo: A
Aprobado: true

## Ejercicio 2: Área de un triángulo

**Archivo:** `AreaTriangulo.java`

**Objetivo:** Desarrollar un programa que permita calcular el área de un triángulo mediante el ingreso de su base y altura.

**Descripción:** El programa solicita al usuario dos valores numéricos y aplica la fórmula:

Área = (base × altura) / 2

**Ejemplo de ejecución:**

- Base: 2
- Altura: 5
- Resultado: 5,00

**Conceptos aplicados:** Variables, operaciones aritméticas, entrada de datos y salida por consola.

## Ejercicio 3: Consumo de agua

**Archivo:** `ConsumoAgua.java`

**Objetivo:** Practicar el uso de variables y operaciones matemáticas para calcular el consumo de agua en diferentes períodos.

**Descripción:** El programa realiza cálculos para obtener el consumo diario, mensual y anual de agua.

**Conceptos aplicados:** Tipos de datos numéricos, operaciones aritméticas y presentación de resultados en consola.

## Ejercicio 4: Clasificación de notas

**Archivo:** `ClasificacionNotas.java`

**Objetivo:** Aplicar estructuras condicionales para determinar si un estudiante aprueba o reprueba según su calificación.

**Descripción:** El programa solicita una nota entre 0 y 10 y la clasifica mediante las condiciones `if`, `else if` y `else`.

**Criterios de clasificación:**
- Nota de 9 a 10: Excelente - Aprobado.
- Nota de 7 a menos de 9: Bueno - Aprobado.
- Nota de 0 a menos de 7: Reprobado.
- Nota fuera del rango de 0 a 10: Error.

**Ejemplo de ejecución:**

- Nota ingresada: 8
- Resultado: Bueno - Aprobado.

**Características de Java 25 utilizadas:** Método `void main()` simplificado y métodos `IO.readln()` e `IO.println()`.

**Conceptos aplicados:** Variables, tipos de datos, entrada de información, operadores relacionales, operadores lógicos y estructuras condicionales.



