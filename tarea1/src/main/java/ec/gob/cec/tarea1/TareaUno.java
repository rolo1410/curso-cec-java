/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.cec.tarea1;

/**
 *
 * @author rcasigna
 */
public class TareaUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Long numero = 123098L;
        Double pi = Math.PI;

        // imprimiendo las salidas.
        System.out.printf("%d%n", numero);
        System.out.printf("%08d%n", numero);
        System.out.printf("%+08d %n", numero);
        System.out.printf("%8.2f%n", (numero * 0.01));
        System.out.printf("%+8.2f%n", (numero * 0.01));
    }
}
