
package modell;

import java.util.logging.Logger;

public class Producto {
    
    private int codigo;
    private String nombre;
    private String marca;
    private double precio;
    private int cantidad;
    private String fechaVencimiento;
    private static int cont = 1000;
    
    /*
    *   Constructor de la clase producto
    */
    
    public Producto(String nombre, String marca, double precio, int cantidad, String fechaVencimiento){
       
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fechaVencimiento = fechaVencimiento;
        this.codigo = cont++;                       //  Esto permite insertar codigo y incrementarlo

    }
    
    // Getter and Setter

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", cantidad=" + cantidad + ", fechaVencimiento=" + fechaVencimiento + '}';
    }
    
    
    
}
