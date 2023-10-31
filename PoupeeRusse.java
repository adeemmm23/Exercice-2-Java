public class PoupeeRusse {
    private PoupeeRusse dansPoupeeRusse;
    private PoupeeRusse contientPoupeeRusse;
    private int taille;
    private boolean isOuvert = false;

    public PoupeeRusse(int taille) {
        this.taille = taille;
    }

    public int getTaille() {
        return this.taille;
    }

    public void ouvrir() {
        if (!this.isOuvert && this.dansPoupeeRusse == null) {
            this.isOuvert = true;
            System.out.println("Poupee ouvert!");
        } else {
            System.out.println("La poupee est deja ouvert");
        }
    }

    public void fermer() {
        if (this.isOuvert && this.dansPoupeeRusse == null) {
            this.isOuvert = false;
            System.out.println("Poupee fermée!");
        } else {
            System.out.println("La poupee est deja fermée");
        }
    }

    public void placerDans(PoupeeRusse contientPoupeeRusse) {
        if (contientPoupeeRusse.isOuvert && contientPoupeeRusse.taille > this.taille
                && this.contientPoupeeRusse.dansPoupeeRusse != null) {
            this.contientPoupeeRusse = contientPoupeeRusse;
            System.out.println("Poupee est placée");
        } else {
            System.out.println("la poupee est petit");
        }
    }

    public void sortirDe() {
        if (this.contientPoupeeRusse.isOuvert && this.contientPoupeeRusse != null) {
            this.contientPoupeeRusse = null;
            System.out.println("Poupee out");
        } else {
            System.out.println("il n'ya pas une poupe ou la poupe est ferme");
        }
    }
}
