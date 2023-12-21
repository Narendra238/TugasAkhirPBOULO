import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFrame extends JFrame implements ActionListener {
    JButton myButton = new JButton("Main");
    private ImageIcon backgroundImage;
    private JLabel background;
    MenuFrame(){
        backgroundImage = new ImageIcon(this.getClass().getResource("/bgfix.png"));
        background = new JLabel(backgroundImage);
        background.setSize(420, 420);
        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        this.add(background);
        this.add(myButton);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton){
            this.dispose();
            MyFrame main = new MyFrame();
        }

    }
}
