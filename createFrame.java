
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

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
        setTitle("About");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1250, 800);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(255, 230, 230)); 
       
         JLabel title = new JLabel("About");
        title.setFont(new Font("Arial", Font.BOLD, 48));
        title.setBounds(550, 30, 200, 50);
        add(title);



         

        ImageIcon imageIcon = new ImageIcon("icon.png"); 
        Image image = imageIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(image);





       /*  //ปลื้มที่ 1
        JLabel imgLabel1 = new JLabel(scaledIcon);
        imgLabel1.setBounds(150, 150, 180, 180);
        add(imgLabel1);
        JLabel nameLabel1 = new JLabel("Pluem X1", SwingConstants.CENTER);
        nameLabel1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        nameLabel1.setBounds(110, 340, 250, 30);
        add(nameLabel1);
        JLabel idLabel1 = new JLabel("67011212105", SwingConstants.CENTER);
        idLabel1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        idLabel1.setBounds(110, 370, 250, 30);
        add(idLabel1);





        // ปลื้มที่ 2
        JLabel imgLabel2 = new JLabel(scaledIcon);
        imgLabel2.setBounds(535, 150, 180, 180);
        add(imgLabel2);
        JLabel nameLabel2 = new JLabel("ชื่อ", SwingConstants.CENTER);
        nameLabel2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        nameLabel2.setBounds(500, 340, 250, 30);
        add(nameLabel2);
        JLabel idLabel2 = new JLabel("รหัสนิสิต", SwingConstants.CENTER);
        idLabel2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        idLabel2.setBounds(500, 370, 250, 30);
        add(idLabel2);





        // ปลื้มที่ 3
        JLabel imgLabel3 = new JLabel(scaledIcon);
        imgLabel3.setBounds(920, 150, 180, 180);
        add(imgLabel3);
        JLabel nameLabel3 = new JLabel("ชื่อ", SwingConstants.CENTER);
        nameLabel3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        nameLabel3.setBounds(885, 340, 250, 30);
        add(nameLabel3);
        JLabel idLabel3 = new JLabel("รหัสนิสิต", SwingConstants.CENTER);
        idLabel3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        idLabel3.setBounds(885, 370, 250, 30);
        add(idLabel3);*/



        
     
       
    }

}
