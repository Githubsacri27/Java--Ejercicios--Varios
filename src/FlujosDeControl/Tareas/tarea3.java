package FlujosDeControl.Tareas;

public class tarea3 {
    public static void main(String[] args) {
//Se requiere desarrollar un programa que reciba los nombres de los integrantes de tu familia y formatearlos
        String nombre1 = "andres";
        String nombre2 = "Maria";
        String nombre3 = "Pepe";

        System.out.println(nombre1.toUpperCase().charAt(1) + "." + nombre1.charAt(4)+nombre1.charAt(5));
        System.out.println(nombre2.toUpperCase().charAt(1) + "." + nombre2.charAt(3)+nombre2.charAt(4));
        System.out.println(nombre3.toUpperCase().charAt(1) + "." + nombre3.charAt(2)+nombre3.charAt(3));
    }
}
