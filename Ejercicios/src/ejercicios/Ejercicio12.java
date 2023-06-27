package ejercicios;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Ejercicio12 {

    /*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String frase;

        int total = 0;
        int correcto = 0;

        do {

            System.out.println("Ingrese una frase");
            frase = leer.nextLine();

            total++;

            if (frase.length() == 5) {

                if (frase.toUpperCase().substring(0, 1).equals("X") && frase.toUpperCase().substring(4, 5).equals("O")) {
                    correcto++;

                }
            }

        } while (!frase.equals("&&&&&"));
        int incorrecto = total - correcto;
        System.out.println("Las lecturas correctas son " + correcto + " Y las lecturas incorrectas son " + incorrecto);

    }
}
