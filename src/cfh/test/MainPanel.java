package cfh.test;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class MainPanel extends JPanel {

    
    MainPanel() {
        super(new BorderLayout());
        
        JLabel label = new JLabel("Testing");
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label, BorderLayout.CENTER);
    }
}
