/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ListaSimple;

/**
 *
 * @author Marko
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaS<String> l = new ListaS<String>();
        l.insertarP("Maria");
        l.insertarP("Rosa");
        System.out.println("Datos: " + l.toString());

        l.insertarF("Ana");
        System.out.println("Datos: " + l.toString());

        l.insertarD("Juana","Maria");
        System.out.println("Datos: " + l.toString());

        l.eliminar();
        System.out.println("Datos: " + l.toString());

        l.eliminarF();
        System.out.println("Datos: " + l.toString());

        l.insertarD("aaaaaa", "Maria");
        System.out.println("Datos: " + l.toString());

        l.insertarP("eeeee");
        System.out.println("Datos: " + l.toString());
        



        
    }

}
