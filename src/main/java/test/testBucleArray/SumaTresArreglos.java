package test.testBucleArray;

public class SumaTresArreglos {
    public static void main(String[] args){
        // README: Solución ejercicio 2: Sumar 3 arreglos
        int[] arreglo1 = {3, 5, 8};
        int[] arreglo2 = {10, 20, 30};
        int[] arreglo3 = {15, 25, 33};
        int[] resultado = new int[3];

        for(int i = 0; i < arreglo1.length; i++){
            resultado[i] = arreglo1[i] + arreglo2[i] + arreglo3[i];
            System.out.println("Indice: " + i + "\tValor: " + resultado[i]);
        }
    }
}
