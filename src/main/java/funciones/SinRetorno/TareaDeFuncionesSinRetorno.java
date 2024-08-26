package funciones.SinRetorno;
/**
 *
 * @author amarianjel
 */
public class TareaDeFuncionesSinRetorno {
    public static void main(String[] args){
        // Función n1
        //saludar();
        // Función n2
        String name = "Abraham";
        //mostrarNombre(name);
        // Función n3
        int num1 = 56;
        int num2 = 45;
        //sumar(num1, num2);
        // Función n4
        verificarParImpar(num2);
    }
    
    // TODO: Tarea de funciones
    // Función 1
    public static void saludar(){
        System.out.println("¡Hola, bienvenido al curso!");
    }
    // Función 2
    private static void mostrarNombre(String nombre){
        System.out.println("Tu nombre es: " + nombre);
    }
    // Fución 3
    private static void sumar(int a, int b){
        int suma = a + b;
        System.out.println("La suma es de: " + suma);
    }
    // Función 4
    private static void verificarParImpar(int numero){
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es PAR");
        }else{
            System.out.println("El número " + numero + " es IMPAR");
        }
    }
}
