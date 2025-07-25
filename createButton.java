
import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;

public class createButton {

    private JButton OpenFile;

    public createButton() {
        this.OpenFile = new JButton("OMG mang kuuuuuuuuuuuuuuu");
    }

    public void setButton() {
    }

    public JButton getButton() {
        return this.OpenFile;
    }

    public JButton[] getAllButton() {
        JButton button[] = new JButton[200];
        Color color[] = {Color.red, Color.green, Color.YELLOW};
        Random random = new Random();
        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton();
            int ColorRandom = random.nextInt(color.length);
            button[i].setBackground(color[ColorRandom]);
        }
        return button;
    }

}
