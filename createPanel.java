
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public final class createPanel {

    public static JPanel create(int width, int height, Color color) {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(width, height));
        panel.setBackground(color);
        return panel;
    }
}
