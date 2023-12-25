import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.stream;

public class LeaderBoard extends JFrame implements ActionListener {
    private final DefaultListModel<String> listModel;
    Button backBtn = new Button("Back",20);
    public LeaderBoard() {
        listModel = new DefaultListModel<>();
        JList dataList = new JList(listModel);
        JScrollPane scorePane = new JScrollPane(dataList);
        scorePane.getVerticalScrollBar().setPreferredSize(new Dimension(8, 0)); // Mengatur lebar scrollbar vertikal
        scorePane.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 8));
        scorePane.setViewportBorder(BorderFactory.createLineBorder(new Color(27, 38, 83),20));

        JLabel mainText = new JLabel("SCORE LIST");
        mainText.setHorizontalAlignment(SwingConstants.CENTER);
        mainText.setForeground(Color.WHITE);
        mainText.setFont(new Font("Arial", Font.BOLD, 34));

        backBtn.addActionListener(this);
        readAndDisplayData();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420,420);
        setResizable(false);
        getContentPane().setBackground(new Color(27, 38, 83));
        this.add(mainText, BorderLayout.NORTH);
        this.add(scorePane,BorderLayout.CENTER);
        this.add(backBtn,BorderLayout.AFTER_LAST_LINE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void readAndDisplayData() {
        try {
            File file = new File("src/scoreList.txt"); // Ganti dengan lokasi file yang sesuai
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                listModel.addElement(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            listModel.addElement("File tidak ditemukan.");
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backBtn){
            this.dispose();
            getScore();
            new MenuFrame();
            backBtn.removeActionListener(backBtn.getActionListeners()[0]);
        }
    }

    void getScore(){
        int size = 0;
        int[] array = new int[size];
        try (BufferedReader br = new BufferedReader(new FileReader("src/scoreList.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length >= 3) {
                    String scorePart = parts[2].trim(); // Mengakses bagian yang mengandung nilai poin

                    // Memproses nilai poin sesuai kebutuhan Anda
                    int score = Integer.parseInt(scorePart.split(" ")[0]);
                    array = addArray(array, score);
                    getHiScore(array);
                }
            }
            for (int a : array){
                System.out.println(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    int[] addArray(int[] array,int data){
        int posisi = array.length;
        int[] temp = new int[array.length+1];
        for (int i = 0; i<array.length; i++){
            temp[i] = array[i];
        }

        temp[posisi] = data;
        array = temp;
        return array;
    }

    int getHiScore(int[] array){
        return Arrays.stream(array).max().getAsInt();
    }
}
