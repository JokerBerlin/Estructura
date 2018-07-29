/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ListaDoble;

/**
 *
 * @author User
 */
public class NodoD <Tipo>{
    private Tipo dato;
    private NodoD anterior;
    private NodoD siguiente;

    public NodoD(Tipo dato) {
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
    public NodoD getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoD anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the siguiente
     */
    public NodoD getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoD siguiente) {
        this.siguiente = siguiente;
    }

}
