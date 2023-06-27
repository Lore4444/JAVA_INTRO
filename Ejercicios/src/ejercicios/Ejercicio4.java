package ejercicios;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Ejercicio4 {


    /*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        float grados;
        System.out.println("Ingrese grados Centigrados");
        grados = leer.nextFloat();

        grados = 32 + (grados / 5);

        System.out.println("Equivalen a " + grados + " grados Fahrenheit ");

    }
}
