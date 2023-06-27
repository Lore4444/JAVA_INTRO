/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int[][] matriz2 = new int[4][4];

        for (int i = 0; i < 4; i++) {
            System.out.println("\n");
            for (int j = 0; j < 4; j++) {

                matriz[i][j] = (int) (Math.random() * 100);

                System.out.print(" " + matriz[i][j] + " ");
            }//for2

        }//for1
        System.out.println("\n");
        System.out.println("\n");

        for (int j = 0; j < 4; j++) {
            System.out.println("\n");
            for (int i = 0; i < 4; i++) {

                matriz2[j][i] = matriz[i][j] * -1;

                System.out.print(" " + matriz2[j][i] + " ");

            }
            System.out.println("  ");

        }
    }
}
