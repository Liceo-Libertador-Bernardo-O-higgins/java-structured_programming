package bucles;

/**
 *
 * @author amarianjel
 */
public class BucleDoWhile {
    public static void main(String[] args){
        // README: Contar los numeros de 1 al 100
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
        
        // REAME: Sumar los primeros 100 numeros
        /*int i = 1;
        int suma = 0;
        do {
            suma += i;
            i++;
        } while (i <= 100);
        System.out.println("La suma de los primeros 100 números es: " + suma);*/
        
        //REDME: Incrementar contador hasta entrada de "abc"
        /*Scanner scanner = new Scanner(System.in);
        String input;
        int contador = 0;

        do {
            System.out.print("Introduce una secuencia de teclas (escribe 'abc' para salir): ");
            input = scanner.nextLine();
            if (!input.equals("abc")) {
                contador += 2;
                System.out.println("Contador: " + contador);
            }
        } while (!input.equals("abc"));

        System.out.println("Has terminado. El contador final es: " + contador);*/
        
        //README: Contar los digitos de un numero
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        int contador = 0;

        do {
            numero /= 10;
            contador++;
        } while (numero != 0);

        System.out.println("El número tiene " + contador + " dígitos.");*/
    }
}
