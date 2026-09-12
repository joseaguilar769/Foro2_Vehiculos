import javax.swing.JOptionPane;
import java.util.ArrayList;
import modelo.Vehiculo;
import modelo.Automovil;
import modelo.Motocicleta;
import modelo.Camion;

public class Main {

    public static void main(String[] args) {

    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    int opcion;

    do {

        String menu = """
                SISTEMA DE GESTIÓN DE VEHÍCULOS
                AutoMundo S.A. de C.V.

                1. Registrar automóvil
                2. Registrar motocicleta
                3. Registrar camión
                4. Mostrar vehículos
                5. Buscar vehículo
                6. Eliminar vehículo
                7. Salir

                Seleccione una opción:
                """;

        opcion = Integer.parseInt(
                JOptionPane.showInputDialog(menu)
        );

        switch (opcion) {

            case 1:
                JOptionPane.showMessageDialog(null,
                        "Opción: Registrar automóvil");
                break;

            case 2:
             String codigo = JOptionPane.showInputDialog("Ingrese el código:");
             String marca = JOptionPane.showInputDialog("Ingrese la marca:");
             String modelo = JOptionPane.showInputDialog("Ingrese el modelo:");

            int anio = Integer.parseInt(
            JOptionPane.showInputDialog("Ingrese el año:")
            );

           double precio = Double.parseDouble(
           JOptionPane.showInputDialog("Ingrese el precio:")
            );
  
            int cantidadPuertas = Integer.parseInt(
            JOptionPane.showInputDialog("Ingrese la cantidad de puertas:")
            );

             String tipoCombustible = JOptionPane.showInputDialog(
             "Ingrese el tipo de combustible:"
            );

            Automovil automovil = new Automovil( codigo, marca, modelo, anio, precio, cantidadPuertas, tipoCombustible );

             vehiculos.add(automovil);

              JOptionPane.showMessageDialog(null,
             "Automóvil registrado correctamente.");
                break;

            case 3:
                JOptionPane.showMessageDialog(null,
                        "Opción: Registrar camión");
                break;

            case 4:
                JOptionPane.showMessageDialog(null,
                        "Opción: Mostrar vehículos");
                break;

            case 5:
                JOptionPane.showMessageDialog(null,
                        "Opción: Buscar vehículo");
                break;

            case 6:
                JOptionPane.showMessageDialog(null,
                        "Opción: Eliminar vehículo");
                break;

            case 7:
                JOptionPane.showMessageDialog(null,
                        "Programa finalizado.");
                break;

            default:
                JOptionPane.showMessageDialog(null,
                        "Opción no válida.");
        }

    } while (opcion != 7);
}
}