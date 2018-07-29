/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ListaDobleCircular;

import javax.swing.JOptionPane;

/**
 *
 * @author Marko
 */
public class ListaDC <Tipo>{
    private Nodo primero;

    public ListaDC(){
        primero=null;
    }

    public ListaDC insertar(Tipo x){
        Nodo nuevo=new Nodo(x);
        Nodo actual=primero;
         if(primero!=null){
             while(actual.getSiguiente()!=primero)
                 actual=actual.getSiguiente();
             nuevo.setSiguiente(primero);
             actual.setSiguiente(nuevo);
             nuevo.setAnterior(actual);
             primero.setAnterior(nuevo);
         }
         else{
             nuevo.setAnterior(nuevo);
             nuevo.setSiguiente(nuevo);
         }
         primero=nuevo;
         return this;

    }

    public ListaDC insertarF(Tipo x){
        Nodo nuevo=new Nodo(x);
         if(primero==null)
                   primero=nuevo;
         else{
                   Nodo actual=primero;
                   while(actual.getSiguiente()!=primero)
                            actual=actual.getSiguiente();
                   actual.setSiguiente(nuevo);
                   nuevo.setAnterior(actual);
                   nuevo.setSiguiente(primero);
                   primero.setAnterior(nuevo);
         }
         return this;
    }

    public ListaDC eliminar(){
        Nodo actual=primero;
        if(primero!=null){
            if(actual.getSiguiente()!=null){
                while(actual.getSiguiente()!=primero){
                    actual=actual.getSiguiente();
                }
                primero=primero.getSiguiente();
                actual.setSiguiente(primero);
            primero.setAnterior(actual);
            }
            else
            JOptionPane.showMessageDialog(null,"Lista vacía");



        }

        return this;
    }

    public ListaDC eliminarF(){
        Nodo actual=primero;
        if(primero!=null)
            if(actual.getSiguiente()!=primero){
                while(actual.getSiguiente().getSiguiente()!=primero){
                    actual=actual.getSiguiente();
                }
                actual.setSiguiente(primero);
                primero.setAnterior(actual);
            }
        else
                JOptionPane.showMessageDialog(null,"Lista vacía");
        return this;

    }
    @Override
    public String toString(){
       String salida="";
       Nodo actual=primero;

       for(actual=primero; actual!=null &&actual.getSiguiente()!=primero; actual=actual.getSiguiente() )
            salida=salida+actual.getDato();
        return salida;


}
    public boolean isEmpty(ListaDC x){
        return primero == null;
    }


}
