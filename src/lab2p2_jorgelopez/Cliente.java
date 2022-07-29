
package lab2p2_jorgelopez;
public class Cliente {
    
    //atributos
    String nombre;
    int edad;
    String num_id;
    double saldo;
    
    
    // Constructores
    public Cliente() {
    }

    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Cliente(String nombre, int edad, String num_id, double saldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.num_id = num_id;
        this.saldo = saldo;
    }
    
    
    // Mutadores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNum_id() {
        return num_id;
    }

    public void setNum_id(String num_id) {
        this.num_id = num_id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    // MA

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", identidad=" + num_id + ", saldo=" + saldo + '}';
    }
    
    
}
