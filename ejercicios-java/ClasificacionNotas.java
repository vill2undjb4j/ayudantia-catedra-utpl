void main() {

    IO.println("=== CLASIFICACION DE NOTAS ===");

    double nota = Double.parseDouble(
        IO.readln("Ingrese la nota del estudiante: ")
    );

    if (nota < 0 || nota > 10) {
        IO.println("Error: la nota debe estar entre 0 y 10.");
    } else if (nota >= 9) {
        IO.println("Excelente - Aprobado");
    } else if (nota >= 7) {
        IO.println("Bueno - Aprobado");
    } else {
        IO.println("Reprobado");
    }
}