
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;

public class createButton {

    public JButton create(String label, int width, int height, Color bgColor) {
        JButton button = new JButton(label);
        button.setPreferredSize(new Dimension(width, height));
        button.setBackground(bgColor);
        button.setFocusable(false);
        return button;
    }
}
