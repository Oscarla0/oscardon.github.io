package EjerciciosNoEntregar.Banco.Clases;

public class ClasesBanco {
    /*Atributos */
    private String cuenta;
    private String dni;
    private String nombre;
    private double saldo;
    private String contraseña;
    private int ping;

    
    /*Construstores */
    public ClasesBanco(String cuenta, String dni, String nombre, double saldo, String contraseña, int ping) {
        this.cuenta = cuenta;
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
        this.contraseña = contraseña;
        this.ping = ping;
    }
    public static double IMP_MAX_RETIRAR = 3000;
    public static double IMP_MAX_INGRESAR = 6000;
    /*Metodos */
    public void constructor() {};
    public void ingresarDinero() {};
    public void sacarDinero() {};
    public void mostrarDinero() {};
    public void transferencia() {};
    /*Getters */
    public String getCuenta() {
        return cuenta;
    }
    public String getContraseña() {
        return contraseña;
    }
    public int getPing() {
        return ping;
    }
    public String getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public double getSaldo() {
        return saldo;
    }
    /*Setters */
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public void setPing(int ping) {
        this.ping = ping;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
