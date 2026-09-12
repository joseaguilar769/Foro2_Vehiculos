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

            case 2:

            String codigoMoto = JOptionPane.showInputDialog("Ingrese el código:");
            String marcaMoto = JOptionPane.showInputDialog("Ingrese la marca:");
            String modeloMoto = JOptionPane.showInputDialog("Ingrese el modelo:");

            int anioMoto = Integer.parseInt(
            JOptionPane.showInputDialog("Ingrese el año:")
            );

            double precioMoto = Double.parseDouble(
            JOptionPane.showInputDialog("Ingrese el precio:")
            );

              int cilindraje = Integer.parseInt(
            JOptionPane.showInputDialog("Ingrese el cilindraje:")
            );

              String tipoMotocicleta = JOptionPane.showInputDialog(
            "Ingrese el tipo de motocicleta:"
            );

            Motocicleta motocicleta = new Motocicleta(
            codigoMoto,
            marcaMoto,
            modeloMoto,
            anioMoto,
            precioMoto,
            cilindraje,
            tipoMotocicleta
            );

             vehiculos.add(motocicleta);

             JOptionPane.showMessageDialog(null,
            "Motocicleta registrada correctamente.");

            break;
             

            case 3:

            String codigoCamion = JOptionPane.showInputDialog("Ingrese el código:");
            String marcaCamion = JOptionPane.showInputDialog("Ingrese la marca:");
            String modeloCamion = JOptionPane.showInputDialog("Ingrese el modelo:");

            int anioCamion = Integer.parseInt(
            JOptionPane.showInputDialog("Ingrese el año:")
            );

            double precioCamion = Double.parseDouble(
            JOptionPane.showInputDialog("Ingrese el precio:")
            );

            double capacidadCarga = Double.parseDouble(
            JOptionPane.showInputDialog("Ingrese la capacidad de carga en toneladas:")
            );

            int cantidadEjes = Integer.parseInt(
            JOptionPane.showInputDialog("Ingrese la cantidad de ejes:")
            );

            Camion camion = new Camion(
            codigoCamion,
            marcaCamion,
            modeloCamion,
            anioCamion,
            precioCamion,
            capacidadCarga,
            cantidadEjes
            );

             vehiculos.add(camion);

             JOptionPane.showMessageDialog(null,
            "Camión registrado correctamente.");

            break;

            case 4:

           if (vehiculos.isEmpty()) {

           JOptionPane.showMessageDialog(null,
                "No hay vehículos registrados.");

            } else {

            String lista = "";

            for (Vehiculo vehiculo : vehiculos) {

            lista += vehiculo.toString();
            lista += "\n-------------------------\n";
        }

        JOptionPane.showMessageDialog(null, lista);
        }

        break;

            case 5:

            String codigoBuscar = JOptionPane.showInputDialog(
            "Ingrese el código del vehículo:"
            );

            boolean encontrado = false;

            for (Vehiculo vehiculo : vehiculos) {

            if (vehiculo.getCodigo().equalsIgnoreCase(codigoBuscar)) {

            JOptionPane.showMessageDialog(null,
                    vehiculo.toString());

            encontrado = true;
            break;
            }
           }

            if (!encontrado) {

            JOptionPane.showMessageDialog(null,
                "No se encontró ningún vehículo con ese código.");
          }

            break;

            case 6:

            String codigoEliminar = JOptionPane.showInputDialog(
            "Ingrese el código del vehículo que desea eliminar:"
            );

            boolean eliminado = false;

            for (int i = 0; i < vehiculos.size(); i++) {

            if (vehiculos.get(i).getCodigo().equalsIgnoreCase(codigoEliminar)) {

            vehiculos.remove(i);

            JOptionPane.showMessageDialog(null,
                    "Vehículo eliminado correctamente.");

            eliminado = true;
            break;
            }
            }

         if (!eliminado) {

        JOptionPane.showMessageDialog(null,
                "No se encontró ningún vehículo con ese código.");
            }

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