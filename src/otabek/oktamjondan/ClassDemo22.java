/**
 * @Project name: JavaDasturlashgaKirishFoundationKursi_Latest
 * @Description: paramterli
 * @Author: Leader_PC
 * @Date : 2024-03-07 18:10
 **/

package otabek.oktamjondan;

import java.util.Scanner;

public class ClassDemo22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ism;
        System.out.print("Isminggizni kiriting: ");
        ism = in.nextLine();
        BoshqaClass boshqaClass = new BoshqaClass();
        boshqaClass.salomlashish(ism);
//        BoshqaClass.salomlashish(ism);      // static metod uchun
        in.close();
    }


    private static class BoshqaClass {
        //    public static void salomlashish(String ism) {     // classdan obyekt olmasdan ishlatish uchun
        public void salomlashish(String ism) {
            System.out.printf("Assalomu alaykum %s", ism);
        }
    }
}
