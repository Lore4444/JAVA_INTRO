/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.

2 7 6
9 5 1
4 3 8

 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Ejercicio20 {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        LLenarMatriz(matriz);
        ImprimirMatriz(matriz);

        System.out.println(" ********************************** ");

        Magico(matriz);

    }//main

    public static void LLenarMatriz(int[][] matriz) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese numeros del 1 al 9 para llenar la matriz");

        for (int i = 0; i < 3; i++) { //filas
            for (int j = 0; j < 3; j++) {//columnas

                do {
                    System.out.println("Ingrese el valor para la posicion " + i + "," + j);
                    matriz[i][j] = leer.nextInt();
                } while (matriz[i][j] < 1 || matriz[i][j] > 9);

            }//for2

        }//for1

    }//LlenarMatriz

    public static void ImprimirMatriz(int[][] matriz) {

        for (int i = 0; i < 3; i++) { //filas
            System.out.println("\n");
            for (int j = 0; j < 3; j++) {//columnas

                System.out.print(" [" + matriz[i][j] + "] ");

            }//for2

        }//for1
        System.out.println(" ");
    }//ImprimirMatriz

    public static void Magico(int[][] matriz) {
        int sumafila;
        int sumacolumna;
        int contador = 0;
        int contador2 = 0;
        int sumadiagonal = 0;
        boolean magico;

        //SUMA DIAGONAL
        for (int i = 0; i < 3; i++) { //filas
            for (int j = 0; j < 3; j++) {//columnas

                if (i == j) {
                    sumadiagonal += matriz[i][j];

                }//if

            }//for j

        }//for i
        System.out.println("Suma diagonal= " + sumadiagonal);

        //SUMAR FILAS Y COLUMNAS
        for (int i = 0; i < 3; i++) { //filas
            sumafila = 0;
            sumacolumna = 0;
            for (int j = 0; j < 3; j++) {//columnas

                sumafila += matriz[i][j];
                sumacolumna += matriz[j][i];

            }//for j
            System.out.print("Suma fila =" + sumafila);
            System.out.println(" ");
            System.out.print("Suma columna =" + sumacolumna);
            System.out.println(" ");

            if (sumafila == sumacolumna) {
                contador++;

            }

            if (sumafila == sumadiagonal) {

                contador2++;
            }

            System.out.println("contador " + contador);
            System.out.println("contador 2 " + contador2);
            System.out.println("*********************************");

        }//for i

        //VERIFICACION
        if ((contador == 3) && (contador2 == 3)) {

            magico = true;

            System.out.println("La matriz es magica");
        } else {
            System.out.println("La matriz no es magica");
        }

    }//Magico
}//Clase
