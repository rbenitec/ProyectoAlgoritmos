
package controller;

import java.util.Arrays;
import modell.Producto;

public class Cola {
    
    /**
     *  Atributos para trabajar con Arreglos
     */
    private Producto cola[];
    private int primero, ultimo;
        
    /**
     *  Atributos para trabajar con Lista Enlazada
     */
    
    /**
     * Metodos Constructores
     */
    
    public Cola(int n){
        cola = new Producto[n];
        colaVacia();
    }
    
    
    /**
     *  Metodos para trabajar con Arreglos
     */
    private void colaVacia() {
        primero =-1; ultimo=-1;
    }
    
    public void insertarProducto(Producto p){
        int indiceMaximo = cola.length-1;
        if(ultimo<indiceMaximo){
            ultimo++;
            cola[ultimo]= p;
            if(primero==-1){
                primero = 0;
            }
        }
    }
    
    public void eliminarElemento(){
        if(primero>=0){
            cola[primero] = null;
            primero++;
            if(primero>ultimo){
                colaVacia();
            }
        }
    }
    
    public String imprimirCola(){
        String cad = "";
        cad = Arrays.toString(cola);
        return cad;
    }

    public Producto[] getCola() {
        return cola;
    }

    public void setCola(Producto[] cola) {
        this.cola = cola;
    }

    public int getPrimero() {
        return primero;
    }

    public void setPrimero(int primero) {
        this.primero = primero;
    }

    public int getUltimo() {
        return ultimo;
    }

    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }
    
    
    /**
     *  Metodos para trabajar con Lista Enlazada
     */
    
}
