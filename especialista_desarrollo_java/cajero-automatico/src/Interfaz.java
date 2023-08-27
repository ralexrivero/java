import java.util.Scanner;

/*
    interfaz de usuario en un cajero automático
    opciones
        1 - consultar saldo
        2 - ingresar dinero
        3 - retirar dinero
        4 - consultar últimos movimientos
        enter para ejecutar opción
    Al elegir una opción, se muestra la opción elegida
 */
public class Interfaz {
    public static void main(String[] args) {
        System.out.println("Elije una opción (digita el número y presiona enter)");
        System.out.println("    1 - consultar saldo");
        System.out.println("    2 - ingresar dinero");
        System.out.println("    3 - retirar dinero");
        System.out.println("    4 - consultar últimos movimientos");

        Scanner scanner = new Scanner(System.in);

        int opcionSeleccionada = scanner.nextInt();

        System.out.println("Opción seleccionada: "  + opcionSeleccionada);
    }
}
