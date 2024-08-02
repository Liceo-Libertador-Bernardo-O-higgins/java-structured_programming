package arreglos;

import java.util.Scanner;

/**
 *
 * @author amarianjel
 */
public class Calculadora {
    public static void main(String []args){
        Scanner leer = new Scanner(System.in);
        // Crear variables
        int opcion;
        float numero1;
        float numero2;
        float resultado;
        
        System.out.println("BIENVIENDOS A MI CALCULADORA INFINITA");

        
        do{
            System.out.println("Ingrese una de las OPCIONES NUMERICAS de la calculadora"
                + "\n 1-. Sumar"
                + "\n 2-. Restar"
                + "\n 3-. Multiplicar"
                + "\n 4-. Dividir"
                + "\n Si ingresa cualquer otro numero saldrá de la calculadora");
            opcion = leer.nextInt();
            System.out.println("Ingrese el numero 1");
            numero1 = leer.nextFloat();
            System.out.println("Ingrese el numero 2");
            numero2 = leer.nextFloat();
            switch (opcion) {
                case 1:
                    resultado = numero1 + numero2;
                    System.out.println("La suma es: " + resultado);
                    break;

                case 2:
                    resultado = numero1 - numero2;
                    System.out.println("La resta es: " + resultado);
                    break;

                case 3:
                    resultado = numero1 * numero2;
                    System.out.println("La multiplicación es: " + resultado);
                    break;

                case 4:
                    resultado = numero1 / numero2;
                    System.out.println("La división es: " + resultado);
                    break;
            }
            
        }while(opcion >= 1 && opcion <= 4);
        
        
        leer.close();
    }
}
