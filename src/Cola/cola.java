/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Cola;

/**
 *
 * @author Marko
 */
public class cola <Tipo> {
    NodoC <Tipo> inicio,fin;
    public cola(){

    }
    public cola enColar(Tipo dato){
        NodoC nuevo=new NodoC(dato);
        if(inicio!=null){
            fin.setSiguiente(nuevo);

        }
        else
            inicio = nuevo;
            fin = nuevo;
        return this;
     }


    public cola desEncolar() throws Exception{
        if(inicio!=null){
            if(inicio.getSiguiente()!=null){
                NodoC actual=inicio;
                inicio=inicio.getSiguiente();
                actual.setSiguiente(null);
            }
            else
                inicio=fin=null;
        }
        else
            throw new Exception("Cola vacía");

        return this;
    }


    @Override
    public String toString(){
        String salida = " ";
        NodoC actual;
        for(actual=inicio; actual!=null; actual=actual.getSiguiente())
            salida=salida + actual.getDato()+",";
        return salida;
    }

    public boolean isEmpty(){
        if(inicio==null)
            return true;
        else
            return false;
    }


    public Tipo firstElement()throws Exception{
        Tipo firstBlood;
        if(inicio!=null)
            firstBlood=inicio.getDato();
        else
            throw new Exception("Cola vacía");

        return firstBlood;
    }


    public cola clear()throws Exception{
        if(inicio!=null){
            while(inicio.getSiguiente()!=null){
                NodoC actual=inicio;
                inicio=inicio.getSiguiente();
                actual.setSiguiente(null);
            }
            inicio=fin=null;
        }
        else
            throw new Exception("Cola vacia");

        return this;
    }

}
