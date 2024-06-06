package repetitivos;

/**
 *
 * @author amarianjel
 */
public class BucleFor {
    public static void main(String[] args){
        // Readme:Imprimir los nunmeros de 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        
        // Readme:Suma los numeros del 1 al 100
        /*int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println("La suma de los números del 1 al 100 es: " + suma);*/
        
        // Readme:Imprime los 10 primeros numeros pares
        /*for (int i = 1; i <= 10; i++) {
            System.out.println(i * 2);
        }*/
        
        // Readme:Tabla de multiplicar
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }

        scanner.close();*/
        
        
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
