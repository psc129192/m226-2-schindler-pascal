package paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

@SuppressWarnings("serial")
final class EditorPanel extends JPanel implements MouseMotionListener {
    private static int mouseX = 0;
    private static int mouseY = 0;
    private EditorControl editorControl;

    public EditorPanel(EditorControl control) {
        editorControl = control;
        addMouseMotionListener(this);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                editorControl.setErsterPunkt(e.getPoint());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                editorControl.erzeugeFigurMitZweitemPunkt(e.getPoint());
            }
        });
    }

    // Die paintComponent()-Methode wird automatisch aufgerufen, wenn irgendwer die repaint()-
    // Methode beim EditorFrame oder beim EditorPanel aufruft.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        editorControl.allesNeuZeichnen(g);
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        System.out.println(mouseX + " " + mouseY);
    }
}