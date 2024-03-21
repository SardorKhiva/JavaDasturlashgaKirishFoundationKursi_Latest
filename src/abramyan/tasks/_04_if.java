/**
 * @Project name: JavaDasturlashgaKirishFoundationKursi_Latest
 * @Description: Abramyan Java tasks
 * @Author: Leader_PC
 * @Date : 2024-01-11 20:45
 **/

package abramyan.tasks;

import java.util.Scanner;

public class _04_if {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.print("x= ");
        var x = in.nextInt();

        if (x > 0) {
            System.out.println(++x);
        } else {
            System.out.println(x);
        }
    }
}

class If_02 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.println("x: ");
        var x = in.nextInt();

        if (x > 0) {
            System.out.println(++x);
        } else {
            System.out.println(x += 2);
        }

    }
}

class If_03 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.print("x: ");
        var x = in.nextInt();

        if (x > 0) {
            ++x;
        } else if (x < 0) {
            x -= 2;
        } else {
            x = 10;
        }

        System.out.println(x);
    }
}

class If_04 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        int a, b, c;
        byte sanoq = 0;

        System.out.print("a= ");
        a = in.nextInt();
        System.out.print("b= ");
        b = in.nextInt();
        System.out.print("c= ");
        c = in.nextInt();

        if (a > 0 || b > 0 || c > 0) {      // balkim bu if ortiqchadir?
            if (a > 0) {
                sanoq++;
            }
            if (b > 0) {
                sanoq++;
            }
            if (c > 0) {
                sanoq++;
            }
        }

        System.out.println("Sonlar ichida " + sanoq + " ta musbat son bor");
    }
}

class If_05 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        int a, b, c;
        byte manfiySanoq = 0;
        byte musbatSanoq = 0;

        System.out.print("a= ");
        a = in.nextInt();
        System.out.print("b= ");
        b = in.nextInt();
        System.out.print("c= ");
        c = in.nextInt();

        if (a > 0) {
            musbatSanoq++;
        }
        if (b > 0) {
            musbatSanoq++;
        }
        if (c > 0) {
            musbatSanoq++;
        }

        if (a < 0) {
            manfiySanoq++;
        }
        if (b < 0) {
            manfiySanoq++;
        }
        if (c < 0) {
            manfiySanoq++;
        }

        System.out.println("Sonlar ichida " + musbatSanoq + " ta musbat va " + manfiySanoq +
                " ta manfiy son bor");
    }
}

class If_06 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.print("x= ");
        var x = in.nextInt();
        System.out.print("y= ");
        var y = in.nextInt();

        int M = 0;      // max
        if (x != y) {           // sonlar teng bo'lmasa
            if (x > y) {
                M = x;
            } else {            // katta if borligi uchu bu yerda else if kerakmas
                M = y;
            }
        }

        System.out.println("Kattasi= " + Math.max(x, y));
        System.out.println("Kattasi= " + M);
    }
}

class If_07 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        byte tartibRaqam = 0;

        System.out.print("a= ");
        var a = in.nextInt();
        System.out.print("b= ");
        var b = in.nextInt();

        if (a > b) {
            tartibRaqam = 2;
        } else if (a < b) {
            tartibRaqam = 1;
        }

        System.out.println(tartibRaqam + "-son kichik");
    }
}

class If_08 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.print("a: ");
        var a = in.nextInt();
        System.out.print("b: ");
        var b = in.nextInt();

        int m = 0, M = 0;

        // oson usul:
        System.out.println("Kattasi = " + Math.max(a, b));
        System.out.println("Kichigi = " + Math.min(a, b));

        //
        if (a != b) {
            if (a > b) {
                M = a;
                m = b;
            } else {
                M = b;
                m = a;
            }
        }

        System.out.println("Kattasi: " + M);
        System.out.println("Kichigi: " + m);
    }
}

class If_09 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.print("a haqiqiy son kiriting: ");
        var a = in.nextFloat();
        System.out.print("b haqiqiy son kiriting: ");
        var b = in.nextFloat();

        if (a != b && a > b) {
            var c = a;
            a = b;
            b = c;
        }


        System.out.println("a kichigi: " + a);
        System.out.println("b kattasi: " + b);
    }
}

class If_10 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        int a, b;

        System.out.print("a: ");
        a = in.nextInt();
        System.out.print("b: ");
        b = in.nextInt();

        if (a != b) {
            a = b = a + b;
        } else {
            a = b = 0;
        }

        System.out.println("a = " + a + ", b = " + b);
    }
}

class If_11 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.print("a: ");
        var a = in.nextInt();
        System.out.print("b: ");
        var b = in.nextInt();


        if (a != b && a > b) {
            b = a;
        } else {
            a = b = 0;
        }

        System.out.println("a: " + a + "\tb: " + b);
    }
}

