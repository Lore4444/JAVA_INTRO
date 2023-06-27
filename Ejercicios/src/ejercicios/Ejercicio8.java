package ejercicios;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Ejercicio8 {

    /*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Lenght() en Java.
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String frase;
        System.out.println("Ingresa una frase");
        frase = leer.next();

        if (frase.length() == 8) {
            System.out.println("Correcto");

        } else {
            System.out.println("Incorrecto");
        }

    }
}
