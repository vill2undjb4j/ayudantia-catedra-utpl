void main() {

    println("=== AREA DE UN TRIANGULO ===");

    double base = Double.parseDouble(
        readln("Ingrese la base: ")
    );

    double altura = Double.parseDouble(
        readln("Ingrese la altura: ")
    );

    if (base > 0 && altura > 0) {
        double area = (base * altura) / 2;
        println("Area: %.2f".formatted(area));
    } else {
        println("Error: los valores deben ser positivos.");
    }
}
