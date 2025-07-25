
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class createPanel {

    private JPanel panel;

    public createPanel(JPanel panel) {
        this.panel = panel;
    }

    public void setPanel() {
        panel.setPreferredSize(new Dimension(50, 50));
        panel.setBackground(Color.GRAY);
    }

    public JPanel getPanel() {
        return this.panel;
    }

}
