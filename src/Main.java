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
                JOptionPane.showMessageDialog(null,
                        "Opción: Registrar motocicleta");
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