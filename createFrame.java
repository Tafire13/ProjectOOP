
import java.awt.Color;
import javax.swing.JFrame;

public class createFrame extends JFrame {

    Constant constant = new Constant();

    public void setFrame(Color color) {
        setSize(constant.width, constant.length);
        getContentPane().setBackground(color);
        setTitle("Graphical User Interface (GUI) Part I-II");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
