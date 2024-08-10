package testBucleArray;

import java.util.Scanner;

public class PalabraEnColumna {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        System.out.print("Ingresa la palabra a deletrear: ");
        String palabra = tec.nextLine();
        int cantidadLetras = palabra.length();

        for(int i = 0; i < palabra.length(); i++){
            System.out.println(palabra.charAt(i));
        }
        System.out.println("\nFIN");
    }
}
