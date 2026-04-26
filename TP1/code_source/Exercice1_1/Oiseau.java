package Exercice1_1;

class Oiseau extends Animal {
    public Oiseau(String nom) {
        super(nom);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " chante.");
    }

    //  Réponse question 5
    public void voler() {
        System.out.println(getNom() + " vole.");
    }
}