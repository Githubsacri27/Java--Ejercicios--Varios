/*Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que
pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
La medida o capacidad actual del estanque puede ser en tipo double,
para una mejor precisión, pero tambien puede ser del tipo int.

Si la capacidad actual es 70 litros: imprimir Estanque lleno
Si está entre 60 y menor a 70: imprimir Estanque casi lleno
Si está entre 40 y menor a 60: imprimir Estanque  3/4
Si está entre 35 y menor a 40: imprimir Medio Estanque
Si está entre 20 y menor a 35: imprimir Suficiente
Si está entre 1 y menor a 20: imprimir Insuficiente*/
import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int capacidaddeposito;

        System.out.println("Introduzca los litros actuales del deposito ");
         capacidaddeposito = sc.nextInt();

         if (capacidaddeposito >= 60 && capacidaddeposito <= 70) {
            System.out.println("estado = " + "Estanque lleno");
        } if (capacidaddeposito >= 40 && capacidaddeposito<60){
            System.out.println("estado = " +"Estanque  3/4");
        } else if (capacidaddeposito >= 35 && capacidaddeposito<40){
            System.out.println("estado = " +"Medio estanque");
        } else if (capacidaddeposito >= 20 && capacidaddeposito<35){
            System.out.println("estado = " +"Estanque suficiente");
        } else if (capacidaddeposito >= 1 && capacidaddeposito<20){
            System.out.println("estado = " +"Estanque  Insuficiente");
        }else if (capacidaddeposito >70){
            System.out.println(" Error: El deposito solo tiene capacidad para 70 litros");
        }

    }
}
