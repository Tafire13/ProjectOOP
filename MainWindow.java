
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame {

    public MainWindow() {
        JPanel panelSouth = new JPanel();
        JPanel panelEast = new JPanel();
        JPanel panelWest = new JPanel();
        JPanel panel = new JPanel(new GridLayout(10, 20));
        createFrame frame = new createFrame();
        frame.setFrame();
        createPanel South = new createPanel(panelSouth);
        createPanel East = new createPanel(panelEast);
        createPanel West = new createPanel(panelWest);
        createButton cbtt = new createButton();
        JButton button[] = cbtt.getAllButton();
        for (int i = 0; i < button.length; i++) {
            panel.add(button[i]);
        }
        JButton OpenFile = cbtt.getButton();
        South.setPanel();
        East.setPanel();
        West.setPanel();
        frame.add(panel, BorderLayout.CENTER);
        frame.add(panelSouth, BorderLayout.SOUTH);
        frame.add(panelEast, BorderLayout.EAST);
        frame.add(panelWest, BorderLayout.WEST);
        setTitle("Graphical User Interface (GUI) Part I-II");
        panelSouth.add(OpenFile);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
