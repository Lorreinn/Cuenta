package Cuentas;

/**
 *Clase Cuenta, donde se almacenan los parámetros, los
 * encapsula y las operaciones relacionadas con una cuenta bancaria, proporcionando métodos para acceder y modificar los atributos, 
 * así como para realizar operaciones típicas de una cuenta bancaria, como ingresos y retiros, 
 * mientras maneja situaciones excepcionales mediante el uso de excepciones.
 * @author Esther
 */
public class CCuenta {

    /**
     * Método para obtener el valor de nombre
     * @return devuelve el valor de nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el valor de nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el valor de cuenta
     * @return devuelve el valor de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método que establece el valor de cuenta
     * @param cuenta 
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método para obtener el valor de saldo
     * @return devuelve el valor de saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método que establece el valor de saldo
     * @param saldo 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método para obtener el valor del tipo de Interés
     * @return devuelve el valor del tipo de Interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método que establece el valor del tipo de Interés
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

/**
 * @param nombre
 * @param cuenta
 * @param saldo
 * @param tipoInterés
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Constructor por defecto de clase.
     */

    public CCuenta()
    {
    }
    
    /**
     * Constructor de clase que toma los siguientes parámetros.
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * Método para obtener salgo de la cuenta
 * @return devuelve el saldo actual de la cuenta
 */
    public double estado()
    {
        return getSaldo();
    }
/**
 * Método que añade una cantidad al saldo actual de la cuenta. 
 * @param cantidad
 * @throws Exception Si la cantidad es negativa, lanza una excepción.
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Método que retira una cantidad del saldo actual de la cuenta. 
 * @param cantidad
 * @throws Exception lanza una excepción si la cantidad es negativa o mayor que el saldo actual
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}