
import java.awt.Dimension;
import javax.swing.JButton;

public class createButton {

    private JButton button;

    public createButton() {
        this.button = new JButton();
    }

    public void setButton(int width, int height, JButton button) {
        button.setPreferredSize(new Dimension(width, height));
        button.setFocusable(false);
    }

    public JButton getButton(String label) {
        this.button = new JButton(label);
        return button;
    }

}
