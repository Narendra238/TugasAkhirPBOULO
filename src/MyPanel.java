import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import javax.swing.JPanel;

public class MyPanel extends JPanel implements ActionListener{


    static final int WIDTH = 600;
    static final int HEIGHT = 500;
    static final int UNIT_SIZE = 20;
    static final int NUMBER_OF_UNITS = (WIDTH * HEIGHT) / (UNIT_SIZE * UNIT_SIZE);

    // hold x and y coordinates for body parts of the snake
    final int x[] = new int[NUMBER_OF_UNITS];
    final int y[] = new int[NUMBER_OF_UNITS];

    // initial length of the snake
    int length = 5;
    int foodEaten;
    int foodX;
    int foodY;
    char direction = 'D';
    boolean running = false;
    Random random;
    Timer timer;
    MyPanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.DARK_GRAY);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        play();
    }

    public void play() {
        addFood();
        running = true;

        timer = new Timer(VarStatic.level, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        draw(graphics);
    }

    public void move() {
        for (int i = length; i > 0; i--) {
            // shift the snake one unit to the desired direction to create a move
            x[i] = x[i-1];
            y[i] = y[i-1];
        }

        if (direction == 'L') {
            x[0] = x[0] - UNIT_SIZE;
        } else if (direction == 'R') {
            x[0] = x[0] + UNIT_SIZE;
        } else if (direction == 'U') {
            y[0] = y[0] - UNIT_SIZE;
        } else {
            y[0] = y[0] + UNIT_SIZE;
        }
    }

    public void checkFood() {
        if(x[0] == foodX && y[0] == foodY) {
            length++;
            foodEaten++;
            addFood();
        }
    }

    public void draw(Graphics graphics) {

        if (running) {
            graphics.setColor(new Color(184, 90, 210));
            graphics.fillOval(foodX, foodY, UNIT_SIZE, UNIT_SIZE);

            graphics.setColor(Color.white);
            graphics.fillRect(x[0], y[0], UNIT_SIZE, UNIT_SIZE);

            for (int i = 1; i < length; i++) {
                graphics.setColor(SettingFrame.snakeColor);
                graphics.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
            }

            graphics.setColor(Color.white);
            graphics.setFont(new Font("Sans serif", Font.ROMAN_BASELINE, 25));
            FontMetrics metrics = getFontMetrics(graphics.getFont());
            graphics.drawString("Score: " + foodEaten, (WIDTH - metrics.stringWidth("Score: " + foodEaten)) / 2, graphics.getFont().getSize());

        } else {
            catatScore();
            if (foodEaten > VarStatic.hiScore) {
                VarStatic.hiScore = foodEaten;
            }
            gameOver(graphics);
            JButton backButton = new JButton("Back to Main Menu");
            graphics.setFont(new Font("Sans serif", Font.BOLD, 50));
            FontMetrics metrics = getFontMetrics(graphics.getFont());
            int lebarButton = metrics.stringWidth("Back to Main Menu") - 100;
            backButton.setBounds((WIDTH - (lebarButton)) / 2, 300,lebarButton,30);
            backButton.addActionListener(e -> {
                JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                parentFrame.dispose();
                new MenuFrame();
            });
            this.add(backButton);
        }
    }

    public void addFood() {
        foodX = random.nextInt((int)(WIDTH / UNIT_SIZE))*UNIT_SIZE;
        foodY = random.nextInt((int)(HEIGHT / UNIT_SIZE))*UNIT_SIZE;
    }

    public void checkHit() {
        // kondisi menabrak badannya
        for (int i = length; i > 0; i--) {
            if (x[0] == x[i] && y[0] == y[i]) {
                running = false;
            }
        }

        // kondisi menabrak border
        if (x[0] < 0 || x[0] > WIDTH || y[0] < 0 || y[0] > HEIGHT) {
            running = false;
        }

        if(!running) {
            timer.stop();
        }
    }

    public void gameOver(Graphics graphics) {
        graphics.setColor(Color.red);
        graphics.setFont(new Font("Sans serif", Font.BOLD, 50));
        FontMetrics metrics = getFontMetrics(graphics.getFont());
        graphics.drawString("Game Over", (WIDTH - metrics.stringWidth("Game Over")) / 2, HEIGHT / 2);

        graphics.setColor(Color.white);
        graphics.setFont(new Font("Sans serif", Font.ROMAN_BASELINE, 25));
        metrics = getFontMetrics(graphics.getFont());
        graphics.drawString("Score: " + foodEaten, (WIDTH - metrics.stringWidth("Score: " + foodEaten)) / 2, graphics.getFont().getSize());
    }

    public void catatScore() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        try {
            BufferedWriter tulis = new BufferedWriter(new FileWriter("src/scoreList.txt",true));
            tulis.write("("+dtf.format(now)+") | " + VarStatic.pilihMode() + " | " + foodEaten + " Poin\n");
            tulis.close();
            System.out.println("Jalan");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (running) {
            move();
            checkFood();
            checkHit();
        }
        repaint();
    }
    public void gerak(char no, char go){
        if (this.direction != no) {
            this.direction = go;
        }
    }
    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    gerak('R','L');
                    break;

                case KeyEvent.VK_RIGHT:
                    gerak('L','R');
                    break;

                case KeyEvent.VK_UP:
                    gerak('D','U');
                    break;

                case KeyEvent.VK_DOWN:
                    gerak('U','D');
                    break;
                case KeyEvent.VK_A:
                    gerak('R','L');
                    break;

                case KeyEvent.VK_D:
                    gerak('L','R');
                    break;

                case KeyEvent.VK_W:
                    gerak('D','U');
                    break;

                case KeyEvent.VK_S:
                    gerak('U','D');
                    break;

            }
        }
    }
}