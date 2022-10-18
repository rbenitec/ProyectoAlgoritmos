
package controller;

import modell.Nodo;
import modell.Producto;

public class ColaCircular {
//    private Producto cola[];
//    private int primero, ultimo;
    
    private Nodo primero, ultimo, nuevo,p, q;
    int cantElementosInsertados=-1;

//    public ColaCircular(int n){
//        cola = new Producto[n];
//        colaVacia();
//        
//    }
    
//    private void colaVacia() {
//        primero =-1; ultimo=-1;
//    }
    
    public void insertarProducto(Producto p){
        nuevo = new Nodo(p);
        
        if(primero == null){
            primero = nuevo; ultimo=nuevo;
            cantElementosInsertados++;
        }else{
            ultimo.setSgteNodo(nuevo);
            ultimo = nuevo;
            ultimo.setSgteNodo(primero);
            cantElementosInsertados++;
        }
    }
    
//    public void insertarProducto(Producto p){
//        int indiceMaximo = cola.length-1;
//        if(ultimo<indiceMaximo){
//            ultimo++;
//            if(ultimo!=primero){
//                cola[ultimo]= p;
//            }
//            if(primero==-1){
//                primero = 0;
//            }
//            
//        }else if(ultimo>=indiceMaximo && primero!=0){ //Llego al tope de la cola circular
//            ultimo = 0;
//            cola[ultimo]= p;
//            
//        }
//    }
    
    public void eliminarProducto(){
        if(primero!=null){  //Hay un elemento
//            ultimo.setSgteNodo(primero.getSgteNodo());
            primero = primero.getSgteNodo();
            ultimo.setSgteNodo(nuevo.getSgteNodo());
//            if(primero.getSgteNodo() == primero){
//                primero = null;
//                ultimo = null;
//            }else{
//                ultimo.setSgteNodo(primero.getSgteNodo());
//                primero = primero.getSgteNodo();
//            }
            
        }
        if(primero == null){
            ultimo = null;
        }
    }
    
    public String recorreLista(){
        p=primero; String cadena="";
        while(p!=null && cantElementosInsertados>=0){
//            cadena += p.getNombre()+"\t";
            System.out.println(p.getProducto().getCodigo()+"\t"+p.getProducto().getMarca());
            p=p.getSgteNodo();
            cantElementosInsertados--;
        }
        return cadena;
    }
//    public void eliminarProducto(){
//        if(primero>=0){
//            cola[primero] = null;
//            primero++;
//            if(primero>ultimo){
//                colaVacia();
//            }
//            
//        }
//    }
    
//    public void muestraArreglo() {
//        System.out.println("codigo\t"+"nombre\t"+ "marca\t"+ "precio\t"+ "cantidad\t" +"fechaVencimiento");
//        for(int i=primero;i<=ultimo;i++){
//            
//                System.out.println(cola[i].getCodigo()+"\t"+cola[i].getNombre()+"\t"+cola[i].getMarca()+"\t"+cola[i].getPrecio()+"\t"+cola[i].getCantidad()+"\t"+"\t"+cola[i].getFechaVencimiento());
//            
//        }
//    }

    
}
