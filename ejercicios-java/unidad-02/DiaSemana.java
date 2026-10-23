
void main() {
    IO.println("=== DIA DE LA SEMANA ===");

    int dia = Integer.parseInt(IO.readln("Ingrese un numero del 1 al 7: "));

    switch (dia) {
        case 1 -> IO.println("Lunes");
        case 2 -> IO.println("Martes");
        case 3 -> IO.println("Miercoles");
        case 4 -> IO.println("Jueves");
        case 5 -> IO.println("Viernes");
        case 6 -> IO.println("Sabado");
        case 7 -> IO.println("Domingo");
        default -> IO.println("Error: ingrese un numero del 1 al 7.");
    }
}
