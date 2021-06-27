package paint.figuren;

import java.awt.*;

public class Rechteck extends Figur {
    private int breite;
    private int hoehe;

    public Rechteck(int x, int y, int breite, int hoehe) {
        super(x, y);
        this.setBreite(breite);
        this.setHoehe(hoehe);
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public int getHoehe() {
        return hoehe;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    @Override
    public void zeichnen(Graphics g) {
        g.drawRect(getX(),getY(),breite,hoehe);
    }
}
