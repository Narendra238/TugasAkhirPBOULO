import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    int borderRadius = 50;
    Color warnaBack = VarStatic.biru;
    Button(String label,Color back, Color front, int borderRadius) {
        super(label);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setForeground(front);
        this.warnaBack = back;
        this.borderRadius = borderRadius;

    }Button(String label) {
        super(label);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
    }
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(warnaBack);
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, borderRadius, borderRadius);

        super.paintComponent(g2);
        g2.dispose();
    }
    public Dimension getPreferredSize() {
        return new Dimension(50, 50); // Ukuran default yang dapat disesuaikan
    }
}
