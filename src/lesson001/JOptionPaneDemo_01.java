/**
 * @Project name: JavaLatest
 * @Description: JOptionPane Demo
 * @Author: Leader_PC
 * @Date : 2023-12-08 11:47
 **/

package lesson001;

import javax.swing.*;
import java.util.Scanner;

public class JOptionPaneDemo_01 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        JOptionPane.showMessageDialog(null,
                "This is a JOptionPane message");

        JOptionPane.showMessageDialog(null,
                "BU message, xabar",
                "Bu PLAIN_MESSAGE",
                JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null,
                "Bu xabar",
                "Bu INFORMATION_MESSAGE",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,
                "Bu xabar",
                "Bu CLOSED_OPTION",
                JOptionPane.CLOSED_OPTION);

        JOptionPane.showMessageDialog(null,
                "Bu xabar",
                "Bu OK_CANCEL_OPTION",
                JOptionPane.OK_CANCEL_OPTION);

        JOptionPane.showMessageDialog(null,
                "Bu xabar",
                "Bu WARNING_MESSAGE",
                JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog(null,
                "Bu xabar",
                "Bu DEFAULT_OPTION",
                JOptionPane.DEFAULT_OPTION);

        JOptionPane.showMessageDialog(null,
                "Bu xabar",
                "Bu OK_OPTION",
                JOptionPane.OK_OPTION);

        JOptionPane.showMessageDialog(null,
                "Bu xabar",
                "Bu NO_OPTION",
                JOptionPane.NO_OPTION);

        JOptionPane.showMessageDialog(null,
                "Bu xabar",
                "Bu WHEN_FOCUSED",
                JOptionPane.WHEN_FOCUSED);

    }
}
