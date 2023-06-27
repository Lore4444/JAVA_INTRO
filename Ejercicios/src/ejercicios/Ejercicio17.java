/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int vector[] = new int[100000];
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        for (int i = 0; i < 100000; i++) {
            vector[i] = (int) (Math.random() * 1000000);

            System.out.println(" " + vector[i]);
            if (vector[i] < 10) {
                count1++;
            } else {
                if (vector[i] < 100) {
                    count2++;
                } else {
                    if (vector[i] < 1000) {
                        count3++;
                    } else {
                        if (vector[i] < 10000) {
                            count4++;
                        } else {
                            if (vector[i] < 100000) {
                                count5++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(" Se encontraron: ");
        System.out.println(" " + count1 + " números de 1 dígito");
        System.out.println(" " + count2 + " números de 2 dígitos");
        System.out.println(" " + count3 + " números de 3 dígitos");
        System.out.println(" " + count4 + " números de 4 dígitos");
        System.out.println(" " + count5 + " números de 5 dígitos");
    }//main
}//class
