package funciones.SinRetorno;

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
        edadJorge += 50;
        int suma = edadJorge + edadProfe;
        System.out.println("La suma de las edades es: " + suma);
    }
    
    // TODO: Mostrar los nombres y las letras Función n6
    
    /*Función para imprimir un saludo:

    Crear una función llamada saludar() que imprima "¡Hola, bienvenido al curso!".

Función para mostrar el nombre:

    Crear una función llamada mostrarNombre(String nombre) que reciba un nombre como parámetro e imprima "Tu nombre es: " seguido del nombre.

Función para sumar dos números:

    Crear una función llamada sumar(int a, int b) que reciba dos números enteros y muestre la suma.

Función para mostrar un número par o impar:

    Crear una función llamada verificarParImpar(int numero) que determine si el número es par o impar y lo imprima.

Función para mostrar los primeros 10 números:

    Crear una función llamada imprimirNumeros() que imprima los números del 1 al 10.

Función para convertir grados Celsius a Fahrenheit:

    Crear una función llamada convertirACelsius(double fahrenheit) que reciba un valor en Fahrenheit y lo convierta a Celsius, mostrando el resultado.

Función para imprimir un mensaje personalizado:

    Crear una función llamada imprimirMensaje(String mensaje) que reciba un mensaje como parámetro e imprima el mensaje.

Función para contar de 1 a un número dado:

    Crear una función llamada contarHasta(int limite) que reciba un número entero y cuente desde 1 hasta ese número, imprimiéndolos.

Función para mostrar los números pares hasta un límite:

    Crear una función llamada imprimirParesHasta(int limite) que imprima los números pares desde 1 hasta el número dado.

Función para calcular el área de un círculo:

    Crear una función llamada calcularAreaCirculo(double radio) que reciba el radio de un círculo e imprima el área.*/
}
