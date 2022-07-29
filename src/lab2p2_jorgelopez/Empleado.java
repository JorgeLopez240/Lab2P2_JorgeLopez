
package lab2p2_jorgelopez;

public class Empleado {
    
    // atributos
    String nombre;
    int edad;
    double sueldo;
    String num_RRHH;
    boolean estado_dia;
    
    
    // Constructores

    public Empleado() {
    }

    public Empleado(String nombre, int edad, boolean estado_dia) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado_dia = estado_dia;
    }

    public Empleado(String nombre, int edad, double sueldo, String num_RRHH, boolean estado_dia) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.num_RRHH = num_RRHH;
        this.estado_dia = estado_dia;
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNum_RRHH() {
        return num_RRHH;
    }

    public void setNum_RRHH(String num_RRHH) {
        this.num_RRHH = num_RRHH;
    }

    public boolean getEstado_dia() {
        return estado_dia;
    }

    public void setEstado_dia(boolean estado_dia) {
        this.estado_dia = estado_dia;
    }
    
    
    // MA
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", num_RRHH=" + num_RRHH + ", estado_dia=" + estado_dia + '}';
    }
    
    
    
    
}
