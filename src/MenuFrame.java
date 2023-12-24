import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class MenuFrame extends JFrame implements ActionListener {

    public static Color snakeColor = VarStatic.tosca;
    JLabel hiScoreLabel = new JLabel("High score : "+VarStatic.hiScore);
    private ImageIcon backgroundImage;
    private JLabel background;

    MenuFrame(){
        System.out.println("ini frame");
        backgroundImage = new ImageIcon(this.getClass().getResource("/bgfix.png"));
        background = new JLabel(backgroundImage);
        background.setSize(420, 420);
        VarStatic.myButton.setBounds(100,160,200,40);
        VarStatic.myButton.setFocusable(false);
        VarStatic.myButton.addActionListener(this);
        hiScoreLabel.setBounds(180, 30, 200, 200);
        VarStatic.merahBTN.setBounds(10,300,80,40);
        VarStatic.merahBTN.setFocusable(false);
        VarStatic.merahBTN.addActionListener(this);
        VarStatic.biruBTN.setBounds(110,300,80,40);
        VarStatic.biruBTN.setFocusable(false);
        VarStatic.biruBTN.addActionListener(this);
        VarStatic.hijauBTN.setBounds(210,300,80,40);
        VarStatic.hijauBTN.setFocusable(false);
        VarStatic.hijauBTN.addActionListener(this);
        VarStatic.toscaBTN.setBounds(310,300,80,40);
        VarStatic.toscaBTN.setFocusable(false);
        VarStatic.toscaBTN.addActionListener(this);
        VarStatic.coklatBTN.setBounds(10,240,80,40);
        VarStatic.coklatBTN.setFocusable(false);
        VarStatic.coklatBTN.addActionListener(this);
        VarStatic.kuningBTN.setBounds(110,240,80,40);
        VarStatic.kuningBTN.setFocusable(false);
        VarStatic.kuningBTN.addActionListener(this);
        VarStatic.pinkBTN.setBounds(210,240,80,40);
        VarStatic.pinkBTN.setFocusable(false);
        VarStatic.pinkBTN.addActionListener(this);
        VarStatic.unguBTN.setBounds(310,240,80,40);
        VarStatic.unguBTN.setFocusable(false);
        VarStatic.unguBTN.addActionListener(this);

//        this.add(background);
        this.add(hiScoreLabel);
        this.add(VarStatic.myButton);

        this.add(VarStatic.merahBTN);
        this.add(VarStatic.biruBTN);
        this.add(VarStatic.hijauBTN);
        this.add(VarStatic.toscaBTN);
        this.add(VarStatic.coklatBTN);
        this.add(VarStatic.kuningBTN);
        this.add(VarStatic.pinkBTN);
        this.add(VarStatic.unguBTN);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == VarStatic.myButton){
            this.dispose();
            MyFrame main = new MyFrame();
            System.out.println("jalan");
            VarStatic.myButton.removeActionListener(VarStatic.myButton.getActionListeners()[0]);

        }
        if (e.getSource() == VarStatic.merahBTN){
            snakeColor = VarStatic.merah;
        }
        if (e.getSource() == VarStatic.biruBTN){
            snakeColor = VarStatic.biru;
        }
        if (e.getSource() == VarStatic.toscaBTN){
            snakeColor = VarStatic.tosca;
        }
        if (e.getSource() == VarStatic.coklatBTN){
            snakeColor = VarStatic.coklat;
        }
        if (e.getSource() == VarStatic.kuningBTN){
            snakeColor = VarStatic.kuning;
        }
        if (e.getSource() == VarStatic.pinkBTN){
            snakeColor = VarStatic.pink;
        }
        if (e.getSource() == VarStatic.unguBTN){
            snakeColor = VarStatic.ungu;
        }
    }
}
