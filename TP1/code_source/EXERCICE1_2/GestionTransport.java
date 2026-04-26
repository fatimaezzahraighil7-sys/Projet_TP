package EXERCICE1_2;

public class GestionTransport {
    public static void main(String[] args) {

        Vehicule v1 = new Voiture("Toyota", "Corolla", 2021, 4);
        Vehicule v2 = new Camion("Volvo", "FMX", 2019, 12.5);

        v1.afficherDetails();
        v2.afficherDetails();
    }
}