package cfh.test;

import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


@SuppressWarnings("serial")
public class TestApplet extends JApplet {

    @Override
    public void init() {
        SwingUtilities.invokeLater(this::createGUI);
    }
    
    private void createGUI() {
        JPanel panel = new MainPanel();
        panel.setOpaque(true);
        add(panel);
    }
}
