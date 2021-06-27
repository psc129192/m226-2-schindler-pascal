package paint;

import java.util.ArrayList;

public class Main {
    private static final Display display = new Display();

    public static void main(String[] args) {
        Rechteck rechteck = new Rechteck(10,10,50,20);
        Rechteck rechteck2 = new Rechteck(100,100,100,40);
        Linie linie = new Linie(60,30,120,120);
        Kreis kreis = new Kreis(100,100,40);
        Dreieck dreieck = new Dreieck(-50,-50,200,50,25,100);

        rechteck.move(100,100);
        linie.move(100,100);
        dreieck.move(50,50);

        ArrayList<Figur> figuren = new ArrayList<>();
        figuren.add(rechteck);
        figuren.add(rechteck2);
        figuren.add(linie);
        figuren.add(kreis);
        figuren.add(dreieck);

        Zeichnung zeichnung = new Zeichnung(figuren);

        display.setZeichnung(zeichnung);
    }
}
