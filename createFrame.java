
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class createFrame extends JFrame {

    Constant constant = new Constant();

    public void setFrame(Color color, String label) {
        setSize(constant.width, constant.length);
        getContentPane().setBackground(color);
        setUndecorated(false);
        setResizable(false);
        setTitle(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("icon.png"));
        setIconImage(icon.getImage());
    }

    public void setAboutFrame(Color color) {
        setSize(constant.width, constant.length);
        getContentPane().setBackground(color);
        setUndecorated(false);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("About");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}
