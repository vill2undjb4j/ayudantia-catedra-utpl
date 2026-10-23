
import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("=== AREA DE UN TRIANGULO ===");

            System.out.print("Ingrese la base: ");
            double base = entrada.nextDouble();

            System.out.print("Ingrese la altura: ");
            double altura = entrada.nextDouble();

            if (base > 0 && altura > 0) {
                double area = (base * altura) / 2;
                System.out.printf("Area: %.2f%n", area);
            } else {
                System.out.println(
                    "Error: los valores deben ser positivos."
                );
            }
        }
    }
}
