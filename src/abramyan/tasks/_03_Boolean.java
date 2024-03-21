/**
 * @Project name: JavaDasturlashgaKirishFoundationKursi_Latest
 * @Description: Abramyan Boolean tasks
 * @Author: Leader_PC
 * @Date : 2024-01-02 20:34
 **/

package abramyan.tasks;

import java.util.Random;
import java.util.Scanner;

public class _03_Boolean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("A butun sonini kiriting: ");
        var A = in.nextInt();

        System.out.println(A + " soni musbatligi " + (A > 0));
        var ok = A > 0;     // boolean ok = A > 0;
        System.out.println(A + " soni musbatligi " + ok);
    }
}

class Boolean_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Butun son kiriting: ");
        var a = in.nextInt();

        boolean ok = a % 2 == 1;

        System.out.println(a + " ning toqligi " + ok);
    }
}

class Boolean_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Butun son kiriting: ");
        var a = in.nextInt();

        boolean ok = a % 2 == 0;

        System.out.println(a + " ning juftligi " + ok);
    }
}

class Boolean_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("1-butun son: ");
        var a = in.nextInt();
        System.out.print("2-butun son: ");
        var b = in.nextInt();

        boolean ok = a > 2 && b <= 3;
        System.out.println(ok);

    }
}

class Boolean_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("1-butun son: ");
        var a = in.nextInt();
        System.out.print("2-butun son: ");
        var b = in.nextInt();

        boolean ok = a >= 0 || b < -2;
        System.out.println(ok);
    }
}

class Boolean_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("1-butun son: ");
        var a = in.nextInt();
        System.out.print("2-butun son: ");
        var b = in.nextInt();
        System.out.print("3-butun son: ");
        var c = in.nextInt();

        boolean ok = (a <= b && b <= c);
        System.out.println(ok);
    }
}

class Boolean_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("1-butun son: ");
        var a = in.nextInt();
        System.out.print("2-butun son: ");
        var b = in.nextInt();
        System.out.print("3-butun son: ");
        var c = in.nextInt();

        boolean ok = (a < b && b < c);
        System.out.println(ok);


    }
}

class Boolean_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("1-son: ");
        var a = in.nextInt();
        System.out.print("2-son: ");
        var b = in.nextInt();

        boolean ok = (a % 2 == 1 && b % 2 == 1);
        System.out.println("2isi ham toqligi" + ok);
    }
}

class Boolean_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("1-son: ");
        var a = in.nextInt();
        System.out.print("2-son: ");
        var b = in.nextInt();

        boolean ok = (a % 2 == 1 || b % 2 == 1);
        System.out.println("hech bo'lmasa birisi toqligi" + ok);

    }
}

class Boolean_10 {
    static int count = 1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int a, b;

        System.out.println(count + "-sikl: ");

//        System.out.print("1-son: ");
        // a = in.nextInt();
        a = rnd.nextInt(1_000) + 1;
        System.out.print("a = " + a);

//        System.out.print("\t2-son: ");
        b = rnd.nextInt(1_000) + 1;
        //b = in.nextInt();
        System.out.println("\tb = " + b);

        /// faqat biri toq:
        boolean ok = ((a % 2) != 0 && (b % 2) == 0) ||  // a toq
                ((a % 2) == 0 && (b % 2) != 0);    // b toq
        boolean ok2 = (a % 2 != 0) ^ (b % 2 != 0);

        System.out.println("Natija: \t");
        System.out.print(ok);
        System.out.println("\t" + ok2);
        System.out.println();

        while (count++ < 1_000) {
            try {
                main(args);
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
        }

    }
}

class Boolean_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("a: ");
        var a = in.nextInt();
        System.out.print("a: ");
        var b = in.nextInt();

        boolean ok = (a % 2 == 0 && b % 2 == 0) ||      // juft
                (a % 2 != 0 && b % 2 != 0);        // toq
        System.out.println(ok);
    }
}

