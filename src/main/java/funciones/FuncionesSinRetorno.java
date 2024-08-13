package funciones;

/**
 *
 * @author amarianjel
 */
public class FuncionesSinRetorno {
    // Función Main
    public static void main(String[] args){
        System.out.println("Estoy dentro de la función Main");
        
        miNombre(); //Llamo a la función de fuera de la función
        myEdad(); //Llamo a la función n3
        bestFriend(); // Llamo a la función n2
        edadAmigo(); // Llamo a la función n4
    }
    
    // Función fuera del Main
    public static void miNombre(){
        System.out.print("Abraham Marianjel ");
    }
    
    // Función n2
    private static void bestFriend(){
        System.out.print("Ramon Ascencio ");
    }
    
    // Función n3
    private static void myEdad(){
        int edad = 1000;
        System.out.println(edad + " años");
    }
    
    // Función n4
    private static void edadAmigo(){
        int edad = 350;
        System.out.println(edad + " años");
    }
}
