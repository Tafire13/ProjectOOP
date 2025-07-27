
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainWindow {

    private Constant constant;
    private createFrame frame;
    private JPanel panelEast;
    private JPanel panelWest;
    private JPanel panelAbout;
    private JPanel panelMonitor;
    private JPanel panelMonitor2;
    private JPanel panelMonitor3;
    private JPanel panelMonitor4;
    private JButton OpenFile;
    private JButton About;
    private JTextField textField;

    public MainWindow() {
        this.frame = new createFrame();
        settingPanel();
        frame.setLayout(new BorderLayout());
        frame.setFrame(constant.white);
        frame.add(panelEast, BorderLayout.EAST);
        frame.add(panelWest, BorderLayout.WEST);
        frame.add(panelAbout, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    private void settingPanel() {
        this.constant = new Constant();
        this.panelAbout = new JPanel();
        this.panelEast = new JPanel();
        this.panelWest = new JPanel();
        this.panelMonitor = new JPanel();
        this.panelMonitor2 = new JPanel();
        this.panelMonitor3 = new JPanel();
        this.panelMonitor4 = new JPanel();
        createPanel pabout = new createPanel(panelAbout);
        createPanel east = new createPanel(panelEast);
        createPanel west = new createPanel(panelWest);
        createPanel monitor = new createPanel(panelMonitor);
        createPanel monitor2 = new createPanel(panelMonitor2);
        createPanel monitor3 = new createPanel(panelMonitor3);
        createPanel monitor4 = new createPanel(panelMonitor4);
        east.setPanel(400, 200, constant.lightGray3);
        west.setPanel(800, 200, constant.lightGray3);
        pabout.setPanel(200, 100, constant.lightGray3);
        monitor.setPanel(750, 600, constant.white);
        monitor2.setPanel(350, 350, constant.white);
        monitor3.setPanel(350, 200, constant.white);
        monitor4.setPanel(750, 90, constant.white);
        //ใช้กำหนดขอบ
        panelEast.setBorder(BorderFactory.createLineBorder(constant.black));
        panelWest.setBorder(BorderFactory.createLineBorder(constant.black));
        panelMonitor.setBorder(BorderFactory.createLineBorder(constant.black));
        panelMonitor2.setBorder(BorderFactory.createLineBorder(constant.black));
        panelMonitor3.setBorder(BorderFactory.createLineBorder(constant.black));
        panelMonitor4.setBorder(BorderFactory.createLineBorder(constant.black));
        //
        panelWest.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 30));
        panelEast.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 30));
        panelAbout.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 5));
        panelWest.add(panelMonitor);
        panelEast.add(panelMonitor2);
        panelEast.add(panelMonitor3);
        panelAbout.add(panelMonitor4);
    }

}
