package repetitivos;

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
        
        
        /* README: Construya un programa JAVA que permita determinar cuántos 
        alumnos tienen promedio entre los rangos: A[1.0 - 2.9]; B[3.0 – 3.9];
        C[4.0 – 5.5]; D[5.6 – 7.0]*/
        /*Scanner scanner = new Scanner(System.in);
        int countA = 0; // Rango [1.0 - 2.9]
        int countB = 0; // Rango [3.0 - 3.9]
        int countC = 0; // Rango [4.0 - 5.5]
        int countD = 0; // Rango [5.6 - 7.0]

        System.out.println("Ingrese el número de alumnos:");
        int numAlumnos = scanner.nextInt();
        int i = 0;

        while (i < numAlumnos) {
            System.out.println("Ingrese el promedio del alumno " + (i + 1) + ":");
            double promedio = scanner.nextDouble();
            
            if (promedio >= 1.0 && promedio <= 2.9) {
                countA++;
            } else if (promedio >= 3.0 && promedio <= 3.9) {
                countB++;
            } else if (promedio >= 4.0 && promedio <= 5.5) {
                countC++;
            } else if (promedio >= 5.6 && promedio <= 7.0) {
                countD++;
            }
            
            i++;
        }

        System.out.println("Número de alumnos en el rango A[1.0 - 2.9]: " + countA);
        System.out.println("Número de alumnos en el rango B[3.0 - 3.9]: " + countB);
        System.out.println("Número de alumnos en el rango C[4.0 - 5.5]: " + countC);
        System.out.println("Número de alumnos en el rango D[5.6 - 7.0]: " + countD);*/
    }
}
