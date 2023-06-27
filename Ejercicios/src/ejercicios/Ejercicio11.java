package ejercicios;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Ejercicio11 {

    /*
 Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        float num1;
        float num2;
        System.out.println("Ingrese dos numeros enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        int opcion;
        do {
            System.out.println("MENU: 1. Sumar, 2. Restar, 3. Multiplicar, 4. Dividir, 5. Salir. Elija opción:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma de los numero es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los numero es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de los numero es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La division de los numero es: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String respuesta = leer.next();
                    if (respuesta.toUpperCase().equals("S")) {
                        System.out.println("Sayonara");
                    } else {
                        opcion = 6;
                    }
                    ;
                    break;
                default: {
                    System.out.println("Opcion incorrecta");
                }
            }

        } while (opcion != 5);

    }
}
