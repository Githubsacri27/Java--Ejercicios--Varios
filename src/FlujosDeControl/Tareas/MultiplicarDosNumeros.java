package FlujosDeControl.Tareas;
import java.util.Scanner;
/*la variable i se inicializa en 1 al principio (int i = 1). Esto se hace porque se quiere repetir la suma del
primer número (num1) tantas veces como el valor del segundo número (num2).
Si i se inicializara en 0 (int i = 0), entonces se sumaría el valor de num1 num2 veces, incluyendo la suma en
el índice 0, lo que no sería correcto. Por ejemplo, si el usuario introduce num1 = 5 y num2 = 3, la suma
debería ser 5 + 5 + 5 = 15. Si i se inicializara en 0, entonces se sumaría 5 en el índice 0, lo que no tiene
sentido en este caso.
Por lo tanto, se inicializa i en 1 para asegurarse de que se sume el primer número a partir del índice 1 y que
se sume num1 exactamente num2 veces. En otras palabras, el bucle se repetirá num2 veces y en cada repetición se
sumará num1 a la variable resultado.
 */
public class MultiplicarDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entero1 =0;
        int entero2 =0;
        int resultado = 0;
        System.out.println("Introduzca el primer número entero");
        entero1 = scanner.nextInt();
        System.out.println("Introduzca el segundo número entero");
        entero2 = scanner.nextInt();

        for (int i =1; i <= entero2; i++){

            resultado += entero1;

        }
        System.out.println(resultado);

    }
}
