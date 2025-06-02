package Ejercicio1;

public class Producto {

    public static void main(String[] args) {
        Producto p1 = new Producto();
        Producto p2 = new Producto("Borrador",35.0);
        Producto p3 = new Producto("Borrador",50.0, 10);

        System.out.println(p1.mostrarInfo()); // Inicializa con valores por defecto
        System.out.println(p2.mostrarInfo()); // Inicializa con valores indicados en parametros y stock a cero
        System.out.println(p3.mostrarInfo()); // Inicializa todos los atributos indicados en parametro
    }

    private String nombre;
    private double precio;
    private int stock;

    public Producto() {
        this.nombre = "Sin nombre";
        this.precio = 0.0;
        this.stock = 0;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = 0;
    }

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }


    public String mostrarInfo() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
