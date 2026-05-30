class Coche extends Vehiculo {
    int numeroDePuertas;

    public void mostrarCoche() {
        mostrarVehiculo();
        System.out.println("Puertas: " + numeroDePuertas);
    }
}