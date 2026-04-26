package Exercice1_1;

public class Zoo {
    public static void main(String[] args) {

        Animal tigre = new Mammifere("Tigre");
        Animal perroquet = new Oiseau("Perroquet");

        tigre.faireDuBruit();
        perroquet.faireDuBruit();

        //Réponse question 6
        Oiseau oiseau = (Oiseau) perroquet;
        oiseau.voler();
    }
}