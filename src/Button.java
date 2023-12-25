import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Button extends JButton {
    int borderRadius = 30;
    float textSize = 0;
    String text;
    int yBtn = 0;
    Color warnaBack = VarStatic.biru;

    Button(String label,float size,Color back, Color front, Color backPressed, int borderRadius) {
        text = label;
        textSize = size;
        setContentAreaFilled(false);
        setFocusPainted(false);
        setForeground(front);
        setBackground(back);
        this.borderRadius = borderRadius;

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(backPressed);
                setForeground(back);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setBackground(back);
                setForeground(backPressed);
            }
        });

    }
    Button(String label,float size,Color back, Color front, Color backPressed,Color frontPressed, int borderRadius) {
        text = label;
        textSize = size;
        setContentAreaFilled(false);
        setFocusPainted(false);
        setForeground(front);
        setBackground(back);
        this.borderRadius = borderRadius;

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(backPressed);
                setForeground(frontPressed);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setBackground(back);
                setForeground(frontPressed);
            }
        });

    }
    Button(String label, float size) {
        text = label;
        textSize = size;
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setBackground(VarStatic.biru);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(new Color(15, 105, 143));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setBackground(VarStatic.biru);
            }
        });
        setFont(new Font("Consolas",Font.BOLD,20));
    }
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, borderRadius, borderRadius);
        g2.setColor(getForeground());
        g2.setFont(g.getFont().deriveFont(Font.BOLD,textSize));
        FontMetrics metrics = getFontMetrics(g2.getFont());
        g2.drawString(text, (getWidth() - metrics.stringWidth(text)) / 2, (getHeight() - metrics.getHeight()) / 2 + metrics.getAscent());
        super.paintComponent(g2);
        g2.dispose();
    }
    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(Color.WHITE);
        g2.setStroke(new BasicStroke(2)); // Mengatur ketebalan garis menjadi 3 pixels
        g2.drawRoundRect(0, 2, getWidth() - 1, getHeight() - 3, borderRadius, borderRadius);
        g2.dispose();
    }
    public Dimension getPreferredSize() {
        return new Dimension(50, 50); // Ukuran default yang dapat disesuaikan
    }
}
