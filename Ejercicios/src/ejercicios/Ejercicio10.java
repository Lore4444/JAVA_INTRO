package ejercicios;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Ejercicio10 {

    /*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int limite;

        System.out.println("Ingrese un numero limite");
        limite = leer.nextInt();

        int suma = 0;

        do {
            System.out.println("Ingrese un numero");
            suma = leer.nextInt() + suma;

        } while (suma < limite);

        System.out.println("La suma total es " + suma);
    }
}
