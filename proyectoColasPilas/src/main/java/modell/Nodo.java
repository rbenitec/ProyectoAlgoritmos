
package modell;

public class Nodo {
    private Producto producto;
    private Nodo sgteNodo;  //Puntero

    /*
    *   Constructor para insertar un nodo al final de la lista
    */
    public Nodo(Producto producto) {
        this.producto = producto;
        this.sgteNodo = null;
    }
    
    /*
    *   Constructor para añadir un nodo al inicio de la lista
    */
    public Nodo(Producto producto, Nodo siguienteNodo){
        this.producto = producto;
        this.sgteNodo = siguienteNodo;
    }
    
    //Getter and Setter

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Nodo getSgteNodo() {
        return sgteNodo;
    }

    public void setSgteNodo(Nodo sgteNodo) {
        this.sgteNodo = sgteNodo;
    }
    
}
