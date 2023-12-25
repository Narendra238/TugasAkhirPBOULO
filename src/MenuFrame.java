import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;
import java.util.Objects;

public class MenuFrame extends JFrame implements ActionListener {


    JLabel hiScoreLabel = new JLabel("High score : "+VarStatic.hiScore);
    JLabel modeLabel  = new JLabel("mode : " + VarStatic.pilihMode());
    JLabel warnaLabel  = new JLabel("warna : ");
    JLabel pilihanWarnaLabel  = new JLabel(VarStatic.pilihWarna());
    private ImageIcon backgroundImage;
    private JLabel background;

    JButton settingBTN = new JButton("Setting");
    MenuFrame(){
        System.out.println("ini frame");
        backgroundImage = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/bgfix.png")));
        background = new JLabel(backgroundImage);
        background.setSize(420, 420);
        VarStatic.myButton.setBounds(100,160,200,40);
        VarStatic.myButton.setFocusable(false);
        VarStatic.myButton.addActionListener(this);
        settingBTN.setBounds(100,260,200,40);
        settingBTN.addActionListener(this);
        hiScoreLabel.setBounds(10, -80, 100, 200);
        modeLabel.setBounds(10, -60, 100, 200);
        warnaLabel.setBounds(10, -40, 100, 200);
        pilihanWarnaLabel.setBounds(55, -40, 100, 200);
        pilihanWarnaLabel.setForeground(SettingFrame.snakeColor);


//        this.add(background);
        this.add(hiScoreLabel);
        this.add(modeLabel);
        this.add(warnaLabel);
        this.add(pilihanWarnaLabel);
        this.add(VarStatic.myButton);
        this.add(settingBTN);

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

        }if (e.getSource() == settingBTN){
            this.dispose();
            SettingFrame set = new SettingFrame();
            System.out.println("jalan");
            settingBTN.removeActionListener(settingBTN.getActionListeners()[0]);
            VarStatic.myButton.removeActionListener(VarStatic.myButton.getActionListeners()[0]);

        }

    }
}
