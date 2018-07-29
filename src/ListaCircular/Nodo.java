/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ListaCircular;

/**
 *
 * @author Marko
 */
public class Nodo<Tipo> {
    private Tipo dato;
     private Nodo siguiente;

    public Nodo(Tipo dato) {
        this.dato = dato;
        siguiente=this;
    }

    /**
     * @return the dato
     */
    public Tipo getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Tipo dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
 }