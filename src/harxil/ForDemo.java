/**
 * @Project name: JavaDasturlashgaKirishFoundationKursi_Latest
 * @Description:
 * @Author: Leader_PC
 * @Date : 2024-01-24 19:34
 **/

package harxil;

import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, sum;

        System.out.print("n: ");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = 0;
            // i ning bo'luvchilari yig'indisi o'zidan boshqa
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += i;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
        }

    }
}        // n gacha tub sonlar:

class NBuluvchilari {// n bo'luvchilari

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        Scanner in = new Scanner(System.in);

        System.out.print("n: ");
        var n = in.nextInt();
        System.out.println(n + " soni bo'luvchilari: ");
        for (int i = 2, j = 1; i < n; i++, j++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\ncurrentTimeMillis = " + (System.currentTimeMillis() - time));
        System.out.println();
        main(args);
        in.close();
    }
}         // n bo'luvchilari

class NBuluvchilarSum {// n bo'luvchilar yig'indisi

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, sum = 0;

        System.out.print("n: ");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                System.out.print(i + " ");
            }
        }

        System.out.println("\nBo'luvchilari yig'indisi = " + sum);

        System.out.println();
        main(args);
        in.close();
    }
}       // n bo'luvchilar summasi

class TubSon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, soni = 0;

        System.out.print("n: ");
        n = in.nextInt();

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                soni++;
            }
        }

        if (n != 1) {
            if (soni == 0) {
                System.out.println(n + " soni tub");
            } else {
                System.out.println(n + " soni murakkab");
            }
        } else {
            System.out.println(n + " soni tub ham murakkab ham emas");
        }

        System.out.println();
        main(args);
        in.close();
    }
}                // n tubmi murakkabmi?

class NTub {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;

        System.out.print("n: ");
        n = in.nextInt();

        if (n != 0) {
            for (int i = 2; i <= n; i++) {
                var soni = 0;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        soni++;
                    }
                }

                if (soni == 0) System.out.println(i);
            }
        }
        System.out.println();
        main(args);
        in.close();
    }
}                  // n gacha tub

class NTubMetodli {                      // n gacha tub metodli
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;

        System.out.print("n: ");
        n = in.nextInt();

        if (n != 0) {
            System.out.println(n + " gacha tub sonlar: ");
            for (int i = 2; i <= n; i++) {
                if (tub(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            for (int i = 2; i <= n; i++) {
                if (tub2(i)) {
                    System.out.print(i + " ");
                }
            }
        }

        System.out.println('\n');
        main(args);
        in.close();
    }

    private static boolean tub(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) return false;
        }
        return true;
    }

    private static boolean tub2(int i) {
        var soni = 0;
        for (int j = 2; j < i; j++) {   // for shapkasini tub son qoidasiga asosan 1 ga va o'ziga bo'linadigan qilsa ham bo'ladi
            if (i % j == 0) soni++;
        }
        if (soni == 0) {
            return true;
        } else {
            return false;
        }
        // if else ni o'rniga quyidagicha yozsa ham bo'ladi:
        // return (soni == 1);
    }
}

class Mukammal {                      // n mukammalmi?
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        boolean mukammal = false;
        var sum = 0;

        System.out.print("n: ");
        n = in.nextInt();

        if (0 < n) {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
                if (sum == n) {
                    mukammal = true;
                }
            }
        }

        if (mukammal) {
            System.out.println(n + " soni mukammal ");
        } else {
            System.out.println(n + " soni mukammal emas ");
        }

        System.out.println();
        main(args);
        in.close();
    }
}

class NtaMukammal {
    public static void main(String[] args) {
        long vaqt = System.currentTimeMillis();
        Scanner in = new Scanner(System.in);

        long n, sum;

        System.out.print("n: ");
        n = in.nextLong();

        System.out.println(n + " gacha bo'lgan mukammal sonlar: ");

        if (0 < n) {
            for (long i = 1; i <= n; i++) {
                sum = 0;
                for (long j = 1; j < i; j++) {
                    if (i % j == 0) {
                        sum += j;
                    }
                }
                if (sum == i) {
                    System.out.print(i + " ");
                }
            }
        }

        System.out.println("\nKetgan vaqt = " + (System.currentTimeMillis() - vaqt) / 1000. + " soniya");
        System.out.println();
        main(args);
        in.close();
    }
}   // n gacha bo'lgan mukammal sonlar: ");

class FriendlyNumbersToN {
    public static void main(String[] args) {
        long vaqt = System.currentTimeMillis();
        Scanner in = new Scanner(System.in);

        System.out.print("n: ");        var n = in.nextLong();

        for (long i = 1; i <= n; i++) {
            var ikki = boluvchilariYigindisi(i);

            if (ikki > i) {
                if (i == boluvchilariYigindisi(ikki)) {
                    System.out.println(i + " " + ikki);
                }
            }
        }

        System.out.println("\nKetgan vaqt: " + (System.currentTimeMillis() - vaqt) / 1000. + " soniya" );
        System.out.println();
        main(args);
        in.close();
    }

    private static long boluvchilariYigindisi(long i) {
        var sum = 0L;
        for (long j = 1; j < i; j++) {
            if (i % j == 0) sum += j;
        }
        return sum;
    }
}