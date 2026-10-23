
public class ConsumoAgua {
    public static void main(String[] args) {

        // Datos del problema
        int habitantes = 180617;
        int personasFamilia = 3;
        double litrosFamilia = 548;

        // Calculos
        double consumoPersona = litrosFamilia / personasFamilia;
        double consumoDiario = consumoPersona * habitantes;
        double consumoMensual = consumoDiario * 30;
        double consumoAnual = consumoDiario * 365;

        // Resultados
        System.out.println("=== CONSUMO DE AGUA ===");
        System.out.printf("Consumo diario: %.2f litros%n", consumoDiario);
        System.out.printf("Consumo mensual: %.2f litros%n", consumoMensual);
        System.out.printf("Consumo anual: %.2f litros%n", consumoAnual);
    }
}
