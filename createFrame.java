
import java.awt.Color;
import javax.swing.JFrame;

public class createFrame extends JFrame {

    Constant constant = new Constant();

    public createFrame() {
    }

    public void setFrame(Color color) {
        setSize(constant.width, constant.length);
        setBackground(color);
        setTitle("Graphical User Interface (GUI) Part I-II");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
