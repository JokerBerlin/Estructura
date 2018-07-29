/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ListaSimple;

/**
 *
 * @author Marko
 */
public class NodoS<Tipo> {

    private Tipo dato;
    private NodoS siguiente;
    private NodoS ls;




    public NodoS(Tipo dato) {
        this.dato = dato;
        siguiente = null;
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
    public NodoS getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoS siguiente) {
        this.siguiente = siguiente;
    }

}