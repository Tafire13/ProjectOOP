
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainWindow {

    private Constant constant = new Constant();
    private createFrame aboutFrame = new createFrame();
    private createFrame mainFrame;
    private JPanel panelEast;
    private JPanel panelWest;
    private JPanel panelSquare;
    private JPanel panelSouth;
    private JPanel panelNorth;
    private JPanel panelMonitor;
    private JPanel panelMonitor2;
    private JPanel panelMonitor3;
    private JPanel panelMonitor4;
    private JPanel panelMonitor5;
    private JPanel panelMonitor6;
    private JPanel panelMonitor7;
    private JPanel squareYellow;
    private JLabel persenYellow;
    private JPanel squareRed;
    private JLabel persenRed;
    private JPanel squareGreen;
    private JLabel persenGreen;
    private JPanel panelImage;
    private JPanel panelInsertImage[] = new JPanel[3];
    private JButton buttonData[] = new JButton[3];
    private JButton OpenFile;
    private JButton buttonAbout;
    private JButton buttonExit;
    private JButton buttonBack;
    private JButton Buttoncalculate;
    private JLabel dept;
    private JLabel aboutLabel;
    private createJtextField textField;

    public MainWindow() {
        this.mainFrame = new createFrame();
        settingPanel();
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setFrame(constant.white, "Project OOP");
        mainFrame.add(panelEast, BorderLayout.EAST);
        mainFrame.add(panelWest, BorderLayout.WEST);
        mainFrame.add(panelSquare, BorderLayout.SOUTH);
        mainFrame.setVisible(true);
    }

    private void settingPanel() {
        initLabel();
        initButtons();
        initText();
        initLegendSquares();
        initPanelStyles();
        initPanelBorders();
        initLayout();
        initMonitorGrid();
        setButtonExit();
        setBUttonAbout();
        setButtonBack();
    }

    private void initButtons() {
        createButton btnFactory = new createButton();
        OpenFile = btnFactory.create("Open File", 200, 20, constant.lightBlue);
        buttonAbout = btnFactory.create("About", 150, 35, constant.pink);
        buttonExit = btnFactory.create("Exit", 150, 35, constant.red);
        buttonBack = btnFactory.create("Back", 150, 35, constant.pink);
        Buttoncalculate = btnFactory.create("Calculate", 200, 20, constant.lightGreen);

        for (int i = 0; i < buttonData.length; i++) {
            buttonData[i] = btnFactory.create("1", 1, 1, constant.white);
            ImageIcon icon = new ImageIcon("icon.png");
            buttonData[i].setIcon(icon);
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
        this.textField = new createJtextField(200, 20);
        this.aboutLabel.setFont(new Font("Tahoma", Font.BOLD, 64));
    }

    private void initLayout() {
        panelWest.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 30));
        panelEast.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 30));
        panelSouth.setLayout(new BorderLayout());
        panelNorth.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
        panelSquare.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));
        panelMonitor.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 100));
        panelMonitor3.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelMonitor4.setLayout(new FlowLayout(FlowLayout.LEFT, 40, 20));
        panelMonitor5.setLayout(new BorderLayout());
        panelMonitor6.setLayout(new GridLayout(10, 20));
        panelMonitor7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
        panelImage.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 70));
        panelMonitor.add(panelMonitor6);
        panelMonitor3.add(dept);
        panelMonitor3.add(textField);
        panelMonitor3.add(Buttoncalculate);
        panelSquare.add(panelMonitor4);
        panelMonitor4.add(squareGreen);
        panelMonitor4.add(persenGreen);
        panelMonitor4.add(squareYellow);
        panelMonitor4.add(persenYellow);
        panelMonitor4.add(squareRed);
        panelMonitor4.add(persenRed);
        panelMonitor4.add(panelMonitor7);
        panelMonitor5.add(OpenFile);
        panelMonitor7.add(buttonAbout);
        panelMonitor7.add(buttonExit);
        panelWest.add(panelMonitor);
        panelEast.add(panelMonitor2);
        panelEast.add(panelMonitor3);
        panelEast.add(panelMonitor5);
        panelNorth.add(aboutLabel);
        panelSouth.add(buttonBack);
        for (int i = 0; i < panelInsertImage.length; i++) {
            panelImage.add(panelInsertImage[i]);
            panelInsertImage[i].setLayout(new BorderLayout());
            panelInsertImage[i].add(buttonData[i]);
        }
    }

    private void initPanelBorders() {
        Color borderColor = constant.black;
        panelEast.setBorder(BorderFactory.createLineBorder(borderColor));
        panelWest.setBorder(BorderFactory.createLineBorder(borderColor));
        panelNorth.setBorder(BorderFactory.createLineBorder(borderColor));
        panelMonitor.setBorder(BorderFactory.createLineBorder(borderColor));
        panelMonitor2.setBorder(BorderFactory.createLineBorder(borderColor));
        panelMonitor3.setBorder(BorderFactory.createLineBorder(borderColor));
        panelMonitor4.setBorder(BorderFactory.createLineBorder(borderColor));
        panelMonitor5.setBorder(BorderFactory.createLineBorder(borderColor));
        panelMonitor6.setBorder(BorderFactory.createLineBorder(borderColor));
        panelMonitor7.setBorder(BorderFactory.createLineBorder(borderColor));
    }

    private void initLegendSquares() {
        squareGreen = createPanel.create(50, 50, constant.green);
        squareYellow = createPanel.create(50, 50, constant.yellow);
        squareRed = createPanel.create(50, 50, constant.red);
    }

    private void initPanelStyles() {
        panelEast = createPanel.create(400, 200, constant.lightGray3);
        panelWest = createPanel.create(900, 200, constant.lightGray3);
        panelSouth = createPanel.create(200, 100, constant.lightGray3);
        panelNorth = createPanel.create(1100, 100, constant.pink);
        panelSquare = createPanel.create(200, 100, constant.lightGray3);
        panelMonitor = createPanel.create(810, 600, constant.white);
        panelMonitor2 = createPanel.create(350, 250, constant.white);
        panelMonitor3 = createPanel.create(350, 200, constant.white);
        panelMonitor4 = createPanel.create(1200, 90, constant.white);
        panelMonitor5 = createPanel.create(350, 100, constant.white);
        panelMonitor6 = createPanel.create(790, 395, constant.softBlue);
        panelMonitor7 = createPanel.create(350, 55, constant.white);
        panelImage = createPanel.create(700, 800, constant.pink);
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
            panelMonitor6.add(button);
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
            aboutFrame.add(panelSouth, BorderLayout.SOUTH);
            aboutFrame.add(panelImage, BorderLayout.CENTER);
            aboutFrame.add(panelNorth, BorderLayout.NORTH);
            aboutFrame.setVisible(true);
        });
    }

    public void setButtonBack() {
        buttonBack.addActionListener(e -> {
            aboutFrame.dispose();
            mainFrame.setVisible(true);
        });

    }
}
