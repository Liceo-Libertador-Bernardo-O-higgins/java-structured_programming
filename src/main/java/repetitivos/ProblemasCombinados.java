package repetitivos;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amarianjel
 */
public class ProblemasCombinados {
    public static void main(String[] args){
        
        //1-. Largo de palabra por teclado
        /*Scanner tec = new Scanner(System.in);
        String palabra = tec.nextLine();
        
        for(int i = 0; i < palabra.length(); i++){
            char letra = palabra.charAt(i);
            System.out.println(letra);
        }*/
        
        
        //2-. Largo de palabra por teclado con numeraciòn hacia la derecha
        String palabra = "Hola Mundo";
        int cont = 1;
        
        for(int i = 0; i < palabra.length(); i++){
            char letra = palabra.charAt(i);
            System.out.print( "     " + cont + "-. " + letra);
            cont++;
        }
        
        
        
        
    }
}







 // Variable para almacenar la palabra invertida
        /*String palabraInvertida = "";
        
        // Recorremos la palabra desde el final hacia el inicio
        for (int i = palabra.length() - 1; i >= 0; i--) {
            // Añadimos el carácter actual a la palabra invertida
            palabraInvertida += palabra.charAt(i);
        }
        
        // Imprimimos la palabra invertida
        System.out.println(palabraInvertida);*/