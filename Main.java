import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variable opcion para el menú
        int opcion = 0;

        //Scanner para ingresar datos por el teclado
        Scanner scanner = new Scanner(System.in);

        // Instancia para crear el cliente y tipo de cuenta
        Cliente cliente = new Cliente("Aurelio Cheveroni", "Cuenta de Ahorros");
        CuentaBancaria cuenta = new CuentaBancaria(cliente, 100.0);


        //Datos iniciales y menu
        System.out.println("****************************");
        System.out.println("\n***Bienvenido a Su Banco***");
        System.out.println("\n****************************");

        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Tipo de cuenta: " +cliente.getTipoDeCuenta());
        System.out.println("****************************");

        String menu = """
                --- Presione el número de la opción deseada ---
                1 - Consultar su saldo disponible
                2 - Depositar
                3 - Retirar dinero
                4 - Salir""";


        while (opcion != 4) {
            System.out.println(menu);
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Su saldo actual es: " + cuenta.consultarSaldo());
                    break;

                case 2:
                    System.out.println("Ingrese el valor a depositar: ");
                    double deposito = scanner.nextDouble();
                    cuenta.depositar(deposito);
                    break;

                case 3:
                    System.out.println("Ingrese la cantidad que desea retirar: ");
                    double retiro = scanner.nextDouble();
                    cuenta.retirar(retiro);
                    break;

                case 4:
                    System.out.println("Gracias por utilizar Su Banco");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}