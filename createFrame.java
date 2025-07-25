
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class createFrame extends JFrame {

    Constant constant = new Constant();

    public createFrame() {
        setSize(constant.width, constant.length);
        setTitle("Graphical User Interface (GUI) Part I-II");
    }

    public void setFrame() {
        setLayout(new BorderLayout());
    }

    public void setFrame(JButton button[]) {
        setLayout(new GridLayout(constant.GridRow, constant.GridColum));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
