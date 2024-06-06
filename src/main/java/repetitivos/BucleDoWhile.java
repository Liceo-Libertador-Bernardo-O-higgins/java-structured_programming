package repetitivos;

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
        
        
        
        
        /* README: Construya un programa JAVA que permita determinar cuántos 
        alumnos tienen promedio entre los rangos: A[1.0 - 2.9]; B[3.0 – 3.9];
        C[4.0 – 5.5]; D[5.6 – 7.0]*/
        
        /*Scanner scanner = new Scanner(System.in);
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        System.out.println("Ingrese el número de alumnos:");
        int numAlumnos = scanner.nextInt();
        int i = 0;

        do {
            System.out.println("Ingrese el promedio del alumno " + (i + 1) + ":");
            double promedio = scanner.nextDouble();
            
            if (promedio >= 1.0 && promedio <= 2.9) {
                countA++;
            } else if (promedio >= 3.0 && promedio <= 3.9) {
                countB++;
            } else if (promedio >= 4.0 && promedio <= 5.5) {
                countC++;
            } else if (promedio >= 5.6 && promedio <= 7.0) {
                countD++;
            }
            
            i++;
        } while (i < numAlumnos);

        System.out.println("Número de alumnos en el rango A[1.0 - 2.9]: " + countA);
        System.out.println("Número de alumnos en el rango B[3.0 - 3.9]: " + countB);
        System.out.println("Número de alumnos en el rango C[4.0 - 5.5]: " + countC);
        System.out.println("Número de alumnos en el rango D[5.6 - 7.0]: " + countD);*/
    }
}
