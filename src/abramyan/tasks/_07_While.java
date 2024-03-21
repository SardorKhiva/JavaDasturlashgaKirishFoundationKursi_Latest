/**
 * @Project name: JavaDasturlashgaKirishFoundationKursi_Latest
 * @Description:
 * @Author: Leader_PC
 * @Date : 2024-01-17 21:22
 **/

package abramyan.tasks;

import java.util.Scanner;

public class _07_While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A, B, soni = 0;

        System.out.print("A: ");
        A = in.nextInt();
        System.out.print("B: ");
        B = in.nextInt();
        var A2 = A;

        if (0 < A && 0 < B) {
            while (A >= B) {
                A -= B;
                soni++;
            }
        }

        var nul = A2 - soni * B;    // umumiy qism - joylashgan qism
        System.out.println(nul + " qismi bo'sh qoladi");

        System.out.println();
        main(args);
        in.close();
    }
}

class While_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A, B, soni = 0;

        System.out.print("A: ");
        A = in.nextInt();
        System.out.print("B: ");
        B = in.nextInt();
        var A2 = A;

        if (0 < A && 0 < B) {
            while (A >= B) {
                A -= B;
                soni++;
            }
        }

        System.out.println(A2 + " uzunlikdagi kesmada " + B + " uzunlikdagi kesma " + soni + " marta to'liq joylashadi ");


        System.out.println();
        main(args);
        in.close();
    }
}

class While_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long k, n;
        long butun = 0, qoldiq;

        System.out.print("k < n, n: ");
        n = in.nextLong();
        System.out.print("k < n, k: ");
        k = in.nextLong();
        qoldiq = n;

        while (k <= n) {
            n -= k;
            butun++;
            qoldiq -= k;
        }

        System.out.println("Butun qismi = " + butun);
        System.out.println("Qoldiq qismi = " + qoldiq);

        System.out.println();
        main(args);
        in.close();
    }
}

class While_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n, daraja = 1, k = 0;
        System.out.print("n: ");        n = in.nextLong();

        if (n < 0) {              // n < 0 bo'lsa,
            n = Math.abs(n);      // n = |n|
        }

        while (n > daraja) {
            daraja *= 3;        // daraja = 1 ni 3 ga toki daraja n dan kichik ekan ko'paytirib boraveramiz
            ++k;                // n soni 3 ning nechanchi daraja ekanligi
        }

        if (n == daraja) {
            System.out.print(n + " = 3^" + k + " = ");
            sodda(k);
        } else {
            System.out.println(n + " soni 3 ning darajasi emas");
        }

        System.out.println();
        main(args);
        in.close();
    }

    private static void sodda(long k) {
        for (int i = 1; i <= k; i++) {
            System.out.print(3);
            if (i != k) {
                System.out.print(" * ");
            }
        }
    }

}

class While_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n, k = 0, ikki = 1;
        System.out.print("n: ");        n = in.nextLong();

        while (n > ikki) {
            ikki *= 2;
            ++k;
        }

        if (Math.pow(2, k) == n) {
            System.out.println(n + " = 2^" + k);
        }
        else {
            System.out.println(false);
        }

        System.out.println();
        main(args);
        in.close();
    }
}

class While_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n natural sonini kiriting: ");    var n = in.nextLong();
        long k = n, kopaytma = 1, i = 0;

        while (k > 0) {
            System.out.print(k);
            if (k > 2)    {    System.out.print(" * ");    }
            else          {    System.out.print(" = ");    }
            kopaytma *= k;
            k -= 2;
        }

        String formattedNumber = String.format("%,d", kopaytma).replace(",", "_");
        System.out.println(formattedNumber);

        System.out.println();
        main(args);
        in.close();
    }
}

//  BU class 123 456 kabi  chiqarish uchun
class Xonalar {
    public static void uchXona(String kopaytma) {
        String formattedNumber = String.format("%,d", kopaytma).replace(",", "_");
    }
}


class While_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n, k = 1;
        System.out.print("n: ");    n = in.nextLong();

        while (Math.pow(k, 2) < n) {
            k++;
        }
        System.out.println(k + "^2 > " + n);

        System.out.println();
        main(args);
        in.close();
    }
}

class While_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n;
        long k;
        do {
            System.out.print("n butun sonini kiriting: ");
            n = in.nextLine();
        } while (Long.parseLong(n) < 0);

        String son = n.replaceAll("\\D", "");   // faqat sonlarni qoldiradi!
        System.out.println(son);

        System.out.println();
        main(args);
        in.close();
    }
}

class While_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        main(args);
        in.close();
    }
}

class While_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        main(args);
        in.close();
    }
}

class While_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

class While_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

class While_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

class While_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

class While_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

class While_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

class While_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

class While_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

class While_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

class While_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

class While_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

class While_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

class While_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

class While_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

class While_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

class While_26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

class While_27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

class While_28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

class While_29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = 3;
        double a1 = 1, a2 = 2, a3, e;

        System.out.print("e = ");
        e = in.nextDouble();
        a3 = (a1 + (2 * a2)) / 3;

        while (!((Math.abs(a3 - a2)) < e)) {
            k++;
            var yangiHad = (a2 * (2 * a3)) / 3;
            a2 = a3;
            a3 = yangiHad;
        }

        System.out.println("Ak = " + a2);
        System.out.println("A(k-1) = " + a1);
        System.out.println("k = " + k);

        in.close();
    }
}

class While_30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}