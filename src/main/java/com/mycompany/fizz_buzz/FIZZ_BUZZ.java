/* Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz". */
package com.mycompany.fizz_buzz;

public class FIZZ_BUZZ {

    public static void main(String[] args) {

        for (int i = 0; i < 101; i++) {
            

            //CONDICION PARA MULTIPLO DE 3
            if (i % 3 == 0) {
                System.out.println("fizz");

                //CONDICION PARA MULTIPLO DE 3
            } else if (i % 5 == 0) {
                System.out.println("buzz");

                //CONDICION PARA AMBOS
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            }else{
                 System.out.println(i);
            }
           
        }
    }
}
