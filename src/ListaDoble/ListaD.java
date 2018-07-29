/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDoble;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ListaD<Tipo> {

    NodoD primero;

    public ListaD() {
        primero = null;
    }

    public ListaD insertar(Tipo x) {
        NodoD nuevo = new NodoD(x);
        if (primero != null) {
            primero.setAnterior(nuevo);
            nuevo.setSiguiente(primero);
        }

        primero = nuevo;
        return this;
    }

    public ListaD Eliminar() {
        NodoD actual = primero;
        if (primero != null) {
            if (primero.getSiguiente() != null) {
                primero = actual.getSiguiente();
                primero.setAnterior(null);
                actual.setSiguiente(null);
            } else {
                primero = null;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista vacía.");
        }

        return this;

    }

    @Override
    public String toString() {
        String salida = "";
        NodoD actual;

        for (actual = primero; actual != null; actual = actual.getSiguiente()) {
            salida = salida + actual.getDato();
        }
        return salida;
    }

    public ListaD insertarI(Tipo dato) {
        NodoD nuevo = new NodoD(dato);
        NodoD aux = primero;
        if (primero != null) {
            aux.setAnterior(nuevo.getSiguiente());
            nuevo.setSiguiente(aux.getAnterior());
        }
        primero = nuevo;
        return this;
    }

    public ListaD insertarF(Tipo x) {
        NodoD nuevo = new NodoD(x);
        NodoD actual = primero;
        if (primero != null) {
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
            nuevo.setAnterior(actual);
        } else {
            primero = nuevo;
        }
        return this;
    }
    
    public ListaD insertarDespuesD(Tipo dato,Tipo buscar){
        NodoD nuevo = new NodoD(dato);
        NodoD aux = primero;
        NodoD aux1 = primero;
        while(aux.getDato()!= buscar){
            aux1=aux;
            aux=aux.getSiguiente();
        }
        aux1.setSiguiente(nuevo);
        nuevo.setSiguiente(aux);
        aux.setAnterior(nuevo);
        return this;
    }
    
    public ListaD eliminarI() {
        if (primero != null) {
            NodoD aux = primero;
            NodoD aux1 = primero;
            while (aux.getSiguiente() != null ) {
                aux1=aux;
                aux=aux.getSiguiente();
            }
            aux.setAnterior(null);
            primero=aux;
            aux1.setSiguiente(null);
        } else {
            
        }
        return this;
    }

    public ListaD eliminarF() {
        NodoD actual = primero;
        if (primero != null) {
            if (primero.getSiguiente() != null) {
                if (actual.getSiguiente() != null) {
                    while (actual.getSiguiente().getSiguiente() != null) {
                        actual = actual.getSiguiente();
                    }
                }

                actual.setSiguiente(null);

            } else {
                primero = null;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista vacía.");
        }

        return this;
    }
    
    public ListaD elimnarElementoB(Tipo elemento){
        if(primero != null){
            NodoD aux= primero;
            NodoD aux1= primero;
            while(aux.getDato()!= elemento){
                aux1=aux;
                aux=aux.getSiguiente();
            }
            aux1= aux;
            aux=aux.getSiguiente();
            aux1.setSiguiente(aux.getSiguiente());
            aux.getSiguiente().setAnterior(aux1);
            aux.setSiguiente(null);
            aux.setAnterior(null);
        }else{
            
        }
        return this;
    }

    public boolean isEmpty(ListaD x) {
        return primero == null;
    }

}
