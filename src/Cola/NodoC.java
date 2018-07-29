/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Cola;

/**
 *
 * @author Marko
 */
public class NodoC<Tipo> {
    private Tipo dato;
    private NodoC siguiente;

    public NodoC(Tipo dato){
        this.dato=dato;
        siguiente=null;
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
    public NodoC getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoC siguiente) {
        this.siguiente = siguiente;
    }



}
