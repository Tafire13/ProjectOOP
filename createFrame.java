
import java.awt.BorderLayout;
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
        setLocationRelativeTo(null);
        setTitle(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("icon.png"));
        setIconImage(icon.getImage());
    }

    public void setAboutFrame(Color color) {
        setTitle("About");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(1250, 800);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
    }

}
