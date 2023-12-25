import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class MenuFrame extends JFrame implements ActionListener {


    JLabel hiScoreLabel = new JLabel("High score : "+VarStatic.hiScore);
    JLabel modeLabel  = new JLabel("Level : " + VarStatic.pilihMode());
    JLabel warnaLabel  = new JLabel("warna : ");
    JLabel mainText = new JLabel("ULER JAVVA",SwingConstants.CENTER);
    JLabel pilihanWarnaLabel  = new JLabel(VarStatic.pilihWarna());
    private ImageIcon backgroundImage;

    Button settingBTN = new Button("Setting",20);
    Button exitBTN = new Button("Exit",20);
    MenuFrame(){
        System.out.println("ini frame");
        VarStatic.myButton.setBounds(100,160,200,40);
        VarStatic.myButton.setFocusable(false);
        VarStatic.myButton.addActionListener(this);

        mainText.setBounds(-10,0,420,240);
        mainText.setFont(new Font("Consolas", Font.BOLD, 30));
        mainText.setForeground(Color.white);
        settingBTN.setBounds(100,230,200,40);
        settingBTN.addActionListener(this);
        hiScoreLabel.setBounds(10, -80, 100, 200);
        hiScoreLabel.setForeground(Color.WHITE);
        modeLabel.setBounds(10, -60, 100, 200);
        modeLabel.setForeground(Color.WHITE);
        warnaLabel.setBounds(10, -40, 100, 200);
        warnaLabel.setForeground(Color.WHITE);
        pilihanWarnaLabel.setBounds(55, -40, 100, 200);
        pilihanWarnaLabel.setForeground(SettingFrame.snakeColor);
        exitBTN.setBounds(100,280,200,40);
        exitBTN.addActionListener(this);

        getContentPane().setBackground(new Color(27, 38, 83));
        this.add(mainText);
        this.add(hiScoreLabel);
        this.add(modeLabel);
        this.add(warnaLabel);
        this.add(pilihanWarnaLabel);
        this.add(VarStatic.myButton);
        this.add(settingBTN);
        this.add(exitBTN);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setResizable(false);
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

        }if (e.getSource() == exitBTN) {

            UIManager.put("OptionPane.yesButtonText", "Ya");
            UIManager.put("OptionPane.noButtonText", "Tidak");
            int keluar = JOptionPane.showConfirmDialog(this,
                    "Yakin Mau Keluar ?", "Exit",
                    JOptionPane.YES_NO_OPTION);

            if (keluar == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
            UIManager.put("OptionPane.yesButtonText",UIManager.getString("OptionPane.yesButtonText"));
            UIManager.put("OptionPane.noButtonText", UIManager.getString("OptionPane.noButtonText"));
        }

    }

    public void cekScore(){
        try {
            Scanner baca = new Scanner(new File("src/scoreList.txt"));
            while (baca.hasNextLine()){
                String data = baca.nextLine();
                System.out.println(data);
            }
            baca.close();
        } catch (IOException e){
            System.out.println("Error");
        }
    }
}
