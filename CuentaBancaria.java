

public class CuentaBancaria {
    private Cliente cliente;
    private double saldo;

    //Constructor
    public CuentaBancaria(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    //Métodos
    public double consultarSaldo() {
        return saldo;
    }

    public void depositar (double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Su nuevo saldo es: " + saldo);
        } else {
            System.out.println("El monto debe ser mayor que cero");
        }
    }

    public void retirar (double cantidad) {
        if (cantidad > 0) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Retiro exitoso. Su nuevo saldo es: " + saldo);
            } else {
                System.out.println("Fondos insuficientes");
            }
        } else {
            System.out.println("El monto debe ser mayor a cero");
        }
    }

}
