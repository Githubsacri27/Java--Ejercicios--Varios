package FlujosDeControl.Tareas;

import java.util.Scanner;

/*Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros,
usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar
el numero de veces (ingresado) para pedir el numero entero, entonces se requiere:
Calcular el menor número e imprimir el valor.
Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir " el numero
menor es igual o mayor que 10!".
 */

import java.util.Scanner;
public class CalcularNumeroMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número entero:");
        int numero = scanner.nextInt();

        int[] numeros = new int[1];
        numeros[0] = numero;

        int menor = numeros[0];

        System.out.println("El número introducido es: " + numero);

        if (menor < 10) {
            System.out.println("El número introducido es menor que 10!");
        } else {
            System.out.println("El número introducido es igual o mayor que 10!");
        }
    }
}
