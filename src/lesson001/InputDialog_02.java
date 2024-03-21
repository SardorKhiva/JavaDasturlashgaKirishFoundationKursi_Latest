/**
 * @Project name: JavaLatest
 * @Description: Input dialog java gui demo,
 * bunda userdan ismi va tug'ilgan yili so'ralib ekranga chiqariladi, bari Java Swingda
 * @Author: Leader_PC
 * @Date : 2023-12-08 19:50
 **/

package lesson001;

import javax.swing.*;
import java.time.Year;
import java.util.Scanner;

public class InputDialog_02 {
    public static void main(String[] args) {

        var in = new Scanner(System.in);

        String ism = JOptionPane.showInputDialog(null,
                "Isminggizni kiriting: ",
                "Ismni kiritish oynasi",
                JOptionPane.INFORMATION_MESSAGE);

        String tugilganYilStr = JOptionPane.showInputDialog(null,
                "Tug'ilgan yilinggizni kiriting: ",
                "Tug'ilgan yilni kiritish oynasi",
                JOptionPane.INFORMATION_MESSAGE);

        int yil = Year.now().getValue();
        int tugilganYil = Integer.parseInt(tugilganYilStr);
        int yosh = yil - tugilganYil;

        if (yil > tugilganYil) {
            JOptionPane.showMessageDialog(null,
                    ism + ", siz " + tugilganYilStr + "-yilda tug'ilgansiz va " + yosh + " yoshdasiz",
                    "Foydalanuvchi haqida ma'lumot: ",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Siz hali tug'ilmabsiz :)");
        }
    }
}
