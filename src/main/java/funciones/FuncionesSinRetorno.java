package funciones;

/**
 *
 * @author amarianjel
 */
public class FuncionesSinRetorno {
    // Función Main
    public static void main(String[] args){
        System.out.println("Estoy dentro de la función Main");
        
        /*miNombre(); //Llamo a la función de fuera de la función
        myEdad(); //Llamo a la función n3
        bestFriend(); // Llamo a la función n2
        edadAmigo();*/ // Llamo a la función n4
        // Variables 
        int edadJorge = 19;
        int edadProfe = 1000;
        double promedioCurso = 6.8;
        double promedioMiguel = 6.4;
        String nombreALumno = "Esperanza";
        String nombreProfesor = "Anibal";
        char letraInicial = 'a';
        char letraFinal = 'z';
        
        // Funciones con argumento
        sumarEdades(edadJorge, edadProfe);
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
    
    // README: Funciones con Argunmento
    // Función n5
    private static void sumarEdades(int edadJorge, int edadProfe){
        int suma = edadJorge + edadProfe;
        System.out.println("La suma de las edades es: " + suma);
    }
    
    // TODO: Mostrar los nombres y las letras Función n6
}
