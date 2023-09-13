import java.math.BigDecimal;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        // Bienvenida al usuario
        System.out.println("Bienvenido al conversor de moneda");
        System.out.println("Por favor, introduzca una cantidad en euros y el programa le devolverá la conversión en dólares americanos");

        // Leer entrada del usuario
        Scanner scanner = new Scanner(System.in);
        double euros = scanner.nextDouble();

        // Conversión básica con double
        double tasaDeCambio = 1.09;
        double dolares = tasaDeCambio * euros;
        System.out.println(euros + " euros equivalen a " + dolares + " US dólares");

        // Mejorar precisión con BigDecimal
        String eurosString = Double.toString(euros);
        BigDecimal eurosBigDecimal = new BigDecimal(eurosString);

        String tasaDeCambioString = Double.toString(tasaDeCambio);
        BigDecimal tasaDeCambioBigDecimal = new BigDecimal(tasaDeCambioString);

        BigDecimal dolaresBigDecimal = eurosBigDecimal.multiply(tasaDeCambioBigDecimal);
        System.out.println(euros + " euros equivalen a " + dolaresBigDecimal.toString() + " US dólares");
    }
}
