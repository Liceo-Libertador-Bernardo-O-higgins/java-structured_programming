package bucles;

import java.util.Scanner;

/**
 *
 * @author amarianjel
 */
public class BucleWhile {
    public static void main(String[] args){
        // Readme:Imprimir los nunmeros de 1 al 10
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        
        // Readme:Suma los numeros del 1 al 100
        /*int i = 1;
        int suma = 0;
        while (i <= 100) {
            suma += i;
            i++;
        }
        System.out.println("La suma de los primeros 100 números es: " + suma);*/
        
        //Redme: Contar un numero
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        int contador = 0;

        while (numero != 0) {
            numero /= 10;
            contador++;
        }

        System.out.println("El número tiene " + contador + " dígitos.");*/
        
        //README: Escribir abc para salir
        /*Scanner scanner = new Scanner(System.in);
        String input = "";
        int contador = 0;

        while (!input.equals("abc")) {
            System.out.print("Introduce una secuencia de teclas (escribe 'abc' para salir): ");
            input = scanner.nextLine();
            if (!input.equals("abc")) {
                contador += 2;
                System.out.println("Contador: " + contador);
            }
        }

        System.out.println("Has terminado. El contador final es: " + contador);*/

        // FIXME: Implementación de una calculadora
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.println("Introduce números para sumar (introduce un número negativo para finalizar):");

        // Bucle while para leer los números
        while (true) {
            System.out.print("Introduce un número: ");
            numero = scanner.nextInt();

            // Condición de salida: número negativo
            if (numero < 0) {
                break;
            }

            // Sumar el número a la suma total
            suma += numero;
        }

        // Mostrar la suma total
        System.out.println("La suma total es: " + suma);

        scanner.close();

    }
}
