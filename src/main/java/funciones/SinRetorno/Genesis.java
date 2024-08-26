package funciones.SinRetorno;
/**
 *
 * @author amarianjel
 */
public class Genesis {
    public static void main(String[] args){
        //laPaty();
        //System.out.println("Estoy en el main");
        String pal = "Juanito";
        int numero = 6;
        yulix(pal, numero, 45);
    }
    
    public static void laPaty(){    // Función sin argumento
        int numero = 10;
        System.out.println("El numero es " + numero);
    }
    
    private static void yulix(String palabra, int num1, int num2){ // Función con argumento
        int resta = num1 - num2;
        System.out.println(palabra + " el resultado es " + resta);
    }
}
