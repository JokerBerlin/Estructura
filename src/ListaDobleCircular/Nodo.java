/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ListaDobleCircular;

/**
 *
 * @author Marko
 */
public class Nodo <Tipo>{
    private Tipo dato;
    private Nodo anterior,siguiente;

    public Nodo(Tipo dato){
        this.dato=dato;
        anterior=siguiente=null;

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
     * @return the anterior
     */
    public Nodo getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
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