
import java.awt.Dimension;
import javax.swing.JPanel;

public class createPanel {

    public JPanel getPanel() {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(50, 50));
        return panel;
    }
}
