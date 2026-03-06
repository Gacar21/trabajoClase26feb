import java.util.Scanner;
import Banco.cuenta;

public class main {
    public static void main(String[] args) {
        Scanner cantidad = new Scanner(System.in);

        System.out.println("!Hola! Bienvenido al banco GabrielBank");
        System.out.println("Donde no se caen los servicios como nequi");

        float inicial;
        do {
            System.out.println("ingrese el monto con el que quieres crear tu cuenta: ");
            inicial = cantidad.nextFloat();
            if (inicial <= 0) {
                System.out.println("El monto ingresado no puede ser menor que cero");
            }
        } while (inicial <= 0);

        cuenta miCuenta = new cuenta(inicial);

        int opcion;
        do {
            System.out.println(" ");
            System.out.println("Escoge la opcion que necesites: ");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Ver saldo actual");
            System.out.println("4. Salir");
            opcion = (int) cantidad.nextFloat();

            switch (opcion) {
                case 1:
                    System.out.println("Monto a depositar: ");
                    float deposito = cantidad.nextFloat();
                    miCuenta.depositarSaldo(deposito);
                    break;
                case 2:
                    System.out.println("Monto a retirar: ");
                    float retiro = cantidad.nextFloat();
                    miCuenta.retirarSaldo(retiro);
                    break;
                case 3:
                    System.out.println("Su saldo disponible es: " + miCuenta.getSaldo());
                    break;
                case 4:
                    System.out.println("Gracias por usar nuestro Sistema Bancario");
                    break;
                default:
                    System.out.println("opcion no valida");
            }
        } while (opcion != 4);
        cantidad.close();
    }
}