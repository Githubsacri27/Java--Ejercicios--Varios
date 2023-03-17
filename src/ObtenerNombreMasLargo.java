
import javax.swing.JOptionPane;

public class ObtenerNombreMasLargo {
    public static void main(String[] args) {

        String persona1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona2 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona3 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");

        if (persona1.length() > persona2.length()){
            System.out.println("La persona con el nombre mas largo es "+persona1 );
        } else if (persona1.length()>persona3.length()){
            System.out.println("La persona con el nombre mas largo es "+persona1 );
        } else if (persona2.length()>persona1.length()) {
            System.out.println("La persona con el nombre mas largo es "+persona2 );
        }else if (persona2.length()>persona3.length()) {
            System.out.println("La persona con el nombre mas largo es " + persona2);
        }else if (persona3.length()>persona1.length()) {
            System.out.println("La persona con el nombre mas largo es " + persona3);
        }else if (persona3.length()>persona2.length()) {
            System.out.println("La persona con el nombre mas largo es " + persona3);
        }

    }
}
