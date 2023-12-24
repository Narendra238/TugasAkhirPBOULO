import javax.swing.*;
import java.awt.*;
import java.io.File;

public class VarStatic {
    public static int hiScore = 0;
    static Color biru = new Color(31, 194, 255);
    static Color tosca = new Color(100, 255, 201);
    static Color coklat = new Color(47, 18, 8);
    static Color kuning = new Color(255, 242, 0);
    static Color pink = new Color(255, 0, 233);
    static Color ungu = new Color(184, 90, 210);
    static Color merah = new Color(255, 0, 0);

    static JButton myButton = new JButton("Main");
    static JButton merahBTN = new JButton("Merah");
    static JButton biruBTN = new JButton("Biru");
    static JButton hijauBTN = new JButton("Hijau");
    static JButton toscaBTN = new JButton("Tosca");
    static JButton coklatBTN = new JButton("Coklat");
    static JButton kuningBTN = new JButton("Kuning");
    static JButton pinkBTN = new JButton("Pink");
    static JButton unguBTN = new JButton("Ungu");

    static File file = new File("/scoreList.txt");

}
