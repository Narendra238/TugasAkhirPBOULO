import javax.swing.*;
import java.io.Serial;

public class MyFrame extends JFrame{

    MyFrame() {
        MyPanel panel = new MyPanel();
        this.add(panel);
        this.setTitle("snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}