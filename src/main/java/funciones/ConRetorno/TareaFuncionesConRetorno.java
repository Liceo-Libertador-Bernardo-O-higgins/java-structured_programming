package funciones.ConRetorno;
/**
 *
 * @author amarianjel
 */
public class TareaFuncionesConRetorno {
    public static void main(String[] args){
        int num1 = 20;
        int num2 = 5;
        int suma = sumarDosNumeros(num1, num2);
        System.out.println(suma + " " + sumarDosNumeros(num1, num2));
    }
    // TODO: Función 1 - Sumar dos números
    private static int sumarDosNumeros(int numero1, int numero2){
        int resultado = numero1 + numero2;
        return resultado;
    }
    // TODO: Función 2 - Obtener el mayor de dos números
    // TODO: Función 3 - Calcular el área de un rectángulo
    // TODO: Función 4 - Calcular el área de un círculo
    // TODO: Función 5 - Determinar si un número es par
    // TODO: Función 6 - Obtener el valor absoluto de un número
    // TODO: Función 7 - Obtener la longitud de una cadena
    // TODO: Función 8 - Convertir grados Celsius a Fahrenheit
    // TODO: Función 9 - Obtener el menor de dos números
    // TODO: Función 10 - Obtener la potencia de un número ( (int) Math.pow(base, exponente);)
}