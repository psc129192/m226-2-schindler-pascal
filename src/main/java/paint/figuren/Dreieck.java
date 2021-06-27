package paint.figuren;

import java.awt.*;

public class Dreieck extends Figur {
    private int[] xKoordinaten;
    private int[] yKoordinaten;
    private final int DIMENSION = 3;

    public Dreieck(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1);
        this.xKoordinaten = new int[]{x1, x2, x3};
        this.yKoordinaten = new int[]{y1, y2, y3};
    }

    @Override
    public void move(int deltaX, int deltaY) {
        super.move(deltaX, deltaY);
        for(int i = 0; i < DIMENSION; i++) {
            this.xKoordinaten[i] += deltaX;
            this.yKoordinaten[i] += deltaY;
        }
    }

    @Override
    public void zeichnen(Graphics g) {
        g.drawPolygon(xKoordinaten, yKoordinaten, DIMENSION);
    }
}
