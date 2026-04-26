package EXERCICE1_3;

class CompteEpargne extends CompteBancaire {
    public CompteEpargne(String numeroCompte, double solde) {
        super(numeroCompte, solde);
    }

    public void calculerInterets(double taux) {
        solde += solde * taux;
    }
}