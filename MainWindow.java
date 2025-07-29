
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainWindow {

    private Constant constant = new Constant();
    public createFrame mainFrame = new createFrame();
    private componentPanel cPanel = new componentPanel();
    private createFrame aboutFrame = new createFrame();
    private JLabel persenGreen;
    private JLabel persenYellow;
    private JPanel panelInsertImage[] = new JPanel[3];
    private JLabel persenRed;
    private JButton buttonData[] = new JButton[3];
    private JButton OpenFile;
    private JButton buttonAbout;
    private JButton buttonExit;
    private JButton buttonBack;
    private JButton Buttoncalculate;
    private JLabel dept;
    private JLabel aboutLabel;
    private createJtextField textField;
    private ImageIcon[] icons = {
        new ImageIcon("c.JPG"),
        new ImageIcon("q2.JPG"),
        new ImageIcon("p.JPG")
    };

    public MainWindow() {
        settingPanel();
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setFrame(constant.white, "Project OOP");
        mainFrame.add(cPanel.panelEast, BorderLayout.EAST);
        mainFrame.add(cPanel.panelWest, BorderLayout.WEST);
        mainFrame.add(cPanel.panelSquare, BorderLayout.SOUTH);
        mainFrame.setVisible(true);
    }

    private void settingPanel() {
        initLabel();
        initButtons();
        initText();
        initLegendSquares();
        initPanelStyles();
        initLayout();
        initMonitorGrid();
        setButtonExit();
        setBUttonAbout();
        setButtonBack();
        setButtonData();
    }

    private void initButtons() {
        createButton btnFactory = new createButton();
        OpenFile = btnFactory.create("Open File", 200, 20, constant.lightBlue);
        buttonAbout = btnFactory.create("About", 150, 35, constant.pink);
        buttonExit = btnFactory.create("Exit", 150, 35, constant.red);
        buttonBack = btnFactory.create("Back", 200, 60, constant.red);
        Buttoncalculate = btnFactory.create("Calculate", 200, 20, constant.lightGreen);
        for (int i = 0; i < buttonData.length; i++) {
            Image img = icons[i].getImage();

            Image scaledImg = img.getScaledInstance(350, 400, Image.SCALE_SMOOTH);

            ImageIcon scaledIcon = new ImageIcon(scaledImg);
            buttonData[i] = btnFactory.create("", 1, 1, constant.white);
            buttonData[i].setIcon(scaledIcon);
        }
    }

    private void initLabel() {
        this.persenRed = new JLabel("= 0%(Top Horizon)");
        this.persenYellow = new JLabel("< 50%(Base Horizon)");
        this.persenGreen = new JLabel("> 50%(Fluid Horizon)");
        this.dept = new JLabel("Enter the depth value :");
        this.aboutLabel = new JLabel("About Group");
    }

    private void initText() {
        this.textField = new createJtextField(210, 30);
        this.aboutLabel.setFont(new Font("Tahoma", Font.BOLD, 64));
    }

    private void initLayout() {
        cPanel.panelWest.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 30));
        cPanel.panelEast.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 30));
        cPanel.panelSouth.setLayout(new BorderLayout());
        cPanel.panelNorth.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));
        cPanel.panelSquare.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));
        cPanel.panelMonitor.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 100));
        cPanel.panelMonitor3.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        cPanel.panelMonitor4.setLayout(new FlowLayout(FlowLayout.LEFT, 40, 20));
        cPanel.panelMonitor5.setLayout(new BorderLayout());
        cPanel.panelMonitor6.setLayout(new GridLayout(10, 20));
        cPanel.panelMonitor7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
        cPanel.panelImage.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 70));
        textField.setHorizontalAlignment(textField.CENTER);
        cPanel.panelMonitor.add(cPanel.panelMonitor6);
        cPanel.panelMonitor3.add(dept);
        cPanel.panelMonitor3.add(textField);
        cPanel.panelMonitor3.add(Buttoncalculate);
        cPanel.panelSquare.add(cPanel.panelMonitor4);
        cPanel.panelMonitor4.add(cPanel.squareGreen);
        cPanel.panelMonitor4.add(persenGreen);
        cPanel.panelMonitor4.add(cPanel.squareYellow);
        cPanel.panelMonitor4.add(persenYellow);
        cPanel.panelMonitor4.add(cPanel.squareRed);
        cPanel.panelMonitor4.add(persenRed);
        cPanel.panelMonitor4.add(cPanel.panelMonitor7);
        cPanel.panelMonitor5.add(OpenFile);
        cPanel.panelMonitor7.add(buttonAbout);
        cPanel.panelMonitor7.add(buttonExit);
        cPanel.panelWest.add(cPanel.panelMonitor);
        cPanel.panelEast.add(cPanel.panelMonitor2);
        cPanel.panelEast.add(cPanel.panelMonitor3);
        cPanel.panelEast.add(cPanel.panelMonitor5);
        cPanel.panelNorth.add(aboutLabel);
        cPanel.panelSouth.add(buttonBack);
        for (int i = 0; i < panelInsertImage.length; i++) {
            cPanel.panelImage.add(panelInsertImage[i]);
            panelInsertImage[i].setLayout(new BorderLayout());
            panelInsertImage[i].add(buttonData[i]);
        }
    }

    private void initLegendSquares() {
        cPanel.squareGreen = createPanel.create(50, 50, constant.green);
        cPanel.squareYellow = createPanel.create(50, 50, constant.yellow);
        cPanel.squareRed = createPanel.create(50, 50, constant.red);
    }

    private void initPanelStyles() {
        cPanel.panelEast = createPanel.create(400, 200, constant.lightGray3);
        cPanel.panelWest = createPanel.create(900, 200, constant.lightGray3);
        cPanel.panelSouth = createPanel.create(200, 100, constant.white);
        cPanel.panelNorth = createPanel.create(1100, 100, constant.white);
        cPanel.panelSquare = createPanel.create(200, 100, constant.lightGray3);
        cPanel.panelMonitor = createPanel.create(810, 600, constant.white);
        cPanel.panelMonitor2 = createPanel.create(350, 250, constant.white);
        cPanel.panelMonitor3 = createPanel.create(350, 200, constant.white);
        cPanel.panelMonitor4 = createPanel.create(1200, 90, constant.white);
        cPanel.panelMonitor5 = createPanel.create(350, 100, constant.white);
        cPanel.panelMonitor6 = createPanel.create(790, 395, constant.softBlue);
        cPanel.panelMonitor7 = createPanel.create(350, 55, constant.white);
        cPanel.panelImage = createPanel.create(700, 800, constant.pink);
        for (int i = 0; i < panelInsertImage.length; i++) {
            panelInsertImage[i] = createPanel.create(350, 400, constant.white);
        }
    }

    private void initMonitorGrid() {
        Color[] colors = {constant.red, constant.yellow, constant.green};
        Random rand = new Random();
        for (int i = 0; i < 200; i++) {
            JButton button = new JButton();
            button.setBackground(colors[rand.nextInt(colors.length)]);
            button.setFocusable(false);
            cPanel.panelMonitor6.add(button);
        }
    }

    public void setButtonExit() {
        buttonExit.addActionListener(e -> {
            int choice = JOptionPane.showConfirmDialog(
                    null,
                    "Are you sure you want to leave?",
                    "Confirm exit",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.ERROR_MESSAGE
            );
            if (choice == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });
    }

    public void setBUttonAbout() {
        buttonAbout.addActionListener(e -> {
            mainFrame.dispose();
            aboutFrame.setAboutFrame(constant.lightBlue);
            aboutFrame.add(cPanel.panelSouth, BorderLayout.SOUTH);
            aboutFrame.add(cPanel.panelImage, BorderLayout.CENTER);
            aboutFrame.add(cPanel.panelNorth, BorderLayout.NORTH);
            aboutFrame.setVisible(true);
        });
    }

    public void setButtonBack() {
        buttonBack.addActionListener(e -> {
            aboutFrame.dispose();
            mainFrame.setVisible(true);
        });
    }

    public void setButtonData() {
        for (int i = 0; i < buttonData.length; i++) {
            final int intdex = i;
            buttonData[i].addActionListener(e -> {
                JOptionPane.showMessageDialog(null,
                        constant.name[intdex] + "\n" + constant.SID[intdex],
                        "Data",
                        JOptionPane.INFORMATION_MESSAGE
                );
            });
        }
    }
}
