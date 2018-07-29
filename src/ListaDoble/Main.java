/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ListaDoble;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaD<String> l = new ListaD<String>();
        l.insertar("Calle");
        l.insertar("Cristian");
        l.insertar("Emo");

        System.out.println("Datos: "+ l.toString());

        l.Eliminar();
        System.out.println("Datos: "+ l.toString());

        l.eliminarF();
        System.out.println("Datos: "+ l.toString());
    }

}
