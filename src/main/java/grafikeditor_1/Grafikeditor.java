package grafikeditor_1;

import grafikeditor_1.figuren.Rechteck;

public class Grafikeditor {
    private static final Display display = new Display();

    public static void main(String[] args) {
        display.hinzufuegen(new Rechteck(300,300,100,100));
        display.allesLoeschen();
        display.hinzufuegen(new Rechteck(400,300,100,100));
    }
}
