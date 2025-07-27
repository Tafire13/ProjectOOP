
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainWindow {

    private Constant constant;
    private createFrame frame;
    private JPanel panelEast;
    private JPanel panelLeft;
    private JPanel panelMonitor;
    private JPanel panelMonitor2;
    private JButton OpenFile;
    private JButton About;
    private JTextField textField;

    public MainWindow() {
        this.frame = new createFrame();
        settingPanel();
        frame.setFrame(constant.gray);
        this.frame.setLayout(new BorderLayout());
        frame.add(panelEast, BorderLayout.EAST);
        frame.add(panelLeft, BorderLayout.WEST);
        frame.setVisible(true);
    }

    private void settingPanel() {
        this.constant = new Constant();
        this.panelEast = new JPanel();
        this.panelLeft = new JPanel();
        this.panelMonitor = new JPanel();
        this.panelMonitor2 = new JPanel();
    }

}
