/*
Para la tarea se requiere un menú para administrar a los productos con las opciones: actualizar, eliminar, crear,
listar y salir.
Para la clase con el método main vamos a contar con un menú para poder seleccionar el tipo de operación, puede ser con la
clase Scanner indicando una lista con las opciones, cada opción asociada a un numero.
 */
package FlujosDeControl.Tareas;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class MenuOpcionesIterativo {
    public static void main(String[] args) {
        int opcionIndice = 0;
        Map<String, Integer> opciones = new HashMap();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Añadir", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        Object[] opArreglo = opciones.keySet().toArray(new String[0]);

        Object opcion = JOptionPane.showInputDialog(null,
                "Seleccione una Opción",
                "Mantenedor de Productos",
                JOptionPane.INFORMATION_MESSAGE, null, opArreglo,
                opArreglo[0]);

        if (opcion == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
        } else {
            opcionIndice = opciones.get(opcion.toString());
        }

        String mensaje = null;
        try {
            while(opcionIndice != 5){
                if (opcionIndice == 1) {
                    mensaje = "Usuario Actualizado Correctamente";
                    JOptionPane.showMessageDialog(null, mensaje);
                    System.out.println(mensaje);
                } else if (opcionIndice == 2) {
                    mensaje = "Usuario Eliminado Correctamente";
                    JOptionPane.showMessageDialog(null, mensaje);
                    System.out.println(mensaje);
                } else if (opcionIndice == 3) {
                    mensaje = "Usuario Agregado Correctamente";
                    JOptionPane.showMessageDialog(null, mensaje);
                    System.out.println(mensaje);
                } else if (opcionIndice == 4) {
                    mensaje = "Lista del Usuario";
                    JOptionPane.showMessageDialog(null, mensaje);
                    System.out.println(mensaje);
                }
                opcion = JOptionPane.showInputDialog(null,
                        "Seleccione una Opción",
                        "Mantenedor de Productos",
                        JOptionPane.INFORMATION_MESSAGE, null, opArreglo,
                        opArreglo[0]);

                if (opcion == null) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
                } else {
                    opcionIndice = opciones.get(opcion.toString());
                }
            }

        } catch (HeadlessException e) {
            throw new RuntimeException(e);
        }

        JOptionPane.showMessageDialog(null, "Saliendo de la Aplicación");
        System.out.println("Saliendo del Programa");


    }
}
