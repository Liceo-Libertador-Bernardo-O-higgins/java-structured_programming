package estructuras_condicionales;

import java.util.Scanner;

/**
 *
 * @author amarianjel
 */
public class ControlesAlternativos {
    // README: Ejercicio 1: Días de la Semana
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 7: ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
    
        // README: Ejercicio 2: Calculadora Básica
        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese un operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        switch (operador) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: División por cero");
                }
                break;
            default:
                System.out.println("Operador inválido");
                break;
        }*/
        
        // README: Ejercicio 3: Meses del Año
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 12: ");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }*/
        
        //README: Ejercicio 4: Calificaciones
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una calificación (A, B, C, D, F): ");
        char calificacion = scanner.next().charAt(0);

        switch (calificacion) {
            case 'A':
                System.out.println("Puntuación: 90-100");
                break;
            case 'B':
                System.out.println("Puntuación: 80-89");
                break;
            case 'C':
                System.out.println("Puntuación: 70-79");
                break;
            case 'D':
                System.out.println("Puntuación: 60-69");
                break;
            case 'F':
                System.out.println("Puntuación: 0-59");
                break;
            default:
                System.out.println("Calificación inválida");
                break;
        }*/
        
        
        // README: Ejercicio 5: Conversor de Unidades
        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cantidad: ");
        double cantidad = scanner.nextDouble();

        System.out.print("Ingrese la unidad de medida (cm, m, km): ");
        String unidad = scanner.next();

        switch (unidad) {
            case "cm":
                System.out.println(cantidad + " cm = " + (cantidad / 100) + " m");
                break;
            case "m":
                System.out.println(cantidad + " m = " + cantidad + " m");
                break;
            case "km":
                System.out.println(cantidad + " km = " + (cantidad * 1000) + " m");
                break;
            default:
                System.out.println("Unidad inválida");
                break;
        }*/
        
        
        // README: Ejercicio 6: Conversión de Calificaciones Numéricas a Letras
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una calificación numérica (0-100): ");
        int calificacion = scanner.nextInt();

        char letra;

        if (calificacion >= 90) {
            letra = 'A';
        } else if (calificacion >= 80) {
            letra = 'B';
        } else if (calificacion >= 70) {
            letra = 'C';
        } else if (calificacion >= 60) {
            letra = 'D';
        } else {
            letra = 'F';
        }

        switch (letra) {
            case 'A':
                System.out.println("Calificación: A");
                break;
            case 'B':
                System.out.println("Calificación: B");
                break;
            case 'C':
                System.out.println("Calificación: C");
                break;
            case 'D':
                System.out.println("Calificación: D");
                break;
            case 'F':
                System.out.println("Calificación: F");
                break;
            default:
                System.out.println("Calificación inválida");
                break;
        }*/
        
        // README: Ejercicio 7: Zodiaco Chino
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();

        int resto = anio % 12;

        switch (resto) {
            case 0:
                System.out.println("Mono");
                break;
            case 1:
                System.out.println("Gallo");
                break;
            case 2:
                System.out.println("Perro");
                break;
            case 3:
                System.out.println("Cerdo");
                break;
            case 4:
                System.out.println("Rata");
                break;
            case 5:
                System.out.println("Buey");
                break;
            case 6:
                System.out.println("Tigre");
                break;
            case 7:
                System.out.println("Conejo");
                break;
            case 8:
                System.out.println("Dragón");
                break;
            case 9:
                System.out.println("Serpiente");
                break;
            case 10:
                System.out.println("Caballo");
                break;
            case 11:
                System.out.println("Cabra");
                break;
            default:
                System.out.println("Año inválido");
                break;
        }*/
        
        // README: Ejercicio 8: Determinar Estación del Año
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 12 para determinar la estación: ");
        int mes = scanner.nextInt();

        switch (mes) {
            case 12:
            case 1:
            case 2:
                System.out.println("Invierno");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Primavera");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Verano");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Otoño");
                break;
            default:
                System.out.println("Mes inválido");
                break;
        }*/
        
        // README: Ejercicio 9: Calculadora de Área
        /*Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seleccione una figura para calcular el área:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectángulo");
        System.out.println("4. Triángulo");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                System.out.println("Área del círculo: " + (Math.PI * radio * radio));
                break;
            case 2:
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                System.out.println("Área del cuadrado: " + (lado * lado));
                break;
            case 3:
                System.out.print("Ingrese la base del rectángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del rectángulo: ");
                double altura = scanner.nextDouble();
                System.out.println("Área del rectángulo: " + (base * altura));
                break;
            case 4:
                System.out.print("Ingrese la base del triángulo: ");
                double baseTriangulo = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double alturaTriangulo = scanner.nextDouble();
                System.out.println("Área del triángulo: " + (0.5 * baseTriangulo * alturaTriangulo));
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }*/
        
       // README: Ejercicio 10: Identificador de Vocales y Consonantes
       /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        char letra = scanner.next().charAt(0);

        switch (Character.toLowerCase(letra)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(letra + " es una vocal");
                break;
            default:
                if (Character.isLetter(letra)) {
                    System.out.println(letra + " es una consonante");
                } else {
                    System.out.println(letra + " no es una letra válida");
                }
                break;
        }*/
    }
}
