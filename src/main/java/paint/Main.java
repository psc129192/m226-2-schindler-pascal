package paint;

public class Main {
    private static final Display display = new Display();

    public static void main(String[] args) {
        Rechteck rechteck = new Rechteck(10,10,50,20);
        Rechteck rechteck2 = new Rechteck(100,100,100,40);
        Linie linie = new Linie(60,30,120,120);
        Kreis kreis = new Kreis(100,100,40);

        display.hinzufuegen(rechteck);
        display.hinzufuegen(rechteck2);
        display.hinzufuegen(linie);
        display.hinzufuegen(kreis);
    }
}
