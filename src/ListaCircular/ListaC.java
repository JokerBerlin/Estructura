/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaCircular;

/**
 *
 * @author Marko
 */
public class ListaC<Tipo> {

    Nodo<Tipo> primero;

    public ListaC() {
        primero = null;
    }

    public ListaC insertar(Tipo x) {

        Nodo nuevo = new Nodo(x);
        Nodo actual = primero;
        if (primero != null) {
            do {
                actual = actual.getSiguiente();
            } while (actual.getSiguiente() != primero);
            nuevo.setSiguiente(primero);
            actual.setSiguiente(nuevo);
        }

        primero = nuevo;
        return this;
    }

    public ListaC Eliminar() {

        Nodo fin = primero;
        Nodo actual = primero;
        if (primero != null) {
            do {
                fin = fin.getSiguiente();
            } while (fin.getSiguiente() != primero);
            if (primero != fin) {
                fin.setSiguiente(actual.getSiguiente());
                primero = actual.getSiguiente();
                actual.setSiguiente(actual);
            }
        }
        return this;
    }

    @Override
    public String toString() {
        String salida = "";
        Nodo actual = primero;

        for (actual = primero; actual != null && actual.getSiguiente() != primero; actual = actual.getSiguiente()) {
            salida = salida + "-"+ actual.getDato();
        }
        return salida;
    
    }
    

    public ListaC insertarI(Tipo ele) {
        Nodo nuevo = new Nodo(ele);
        if (primero != null) {
            Nodo aux = primero;
            while (aux.getSiguiente() != primero) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setSiguiente(primero);

        } else {
            primero = nuevo;
        }
        return this;
    }

    public ListaC insertarF(Tipo x) {
        Nodo nuevo = new Nodo(x);
        Nodo actual = primero;
        if (primero != null) {
            while (actual.getSiguiente() != primero) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
            nuevo.setSiguiente(primero);
        } else {
            primero = nuevo;
            nuevo.setSiguiente(nuevo);
        }

        return this;

    }

    public ListaC InsertarAntesD(Tipo ele, Tipo buscar) {
        Nodo nuevo = new Nodo(ele);
        if (primero != null) {
            Nodo aux = primero;
            while (aux.getDato() != buscar) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setSiguiente(aux.getSiguiente());
        } else {
            primero = nuevo;
        }
        return this;
    }

    public ListaC eliminarP() throws Exception {
        if (primero != null) {
            Nodo aux = primero;
            Nodo aux1 = primero;
            while (aux.getSiguiente() != primero) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(aux1.getSiguiente());
            primero = aux1.getSiguiente();
        } else {
            throw new Exception("lista vacia");
        }
        return this;
    }
    
    public ListaC EliminarF() {
        Nodo fin = primero;
        Nodo actual = primero;
        if (primero != null) {
            do {
                fin = fin.getSiguiente();
            } while (fin.getSiguiente().getSiguiente() != primero);
            fin.setSiguiente(actual);
        }

        return this;
    }

    public ListaC eliminarB(Tipo ele){
        if (primero != null) {
            Nodo aux = primero;
            Nodo aux1 = primero;
            while (aux.getDato() != ele) {
                aux1 = aux;
                aux = aux.getSiguiente();
            }
            aux1 = aux;
            aux = aux.getSiguiente().getSiguiente();
            aux1.setSiguiente(aux);
            aux1.getSiguiente().setSiguiente(aux1);
        } else {
            
        }
        return this;
    }

    public boolean isEmpty(ListaC x) {
        return primero == null;
    }

}
