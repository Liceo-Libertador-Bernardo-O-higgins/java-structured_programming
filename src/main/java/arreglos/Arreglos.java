package arreglos;

/**
 *
 * @author amarianjel
 */
public class Arreglos {
    public static void main(String[] args){
        //Formas de crear un arreglo
        /*int []miArregloNumerico = { 3, 5, 3}; //Tamaño 3
        char []miArregloLetras = { 'c','a'};    //Tamaño 2
        String []miArregloPalabras = { "El pelo rubio", "Me gusta comer", "Vicentito", "Los al cuadrado"};
        
        //Variables
        int num1 = 0;
        int num2 = 10;
        int num3 = 4;
        char letra1 = 'a';
        char letra2 = 'b';
        char letra3 = 'c';
        String palabra1 = "Matias";
        String palabra2 = "Vicentito";
        String palabra3 = "Angular";
        
        int []arrNum = new int[3];
        Character []arrLetra = new Character[2];
        String []arrPalabra = new String[3];
            
        arrPalabra[0] = palabra2;
        arrPalabra[1] = palabra3;
        arrPalabra[2] = palabra1;
        
        int indice = arrPalabra.length - 1;
        // Mostrar elementos
        for(int i = 0; i < arrPalabra.length; i++){
            //System.out.println("Indice: " + i + "   Valor del arreglo: " + arrPalabra[indice--]);

        }
        
        // Clase de sumas
        int []myarray1 = {3,4,6};
        int []myarray2 = {5,7,6};
        int []sumaArreglos = new int[3];

        // MathRandom
        int numeroRandom = (int)(Math.random() * 9);
        
        System.out.println("Este es el Random: " + numeroRandom);
        
        // Suma Arreglos
        sumaArreglos[0] = myarray1[0] + myarray2[0];
        //System.out.println(" Las suma es: " + sumaArreglos[0]);
        
        sumaArreglos[1] = myarray1[1] + myarray2[1];
        //System.out.println(" Las suma es: " + sumaArreglos[1]);
        
        sumaArreglos[2] = myarray1[2] + myarray2[2];
        //System.out.println(" Las suma es: " + sumaArreglos[2]);
            
        
        for(int i = 0; i < sumaArreglos.length; i++){
            sumaArreglos[i] = myarray1[i] + myarray2[i];
            
            if( sumaArreglos[i] <= 8){
                sumaArreglos[i] += 3; 
            }
            System.out.println("La suma es: "  + sumaArreglos[i]);
        }*/
            
            
            
         
        
        
        
        
        
        
        
        //README: 1 Sumar elementos de un arreglo
        /*int[] numeros = {1, 2, 3, 4, 5};
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
            
        }*/

        //System.out.println("La suma de los elementos es: " + suma);
        
        
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
