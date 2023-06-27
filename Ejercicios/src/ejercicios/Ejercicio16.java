/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int tamaño;
        System.out.println("Ingrese el tamaño del vector");
        tamaño = leer.nextInt();

        int[] vector = new int[tamaño];

        System.out.println("Introduce numero a buscar dentro del vector");
        int num2 = leer.nextInt();

        llenaVector(vector);
        imprimeVector(vector);
        posicionVector(vector, num2);
    }

    public static int[] llenaVector(int[] vector) {
        System.out.println("LLenando vector....");

        /* for (int i = 0; i < tamaño; i++) {
                                        vector[i]=new Random().nextInt(10);
            
        }*/
        for (int i = 0; i < vector.length; i++) {
            vector[i] = new Random().nextInt(10);
        }

        return vector;
    }

    public static void imprimeVector(int[] vector) {
        System.out.println("Imprimiendo vector....");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(String.valueOf(vector[i]) + " ");
        }
    }

    public static void posicionVector(int[] vector, int num2) {
        //System.out.println("Imprimiendo vector....");
        int band = 0;
        int cont = 0;

        for (int i = 0; i < vector.length; i++) {
            //System.out.print(String.valueOf(vector[i])+" ");
            if (num2 == vector[i]) {
                //System.out.println("El numero si se encuentra dentro del vector");
                band = 1;
                cont++;
            }

        }
        if (band == 1) {
            System.out.println("El numero si se encuentra dentro del vector");
        } else {
            System.out.println("");
            System.out.println("El numero buscado, no se encuentra dentro del vector");
        }

        if (cont == 1) {
            System.out.println("el numero " + num2 + ": se encuentra repetido: " + cont + "vez");
        } else {
            System.out.println("el numero " + num2 + ": se encuentra repetido: " + cont + " veces");
        }
    }

}
