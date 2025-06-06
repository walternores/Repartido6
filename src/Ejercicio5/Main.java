package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Vehiculo [] vehiculo = new Vehiculo[5];
        vehiculo[0] = new Auto();
        vehiculo[1] = new Motocicleta();
        vehiculo[2] = new Auto();
        vehiculo[3] = new Motocicleta();
        vehiculo[4] = new Auto();
        for (Vehiculo value : vehiculo) {
            System.out.println(value.velocidadMaxima());

        }

    }
}
