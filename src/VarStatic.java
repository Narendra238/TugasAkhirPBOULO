import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class VarStatic {
    public static int hiScore = 0;
    public static int mudah = 120;
    public static int normal = 80;
    public static int sulit = 60;
    public static int level = normal;
    public static String checkList = "O";
    static Color biru = new Color(31, 194, 255);
    static Color biruP = new Color(18, 108, 141);
    static Color tosca = new Color(100, 255, 201);
    static Color toscaP = new Color(51, 129, 102);
    static Color coklat = new Color(47, 18, 8);
    static Color coklatP = new Color(16, 4, 0);
    static Color kuning = new Color(255, 242, 0);
    static Color kuningP = new Color(108, 103, 2);
    static Color pink = new Color(255, 0, 233);
    static Color pinkP = new Color(133, 1, 121);
    static Color ungu = new Color(184, 90, 210);
    static Color unguP = new Color(86, 36, 100);
    static Color merah = new Color(255, 0, 0);
    static Color merahP = new Color(122, 2, 2);
    static Color hijau = new Color(0, 255, 6);
    static Color hijauP = new Color(2, 121, 5);

    static Button myButton = new Button("Main",20);
    static Button merahBTN = new Button("",15,merah,Color.white,merahP,Color.white,10);
    static Button biruBTN = new Button("",15,biru,Color.black,biruP,Color.black,10);
    static Button hijauBTN = new Button("",15,hijau,Color.black,hijauP,Color.black,10);
    static Button toscaBTN = new Button("",15,tosca,Color.black,toscaP,Color.black,10);
    static Button coklatBTN = new Button("",15,coklat,Color.white,coklatP,Color.WHITE,10);
    static Button kuningBTN = new Button("",15,kuning,Color.black,kuningP,Color.black,10);
    static Button pinkBTN = new Button("",15,pink,Color.black,pinkP,Color.black,10);
    static Button unguBTN = new Button("",15,ungu,Color.black,unguP,Color.black,10);


    static String pilihMode(){
        if (level == mudah) return "MUDAH";
        if (level == normal) return "NORMAL";
        if (level == sulit) return "SULIT";
        return "normal";
    }static String pilihWarna(){
        if (SettingFrame.snakeColor == merah) return "Merah";
        if (SettingFrame.snakeColor == biru) return "Biru";
        if (SettingFrame.snakeColor == tosca) return "tosca";
        if (SettingFrame.snakeColor == coklat) return "Coklat";
        if (SettingFrame.snakeColor == kuning) return "Kuning";
        if (SettingFrame.snakeColor == pink) return "Pink";
        if (SettingFrame.snakeColor == ungu) return "Ungu";
        if (SettingFrame.snakeColor == hijau) return "Hijau";
        return "Tosca";
    }
    static int[] addArray(int[] array,int data){
        int posisi = array.length;
        int[] temp = new int[array.length+1];
        for (int i = 0; i<array.length; i++){
            temp[i] = array[i];
        }

        temp[posisi] = data;
        array = temp;
        return array;
    }

    static int getHiScore(int[] array){
        return Arrays.stream(array).max().getAsInt();
    }
    static int size = 0;
    static int[] array = new int[size];
    static void getScore(){
        try (BufferedReader br = new BufferedReader(new FileReader("src/scoreList.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length >= 3) {
                    String scorePart = parts[2].trim(); // Mengakses bagian yang mengandung nilai poin

                    // Memproses nilai poin sesuai kebutuhan Anda
                    int score = Integer.parseInt(scorePart.split(" ")[0]);
                    array = addArray(array, score);
                    hiScore = getHiScore(array);
                }
            }
            for (int a : array){
                System.out.println(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
