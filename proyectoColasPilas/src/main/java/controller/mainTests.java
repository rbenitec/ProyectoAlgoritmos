
package controller;

import modell.Producto;


public class mainTests {
    
    
    public static void main(String[] args){
        
        PilaLista l = new PilaLista();
        Producto p1 = new Producto("Yogurt", "Gloria", 6.20, 10, "2022-12-12");
        l.insertaElemento(p1);
        Producto p2 = new Producto("Fideos", "Moly", 2.20, 20, "2022-11-12");
        l.insertaElemento(p2);
        Producto p3 = new Producto("Atun", "Primor", 7.20, 16, "2024-10-12");
        l.insertaElemento(p3);
        
        System.out.println(l.muestraLista());
        l.eliminaElemento();System.out.println(l.muestraLista());
//        Producto p4 = new Producto("Detergente", "ACE", 7.20, 16, "2024-10-12");
//        l.insertaElemento(p4);
        
        
//        ListasEnlazadas obj = new ListasEnlazadas();
//        Producto p1 = new Producto("Yogurt", "Gloria", 6.20, 10, "2022-12-12");
//        obj.insertarNodoPorInicio(p1);
//        Producto p2 = new Producto("Fideos", "Moly", 2.20, 20, "2022-11-12");
//        obj.insertarNodoPorInicio(p2);
//        Producto p3 = new Producto("Atun", "Primor", 7.20, 16, "2024-10-12");
//        obj.insertarNodoPorInicio(p3);
//        
//        
//        System.out.println(obj.imprimirLista());
//        
//        Producto p4 = new Producto("Detergente", "ACE", 7.20, 16, "2024-10-12");
//        obj.insertarNodoPorFinal(p4);
//        
//        System.out.println(obj.imprimirLista());
//        
//        obj.eliminarNodoPorInicio();System.out.println(obj.imprimirLista());
//        obj.eliminarNodoPorFinal();System.out.println(obj.imprimirLista());
//        ColaCircular obj = new ColaCircular();
//        Producto p1 = new Producto("Yogurt", "Gloria", 6.20, 10, "2022-12-12");
//        obj.insertarProducto(p1);
//        Producto p2 = new Producto("Fideos", "Moly", 2.20, 20, "2022-11-12");
//        obj.insertarProducto(p2);
//        Producto p3 = new Producto("Atun", "Primor", 7.20, 16, "2024-10-12");
//        obj.insertarProducto(p3);
//        
//        obj.recorreLista();
//        obj.eliminarProducto();
//        System.out.println("\n ======== \n");
//        obj.recorreLista();
//        obj.recorreLista();
    }
    
}
