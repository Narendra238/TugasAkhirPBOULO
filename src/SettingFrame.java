import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingFrame extends JFrame implements ActionListener {

    public static Color snakeColor = VarStatic.tosca;
    Button done = new Button("DONE");
    JButton mudahBtn = new JButton("Mudah");
    JButton normalBtn = new JButton("Normal");
    JButton sulitBtn = new JButton("Sulit");

    SettingFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(27, 38, 83));
        panel.setLayout(null);
        this.add(panel);

        JLabel mainText = new JLabel("SETTING",SwingConstants.CENTER);
        mainText.setBounds(0,0,420,100);
        mainText.setFont(new Font("Consolas", Font.BOLD, 30));
        mainText.setForeground(Color.white);

        JLabel modeText = new JLabel("Pilih Level :",SwingConstants.CENTER);
        modeText.setFont(new Font("Consolas", Font.PLAIN, 15));
        modeText.setBounds(0,0,420,180);
        modeText.setForeground(Color.white);

        int tinggi = 110;
        mudahBtn.setBounds(40,tinggi,100,40);
        mudahBtn.addActionListener(this);
        normalBtn.setBounds(150,tinggi,100,40);
        normalBtn.addActionListener(this);
        sulitBtn.setBounds(260,tinggi,100,40);
        sulitBtn.addActionListener(this);

        JLabel colorText = new JLabel("Pilih warna badan :",SwingConstants.CENTER);
        colorText.setBounds(0,80,420,180);
        colorText.setForeground(Color.white);
        colorText.setFont(new Font("Consolas", Font.PLAIN, 15));

        tinggi = 240;
        VarStatic.merahBTN.setBounds(10,tinggi,80,40);
        VarStatic.merahBTN.setFocusable(false);
        VarStatic.merahBTN.addActionListener(this);
        VarStatic.biruBTN.setBounds(110,tinggi,80,40);
        VarStatic.biruBTN.setFocusable(false);
        VarStatic.biruBTN.addActionListener(this);
        VarStatic.hijauBTN.setBounds(210,tinggi,80,40);
        VarStatic.hijauBTN.setFocusable(false);
        VarStatic.hijauBTN.addActionListener(this);
        VarStatic.toscaBTN.setBounds(310,tinggi,80,40);
        VarStatic.toscaBTN.setFocusable(false);
        VarStatic.toscaBTN.addActionListener(this);

        tinggi = tinggi-50;
        VarStatic.coklatBTN.setBounds(10,tinggi,80,40);
        VarStatic.coklatBTN.setFocusable(false);
        VarStatic.coklatBTN.addActionListener(this);
        VarStatic.kuningBTN.setBounds(110,tinggi,80,40);
        VarStatic.kuningBTN.setFocusable(false);
        VarStatic.kuningBTN.addActionListener(this);
        VarStatic.pinkBTN.setBounds(210,tinggi,80,40);
        VarStatic.pinkBTN.setFocusable(false);
        VarStatic.pinkBTN.addActionListener(this);
        VarStatic.unguBTN.setBounds(310,tinggi,80,40);
        VarStatic.unguBTN.setFocusable(false);
        VarStatic.unguBTN.addActionListener(this);

        done.setBounds(100,300, 200,40);
        done.addActionListener(this);

        // isi
        panel.add(mainText);
        panel.add(modeText);
        panel.add(colorText);
        panel.add(mudahBtn);
        panel.add(normalBtn);
        panel.add(sulitBtn);
        panel.add(VarStatic.merahBTN);
        panel.add(VarStatic.biruBTN);
        panel.add(VarStatic.hijauBTN);
        panel.add(VarStatic.toscaBTN);
        panel.add(VarStatic.coklatBTN);
        panel.add(VarStatic.kuningBTN);
        panel.add(VarStatic.pinkBTN);
        panel.add(VarStatic.unguBTN);
        panel.add(done);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
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
        if (e.getSource() == VarStatic.hijauBTN){
            snakeColor = VarStatic.hijau;
        }
        if (e.getSource() == mudahBtn) {
            VarStatic.mode = VarStatic.mudah;
        }
        if (e.getSource() == normalBtn) {
            VarStatic.mode = VarStatic.normal;
        }
        if (e.getSource() == sulitBtn) {
            VarStatic.mode = VarStatic.sulit;
        }
        if (e.getSource() == done){
            this.dispose();
            new MenuFrame();
            done.removeActionListener(done.getActionListeners()[0]);
            System.out.println("setting done");
        }
    }
}
