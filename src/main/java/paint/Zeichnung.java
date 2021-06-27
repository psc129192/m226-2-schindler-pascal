package paint;

import paint.figuren.Figur;

import java.awt.*;
import java.util.List;

public class Zeichnung {
    private List<Figur> figuren;

    public Zeichnung(List<Figur> figuren) {
        this.figuren = figuren;
    }

    public List<Figur> getFiguren() {
        return figuren;
    }

    public void zeichneFiguren(Graphics g) {
        for (Figur figur : this.figuren) {
            figur.zeichnen(g);
        }
    }

    public void hinzufuegen(Figur figur) {
        figuren.add(figur);
    }

    public void loeschen(Figur figur) {
        figuren.remove(figur);
    }
}