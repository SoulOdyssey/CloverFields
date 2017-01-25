package cloverfields;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Display extends JFrame implements WindowListener {

    private JPanel gp;

    public Display() {

        gp = (JPanel) getGlassPane();
        gp.setVisible(true);
        gp.setLayout(new GridLayout(1, 1));
        this.setLayout(new GridLayout(1, 1));
//        gp.add(/* paint */);
//        this.add(/* key bindings */);

        this.addComponentListener(new ComponentListener() {

            public void componentHidden(ComponentEvent e) {

            }

            public void componentMoved(ComponentEvent e) {

            }

            public void componentResized(ComponentEvent e) {

            }

            public void componentShown(ComponentEvent e) {

            }
        });

    }

    public void close() {
        System.exit(0);
    }

    public void windowActivated(WindowEvent e) {

    }

    public void windowClosed(WindowEvent e) {

    }

    public void windowClosing(WindowEvent e) {
        close();
    }

    public void windowDeactivated(WindowEvent e) {

    }

    public void windowDeiconified(WindowEvent e) {

    }

    public void windowIconified(WindowEvent e) {

    }

    public void windowOpened(WindowEvent e) {

    }
}