class Boolean_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;
        boolean ok;
        byte musbat = 0;
        boolean ok2 = false;

        System.out.print("a: ");
        a = in.nextInt();
        if (a > 0) {
            musbat++;
        }
        System.out.print("b: ");
        b = in.nextInt();
        if (b > 0) {
            musbat++;
        }
        System.out.print("c: ");
        c = in.nextInt();
        if (c > 0) {
            musbat++;
        }

        ok = (a > 0 && b > 0 && c > 0);
        ok = musbat == 3;

        System.out.println("Hammasi musbatligi: " + ok);
        System.out.println("Hammasi musbatligi: " + ok2);
    }
}

class Boolean_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;
        boolean musbat;
        boolean bitMusbat;
        boolean isFirstBitSet;
        boolean bitMusbat2;

        System.out.print("a butun son: ");
        a = in.nextInt();
        System.out.print("b butun son: ");
        b = in.nextInt();
        System.out.print("c butun son: ");
        c = in.nextInt();

        musbat = a > 0 || b > 0 || c > 0;
        isFirstBitSet = ((a & 1) | (b & 1) | (c & 1)) == 1;   // ?
        bitMusbat = ((a & (1 << 31)) == 0) ||      // int a ni katta bitida 0 borligi, 0000_0000_0000_0000_0000_0000_0000_0001 > 1000_0000_0000_0000_0000_0000_0000_0000
                ((b & (1 << 31)) == 0) ||
                ((c & (1 << 31)) == 0);
        bitMusbat2 = ((a & Integer.MIN_VALUE) == 0) ||
                ((b & Integer.MIN_VALUE) == 0) ||
                ((c & Integer.MIN_VALUE) == 0);


        System.out.println("3 ta sondan hech bo'lmasa birisi musbatligi = " + musbat);
        System.out.println("2-variant = " + isFirstBitSet);
        System.out.println("3-variant = " + bitMusbat);
        System.out.println("4-variant = " + bitMusbat2);
    }
}

class Boolean_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean ok;     // faqat 1si musbat
        int a, b, c;
        System.out.print("a: ");
        a = in.nextInt();
        System.out.print("b: ");
        b = in.nextInt();
        System.out.print("c: ");
        c = in.nextInt();


        ok = ((a > 0) && (b <= 0) && (c <= 0)) ||        // +a, -b, -c 1 > 0 || 0 < 0 || 0 < 0
                ((a <= 0) && (b > 0) && (c <= 0)) ||        // -a, +b, -c
                ((a <= 0) && (b <= 0) && (c > 0));          // -a, -b, +c

        System.out.println("Faqat 1si musbatligi " + ok);
    }
}

class Boolean_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean ikkitaMusbat;
        int a, b, c;

        System.out.print("a: ");
        a = in.nextInt();
        System.out.print("b: ");
        b = in.nextInt();
        System.out.print("c: ");
        c = in.nextInt();

        ikkitaMusbat = (a > 0 && b > 0 && c < 0) ||     // +a +b -c
                (a < 0 && b > 0 && c > 0) ||     // -a +b +c
                (a > 0 && b < 0 && c > 0);       // +a -b +c

        System.out.println(ikkitaMusbat);
    }
}

class Boolean_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a;
        boolean ok, ok2, ok3;
        String numberStr;
        byte xona = 0;

        System.out.print("a: ");
        a = in.nextInt();
        numberStr = Integer.toString(a);    // int a ni stringga numberStr ga satr qilib copy qilamiz

        // agar son juft bo'lsa :
        if (a % 2 == 0) {
            ok = (a > 9 && a < 100);
            ok2 = numberStr.length() == 2;      // satr uzunligini 2 xonali ekanligini tekshiramiz

            // ok3 da sonni 10 ga bo'lamiz to a > 0 rost bo'lguncha, har bo'lganda xonalar sonini oshirib boramiz:
            while (a > 0) {
                a /= 10;
                xona++;
            }
            ok3 = xona == 2;
        }
        // aks holda false:
        else {
            ok = ok2 = ok3 = false;
        }

        System.out.println("2 xonali sonligi " + ok);
        System.out.println("2 xonali sonligi " + ok2);
        System.out.println("2 xonali sonligi " + ok3);
    }
}

