
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class createFrame extends JFrame {

    public createFrame() {
        setSize(1250, 800);
    }

    public void setFrame() {
        setLayout(new BorderLayout());
    }

    public void setFrame(JButton button[]) {
        setLayout(new GridLayout(20, 10));
    }

}
