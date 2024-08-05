package arreglos;

import java.util.Scanner;

/**
 *
 * @author amarianjel
 */
public class BDDConsulta {
    public static void main(String []args){
        // README: Crear una bdd que se pregunte por el nombre, si esta mostrar algo, sino esta, mostrar que no esta.
        Scanner scanner = new Scanner(System.in);
        String[] nombres = {"Ana", "Juan", "Pedro", "Maria", "Alberto", "Alba", "Anais", "Jorge", "Vicente", "Yuliana"}; // Arreglo de nombres
        String nombreBuscar;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese un nombre a buscar (o 'salir' para terminar): ");
            nombreBuscar = scanner.nextLine();

            if (nombreBuscar.equalsIgnoreCase("salir")) {
                continuar = false;
            } else {
                boolean encontrado = false;
                for (int i = 0; i < nombreBuscar.length(); i++) {
                    if (nombres[i].toLowerCase().equalsIgnoreCase(nombreBuscar.toLowerCase())) {
                        encontrado = true;
                        break;
                    }
                }

                if (encontrado) {
                    System.out.println("El nombre " + nombreBuscar + " está en el arreglo.");
                } else {
                    System.out.println("El nombre " + nombreBuscar + " no está en el arreglo.");
                }
            }
        }
        
        System.out.println("EL PROGRAMA FINALIZO");
    }
}

