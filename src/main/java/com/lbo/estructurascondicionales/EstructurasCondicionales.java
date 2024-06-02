package com.lbo.estructurascondicionales;
import java.util.Scanner;

/**
 *
 * @author amarianjel
 */
public class EstructurasCondicionales {

    public static void main(String[] args) {
       // README: 1 Calculo de cuadernos
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de cuadernos que desea comprar: ");
        int cantidadCuadernos = scanner.nextInt();
        int precioMenor5 = 1200;
        int precioMayorIgual5 = 900;
        int total;
        if (cantidadCuadernos < 5) {
            total = cantidadCuadernos * precioMenor5;
        } else {
            total = cantidadCuadernos * precioMayorIgual5;
        }
        System.out.println("El total a pagar es: $" + total);
        scanner.close();*/


        // README: 2 Calculo de Pulsaciones
        // Crear un objeto Scanner para obtener la entrada del usuario
        /*Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Solicitar al usuario que ingrese su sexo (F para femenino, M para masculino)
        System.out.print("Ingrese su sexo (F para femenino, M para masculino): ");
        char sexo = scanner.next().charAt(0);
//        sexo = sexo.toUpperCase(); // Convertir el sexo a mayúsculas

        // Declarar la variable para el número de pulsaciones
        double pulsaciones;

        // Calcular el número de pulsaciones según el sexo
        if (sexo == 'F' || sexo == 'f') {
            pulsaciones = (220 - edad) / 10.0;
        } else if (sexo == 'M' || sexo == 'm') {
            pulsaciones = (210 - edad) / 10.0;
        } else {
            System.out.println("Sexo no válido. Use 'F' para femenino o 'M' para masculino.");
            return;
        }

        // Mostrar el número de pulsaciones
        System.out.println("El número de pulsaciones por cada 10 segundos de ejercicio aeróbico es: " + pulsaciones);
        
        // Cerrar el scanner
        scanner.close(); */

        // README: 3 Calculo de colegiatura
        /*Scanner scanner = new Scanner(System.in);
        
        // Solicitar el número de asignaturas
        System.out.print("Ingrese el número de asignaturas que cursa el estudiante: ");
        int numeroAsignaturas = scanner.nextInt();
        
        // Solicitar el costo por asignatura
        System.out.print("Ingrese el costo por asignatura: ");
        double costoAsignatura = scanner.nextDouble();
        
        // Solicitar el promedio del último periodo
        System.out.print("Ingrese el promedio del último periodo: ");
        double promedio = scanner.nextDouble();
        
        // Calcular la colegiatura base
        double colegiaturaBase = numeroAsignaturas * costoAsignatura;
        
        // Calcular el total a pagar
        double totalPagar;
        if (promedio >= 6) {
            // Aplicar descuento del 30%
            totalPagar = colegiaturaBase * 0.7;
        } else {
            // Aplicar impuesto del 10%
            totalPagar = colegiaturaBase * 1.1;
        }
        
        // Mostrar el total a pagar
        System.out.printf("El estudiante debe pagar: $%.2f%n", totalPagar);
        
        // Cerrar el scanner
        scanner.close();*/


        // README: 4 Calculo de pago de vivienda
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el costo de la vivienda
        System.out.print("Ingrese el costo de la vivienda: ");
        double costoVivienda = scanner.nextDouble();
        
        // Solicitar los ingresos del comprador
        System.out.print("Ingrese los ingresos mensuales del comprador: ");
        double ingresosComprador = scanner.nextDouble();
        
        // Variables para calcular el pie y los pagos mensuales
        double porcentajePie;
        int plazoAnios;
        
        // Determinar el porcentaje del pie y el plazo según los ingresos
        if (ingresosComprador < 500000) {
            porcentajePie = 0.15; // 15% del costo
            plazoAnios = 10; // a pagar en 10 años
        } else {
            porcentajePie = 0.30; // 30% del costo
            plazoAnios = 7; // a pagar en 7 años
        }
        
        // Calcular el monto del pie
        double montoPie = costoVivienda * porcentajePie;
        
        // Calcular el monto a financiar
        double montoFinanciar = costoVivienda - montoPie;
        
        // Calcular el total de meses para los pagos
        int totalMeses = plazoAnios * 12;
        
        // Calcular los pagos mensuales
        double pagoMensual = montoFinanciar / totalMeses;
        
        // Mostrar los resultados
        System.out.printf("Monto del pie: $%.2f%n", montoPie);
        System.out.printf("Pago mensual: $%.2f%n", pagoMensual);
        
        // Cerrar el scanner
        scanner.close();
    }
}
