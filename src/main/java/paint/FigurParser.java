package paint;

import paint.figuren.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FigurParser {
    private FigurDAO dao;

    public FigurParser(FigurDAO dao) {
        this.dao = dao;
    }

    public List<Figur> parse() {
        List<Figur> figuren = new ArrayList<Figur>();
        String[] figurData = dao.readNextFigurData();
        while (figurData != null) {
            String figurTyp = figurData[0];
            int x = Integer.valueOf(figurData[1]);
            int y = Integer.valueOf(figurData[2]);
            switch (figurTyp) {
                case "Rechteck":
                    int breite = Integer.valueOf(figurData[3]);
                    int hoehe = Integer.valueOf(figurData[4]);
                    figuren.add(new Rechteck(x, y, breite, hoehe));
                    break;
                case "Kreis":
                    int durchmesser = Integer.valueOf(figurData[3]);
                    figuren.add(new Kreis(x, y, durchmesser));
                    break;
                case "Linie":
                    int endx = Integer.valueOf(figurData[3]);
                    int endy = Integer.valueOf(figurData[4]);
                    figuren.add(new Linie(x, y, endx, endy));
                    break;
                case "Dreieck":
                    Point pointY = new Point(Integer.valueOf(figurData[3]), Integer.valueOf(figurData[4]));
                    Point pointZ = new Point(Integer.valueOf(figurData[5]), Integer.valueOf(figurData[6]));
                    figuren.add(new Dreieck(x,y,pointY.x, pointY.y, pointZ.x, pointZ.y));
                    break;
            }
            figurData = dao.readNextFigurData();
        }
        return figuren;
    }
}
