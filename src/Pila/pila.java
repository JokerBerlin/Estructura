/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Pila;

/**
 *
 * @author Marko
 */
public class pila <Tipo>{
    NodoP tope;
    public pila(){
        tope = null;
    }

    public pila push (Tipo elemento){
        NodoP nuevo = new NodoP(elemento);
        if(tope != null){
            nuevo.setSiguiente(tope);
        }
        tope = nuevo;

        return this;
    }
//Metodo push agrega de principio al final(el primer dato es el ultimo)

    @Override
    public String toString(){
        String salida = " ";
        NodoP aux = tope;
        while(aux !=null){
            salida = salida + aux.getDato();
            aux = aux.getSiguiente();
        }
        return salida;
    }


    // el "throws Exception" controla la pila vacia mediante un mensaje
    public Tipo pop() throws Exception {
        NodoP aux = tope;
        Tipo elemento;
        if(tope != null){
            if(tope.getSiguiente() != null){ //cuando tiene mas de dos datos
                tope = aux.getSiguiente();
                aux.setSiguiente(null);
                elemento = (Tipo) aux.getDato(); //(Tipo) es un tipo casting
            }
            else{
                elemento = (Tipo) tope.getDato();
                tope = null; //cuando tiene un dato

            }
            return elemento;
        }
        else
            throw new Exception("Pila Vacia");

}

        public pila pop1() throws Exception {
        NodoP aux = tope;

        if(tope != null){
            if(tope.getSiguiente() != null){ //cuando tiene mas de dos datos
                tope = aux.getSiguiente();
                aux.setSiguiente(null);
            }
            else{
                tope = null; //cuando tiene un dato
            }
            return this;
        }
        else
            throw new Exception("Pila Vacia");
    }


        public Tipo top()throws Exception{
            if(tope != null){
                Tipo elemento = (Tipo) tope.getDato();
                return elemento;
            }
            else
                throw new Exception("Pila vacia");
        }

       //isEmpty si la pila esta vacia
        public boolean isEmpty(){
            return tope == null;
        }


        //clear para limpiar la lista
        public pila clear() throws Exception{
            if(tope != null){
                if(tope != tope.getSiguiente()){
                    while(tope != null)
                        tope = tope.getSiguiente();
                    }
                else
                    tope = null;
                return this;
                 }
            else
                throw new Exception("Pila vacia");
        }
}
