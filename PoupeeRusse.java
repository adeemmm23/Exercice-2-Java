public class PoupeeRusse {
    private int taille;
    private boolean isOuvert = false;
    private PoupeeRusse dansPoupeeRusse;
    private PoupeeRusse contientPoupeeRusse;

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
        if (this.isOuvert && this.contientPoupeeRusse == null && contientPoupeeRusse.taille < this.taille) {
            this.contientPoupeeRusse = contientPoupeeRusse;
            System.out.println("Poupee de taille " + contientPoupeeRusse.taille + " placée dans la poupee de taille "
                    + this.taille);
        } else {
            if (!this.isOuvert) {
                System.out.println("La poupee est fermée");
            } else if (this.contientPoupeeRusse != null) {
                System.out.println("La poupee contient deja une poupee");
            } else {
                System.out.println("La poupee est trop grande");
            }
        }
    }

    public void sortirDe() {
        if (this.isOuvert && this.contientPoupeeRusse != null) {
            System.out.println("La poupee de taille " + this.taille + " a été sortie de la poupee de taille "
                    + this.contientPoupeeRusse.taille);
            this.contientPoupeeRusse = null;
        } else {
            if (!this.isOuvert) {
                System.out.println("La poupee est fermée");
            } else {
                System.out.println("La poupee ne contient pas de poupee");
            }
        }
    }
}
