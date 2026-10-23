
void main() {

    IO.println("=== CALCULO DEL INDICE DE MASA CORPORAL ===");

    double peso = Double.parseDouble(IO.readln("Ingrese su peso en kg: "));
    double altura = Double.parseDouble(IO.readln("Ingrese su altura en metros: "));

    if (peso <= 0 || altura <= 0) {
        IO.println("Error: el peso y la altura deben ser mayores que cero.");
    } else {
        double imc = peso / (altura * altura);

        IO.println("Su IMC es: %.2f".formatted(imc));

        if (imc < 18.5) {
            IO.println("Clasificacion: Bajo peso");
        } else if (imc < 25) {
            IO.println("Clasificacion: Peso normal");
        } else if (imc < 30) {
            IO.println("Clasificacion: Sobrepeso");
        } else {
            IO.println("Clasificacion: Obesidad");
        }
    }
}
