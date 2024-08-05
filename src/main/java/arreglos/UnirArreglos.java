package arreglos;

import java.util.Arrays;

/**
 *
 * @author amarianjel
 */
public class UnirArreglos {
    public static void main(String []args){
        /*int[] arreglo1 = {1, 2, 3};
        int[] arreglo2 = {4, 5, 6};
        int[] arregloUnido = new int[arreglo1.length + arreglo2.length];
        
        System.arraycopy(arreglo1, 0, arregloUnido, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, arregloUnido, arreglo1.length, arreglo2.length);
        
        System.out.println(Arrays.toString(arregloUnido));*/
        // Crear dos BDD
        /*String[] nombres = {"Juan", "Alberto", "Esperanza", "Amaia", "Alba"};
        String[] apellidos = {"Irribarra", "Pozo", "Marianjel", "Guitierrez", "Letelier"};
        String[] arregloUnido = new String[nombres.length + apellidos.length];
        
        int indice = 0;
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(indice + " " +  i);
            arregloUnido[indice++] = nombres[i];
        }
        for (int i = 0; i < apellidos.length; i++) {
            System.out.println(indice + " " +  i);
            arregloUnido[indice++] = apellidos[i];
        }
        System.out.println(Arrays.toString(arregloUnido));*/
        
        // README: 2-. Nombre - Apellido
        /*String[] nombres = {"Juan", "Alberto", "Esperanza", "Amaia", "Alba"};
        String[] apellidos = {"Irribarra", "Pozo", "Marianjel", "Guitierrez", "Letelier"};
        String[] arregloUnido = new String[nombres.length + apellidos.length];

        System.out.println("Nombre - Apellido");
        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i] + " " + apellidos[i]);
        }*/

        //README: 3-. Guardar en el arreglo y mostrarlo
        String[] nombres = {"Juan", "Alberto", "Esperanza", "Amaia", "Alba"};
        String[] apellidos = {"Irribarra", "Pozo", "Marianjel", "Guitierrez", "Letelier"};
        String[] arregloUnido = new String[nombres.length + apellidos.length];

        int indice = 0;
        for (int i = 0; i < nombres.length; i++) {
            arregloUnido[indice++] = nombres[i];
            arregloUnido[indice++] = apellidos[i];
        }

        for(int i = 0; i < arregloUnido.length; i++){
            if( i % 2 == 0){
                System.out.print(arregloUnido[i] + " ");
            }else{
                System.out.println(arregloUnido[i]);
            }
        }
    }
}
