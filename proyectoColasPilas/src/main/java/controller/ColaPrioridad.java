package controller;

import modell.Producto;

public class ColaPrioridad {
    private Producto normal[];
    private Producto prioridad[];
    int primeroNormal, ultimoNormal, primeroPrioridad, ultimoPrioridad;
    
    public ColaPrioridad(int n){
        normal = new Producto[n];
        prioridad = new Producto[n];
        colaVaciaNormal();colaVaciaPrioridad();
    }

    private void colaVaciaNormal() {
        primeroNormal =-1; ultimoNormal=-1; 
    }
    
    private void colaVaciaPrioridad(){
        primeroPrioridad=-1; ultimoPrioridad=-1;
    }
    /**
     * Metodo para insertar un elemnto de prioridad
     */
    
    public void insertarElementoNormal(Producto p){
        int indiceMax = normal.length-1;
        if(ultimoNormal<indiceMax){
            ultimoNormal++;
            normal[ultimoNormal] = p;
            if(primeroNormal==-1){
                primeroNormal=0;
            }
        }
    }
    
    public void insertarElementoPrioridad(Producto p){
        int indiceMax = prioridad.length-1;
        if(ultimoPrioridad<indiceMax){
            ultimoPrioridad++;
            prioridad[ultimoPrioridad] = p;
            if(primeroPrioridad==-1){
                primeroPrioridad=0;
            }
        }
    }
    
    /**
     * Metodo para eliminar elemento
     */
    
    public void eliminarElementoPrioridad(){
        if(primeroPrioridad>=0){
            prioridad[primeroPrioridad] = null;
            primeroPrioridad++;
            if(primeroPrioridad>ultimoPrioridad){
                colaVaciaPrioridad();
            }
        }else if(primeroNormal>=0){
            normal[primeroNormal] = null;
            primeroNormal++;
            if(primeroNormal>ultimoNormal){
                colaVaciaNormal();
            }
        }
    }
    
    /**
     * Metodos Getter and Setter
     * @return 
     */

    public Producto[] getNormal() {
        return normal;
    }

    public void setNormal(Producto[] normal) {
        this.normal = normal;
    }

    public Producto[] getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Producto[] prioridad) {
        this.prioridad = prioridad;
    }

    public int getPrimeroNormal() {
        return primeroNormal;
    }

    public void setPrimeroNormal(int primeroNormal) {
        this.primeroNormal = primeroNormal;
    }

    public int getUltimoNormal() {
        return ultimoNormal;
    }

    public void setUltimoNormal(int ultimoNormal) {
        this.ultimoNormal = ultimoNormal;
    }

    public int getPrimeroPrioridad() {
        return primeroPrioridad;
    }

    public void setPrimeroPrioridad(int primeroPrioridad) {
        this.primeroPrioridad = primeroPrioridad;
    }

    public int getUltimoPrioridad() {
        return ultimoPrioridad;
    }

    public void setUltimoPrioridad(int ultimoPrioridad) {
        this.ultimoPrioridad = ultimoPrioridad;
    }
  
}
