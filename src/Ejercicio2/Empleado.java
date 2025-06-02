package Ejercicio2;

import Ejercicio1.Producto;

public class Empleado {


    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado("Walter",22000.0);
        Empleado e3 = new Empleado("Andrea",25000.0, 5);

        System.out.println("Nombre de empleado: " + e1.nombre);
        System.out.println("Sueldo total: " + e1.calcularSueldoTotal());
        System.out.println();
        System.out.println("Nombre de empleado: " + e2.nombre);
        System.out.println("Sueldo total: " + e2.calcularSueldoTotal());
        System.out.println();
        System.out.println("Nombre de empleado: " + e3.nombre);
        System.out.println("Sueldo total: " + e3.calcularSueldoTotal());

    }


    private String nombre;
    private double sueldoBase;
    private int horasExtras;


    public double  calcularSueldoTotal(){
        return sueldoBase+(250*horasExtras);
    }

    public Empleado() {
        this.nombre = "Sin nombre";
        this.sueldoBase = 0.0;
        this.horasExtras = 0;
    }
    public Empleado(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.horasExtras = 0;
    }

    public Empleado(String nombre, double sueldoBase, int horasExtras) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.horasExtras = horasExtras;
    }
}
