
void main() {
    int edad = Integer.parseInt(
        IO.readln("Ingrese su edad: ")
    );

    if (edad >= 18) {
        IO.println("Usted es mayor de edad");
    } else {
        IO.println("Usted es menor de edad");
    }
}
