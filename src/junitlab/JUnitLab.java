/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitlab;

/**
 *
 * @author irving
 */
public class JUnitLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila miPila = new Pila();

        miPila.push(123);
        miPila.push(456);
        miPila.push(789);
        miPila.push(12);

        miPila.imprimirPila();

        System.out.println("Top de la pila: " + miPila.top());
        System.out.println("Pop de la pila: " + miPila.pop());

        miPila.imprimirPila();
     }
    
}
