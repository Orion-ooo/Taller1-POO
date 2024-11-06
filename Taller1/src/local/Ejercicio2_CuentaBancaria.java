
package local;

/**
 *
 * @author Daniel
 */
public class Ejercicio2_CuentaBancaria {
    private int numCuenta;
    private double saldo;
    private String tipoCuenta;

    public Ejercicio2_CuentaBancaria() {} // constructor por defecto

    public Ejercicio2_CuentaBancaria(int numCuenta, String tipoCuenta) { // constructor con dos parametros
        this.numCuenta = numCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public Ejercicio2_CuentaBancaria(int numCuenta, double saldo, String tipoCuenta) { // constructor sobrecargador en los tres parametros
        this.numCuenta = 12345;
        this.saldo = 850.000;
        this.tipoCuenta = "Cuenta de ahorro";
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
    
}
