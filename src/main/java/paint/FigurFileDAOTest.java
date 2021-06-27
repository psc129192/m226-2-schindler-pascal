package paint;

import org.junit.Before;
import org.junit.Test;
import paint.figuren.Figur;
import paint.figuren.Kreis;
import paint.figuren.Linie;
import paint.figuren.Rechteck;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class FigurFileDAOTest {
    private FigurDAO dao;
    private FigurParser parser;
    private Rechteck rechteck;
    private Linie linie;
    private Kreis kreis;

    @Before
    public void setUp() {
        dao = new FigurDAOStub();
        parser = new FigurParser(dao);
        rechteck = new Rechteck(10,10,50,20);
        linie = new Linie(60,30,120,120);
        kreis = new Kreis(100,100,40);
    }

    @Test
    public void test() {
        List<Figur> figuren = parser.parse();
        assertEquals(3, figuren.size());
        assertEquals(rechteck.getX(), figuren.get(0).getX());
        assertEquals(linie.getX(), figuren.get(1).getX());
        assertEquals(kreis.getX(), figuren.get(2).getX());
    }
}