class Boolean_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a;
        boolean ok;

        System.out.print("a: ");
        a = in.nextInt();

        ok = a > 99 && a < 1000 && a % 2 != 0;

        System.out.print("Berilgan son 3xonali toqligi " + ok);
    }
}

class Boolean_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;
        boolean ikkitaTeng, ikkitaTeng2, ikkitaTeng3, ikkitaTeng4;

        System.out.print("a: ");
        a = in.nextInt();
        System.out.print("b: ");
        b = in.nextInt();
        System.out.print("c: ");
        c = in.nextInt();

        // hech bo'lmaganda 2 ta son teng agar,
        ikkitaTeng = (a == b) || (b == c) || (a == c);                  // 2 tasi teng bo'lsa
        ikkitaTeng2 = (a - b == 0) || (b - c == 0) || (a - c == 0);     // 2 ta ayirmasi 0 bo'lsa
        ikkitaTeng3 = (a / b == 1) || (b / c == 1) || (a / c == 1);     // 2 ta son bo'linganda 1 bo'lsa
        ikkitaTeng4 = !(a != b) || !(b != c) || !(a != c);              // double negation, 1-variant kabi

        System.out.println("Hech bo'lmaganda 2 tasi tengligi " + ikkitaTeng);
        System.out.println("Hech bo'lmaganda 2 tasi tengligi " + ikkitaTeng2);
        System.out.println("Hech bo'lmaganda 2 tasi tengligi " + ikkitaTeng3);
        System.out.println("Hech bo'lmaganda 2 tasi tengligi " + ikkitaTeng4);
    }
}

class Boolean_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;
        boolean uzaroQarshi = false;
        boolean uzaroQarshi2 = false;

        System.out.print("a: ");
        a = in.nextInt();
        System.out.print("b: ");
        b = in.nextInt();
        System.out.print("c: ");
        c = in.nextInt();

        uzaroQarshi = (a / b == -1) || (b / c == -1) || (a / c == -1);
        uzaroQarshi2 = (a + b == 0) || (b + c == 0) || (a + c == 0);

        System.out.println("2 ta o'zaro qarama-qarshi sonlar mavjudligi " + uzaroQarshi);
        System.out.println("2 ta o'zaro qarama-qarshi sonlar mavjudligi " + uzaroQarshi2);

    }
}

class Boolean_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a;
        boolean aralashRaqam = false;
        int bir, on, yuz;

        do {
            System.out.print("3 xonali son kiriting: ");
            a = in.nextInt();
        } while (!(a > 99 && a < 1000));

        bir = a % 10;
        on = a % 100 / 10;
        yuz = a / 100;

        aralashRaqam = (bir != on && on != yuz);

        System.out.println("Barcha raqamlari har xilligi " + aralashRaqam + '\n');

        main(args);
    }
}

class Boolean_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a;
        boolean oshadiganRaqam = false;
        boolean oshadiganRaqam2 = false;
        int bir, on, yuz;

        do {
            System.out.print("3 xonali son kiriting: ");
            a = in.nextInt();
        } while (!(a > 99 && a < 1000));

        bir = a % 10;
        on = a % 100 / 10;
        yuz = a / 100;

        oshadiganRaqam = yuz < on && on < bir;
        oshadiganRaqam2 = yuz - on < 0 && on - bir < 0;

        System.out.println("Raqamlar o'sishi " + oshadiganRaqam);
        System.out.println("Raqamlar o'sishi " + oshadiganRaqam2);
        System.out.println();

        main(args);
    }
}

