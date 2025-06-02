package Ejercicio3;

import Ejercicio1.Producto;

public class Conversor {

    public static void main(String[] args) {
        Conversor c1 = new Conversor();
        double kilogramo=1.0;
        double metros=1;
        double celsius=30;

        System.out.println(kilogramo+" kilogramos a gramos: "+ c1.convertir(kilogramo,"peso"));
        System.out.println(metros+" metros a centimetros: "+c1.convertir(metros)); // metro a km
        System.out.println(celsius+" grados celsius a fahrenheit: "+c1.convertir(celsius,true));
    }


    // kilogramos a gramos
    public double convertir(double kilogramos, String tipo){
        if(tipo.equals("peso")){
            return kilogramos*1000;
        }else{
            return kilogramos;
        }
    }

    // metros a centimetros
    public double convertir(double metros){
        return metros*100;
    }

    // celsius a fahrenheit
    public double convertir(double temperatura, boolean esTemperatura){
        if(esTemperatura==true){
            return  (temperatura * 9/5) + 32;
        }else{
            return temperatura;
        }
    }
}
