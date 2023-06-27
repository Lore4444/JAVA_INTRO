package ejercicios;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Ejercicio13 {

    /*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension de la matriz");
        int num = leer.nextInt();

        String[][] matriz = new String[num][num];

        for (int i = 0; i < num; i++) {

            for (int j = 0; j < num; j++) {

                if (i == 0 || j == 0 || i == num - 1 || j == num - 1) {

                    matriz[i][j] = "*";

                } else {
                    matriz[i][j] = "  ";

                }

            }

        }

        for (int i = 0; i < num; i++) {

            for (int j = 0; j < num; j++) {

                System.out.print("[" + matriz[i][j] + "]");
            }

            System.out.println("");
        }

    }
}
