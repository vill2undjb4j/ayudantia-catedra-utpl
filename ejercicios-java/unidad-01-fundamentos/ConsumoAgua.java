void main() {

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
    println("=== CONSUMO DE AGUA ===");

    println("Consumo diario: %.2f litros"
            .formatted(consumoDiario));

    println("Consumo mensual: %.2f litros"
            .formatted(consumoMensual));

    println("Consumo anual: %.2f litros"
            .formatted(consumoAnual));
}
