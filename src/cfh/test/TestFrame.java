package cfh.test;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFrame {
    
    public static void main(String[] args) {
        TestFrame test = new TestFrame();
        test.createGUI();
    }

    
    private JFrame frame;
    
    private void createGUI() {
        JPanel panel = new MainPanel();
        panel.setOpaque(true);
        
        frame = new JFrame("Test JNLP");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
