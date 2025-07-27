
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
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
    private JPanel panelMonitor5;
    private JPanel squareYellow;
    private JLabel persenYellow;
    private JPanel squareRed;
    private JLabel persenRed;
    private JPanel squareGreen;
    private JLabel persenGreen;
    private JButton OpenFile;
    private JButton buttonAbout;
    private JButton Buttoncalculate;
    private JLabel dept;
    private createJtextField textField;

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
        this.textField = new createJtextField(200, 20);
        this.constant = new Constant();
        this.panelAbout = new JPanel();
        this.panelEast = new JPanel();
        this.panelWest = new JPanel();
        this.panelMonitor = new JPanel();
        this.panelMonitor2 = new JPanel();
        this.panelMonitor3 = new JPanel();
        this.panelMonitor4 = new JPanel();
        this.panelMonitor5 = new JPanel();
        this.squareYellow = new JPanel();
        this.squareRed = new JPanel();
        this.squareGreen = new JPanel();
        this.squareYellow = new JPanel();
        this.OpenFile = new JButton("Open File");
        this.buttonAbout = new JButton("About");
        this.persenRed = new JLabel("= 0%(Top Horizon)");
        this.persenYellow = new JLabel("< 50%(Base Horizon)");
        this.persenGreen = new JLabel("> 50%(Fluid Horizon)");
        this.dept = new JLabel("Enter the depth value :");
        this.Buttoncalculate = new JButton("Calculate");
        createPanel pabout = new createPanel(panelAbout);
        createPanel east = new createPanel(panelEast);
        createPanel west = new createPanel(panelWest);
        createPanel monitor = new createPanel(panelMonitor);
        createPanel monitor2 = new createPanel(panelMonitor2);
        createPanel monitor3 = new createPanel(panelMonitor3);
        createPanel monitor4 = new createPanel(panelMonitor4);
        createPanel monitor5 = new createPanel(panelMonitor5);
        createPanel YellowSquare = new createPanel(squareYellow);
        createPanel RedSquare = new createPanel(squareRed);
        createPanel GreenSquare = new createPanel(squareGreen);
        createButton open_File = new createButton();
        createButton about = new createButton();
        createButton calculate = new createButton();
        east.setPanel(400, 200, constant.lightGray3);
        west.setPanel(800, 200, constant.lightGray3);
        pabout.setPanel(200, 100, constant.lightGray3);
        monitor.setPanel(750, 600, constant.white);
        monitor2.setPanel(350, 150, constant.white);
        monitor3.setPanel(350, 200, constant.white);
        monitor4.setPanel(900, 90, constant.white);
        monitor5.setPanel(350, 200, constant.white);
        YellowSquare.setPanel(50, 50, constant.yellow);
        RedSquare.setPanel(50, 50, constant.red);
        GreenSquare.setPanel(50, 50, constant.green);
        //ใช้กำหนดขอบ
        panelEast.setBorder(BorderFactory.createLineBorder(constant.black));
        panelWest.setBorder(BorderFactory.createLineBorder(constant.black));
        panelMonitor.setBorder(BorderFactory.createLineBorder(constant.black));
        panelMonitor2.setBorder(BorderFactory.createLineBorder(constant.black));
        panelMonitor3.setBorder(BorderFactory.createLineBorder(constant.black));
        panelMonitor4.setBorder(BorderFactory.createLineBorder(constant.black));
        panelMonitor5.setBorder(BorderFactory.createLineBorder(constant.black));
        open_File.setButton(200, 20, OpenFile);
        OpenFile.setBackground(constant.lightGreen);
        about.setButton(200, 35, buttonAbout);
        buttonAbout.setBackground(constant.pink);
        calculate.setButton(200, 20, Buttoncalculate);
        textField.setHorizontalAlignment(JTextField.CENTER);
        Buttoncalculate.setBackground(constant.lightGreen);
        //
        panelWest.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 30));
        panelEast.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 30));
        panelAbout.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 5));
        panelMonitor3.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelMonitor4.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        panelMonitor5.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 50));
        panelWest.add(panelMonitor);
        panelEast.add(panelMonitor2);
        panelEast.add(panelMonitor3);
        panelMonitor3.add(dept);
        panelMonitor3.add(textField);
        panelMonitor3.add(Buttoncalculate);
        panelAbout.add(panelMonitor4);
        panelMonitor4.add(squareGreen);
        panelMonitor4.add(persenGreen);
        panelMonitor4.add(squareYellow);
        panelMonitor4.add(persenYellow);
        panelMonitor4.add(squareRed);
        panelMonitor4.add(persenRed);
        panelMonitor4.add(buttonAbout);
        panelEast.add(panelMonitor5);
        panelMonitor5.add(OpenFile);
    }

}
