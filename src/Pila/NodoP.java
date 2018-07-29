/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Pila;

/**
 *
 * @author Marko
 */
public class NodoP <Tipo>{
    private Tipo Dato;
    private NodoP siguiente;

    public NodoP(Tipo Dato){
        this.Dato = Dato;
        this.siguiente = null;


    }

    /**
     * @return the Dato
     */
    public Tipo getDato() {
        return Dato;
    }

    /**
     * @param Dato the Dato to set
     */
    public void setDato(Tipo Dato) {
        this.Dato = Dato;
    }

    /**
     * @return the siguiente
     */
    public NodoP getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoP siguiente) {
        this.siguiente = siguiente;
    }


}
