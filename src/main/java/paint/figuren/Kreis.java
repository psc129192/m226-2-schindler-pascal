package paint.figuren;

import java.awt.*;

public class Kreis extends Figur {
    private int durchmesser;

    public Kreis(int x, int y, int durchmesser) {
        super(x, y);
        this.setDurchmesser(durchmesser);
    }

    public int getDurchmesser() {
        return durchmesser;
    }

    public void setDurchmesser(int durchmesser) {
        this.durchmesser = durchmesser;
    }

    @Override
    public void zeichnen(Graphics g) {
        g.drawOval(getX(), getY(), durchmesser, durchmesser);
    }
}
