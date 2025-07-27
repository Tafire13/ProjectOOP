
import java.awt.Dimension;
import javax.swing.JTextField;

public class createJtextField extends JTextField {

    public createJtextField(int width, int height) {
        setPreferredSize(new Dimension(width, height));
    }
}
