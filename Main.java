public class Main {
    public static void main(String[] args) {
        PoupeeRusse poupeeRusse1 = new PoupeeRusse(2);
        PoupeeRusse poupeeRusse2 = new PoupeeRusse(1);

        poupeeRusse1.placerDans(poupeeRusse2);
        poupeeRusse2.placerDans(poupeeRusse1);
    }
}