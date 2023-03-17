import java.util.Scanner;

public class MostrarOrdenadosDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int num1 = sc.nextInt();

        System.out.println("Introduzca el segundo número");
        int num2 = sc.nextInt();
        int resultado = 0;
        if(num1<num2) {
            resultado = num2;
            System.out.println("El orden es: " + resultado + " y luego: " +num1);
        } else {
            resultado =num1;
            System.out.println("El orden es: " + resultado + " y luego: " +num2);
        }


    }
}
