
void main() {

    IO.println("=== ECUACION CUADRATICA ===");

    double a = Double.parseDouble(IO.readln("Ingrese a: "));
    double b = Double.parseDouble(IO.readln("Ingrese b: "));
    double c = Double.parseDouble(IO.readln("Ingrese c: "));

    if (a == 0) {
        IO.println("Error: a debe ser diferente de cero.");
    } else {
        double discriminante = b * b - 4 * a * c;

        if (discriminante < 0) {
            IO.println("No existen soluciones reales.");
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            IO.println("x1 = %.4f".formatted(x1));
            IO.println("x2 = %.4f".formatted(x2));
        }
    }
}
