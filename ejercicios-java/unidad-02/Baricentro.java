
void main() {

    IO.println("=== CALCULO DEL BARICENTRO ===");

    double x1 = Double.parseDouble(IO.readln("Ingrese x1: "));
    double y1 = Double.parseDouble(IO.readln("Ingrese y1: "));

    double x2 = Double.parseDouble(IO.readln("Ingrese x2: "));
    double y2 = Double.parseDouble(IO.readln("Ingrese y2: "));

    double x3 = Double.parseDouble(IO.readln("Ingrese x3: "));
    double y3 = Double.parseDouble(IO.readln("Ingrese y3: "));

    double baricentroX = (x1 + x2 + x3) / 3;
    double baricentroY = (y1 + y2 + y3) / 3;

    IO.println("=== RESULTADOS ===");
    IO.println("Baricentro X: %.2f".formatted(baricentroX));
    IO.println("Baricentro Y: %.2f".formatted(baricentroY));
}
