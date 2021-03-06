package paint;

import paint.figuren.*;

import java.awt.Graphics;
import java.awt.Point;
import java.util.List;


final class EditorControl {
    private Zeichnung zeichnung;
    private char figurTyp;
    private Point ersterPunkt;

    public void allesNeuZeichnen(Graphics g) {
        zeichnung.zeichneFiguren(g);
    }

    public void setZeichnung(Zeichnung zeichnung) {
        this.zeichnung = zeichnung;
    }

    public void setFigurTyp(char figurTyp) {
        this.figurTyp = figurTyp;
    }

    public void setErsterPunkt(Point ersterPunkt) {
        this.ersterPunkt = ersterPunkt;
    }

    public void erzeugeFigurMitZweitemPunkt(Point zweiterPunkt) {
        switch (this.figurTyp) {
            case 'r':
                zeichnung.hinzufuegen(new Rechteck(ersterPunkt.x, ersterPunkt.y, zweiterPunkt.x - ersterPunkt.x, zweiterPunkt.y - ersterPunkt.y));
                break;
            case 'k':
                zeichnung.hinzufuegen(new Kreis(ersterPunkt.x, ersterPunkt.y, zweiterPunkt.x - ersterPunkt.x));
                break;
            case 'l':
                zeichnung.hinzufuegen(new Linie(ersterPunkt.x, ersterPunkt.y, zweiterPunkt.x, zweiterPunkt.y));
                break;
            case 'd':
                zeichnung.hinzufuegen(new Dreieck(ersterPunkt.x, ersterPunkt.y, zweiterPunkt.x, zweiterPunkt.y, ersterPunkt.x - (zweiterPunkt.x - ersterPunkt.x), zweiterPunkt.y));
                break;
        }

        Grafikeditor.frame.repaint();
    }

    public void loeschen() {
        zeichnung.loeschen();
        Grafikeditor.frame.repaint();
    }

    public void importieren() {
        FigurParser parser = new FigurParser(new FigurFileDAO());
        List<Figur> figurenAusFile = parser.parse();

        for (Figur figur : figurenAusFile) {
            zeichnung.hinzufuegen(figur);
        }
        Grafikeditor.frame.repaint();
    }
}