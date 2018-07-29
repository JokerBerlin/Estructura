/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSimple;

import javax.swing.JOptionPane;

/**
 *
 * @author Marko
 */
public class ListaS<Tipo> {

    private NodoS ls;

    public ListaS() {
        ls = null;
    }

    /**
     * @return the ls
     */
    public NodoS getLs() {
        return ls;
    }

    /**
     * @param ls the ls to set
     */
    public void setLs(NodoS ls) {
        this.ls = ls;
    }

    public ListaS insertarP(Tipo x) {
        NodoS nuevo = new NodoS(x);
        if (getLs() != null) {
            nuevo.setSiguiente(getLs());
        }
        setLs(nuevo);
        return this;
    }//insertar

    public ListaS insertarF(Tipo x) {
        NodoS aux = getLs();
        NodoS nuevo = new NodoS(x);
        if (getLs() != null) {
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);

        } else {
            setLs(nuevo);
        }
        return this;
    }//insertarF

    public ListaS insertarD(Tipo x, Tipo d) {

        NodoS nuevo = new NodoS(x);
        NodoS aux = getLs();
        NodoS aux2 = getLs();
        while (aux.getDato() != d) {
            aux = aux.getSiguiente();
        }
        aux2 = aux.getSiguiente();
        aux.setSiguiente(nuevo);
        nuevo.setSiguiente(aux2.getSiguiente());
        return this;
    }//insertarD

    @Override
    public String toString() {
        String cad = "";
        NodoS aux = ls;
        while (aux != null) {
            cad = cad + aux.getDato() + ", ";
            aux = aux.getSiguiente();
        }
        return cad;
    }

    public ListaS eliminar() {
        NodoS actual = ls;
        if (ls != null) {
            ls = actual.getSiguiente();
            actual.setSiguiente(null);
        } else {
            JOptionPane.showMessageDialog(null, "La lista esta vacía.");
        }

        return this;
    }

    public ListaS eliminarI() {

        NodoS aux = ls;

        ls = aux.getSiguiente();

        aux.setSiguiente(null);

        return this;
    }
    
    public ListaS eliminarF() {
        NodoS actual = ls;
        if (ls != null) {
            if (ls.getSiguiente() != null) {
                if (actual.getSiguiente() != null) {
                    while (actual.getSiguiente().getSiguiente() != null) {
                        actual = actual.getSiguiente();
                    }
                }
                actual.setSiguiente(null);

            } else {
                ls = null;
            }
        } else {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
        }
        return this;

    }

    public boolean isEmpty(ListaS x) {
        return ls == null;
    }

}//ListaS
