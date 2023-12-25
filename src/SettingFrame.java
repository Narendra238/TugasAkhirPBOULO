import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingFrame extends JFrame implements ActionListener {

    public static Color snakeColor = VarStatic.tosca;
    Button done = new Button("DONE",20);
    Button mudahBtn = new Button("Mudah",15,VarStatic.hijau, VarStatic.hijauP, VarStatic.hijauP, 20);
    Button normalBtn = new Button("Normal",15,VarStatic.kuning, VarStatic.kuningP, VarStatic.kuningP, 20);
    Button sulitBtn = new Button("Sulit",15,VarStatic.merah, VarStatic.merahP, VarStatic.merahP, 20);
    JLabel modeText = new JLabel("Pilih Level : "+VarStatic.pilihMode(),SwingConstants.CENTER);

    SettingFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
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

        modeText.setFont(new Font("Consolas", Font.PLAIN, 15));
        modeText.setBounds(0,0,420,180);
        modeText.setForeground(Color.white);

        int tinggi = 110;
        mudahBtn.setBounds(50,tinggi,100,40);
        mudahBtn.addActionListener(this);
        normalBtn.setBounds(160,tinggi,100,40);
        normalBtn.addActionListener(this);
        sulitBtn.setBounds(270,tinggi,100,40);
        sulitBtn.addActionListener(this);

        JLabel colorText = new JLabel("Pilih skin :",SwingConstants.CENTER);
        colorText.setBounds(0,80,420,180);
        colorText.setForeground(Color.white);
        colorText.setFont(new Font("Consolas", Font.PLAIN, 15));

        tinggi = 245;
        VarStatic.merahBTN.setBounds(15,tinggi,80,40);
        VarStatic.merahBTN.setFocusable(false);
        VarStatic.merahBTN.addActionListener(this);
        VarStatic.biruBTN.setBounds(115,tinggi,80,40);
        VarStatic.biruBTN.setFocusable(false);
        VarStatic.biruBTN.addActionListener(this);
        VarStatic.hijauBTN.setBounds(215,tinggi,80,40);
        VarStatic.hijauBTN.setFocusable(false);
        VarStatic.hijauBTN.addActionListener(this);
        VarStatic.toscaBTN.setBounds(315,tinggi,80,40);
        VarStatic.toscaBTN.setFocusable(false);
        VarStatic.toscaBTN.addActionListener(this);

        tinggi = tinggi - 55;
        VarStatic.coklatBTN.setBounds(15,tinggi,80,40);
        VarStatic.coklatBTN.setFocusable(false);
        VarStatic.coklatBTN.addActionListener(this);
        VarStatic.kuningBTN.setBounds(115,tinggi,80,40);
        VarStatic.kuningBTN.setFocusable(false);
        VarStatic.kuningBTN.addActionListener(this);
        VarStatic.pinkBTN.setBounds(215,tinggi,80,40);
        VarStatic.pinkBTN.setFocusable(false);
        VarStatic.pinkBTN.addActionListener(this);
        VarStatic.unguBTN.setBounds(315,tinggi,80,40);
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

        if (snakeColor == VarStatic.merah) {
            VarStatic.merahBTN.setLabel(VarStatic.checkList);
            VarStatic.biruBTN.setLabel("");
            VarStatic.coklatBTN.setLabel("");
            VarStatic.toscaBTN.setLabel("");
            VarStatic.kuningBTN.setLabel("");
            VarStatic.pinkBTN.setLabel("");
            VarStatic.unguBTN.setLabel("");
            VarStatic.hijauBTN.setLabel("");
        }
        if (snakeColor == VarStatic.biru) {
            VarStatic.biruBTN.setLabel(VarStatic.checkList);
            VarStatic.merahBTN.setLabel("");
            VarStatic.coklatBTN.setLabel("");
            VarStatic.toscaBTN.setLabel("");
            VarStatic.kuningBTN.setLabel("");
            VarStatic.pinkBTN.setLabel("");
            VarStatic.unguBTN.setLabel("");
            VarStatic.hijauBTN.setLabel("");
        }
        if (snakeColor == VarStatic.coklat) {
            VarStatic.coklatBTN.setLabel(VarStatic.checkList);
            VarStatic.biruBTN.setLabel("");
            VarStatic.merahBTN.setLabel("");
            VarStatic.toscaBTN.setLabel("");
            VarStatic.kuningBTN.setLabel("");
            VarStatic.pinkBTN.setLabel("");
            VarStatic.unguBTN.setLabel("");
            VarStatic.hijauBTN.setLabel("");
        }
        if (snakeColor == VarStatic.tosca) {
            VarStatic.toscaBTN.setLabel(VarStatic.checkList);
            VarStatic.biruBTN.setLabel("");
            VarStatic.coklatBTN.setLabel("");
            VarStatic.merahBTN.setLabel("");
            VarStatic.kuningBTN.setLabel("");
            VarStatic.pinkBTN.setLabel("");
            VarStatic.unguBTN.setLabel("");
            VarStatic.hijauBTN.setLabel("");
        }
        if (snakeColor == VarStatic.kuning) {
            VarStatic.kuningBTN.setLabel(VarStatic.checkList);
            VarStatic.biruBTN.setLabel("");
            VarStatic.coklatBTN.setLabel("");
            VarStatic.toscaBTN.setLabel("");
            VarStatic.merahBTN.setLabel("");
            VarStatic.pinkBTN.setLabel("");
            VarStatic.unguBTN.setLabel("");
            VarStatic.hijauBTN.setLabel("");
        }
        if (snakeColor == VarStatic.pink) {
            VarStatic.pinkBTN.setLabel(VarStatic.checkList);
            VarStatic.biruBTN.setLabel("");
            VarStatic.coklatBTN.setLabel("");
            VarStatic.toscaBTN.setLabel("");
            VarStatic.kuningBTN.setLabel("");
            VarStatic.merahBTN.setLabel("");
            VarStatic.unguBTN.setLabel("");
            VarStatic.hijauBTN.setLabel("");
        }
        if (snakeColor == VarStatic.ungu) {
            VarStatic.unguBTN.setLabel(VarStatic.checkList);
            VarStatic.biruBTN.setLabel("");
            VarStatic.coklatBTN.setLabel("");
            VarStatic.toscaBTN.setLabel("");
            VarStatic.kuningBTN.setLabel("");
            VarStatic.pinkBTN.setLabel("");
            VarStatic.merahBTN.setLabel("");
            VarStatic.hijauBTN.setLabel("");
        }
        if (snakeColor == VarStatic.hijau) {
            VarStatic.hijauBTN.setLabel(VarStatic.checkList);
            VarStatic.biruBTN.setLabel("");
            VarStatic.coklatBTN.setLabel("");
            VarStatic.toscaBTN.setLabel("");
            VarStatic.kuningBTN.setLabel("");
            VarStatic.pinkBTN.setLabel("");
            VarStatic.unguBTN.setLabel("");
            VarStatic.merahBTN.setLabel("");
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // Level
        if (e.getSource() == mudahBtn) {
            VarStatic.level = VarStatic.mudah;
        }
        if (e.getSource() == normalBtn) {
            VarStatic.level = VarStatic.normal;
        }
        if (e.getSource() == sulitBtn) {
            VarStatic.level = VarStatic.sulit;
        }
        modeText.setText("Pilih Level : " + VarStatic.pilihMode());
        if (e.getSource() == done){
            this.dispose();
            new MenuFrame();
            done.removeActionListener(done.getActionListeners()[0]);
            System.out.println("setting done");
        }

        // Color
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
        if (snakeColor == VarStatic.merah) {
            VarStatic.merahBTN.setLabel(VarStatic.checkList);
            VarStatic.biruBTN.setLabel("");
            VarStatic.coklatBTN.setLabel("");
            VarStatic.toscaBTN.setLabel("");
            VarStatic.kuningBTN.setLabel("");
            VarStatic.pinkBTN.setLabel("");
            VarStatic.unguBTN.setLabel("");
            VarStatic.hijauBTN.setLabel("");
        }
        if (snakeColor == VarStatic.biru) {
            VarStatic.biruBTN.setLabel(VarStatic.checkList);
            VarStatic.merahBTN.setLabel("");
            VarStatic.coklatBTN.setLabel("");
            VarStatic.toscaBTN.setLabel("");
            VarStatic.kuningBTN.setLabel("");
            VarStatic.pinkBTN.setLabel("");
            VarStatic.unguBTN.setLabel("");
            VarStatic.hijauBTN.setLabel("");
        }
        if (snakeColor == VarStatic.coklat) {
            VarStatic.coklatBTN.setLabel(VarStatic.checkList);
            VarStatic.coklatBTN.setForeground(Color.WHITE);
            VarStatic.biruBTN.setLabel("");
            VarStatic.merahBTN.setLabel("");
            VarStatic.toscaBTN.setLabel("");
            VarStatic.kuningBTN.setLabel("");
            VarStatic.pinkBTN.setLabel("");
            VarStatic.unguBTN.setLabel("");
            VarStatic.hijauBTN.setLabel("");
        }
        if (snakeColor == VarStatic.tosca) {
            VarStatic.toscaBTN.setLabel(VarStatic.checkList);
            VarStatic.biruBTN.setLabel("");
            VarStatic.coklatBTN.setLabel("");
            VarStatic.merahBTN.setLabel("");
            VarStatic.kuningBTN.setLabel("");
            VarStatic.pinkBTN.setLabel("");
            VarStatic.unguBTN.setLabel("");
            VarStatic.hijauBTN.setLabel("");
        }
        if (snakeColor == VarStatic.kuning) {
            VarStatic.kuningBTN.setLabel(VarStatic.checkList);
            VarStatic.biruBTN.setLabel("");
            VarStatic.coklatBTN.setLabel("");
            VarStatic.toscaBTN.setLabel("");
            VarStatic.merahBTN.setLabel("");
            VarStatic.pinkBTN.setLabel("");
            VarStatic.unguBTN.setLabel("");
            VarStatic.hijauBTN.setLabel("");
        }
        if (snakeColor == VarStatic.pink) {
            VarStatic.pinkBTN.setLabel(VarStatic.checkList);
            VarStatic.biruBTN.setLabel("");
            VarStatic.coklatBTN.setLabel("");
            VarStatic.toscaBTN.setLabel("");
            VarStatic.kuningBTN.setLabel("");
            VarStatic.merahBTN.setLabel("");
            VarStatic.unguBTN.setLabel("");
            VarStatic.hijauBTN.setLabel("");
        }
        if (snakeColor == VarStatic.ungu) {
            VarStatic.unguBTN.setLabel(VarStatic.checkList);
            VarStatic.biruBTN.setLabel("");
            VarStatic.coklatBTN.setLabel("");
            VarStatic.toscaBTN.setLabel("");
            VarStatic.kuningBTN.setLabel("");
            VarStatic.pinkBTN.setLabel("");
            VarStatic.merahBTN.setLabel("");
            VarStatic.hijauBTN.setLabel("");
        }
        if (snakeColor == VarStatic.hijau) {
            VarStatic.hijauBTN.setLabel(VarStatic.checkList);
            VarStatic.biruBTN.setLabel("");
            VarStatic.coklatBTN.setLabel("");
            VarStatic.toscaBTN.setLabel("");
            VarStatic.kuningBTN.setLabel("");
            VarStatic.pinkBTN.setLabel("");
            VarStatic.unguBTN.setLabel("");
            VarStatic.merahBTN.setLabel("");
        }
    }
}
