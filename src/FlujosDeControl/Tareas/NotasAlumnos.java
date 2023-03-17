package FlujosDeControl.Tareas;

import java.util.Scanner;

/*Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). Mostrar el
 promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el
 promedio total.
Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar
los cálculos (contadores, sumas).
Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando
el programa.
 */
public class NotasAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota, sumaTotal = 0, Mayores = 0, Menores = 0;
        int cantidadNotas = 0, cantidadMayores = 0, cantidadMenores = 0, cantidadUnos = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Introduce la nota del examen " + i + " (1-7): ");
            nota = sc.nextDouble();

            if (nota == 0) {
                System.out.println("Error: la nota no es válida.");
                break;
            }

            sumaTotal += nota;
            cantidadNotas++;

            if (nota > 5) {
                Mayores += nota;
                cantidadMayores++;
            } else if (nota < 4) {
                Menores += nota;
                cantidadMenores++;
            }

            if (nota == 1) {
                cantidadUnos++;
            }
        }

        if (cantidadNotas == 0) {
            System.out.println("No se ingresaron notas.");
        } else {
            double promedioTotal = sumaTotal / cantidadNotas;
            double promedioMayores = cantidadMayores == 0 ? 0 : Mayores / cantidadMayores;
            double promedioMenores = cantidadMenores == 0 ? 0 : Menores / cantidadMenores;

            System.out.println("Promedio de notas mayores a 5: " + promedioMayores);
            System.out.println("Promedio de notas inferiores a 4: " + promedioMenores);
            System.out.println("Cantidad de notas 1: " + cantidadUnos);
            System.out.println("Promedio total: " + promedioTotal);
        }

    }
}
