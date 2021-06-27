package paint;

import paint.figuren.*;

import java.util.ArrayList;
import java.util.List;

public class Grafikeditor {
    public static List<Figur> figuren = new ArrayList<>();
    @SuppressWarnings("unused")
    public static EditorFrame frame = new EditorFrame(800, 600);

    public static void main(String[] args) {
        new Grafikeditor();
    }

    private Grafikeditor() {
        Rechteck rechteck = new Rechteck(10, 10, 50, 20);
        Rechteck rechteck2 = new Rechteck(100, 100, 100, 40);
        Linie linie = new Linie(60, 30, 120, 120);
        Kreis kreis = new Kreis(100, 100, 40);
        Dreieck dreieck = new Dreieck(-50, -50, 200, 50, 25, 100);

        rechteck.move(100, 100);
        linie.move(100, 100);
        dreieck.move(50, 50);

        List<Figur> figuren = new ArrayList<>();
        figuren.add(rechteck);
        figuren.add(rechteck2);
        figuren.add(linie);
        figuren.add(kreis);
        figuren.add(dreieck);

        Zeichnung zeichnung = new Zeichnung(figuren);

        frame.setZeichnungInControl(zeichnung);

        frame.repaint();
    }
}