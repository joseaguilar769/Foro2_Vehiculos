package modelo;

public class Camion extends Vehiculo {
    private double capacidadCarga;
    private int cantidadEjes;

    public Camion(String codigo, String marca, String modelo, int anio,
                  double precio, double capacidadCarga, int cantidadEjes) {
        super(codigo, marca, modelo, anio, precio);
        setCapacidadCarga(capacidadCarga);
        setCantidadEjes(cantidadEjes);
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        if (capacidadCarga > 0) {
            this.capacidadCarga = capacidadCarga;
        } else {
            System.out.println("Error: La capacidad de carga debe ser mayor a 0.");
            this.capacidadCarga = 1.0; 
        }
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        if (cantidadEjes >= 2) {
            this.cantidadEjes = cantidadEjes;
        } else {
            System.out.println("Error: Un camión debe tener al menos 2 ejes.");
            this.cantidadEjes = 2; 
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCapacidad de carga: " + capacidadCarga + " Toneladas" +
                "\nCantidad de ejes: " + cantidadEjes;
    }
}
