
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class createFrame extends JFrame {

    Constant constant = new Constant();

    public void setFrame(Color color) {
        setSize(constant.width, constant.length);
        getContentPane().setBackground(color);
        setUndecorated(true);
        setResizable(false);
        setTitle("Graphical User Interface (GUI) Part I-II");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("icon.png"));
        setIconImage(icon.getImage());
    }

}
