public class Cliente {
    private String nombre;
    private String tipoDeCuenta;

    //Constructor

    public Cliente(String nombre, String tipoDeCuenta) {
        this.nombre = nombre;
        this.tipoDeCuenta = tipoDeCuenta;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

}
