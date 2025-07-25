
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class createFrame extends JFrame {

    public createFrame() {
        createButton cbt = new createButton();
        createPanel cpn = new createPanel();
        JPanel panel = cpn.getPanel();
        setLayout(new BorderLayout());
        setTitle("Graphical User Interface (GUI) Part I-II");
        setSize(500, 500);
        add(panel, BorderLayout.SOUTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

}
