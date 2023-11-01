public class Main {
    public static void main(String[] args) {
        PoupeeRusse poupeeRusse1 = new PoupeeRusse(2);
        PoupeeRusse poupeeRusse2 = new PoupeeRusse(1);

        poupeeRusse1.ouvrir();

        poupeeRusse1.placerDans(poupeeRusse2);
        poupeeRusse1.fermer();
        poupeeRusse1.placerDans(poupeeRusse2);
        poupeeRusse1.ouvrir();
        poupeeRusse1.sortirDe();
        poupeeRusse1.fermer();
    }
}