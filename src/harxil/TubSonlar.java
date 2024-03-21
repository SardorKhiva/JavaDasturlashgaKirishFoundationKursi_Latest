/**
 * @Project name: JavaDasturlashgaKirishFoundationKursi_Latest
 * @Description: n gacha tub sonlar 2 xil usulda
 * @Author: Leader_PC
 * @Date : 2024-03-02 18:46
 **/

package harxil;

import java.util.Scanner;

public class TubSonlar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nechchigacha tub sonlar chiqarilsin: ");
        long limit = in.nextLong();

        for (long i = 2; i <= limit; i++) {
            var tub = true;
            for (long j = 2; j < i; j++) {
                if (i % j == 0) {
                    tub = false;
                    break;
                }
            }
            if (tub) System.out.println(i);
        }

        in.close();
    }
}

class TubSonlar2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nechchigacha tub sonlar chiqarilsin: ");
        long limit = in.nextLong();

    keyingi:
        for (long i = 2; i <= limit; i++) {
           for (long j = 2; j < i; j++) {
               if (i % j == 0) continue keyingi;
           }
            System.out.println(i);
        }

        in.close();
    }
}