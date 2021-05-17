package grafikeditor_2;

import grafikeditor_2.figuren.Kreis;
import grafikeditor_2.figuren.Linie;
import grafikeditor_2.figuren.Rechteck;

public class Grafikeditor {
    private static final Display display = new Display();

    public static void main(String[] args) {
        Linie l = new Linie(100, 100,200,200);
        Rechteck r = new Rechteck(200,200,50,50);
        Kreis k = new Kreis(300,300, 10);

        display.hinzufuegen(l);

        //TODO: Draw Methode für Rechteck
        display.hinzufuegen(r);

        //TODO: Draw Methode für Kreis
        display.hinzufuegen(k);

        try {
            System.out.println("Warte 5 Sekunden vor dem verschieben");
            Thread.sleep(5000);
        }
        catch (Exception e){
            System.out.println("Warten unterbrochen");
        }

        System.out.println("Verschiebe figuren");


        l.move(100,200);
        r.move(100,200);
        k.move(100,200);

        display.repaint();
    }
}
