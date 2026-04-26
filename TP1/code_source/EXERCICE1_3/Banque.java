package EXERCICE1_3;

public class Banque {
    public static void main(String[] args) {

        CompteCourant cc = new CompteCourant("C1", 1000);
        CompteEpargne ce = new CompteEpargne("E1", 2000);

        cc.deposer(500);
        cc.retirer(300);

        ce.calculerInterets(0.05);

        System.out.println("Solde CC: " + cc.solde);
        System.out.println("Solde CE: " + ce.solde);
    }
}