class If_12 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        int a, b, c;
        int m = 0;

        System.out.println("3 ta son kiriting: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a < b && b < c) {
            m = a;
        } else if (a > b && a < c) {
            m = b;
        } else {
            m = c;
        }

        System.out.println("Eng kichigi: " + Math.min(a, Math.min(b, c)));
        System.out.println("Eng kichigi: " + m);
    }
}

class If_13 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        int a, b, c;

        System.out.println("3 ta son kiriting: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        System.out.print("3 ta son ichidan o'rtachasi: ");
        if (b < a && a < c) {
            System.out.print(a);
        } else if (a < b && b < c) {
            System.out.print(b);
        } else {
            System.out.print(c);
        }
    }
}

class If_14 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.println("3 ta son kiriting: ");
        var a = in.nextInt();
        var b = in.nextInt();
        var c = in.nextInt();

        System.out.println("Kichigi: " + Math.min(Math.min(a, b), c));
        System.out.println("Kattasi: " + Math.min(Math.max(a, b), c));

        // qayta-qayta qiymat kiritib ko'rish uchun:
        main(args);
    }
}

class If_15 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.println("3 ta son kiriting: ");
        var a = in.nextInt();
        var b = in.nextInt();
        var c = in.nextInt();
        int m1, m2;

        var m = Math.min(Math.min(a, b), c);    // min ni topamiz

        if (m == a) {
            m1 = b;
            m2 = c;
        } else if (m == b) {
            m1 = a;
            m2 = c;
        } else {
            m1 = a;
            m2 = b;
        }

        System.out.println("2 ta eng kattasi: " + m1 + " " + m2);
    }
}

class If_16 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        double a, b, c;
        System.out.println("3 ta haqiqiy son kiriting: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        var m = Math.min(Math.min(a, b), c);    // a, b, c dan kichigini topamiz
        var M = Math.max(Math.min(a, b), c);    // a, b, c dan kattasini topamiz

        if (a == m && M == c) {   // agar kichigi a va kattasi c bo'lsa (a < b < c)
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a *= 1;
            b *= 1;
            c *= 1;
        }

        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
    }
}

class If_17 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        double a, b, c;

        System.out.println("3 ta haqiqiy son kiriting: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if ((a < b && b < c) || (a > b && b > c)) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a *= -1;
            b *= -1;
            c *= -1;
        }
    }
}

class If_18 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        int a, b, c;
        byte t = 0;

        System.out.println("3 ta butun son kiritng: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a == b) t = 3;     // c boshqacha
        else if (a == c) t = 2;     // b boshqacha
        else if (b == c) t = 1;     // a boshqacha

        if (t == 0) {
            System.out.println("Teng sonlar yo'q");
        }
        System.out.println(t + "-raqam boshqacha");
    }
}

class If_19 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        int a, b, c, d;
        byte t = 0;

        System.out.println("4 ta son kiriting: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();

        if (b == c && c == d) {
            t = 1;
        }   // a boshqacha
        else if (a == c && c == d) {
            t = 2;
        }   // b boshqacha
        else if (a == b && b == d) {
            t = 3;
        }   // c boshqacha
        else if (a == b && b == c) {
            t = 4;
        }  // d boshqacha

        if (t == 0) {
            System.out.println("3 ta o'zaro son yo'q");
        }

        System.out.println("O'zgacha son tartib raqami " + t);
    }
}

class If_20 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        int a, b, c;
        float masofa = 0;

        System.out.print("a: ");
        a = in.nextInt();
        System.out.print("b: ");
        b = in.nextInt();
        System.out.print("c: ");
        c = in.nextInt();

        if (a != b && a != c) {             // a b va c dan farqli bo'lsagina
            if (a < b && b < c) {           // a ga b yaqin
                masofa = Math.abs(b) - Math.abs(a);
            } else {                        // a ga c yaqin
                masofa = Math.abs(c) - Math.abs(a);
            }
        }

        System.out.println("Oraliq masofa = " + masofa);
    }
}

class If_21 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        int x = 0, y = 0;

        System.out.print("x: ");
        x = in.nextInt();
        System.out.print("y: ");
        y = in.nextInt();

        if (x >= 0 && y >= 0) {
            if (x > 0) {
                x = 1;
            }
            if (y > 0) {
                y = 2;
            }
        } else if (x < 0 && y < 0) {
            x = y = 3;
        }

        System.out.println("x: " + x + ", y: " + y);
    }
}

