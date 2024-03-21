/**
 * @Project name: JavaDasturlashgaKirishFoundationKursi_Latest
 * @Description:
 * @Author: Leader_PC
 * @Date : 2024-03-07 21:49
 **/

package otabek.oktamjondan;

import java.util.Scanner;

public class ClassDemo23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1-ustozinggiz ismini kiriting: ");
        String ism = in.nextLine();
        KeyingiClass keyingiClass = new KeyingiClass();
        keyingiClass.ismKiritish(ism);
        keyingiClass.chiqarish();
        in.close();

//        kona daewoo sex
    }

    private static class KeyingiClass {
        private String ustozIsmi;

        public void ismKiritish(String ism) {
            ustozIsmi = ism;
        }

        public String getUstozIsmi() {
            return ustozIsmi;
        }

        public void chiqarish() {
            System.out.println("Sizning 1-ustozinggiz ismi " + getUstozIsmi());
        }
    }
}