/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Pila;

/**
 *
 * @author Marko
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here

        pila <String> l = new pila<String>();
        l.push("Maria");
        l.push("Rutimon");

        System.out.println("Datos: " + l.toString());

        l.pop();
        System.out.println("Datos: " + l.toString());

        l.top();
        System.out.println("Datos: " + l.toString());

        l.clear();
        System.out.println("Datos: " + l.toString());

        l.isEmpty();
            
    }

}
