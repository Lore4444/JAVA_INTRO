package ejercicios;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Ejercicio3 {

    /*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.

toLowerCase() Retorna la cadena en minúsculas

toUpperCase() Retorna la cadena en mayúsculas
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase");

        String frase = leer.nextLine();

        String minusculas = frase.toLowerCase();
        String mayusculas = frase.toUpperCase();
        System.out.println("En minusculas: " + minusculas);
        System.out.println("En mayusculas: " + mayusculas);

    }
}
