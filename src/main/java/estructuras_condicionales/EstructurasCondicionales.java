package estructuras_condicionales;

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
        
        // README: 5 Calculo ṕago de computadores
        /*Scanner scanner = new Scanner(System.in);
        
        // Solicitar el número de computadores
        System.out.print("Ingrese el número de computadores que desea comprar: ");
        int cantidadComputadores = scanner.nextInt();

        // Solicitar el precio por computador
        System.out.print("Ingrese el precio de cada computador: ");
        double precioComputador = scanner.nextDouble();
        
        // Solicitar si el cliente tiene convenio
        System.out.print("¿El cliente tiene convenio? (true/false): ");
        boolean tieneConvenio = scanner.nextBoolean();

        // Determinar el descuento base
        double descuento;
        if (cantidadComputadores < 5) {
            descuento = 0.10; // 10% descuento
        } else if (cantidadComputadores < 10) {
            descuento = 0.15; // 15% descuento
        } else {
            descuento = 0.20; // 20% descuento
        }

        // Duplicar el descuento si el cliente tiene convenio
        if (tieneConvenio) {
            descuento *= 2;
        }

        // Calcular el costo total sin descuento
        double totalSinDescuento = cantidadComputadores * precioComputador;
        
        // Aplicar el descuento
        double totalConDescuento = totalSinDescuento * (1 - descuento);

        // Mostrar el total a pagar
        System.out.printf("El total a pagar por los computadores es: $%.2f\n", totalConDescuento);

        // Cerrar el scanner
        scanner.close();*/
        
        
        //README: 6 Inversion de casa
        /*Scanner scanner = new Scanner(System.in);

        // Solicitar el monto total de la inversión
        System.out.print("Ingrese el monto total de la inversión necesaria para el negocio: ");
        double inversionTotal = scanner.nextDouble();

        // Solicitar el monto de la hipoteca
        System.out.print("Ingrese el monto que el banco le prestará por la hipoteca: ");
        double montoHipoteca = scanner.nextDouble();

        // Determinar la cantidad que deberá cubrir la persona y su socio
        double montoPersona = 0;
        double montoSocio = 0;
        double montoDesdeCuentaBancaria = 0;

        if (montoHipoteca < 1000000) {
            // La persona y el socio cubren el 50% cada uno del total de la inversión
            montoPersona = inversionTotal / 2;
            montoSocio = inversionTotal / 2;
            // La persona usa la hipoteca para cubrir parte de su 50%
            montoPersona -= montoHipoteca;
            // La diferencia se toma de la cuenta bancaria
            montoDesdeCuentaBancaria = montoPersona;
        } else {
            // La persona usa el 100% de la hipoteca
            montoPersona = montoHipoteca;
            // Si el monto de la hipoteca es menor que la inversión total, el resto se reparte
            if (montoHipoteca < inversionTotal) {
                double resto = inversionTotal - montoHipoteca;
                montoPersona += resto / 2;
                montoSocio += resto / 2;
            }
        }

        // Mostrar los resultados
        System.out.printf("El monto que deberá cubrir la persona es: $%.2f\n", montoPersona);
        System.out.printf("De los cuales $%.2f provienen de la hipoteca y $%.2f de la cuenta bancaria.\n", montoHipoteca, montoDesdeCuentaBancaria);
        System.out.printf("El monto que deberá cubrir el socio es: $%.2f\n", montoSocio);

        // Cerrar el scanner
        scanner.close();*/
        
        //REDME: 7 Promoción de supermercado
        /*Scanner scanner = new Scanner(System.in);

        // Definir la lista de productos en promoción
        String[] productosEnPromocion = new String[3];
        System.out.println("Ingrese los nombres de los 3 productos en promoción:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Producto %d: ", i + 1);
            productosEnPromocion[i] = scanner.nextLine().toLowerCase();
        }

        // Solicitar los productos comprados por el cliente
        String[] productosComprados = new String[2];
        double[] montosComprados = new double[2];
        System.out.println("Ingrese los productos comprados por el cliente y su monto:");
        for (int i = 0; i < 2; i++) {
            System.out.printf("Producto %d nombre: ", i + 1);
            productosComprados[i] = scanner.nextLine().toLowerCase();
            System.out.printf("Producto %d monto: ", i + 1);
            montosComprados[i] = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea
        }

        // Calcular el total de la compra
        double totalCompra = 0;
        for (double monto : montosComprados) {
            totalCompra += monto;
        }

        // Verificar si algún producto comprado está en la lista de promoción
        boolean tieneProductoPromocion = false;
        for (String productoComprado : productosComprados) {
            for (String productoPromocion : productosEnPromocion) {
                if (productoComprado.equals(productoPromocion)) {
                    tieneProductoPromocion = true;
                    break;
                }
            }
            if (tieneProductoPromocion) break;
        }

        // Determinar el descuento
        double descuento;
        if (tieneProductoPromocion) {
            descuento = 0.20; // 20% de descuento
        } else {
            descuento = 0.10; // 10% de descuento
        }

        // Calcular el monto del descuento
        double montoDescuento = totalCompra * descuento;

        // Mostrar el resultado
        System.out.printf("El monto total de la compra es: $%.2f\n", totalCompra);
        System.out.printf("El descuento aplicado es: %.2f%%\n", descuento * 100);
        System.out.printf("El monto a descontar es: $%.2f\n", montoDescuento);
        System.out.printf("El monto total a pagar después del descuento es: $%.2f\n", totalCompra - montoDescuento);

        // Cerrar el scanner
        scanner.close();*/
  
        //README: 8 Sueldo liquido
        /*Scanner scanner = new Scanner(System.in);

        // Solicitar la base líquida imponible
        System.out.print("Ingrese la base líquida imponible: ");
        double baseImponible = scanner.nextDouble();

        // Determinar el porcentaje de impuesto según la tabla
        double porcentajeImpuesto;
        if (baseImponible < 800000) {
            porcentajeImpuesto = 2.0;
        } else if (baseImponible <= 2000000) {
            porcentajeImpuesto = 4.0;
        } else {
            porcentajeImpuesto = 7.0;
        }

        // Calcular el valor del impuesto
        double valorImpuesto = (baseImponible * porcentajeImpuesto) / 100;

        // Mostrar los resultados
        System.out.printf("Porcentaje de impuesto: %.2f%%\n", porcentajeImpuesto);
        System.out.printf("Valor del impuesto a cancelar: $%.2f\n", valorImpuesto);

        // Cerrar el scanner
        scanner.close();*/
        
        //README: 9 Estanque
        /*Scanner scanner = new Scanner(System.in);

        // Solicitar el nivel de llenado mínimo
        System.out.print("Ingrese el nivel de llenado mínimo del estanque (en litros): ");
        double nivelMinimo = scanner.nextDouble();

        // Solicitar el nivel de llenado máximo
        System.out.print("Ingrese el nivel de llenado máximo del estanque (en litros): ");
        double nivelMaximo = scanner.nextDouble();

        // Solicitar el nivel de llenado actual
        System.out.print("Ingrese el nivel de llenado actual del estanque (en litros): ");
        double nivelActual = scanner.nextDouble();

        // Determinar el estado del nivel de llenado
        if (nivelActual < nivelMinimo) {
            double diferencia = nivelMinimo - nivelActual;
            System.out.printf("El nivel de llenado está por debajo del mínimo por %.2f litros.\n", diferencia);
        } else if (nivelActual > nivelMaximo) {
            double diferencia = nivelActual - nivelMaximo;
            System.out.printf("El nivel de llenado está por encima del máximo por %.2f litros.\n", diferencia);
        } else {
            double sobreMinimo = nivelActual - nivelMinimo;
            double bajoMaximo = nivelMaximo - nivelActual;
            System.out.printf("El nivel de llenado está entre el mínimo y el máximo.\n");
            System.out.printf("Está %.2f litros sobre el mínimo.\n", sobreMinimo);
            System.out.printf("Está %.2f litros por debajo del máximo.\n", bajoMaximo);
        }

        // Cerrar el scanner
        scanner.close();*/
    }
}
