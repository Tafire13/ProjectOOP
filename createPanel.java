
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class createPanel {

    private JPanel panel;

    public createPanel(JPanel panel) {
        this.panel = panel;
    }

    public void setPanel(Color color) {
        panel.setBackground(color);
    }

    public void setPanel(int width, int height, Color color) {
        panel.setPreferredSize(new Dimension(width, height));
        panel.setBackground(color);
    }

    public JPanel getPanel() {
        return this.panel;
    }

}
