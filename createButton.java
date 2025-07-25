
import javax.swing.JButton;

public class createButton {

    public JButton[] getButton() {
        JButton button[] = new JButton[20];
        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton("" + (i + 1));
        }
        return button;
    }

}
