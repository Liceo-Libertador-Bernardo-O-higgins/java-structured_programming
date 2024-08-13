package test.testBucleArray;

public class ParImpar {
    public static void main(String[] args) {
        // REAME: Solución ejercicio 1: Dado un numero, sumar dos numero consecutivos a un arreglo par y dos consecutivos a un arreglo impar
        int[] arreglo1 = new int[2];    // PAR
        int[] arreglo2 = new int[2];    // IMPAR
        int numero = 3;

        for(int i = 0; i < arreglo1.length; i++){
            if (numero%2 == 0){
                // PAR
                System.out.println("PAR");
                arreglo1[i - 1] = numero;
                arreglo1[i] = numero + 2;
                System.out.println("Arreglo 1: " + arreglo1[i - 1] + ", " + arreglo1[i]);
            }else{
                // IMPAR
                System.out.println("IMPAR");
                arreglo2[i] = numero;
                arreglo2[i + 1] = numero + 2;
                System.out.println("Arreglo 2: " + arreglo2[i] + ", " + arreglo2[i + 1]);
            }
            numero++;
        }
    }
}