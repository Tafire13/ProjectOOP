
import java.awt.Color;
import javax.swing.JButton;

public class createButton {

    private JButton button;

    public createButton() {
        this.button = new JButton();
    }

    public void setButton(Color color) {
        button.setBackground(color);
    }

    public JButton getButton(String label) {
        this.button = new JButton(label);
        return button;
    }

}
