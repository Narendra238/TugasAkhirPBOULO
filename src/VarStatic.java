import javax.swing.*;
import java.awt.*;
import java.io.File;

public class VarStatic {
    public static int hiScore = 0;
    public static int mudah = 120;
    public static int normal = 80;
    public static int sulit = 60;
    public static int mode = normal;
    static Color biru = new Color(31, 194, 255);
    static Color tosca = new Color(100, 255, 201);
    static Color coklat = new Color(47, 18, 8);
    static Color kuning = new Color(255, 242, 0);
    static Color pink = new Color(255, 0, 233);
    static Color ungu = new Color(184, 90, 210);
    static Color merah = new Color(255, 0, 0);
    static Color hijau = new Color(0, 255, 6);

    static Button myButton = new Button("Main");
    static Button merahBTN = new Button("Merah",merah,Color.white,5);
    static Button biruBTN = new Button("Biru",biru,Color.black,5);
    static Button hijauBTN = new Button("Hijau",hijau,Color.black,5);
    static Button toscaBTN = new Button("Tosca",tosca,Color.black,5);
    static Button coklatBTN = new Button("Coklat",coklat,Color.white,5);
    static Button kuningBTN = new Button("Kuning",kuning,Color.black,5);
    static Button pinkBTN = new Button("Pink",pink,Color.black,5);
    static Button unguBTN = new Button("Ungu",ungu,Color.black,5);

    static File file = new File("/scoreList.txt");

    static String pilihMode(){
        if (mode == mudah) return "mudah";
        if (mode == normal) return "normal";
        if (mode == sulit) return "sulit";
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

}
