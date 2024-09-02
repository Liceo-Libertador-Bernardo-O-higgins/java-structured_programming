package funciones.ConRetorno;
/**
 *
 * @author amarianjel
 */
public class FuncionesConRetorno {
    public static void main(String[] args){
        System.out.println("Estoy dentro del main");
        // Función numerica sin argumento
        int numeroCreado = crearNumero();   // Llamo a la funcion y le asigno un valor
        System.out.println(numeroCreado);
        
        // Función de palabra con argumento
        String parteDeOración = "Celular";  // Argumento
        crearPalabra(parteDeOración); //Llamo a la función
        System.out.println(crearPalabra(parteDeOración)); // Imprimo la función
        
    }
    // README: Función con retorno - Sin argunmento
    private static int crearNumero(){
        int numero = 4;
        return numero;
    }
    
    // README: Función con retorno - Con argumento
    private static String crearPalabra(String palabra){
        String palabra2 = "Fabiola";
        return palabra2 + palabra;
    }
}