class If_22 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        int x, y;
        String chorak = "I ";

        System.out.print("x: ");
        x = in.nextInt();
        System.out.print("y: ");
        y = in.nextInt();

        if ((x != 0 && y != 0)) {           // x va y 0 dan farqli bo'lsa
            if (x < 0 && y > 0) {           // II chorak
                chorak = "II ";
            } else if (x < 0 && y < 0) {
                chorak = "III ";            // III chorak
            } else if (x > 0 && y < 0) {
                chorak = "IV";              // IV chorak
            }
            System.out.println(chorak + " chorakda\n");
        } else {
            System.out.println("0, korrdinata markazi");
        }

        main(args);
    }
}

class If_23 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        int x1 = 0, y1 = 0;     // a nuqta
        int x2 = 0, y2 = 0;     // b nuqta
        int x3 = 0, y3 = 0;     // c nuqta
        int x4 = 0, y4 = 0;     // d nuqta

        System.out.print("x1: ");
        x1 = in.nextInt();
        System.out.print("y1: ");
        y1 = in.nextInt();
        System.out.print("x2: ");
        x2 = in.nextInt();
        System.out.print("y2: ");
        y2 = in.nextInt();
        System.out.print("x3: ");
        x3 = in.nextInt();
        System.out.print("y3: ");
        y3 = in.nextInt();

        if (x1 == x2) {
            x4 = x3;
        } else if (x1 == x3) {
            x4 = x3;
        } else if (x2 == x3) {
            x4 = x1;
        }

        if (y1 == y2) {
            y4 = y3;
        } else if (y1 == y3) {
            y4 = y3;
        } else if (y2 == y3) {
            y4 = y1;
        }

        System.out.println("4-tomon koordinatalari: " + x4 + ":" + y4);
    }
}

class If_24 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        double x = 0, f = 0;

        System.out.print("x haqiqiy sonni kiriting: ");
        x = in.nextDouble();

        if (x > 0) {
            f = 2 * Math.sin(x);
        } else {
            f = x - 6;
        }

        System.out.println(f);
    }
}

class If_25 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        double f = 0, x = 0;

        System.out.print("x: ");
        x = in.nextDouble();

        if (x < -2 || x > 2) {
            f = 2 * x;
        } else {
            f = -3 * x;
        }

        System.out.println(f);
    }
}

class If_26 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        double f, x;

        System.out.print("x: ");
        x = in.nextDouble();

        if (x <= 0) {
            f = -x;
        } else if (0 < x && x < 2) {
            f = x * x;
        } else {
            f = 4;
        }

        System.out.println(f);

    }
}

class If_27 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        double f = 0, x = 0;
        boolean haqiqiyJuft, haqiqiyToq;

        System.out.print("x: ");
        x = in.nextDouble();

        haqiqiyJuft = x % 2 == 0;
        haqiqiyToq  = x % 2 != 0;

        /// bu masalada [) qavsda chapdagi son kiradi to'plamga, o'ngdagimas
        if (x < 0) {
            f = 0;
        }
        else if ( haqiqiyJuft ){
            f = 1;
        } else if (haqiqiyToq) {
            f = -1;
        }

        System.out.println("Javobi: " + f);
    }
}

class If_28 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        int yil = 2024;
        boolean kabisaYil = false;

        System.out.print("Yilni kiriting: ");
        yil = in.nextInt();

        if (yil % 4 == 0) {
            if ( yil % 100 == 0 ) {
                if ( yil % 400 == 0 ) {
                    kabisaYil = true;
                }
                else { kabisaYil = false; }
            }
            else {
                kabisaYil = true;
            }
        }

        System.out.println(yil + "-yil kabisa yilligi " + kabisaYil);
        main(args);
    }
}

class If_29 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        int x = 0;
        String ishora = "manfiy";     // musbat/manfiy
        String juft = "juft";       // juft/toqlik

        System.out.print("Son kiriting: ");
        x = in.nextInt();

        if (x > 0) {    // agar son 0 dan katta bo'lsa
            ishora = "musbat";
        }
        if (x == 0) {
            ishora = "";
        }
        if ( x % 2 != 0 ) {
            juft = "toq";
        }

        System.out.print(x + " soni ");
        System.out.println(ishora + " " + juft);

        main(args);
    }
}

class If_30  {

    public static void main(String[] args) {
        var in = new Scanner(System.in);

        int xonaSoni = 0;
        String sonJuft = "juft";
        String sonMusbat = "manfiy";

        System.out.print("0 < x < 1000 oraliqdagi son kiriting: ");
        var x = in.nextInt();

        // + - ga tekshir
        if (x > 0) {
            sonMusbat = "musbat";
        }
        if (x == 0) {
            sonMusbat = "";
        }

        // toqlikka tekshir:
        if (x % 2 != 0) {
            sonJuft = "toq";
        }

        xonaSoni = String.valueOf(x).length();  // x ni stringga o'tkazib xonalar sonini aniqlaymiz

        System.out.println(x + " soni " + xonaSoni + " xonali " + sonMusbat + " " + sonJuft);
    }
}