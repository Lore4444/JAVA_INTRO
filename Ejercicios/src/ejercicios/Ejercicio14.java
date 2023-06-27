/*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double euros = 0;
        System.out.println("Ingrese la cantidad de Euros a cambiar");
        euros = leer.nextDouble();
        String moneda = "";
        System.out.println("Ingrese la moneda a convertir: dolar, yen, o libra");
        moneda = leer.next();

        cambio(euros, moneda);

    }

    public static void cambio(double euros, String moneda) {

        switch (moneda) {
            case "dolar":
                euros = euros * 1.28611;
                break;
            case "libra":
                euros = euros * 0.86;
                break;
            case "yen":
                euros = euros * 129.852;
                break;
        }
        System.out.println("Los euros equivalen a: " + euros + " " + moneda);
    }
}
