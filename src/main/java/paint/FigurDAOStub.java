package paint;

public class FigurDAOStub implements FigurDAO {
    private String[] testFiguren = {
            "Rechteck,10,10,50,20",
            "Linie,60,30,120,120",
            "Kreis,100,100,40"
    };
    private int currentFigur = 0;

    @Override
    public String[] readNextFigurData() {
        if(currentFigur < testFiguren.length) {
            String[] figurData = testFiguren[currentFigur].split(",");
            currentFigur++;
            return figurData;
        }
        return null;
    }
}
