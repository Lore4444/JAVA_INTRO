package ejercicios;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Ejercicio9 {

    /*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingresa una frase");
        frase = leer.next();

        if (frase.substring(0, 1).equals("A")) {
            System.out.println("Correcto");

        } else {
            System.out.println("Incorrecto");
        }

    }
}
