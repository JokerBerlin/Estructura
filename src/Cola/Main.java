/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Cola;

/**
 *
 * @author Marko
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        cola <String> L = new cola<String>();
        L.enColar("Cosito");
        L.enColar("Emili");
        L.enColar("Crinpin");
        System.out.println("Datos: "+L.toString());

        L.desEncolar();
        System.out.println("Datos: "+L.toString());

        L.isEmpty();
        System.out.println("Datos: "+L.toString());

        L.clear();
        System.out.println("Datos: "+L.toString());

    }

}
