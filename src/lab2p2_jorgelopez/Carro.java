
package lab2p2_jorgelopez;
public class Carro {
    // atributos
    String marca;
    String modelo;
    String fecha_creacion;
    String fecha_ingreso;
    String estado;
    String id_dueño;
    double costoR;
    
    
    // constructores
    public Carro() {
    }

    public Carro(String marca, String modelo, String id_dueño, double costoR) {
        this.marca = marca;
        this.modelo = modelo;
        this.id_dueño = id_dueño;
        this.costoR = costoR;
    }

    public Carro(String marca, String modelo, String fecha_creacion, String fecha_ingreso, String estado, String id_dueño, double costoR) {
        this.marca = marca;
        this.modelo = modelo;
        this.fecha_creacion = fecha_creacion;
        this.fecha_ingreso = fecha_ingreso;
        this.estado = estado;
        this.id_dueño = id_dueño;
        this.costoR = costoR;
    }
    
    
    //Mutadores
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getId_dueño() {
        return id_dueño;
    }

    public void setId_dueño(String id_dueño) {
        this.id_dueño = id_dueño;
    }

    public double getCostoR() {
        return costoR;
    }

    public void setCostoR(double costoR) {
        this.costoR = costoR;
    }
    
    
    //MA
    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", fecha_ingreso=" + fecha_ingreso + ", estado=" + estado + ", id_due\u00f1o=" + id_dueño + ", costoR=" + costoR + '}';
    }
    
    
}
