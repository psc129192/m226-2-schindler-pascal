package paint.figuren;

import java.awt.*;

public class Dreieck extends Figur {
    private Point y;
    private Point z;

    public Dreieck(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1);
        this.y = new Point(x2, y2);
        this.z = new Point(x3, y3);
    }

    @Override
    public void move(int deltaX, int deltaY) {
        super.move(deltaX, deltaY);
        this.y.move(deltaX, deltaY);
        this.z.move(deltaX, deltaY);
    }

    @Override
    public void zeichnen(Graphics g) {
        g.drawLine(super.x, super.y, this.y.x, this.y.y);
        g.drawLine(this.y.x, this.y.y, this.z.x, this.z.y);
        g.drawLine(this.z.x, this.z.y, super.x, super.y);
    }
}
