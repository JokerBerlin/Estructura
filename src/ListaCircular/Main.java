/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ListaCircular;

/**
 *
 * @author Marko
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaC<String> l = new ListaC<String>();
        l.insertar("Calle");
        l.insertar("Pedu");
        l.insertar("Emili");
        System.out.println("Datos: "+ l.toString());

        l.Eliminar();
        System.out.println("Datos: "+ l.toString());

        l.EliminarF();
        System.out.println("Datos: "+ l.toString());


    }

}
