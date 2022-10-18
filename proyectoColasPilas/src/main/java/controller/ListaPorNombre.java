
package controller;

import modell.Nodo;
import modell.Producto;

public class ListaPorNombre {
    Nodo inicio,fin, nuevo, p, q ;
    
    
    public void insertarElemento(Producto producto){
        nuevo = new Nodo(producto);
        if(inicio ==null){         //Lista Vacia, al inicio del llenado del codigo
            inicio = nuevo; fin = nuevo;
        }else{  //Que ya hay un nodo en la cola
            //  Evaluar en que pisicion ingresara el nuevo nodo segun su nombre
            p = inicio;
            while(p.getSgteNodo()!=null){
                // nuevo es menor que e
                if(nuevo.getProducto().getNombre().compareToIgnoreCase(inicio.getProducto().getNombre())>0){
                    nuevo.setSgteNodo(inicio);
                    inicio = nuevo;break;  
                }else{
                    p.setSgteNodo(nuevo);
                }
                
                p=p.getSgteNodo();
            }
            
            
            
//            if(productos[i].getNombre().compareToIgnoreCase(productos[i+1].getNombre()) > 0){
//                            temp = productos[i];
//                            productos[i] = productos[i+1];
//                            productos[i+1] = temp;
//                        }
//            
            
            fin.setSgteNodo(nuevo);
            fin = nuevo;
        }
    }
    
    public void eliminarElemento(){
        if(inicio != null){    //Hay nodos en la cola
            inicio = inicio.getSgteNodo();
        }
        if(inicio==null){
            inicio =null;
        }
    }
    
    public String recorreLista(){
        p=inicio; String cadena="";
        while(p!=null){
//            cadena += p.getNombre()+"\t";
            System.out.println(p.getProducto().getCodigo()+"\t"+p.getProducto().getMarca());
            p=p.getSgteNodo();
            
        }
        return cadena;
    }
}