class Boolean_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a;
        boolean oshadiganRaqam = false;
        boolean kamayadiganRaqam = false;
        boolean natija;
        int bir, on, yuz;

        do {
            System.out.print("3 xonali son kiriting: ");
            a = in.nextInt();
        } while (!(a > 99 && a < 1000));

        bir = a % 10;
        on = a % 100 / 10;
        yuz = a / 100;

        oshadiganRaqam = yuz < on && on < bir;          // raqamlar oshadigan
        kamayadiganRaqam = yuz > on && on > bir;        // raqamlar kamayadigan
        natija = oshadiganRaqam || kamayadiganRaqam;    // oshishi yoki kamayishi true bo'lsa

        System.out.println("Raqamlar o'sishi yoki kamayishi " + oshadiganRaqam);
        System.out.println();

        main(args);
    }
}

class Boolean_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x;
        boolean palindromlik;       // 121, 232, 252, ...

        do {
            System.out.print("3 xonali son kiriting: ");
            x = in.nextInt();
        } while (!(x > 99 && x < 1000));

        palindromlik = x % 10 == x / 100;

        System.out.println("Palindromligi " + palindromlik);
        System.out.println();

        main(args);
    }
}

class Boolean_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c, d;
        boolean ildizli = false;

        do {
            System.out.print("a: ");
            a = in.nextInt();
        } while (a == 0);

        System.out.print("b: ");
        b = in.nextInt();
        System.out.print("c: ");
        c = in.nextInt();

        d = b * b - 4 * a * c;
        ildizli = d > 0;

        System.out.println("Diskriminant haqiqiy ildizga egaligi " + ildizli);
    }
}

class Boolean_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, y;
        boolean II_chorak = false;

        System.out.print("x korrdinata: ");
        x = in.nextInt();
        System.out.print("y korrdinata: ");
        y = in.nextInt();

        II_chorak = x < 0 && y > 0;

        System.out.println("x:y koordinata II chorakdaligi " + II_chorak);
    }
}

class Boolean_26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, y;
        boolean IV_chorak = false;

        System.out.print("x: ");
        x = in.nextInt();
        System.out.print("y: ");
        y = in.nextInt();

        IV_chorak = x > 0 && y < 0;

        System.out.println("IV chorakdaligi " + IV_chorak);
    }
}

class Boolean_27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, y;
        boolean II_yoki_III;

        System.out.print("x: ");
        x = in.nextInt();
        System.out.print("y: ");
        y = in.nextInt();

        II_yoki_III = (x < 0 && y > 0) || (x < 0 && y < 0);

        System.out.println("II yoki III chorakdaligi " + II_yoki_III);
    }
}

class Boolean_28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, y;
        boolean I_yoki_III;

        System.out.print("x: ");
        x = in.nextInt();
        System.out.print("y: ");
        y = in.nextInt();

        I_yoki_III = (x > 0 && y > 0) || (x < 0 && y < 0);

        System.out.println("I yoki III chorakdaligi " + I_yoki_III);
    }
}

class Boolean_29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, y, x1, y1, x2, y2;
        boolean ok = false;

        System.out.print("Chap yuqori cho'qqisi, x1: ");
        x1 = in.nextInt();
        System.out.print("Chap yuqori cho'qqisi, y1: ");
        y1 = in.nextInt();

        System.out.print("O'ng pastki cho'qqisi, x2: ");
        x2 = in.nextInt();
        System.out.print("O'ng pastki cho'qqisi, y2: ");
        y2 = in.nextInt();

        System.out.print("x koordinata: ");
        x = in.nextInt();
        System.out.print("y koordinata: ");
        y = in.nextInt();

        if (x > 0 && y > 0) {
            ok = (x > x1 && x < x2) && (y > y1 && y < y2);
        }

        System.out.println(ok);
    }
}

