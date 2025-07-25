
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class createFrame extends JFrame {

    public createFrame() {
        setSize(1250, 800);
        setTitle("Graphical User Interface (GUI) Part I-II");
    }

    public void setFrame() {
        setLayout(new BorderLayout());
    }

    public void setFrame(JButton button[]) {
        setLayout(new GridLayout(20, 10));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
