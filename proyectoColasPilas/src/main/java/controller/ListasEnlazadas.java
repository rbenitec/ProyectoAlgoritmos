
package controller;

import modell.Nodo;
import modell.Producto;

public class ListasEnlazadas {

    private Nodo inicio, nuevo,p,q; //inicio es como la lista
    
    /**
     *  Metodo para insertar nodo por el inicio
     */
    
    public void insertarNodoPorInicio(Producto producto){
        nuevo = new Nodo(producto);
        if(inicio == null){
            inicio = nuevo;
        }else{
            nuevo.setSgteNodo(inicio);
            inicio = nuevo;
        }
    }
    
    /**
     *  Metodo para insertar nodo por el final
     */
    
    public void insertarNodoPorFinal(Producto producto){
        nuevo = new Nodo(producto);
        if(inicio == null){
            inicio = nuevo;
        }else{
            p = inicio;
            while(p.getSgteNodo()!=null){
                p = p.getSgteNodo();
            }
            p.setSgteNodo(nuevo);
        }
            
    }
    
    /**
     *  Metodo para Eliminar nodo por el final
     */
    public void eliminarNodoPorFinal(){
        if(inicio!=null){
            if(inicio.getSgteNodo() == null){
                inicio = null;
            }else{
                p=inicio;
                while(p.getSgteNodo()!=null){    
                    q=p;
                    p = p.getSgteNodo();
                }
                q.setSgteNodo(null);
            }
        }
    }
    
    /**
     *  Metodo para Eliminar nodo por el inicio
     */
    public void eliminarNodoPorInicio(){
        if(inicio!=null){
            inicio = inicio.getSgteNodo();
        }
    }
    
    public String imprimirLista(){
        String cadena = ""; p=inicio;
        while(p!= null){
            cadena += p.getProducto().getNombre()+ "\t" + p.getProducto().getMarca()+"\n";
            p = p.getSgteNodo();
        }
        return cadena;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getNuevo() {
        return nuevo;
    }

    public void setNuevo(Nodo nuevo) {
        this.nuevo = nuevo;
    }

    public Nodo getP() {
        return p;
    }

    public void setP(Nodo p) {
        this.p = p;
    }

    public Nodo getQ() {
        return q;
    }

    public void setQ(Nodo q) {
        this.q = q;
    }
    
    
}
