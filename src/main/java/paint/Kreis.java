package paint;

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
}
