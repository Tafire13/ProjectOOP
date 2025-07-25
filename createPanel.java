
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JPanel;

public class createPanel {

    private JPanel panel;

    public createPanel(JPanel panel) {
        this.panel = panel;
    }

    public void setPanel() {
        panel.setLayout(new FlowLayout());
        panel.setPreferredSize(new Dimension(50, 50));
        panel.setBackground(Color.GRAY);
    }

    public JPanel getPanel() {
        return this.panel;
    }

}
