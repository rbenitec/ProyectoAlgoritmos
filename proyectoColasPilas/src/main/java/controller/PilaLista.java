
package controller;

import modell.Nodo;
import modell.Producto;


public class PilaLista {
    private Nodo nuevo, tope, inicio, p;
    
    public void insertaElemento(Producto producto){
        nuevo = new Nodo(producto);
        if(tope==null){
            tope = nuevo;
        }else{
            nuevo.setSgteNodo(tope);
            tope = nuevo;
        }
    }
    
    public void eliminaElemento(){    
        if(tope!=null){
            tope = tope.getSgteNodo();
        }
    }
    
    public String muestraLista(){
        String cadena="";
        if(tope!=null){
            p=tope;
            while(p!=null){
                cadena += p.getProducto().getNombre()+"\t"+p.getProducto().getMarca()+"\n";
                p = p.getSgteNodo(); //p avanza al siguiente nodo
            }
        }
        return cadena;
    }

    public Nodo getNuevo() {
        return nuevo;
    }

    public void setNuevo(Nodo nuevo) {
        this.nuevo = nuevo;
    }

    public Nodo getTope() {
        return tope;
    }

    public void setTope(Nodo tope) {
        this.tope = tope;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getP() {
        return p;
    }

    public void setP(Nodo p) {
        this.p = p;
    }
    
    
    
}
