package arreglos;

/**
 *
 * @author amarianjel
 */
public class Arreglos {
        public static void main(String[] args){
        
        //README: 1 Sumar elementos de un arreglo
        int[] numeros = {1, 2, 3, 4, 5};
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        System.out.println("La suma de los elementos es: " + suma);
        
        
        // README: 2 Encontrar el mayor de un elemento
        /*int[] numeros = {10, 20, 30, 5, 15};
        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El mayor elemento es: " + mayor);*/
        
        
        
        
        // README: 3 Invertir un arreglo
        /*int[] numeros = {1, 2, 3, 4, 5};
        int n = numeros.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[n - 1 - i];
            numeros[n - 1 - i] = temp;
        }

        System.out.println("Arreglo invertido: " + java.util.Arrays.toString(numeros));*/
        
        
        
        // README: 4 Contar elementos pares e impares
        /*int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int pares = 0, impares = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Número de elementos pares: " + pares);
        System.out.println("Número de elementos impares: " + impares);*/
        
        
        // README: 5 Promedio de elementos 
        /*int[] numeros = {5, 10, 15, 20, 25};
        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        double promedio = (double) suma / numeros.length;
        System.out.println("El promedio de los elementos es: " + promedio);*/
        
        
        // README: 6 Elementos comunes entre dos arreglos
        /*int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        System.out.print("Elementos comunes: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }*/

        
        // README: 7 Eliminar elementos duplicados
        /*int[] numeros = {1, 2, 2, 3, 4, 4, 5};
        int[] unicos = Arrays.stream(numeros).distinct().toArray();

        System.out.println("Arreglo sin duplicados: " + Arrays.toString(unicos));*/
        
        
        // README: 8 Ordenar un arreglo en orden ascendente
        /*int[] numeros = {5, 3, 1, 4, 2};
        Arrays.sort(numeros);

        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));*/
        
        
        
        
        
        
        // README: 9 Busqueda lineal de un arreglo
        /*int[] numeros = {10, 20, 30, 40, 50};
        int buscar = 30;
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El elemento " + buscar + " se encuentra en el arreglo.");
        } else {
            System.out.println("El elemento " + buscar + " no se encuentra en el arreglo.");
        }*/
        
        
        
        // README: 10 Rotar un arreglo hacia la derecha
        /*int[] numeros = {1, 2, 3, 4, 5};
        int ultimo = numeros[numeros.length - 1];

        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = ultimo;

        System.out.println("Arreglo rotado: " + java.util.Arrays.toString(numeros));*/
        
    }
}
