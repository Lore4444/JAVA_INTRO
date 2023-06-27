/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[] vector = new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i] = i + 1;

            System.out.print("[" + vector[i] + "]");
        }

        System.out.println("Contenido del arreglo en forma descendente");
        for (int i = 0; i < 100; i++) {
            vector[i] = 100 - i;
            System.out.print(" " + vector[i]);

        }

    }
}