class Boolean_30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;
        boolean tengTomonli3burchakligi = false;

        System.out.print("a: ");
        a = in.nextInt();
        System.out.print("b: ");
        b = in.nextInt();
        System.out.print("c: ");
        c = in.nextInt();

        tengTomonli3burchakligi = (a == b && b == c);

        System.out.println("Teng tomonli 3burchakligi " + tengTomonli3burchakligi);
    }
}

class Boolean_31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;
        boolean tengYonli3burchak = false;

        System.out.print("a: ");
        a = in.nextInt();
        System.out.print("b: ");
        b = in.nextInt();
        System.out.print("c: ");
        c = in.nextInt();

        tengYonli3burchak = a == b || b == c || a == c;
        System.out.println(tengYonli3burchak);
    }
}

class Boolean_32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;
        boolean tugriBurchakli = false;

        System.out.print("a: ");
        a = in.nextInt();
        System.out.print("b: ");
        b = in.nextInt();
        System.out.print("c: ");
        c = in.nextInt();

        tugriBurchakli = (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) ||
                (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)) ||
                (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println(tugriBurchakli);
    }
}

class Boolean_33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;
        boolean trueTriangle = false;

        System.out.print("a: ");
        a = in.nextInt();
        System.out.print("b: ");
        b = in.nextInt();
        System.out.print("c: ");
        c = in.nextInt();

        trueTriangle = (a + b > c) ||
                (b + c > a) ||
                (a + c > b);

        System.out.println(trueTriangle);
    }
}

class Boolean_34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, y;
        boolean ok = false;

        do {
            System.out.print("x: ");
            x = in.nextInt();
            System.out.print("y: ");
            y = in.nextInt();
        } while ( !((x > 0 && y > 0) && (x < 9 && y < 9)) );    // x va y 0 va 9 oraliqda bo'lsin

        ok = (x + y) % 2 != 0;      // x + y == toq son

        System.out.println("Oq katakligi " + ok);
    }
}

class Boolean_35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x1, y1, x2, y2;
        boolean birXilRang = false;

        System.out.print("x1: ");
        x1 = in.nextInt();
        System.out.print("y1: ");
        y1 = in.nextInt();
        System.out.print("x2: ");
        x2 = in.nextInt();
        System.out.print("y2: ");
        y2 = in.nextInt();

        birXilRang = ( (x1 + y1) % 2 == 0) && ( (x2 + y2) % 2 == 0 ) ||   // qora, juft
                     ( (x1 + y1) % 2 != 0) && ( (x2 + y2) % 2 != 0 );     // oq, toq

        System.out.println("Figura bir xil ranglarda harakatlanganligi " + birXilRang);
    }
}

class Boolean_36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x1, y1, x2, y2;
        boolean ruh = false;    // ruh faqat gorizontal yoki vertikal yuradi

        System.out.print("x1: ");
        x1 = in.nextInt();
        System.out.print("y1: ");
        y1 = in.nextInt();
        System.out.print("x2: ");
        x2 = in.nextInt();
        System.out.print("y2: ");
        y2 = in.nextInt();

        ruh = (x1 == x2) || (y1 == y2);

        System.out.println("Ruhning yurishi " + ruh);
    }
}

// TODO: 37 dan 40 gacha tugatish!

class Boolean_37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x1, y1, x2, y2;
        boolean shoh = false;    // shoh har tomonga 1 odimdan yura oladi

        do {
            System.out.print("x1: ");            x1 = in.nextInt();
            System.out.print("y1: ");            y1 = in.nextInt();
            System.out.print("x2: ");            x2 = in.nextInt();
            System.out.print("y2: ");            y2 = in.nextInt();
        } while ( !((x1 > 0 && y1 > 0 && x2 > 0 && y2 > 0) &&    // x1 y1 x2 y2 > 0
                  (x1 < 9 && y1 < 9 && x2 < 9 && y2 < 9)) );     // x1 y1 x2 y2 < 9

//        shoh =


    }
}

class Boolean_38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

class Boolean_39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

class Boolean_40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}
