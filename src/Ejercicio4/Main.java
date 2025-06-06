package Ejercicio4;

public class Main {

    public static void main(String[] args) {
        /*
        Animal perro = new Perro();
        Animal gato = new Gato();

        perro.hacerSonido();
        gato.hacerSonido();
        */
        Animal [] animalito = new Animal[5];
        animalito[0] = new Perro();
        animalito[1] = new Gato();
        animalito[2] = new Perro();
        animalito[3] = new Gato();
        animalito[4] = new Perro();

        for (Animal animal : animalito) {
            animal.hacerSonido();
        }

    }


}
