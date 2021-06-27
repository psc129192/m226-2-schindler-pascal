package paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
final class EditorFrame extends JFrame {
    private EditorControl editorControl = new EditorControl();

    public EditorFrame(int breite, int hoehe) {
        erzeugeUndSetzeEditorPanel();
        fensterEinmitten(breite, hoehe);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                editorControl.setFigurTyp(e.getKeyChar());
            }
        });
    }

    private void erzeugeUndSetzeEditorPanel() {
        JPanel panel = new EditorPanel(editorControl);
        Button rechteckBtn = new Button("Rechteck");
        Button kreisBtn = new Button("Kreis");
        Button linieBtn = new Button("Linie");
        Button dreieckBtn = new Button("Dreieck");

        panel.add(rechteckBtn);
        panel.add(kreisBtn);
        panel.add(linieBtn);
        panel.add(dreieckBtn);

        rechteckBtn.setFocusable(false);
        kreisBtn.setFocusable(false);
        linieBtn.setFocusable(false);
        dreieckBtn.setFocusable(false);

        rechteckBtn.addActionListener(e -> editorControl.setFigurTyp('r'));
        kreisBtn.addActionListener(e -> editorControl.setFigurTyp('k'));
        linieBtn.addActionListener(e -> editorControl.setFigurTyp('l'));
        dreieckBtn.addActionListener(e -> editorControl.setFigurTyp('d'));

        setContentPane(panel);
    }

    private void fensterEinmitten(int breite, int hoehe) {
        Dimension bildschirmGroesse = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle fensterAusschnitt = new Rectangle();
        fensterAusschnitt.width = breite;
        fensterAusschnitt.height = hoehe;
        fensterAusschnitt.x = (bildschirmGroesse.width - fensterAusschnitt.width) / 2;
        fensterAusschnitt.y = (bildschirmGroesse.height - fensterAusschnitt.height) / 2;
        setBounds(fensterAusschnitt);
    }

    public void setZeichnungInControl(Zeichnung zeichnung) {
        editorControl.setZeichnung(zeichnung);
    }
}
