/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ListaDobleCircular;

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
        ListaDC<String> l = new ListaDC<String>();
        l.insertar("Edu");
        l.insertar("Calle");
        l.insertar("Crispin");
        System.out.println("Datos: "+ l.toString());

        l.eliminar();
        System.out.println("Datos: "+ l.toString());

        l.eliminarF();
        System.out.println("Datos: "+ l.toString());
    }

}
