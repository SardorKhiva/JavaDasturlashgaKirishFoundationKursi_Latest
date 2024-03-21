package abramyan.tasks;

import java.util.Scanner;

public class _01_Begin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int P;

        System.out.print("Kvadrat tomonini kiriting: ");
        a = in.nextInt();

        P = 4 * a;

        System.out.println("Kvadrat perimetri: " + P);
    }
}

class Begin_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a;
        double S;

        System.out.print("Kvadrat tomoni: ");
        a = in.nextInt();

        S = Math.pow(a, 2);     // a * a;

        System.out.println("Kvadratning yuzasi: " + S);
    }
}

class Begin_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a, b;
        double S, P;

        System.out.println("To'g'ri 4burchakning tomonlari a, b:");
        a = in.nextDouble();
        b = in.nextDouble();

        S = a * b;
        P = 2 * (a + b);

        System.out.println("To'g'ri 4burchakning yuzasi: " + S);
        System.out.println("To'g'ri 4burchakning perimetri: " + P);
    }
}

class Begin_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double d, L;

        System.out.print("Aylana diametri: ");
        d = in.nextDouble();

        L = Math.PI * d;

        System.out.println("Aylana uzunligi: " + L);
    }
}

class Begin_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a;
        double V;
        double S;

        System.out.print("Kubning yon tomoni yuzasini kiriting: ");
        a = in.nextDouble();

        V = Math.pow(a, 3);
        S = 6 * a * a;

        System.out.println("Kubning hajmi: " + V);
        System.out.println("Kubning yuzasi: " + S);
    }
}

class Begin_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a, b, c;
        double V, S;

        System.out.println("Parrallelipipedning tomonlarini kiriting: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        V = a * b * c;
        S = 2 * (a * b + b * c + a * c);

        System.out.println("Parrallelipipedning hajmi: " + V);
        System.out.println("Parrallelipipedning yuzasi: " + S);
    }
}

class Begin_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double R;
        double S, L;

        System.out.print("Doiraning radiusi:");
        R = in.nextDouble();

        L = 2 * Math.PI * R;
        S = Math.PI * Math.pow(R, 2);

        System.out.println("Doiraning uzunligi= " + L);
        System.out.println("Doiraning yuzasi=   " + S);
    }
}

class Begin_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b;
        double ar;

        System.out.println("2 ta son kiriting: ");
        a = in.nextInt();
        b = in.nextInt();

        ar = (a + b) / 2.;

        System.out.println(a + " va " + b + " ning o'rta arifmetigi= " + ar);
    }
}

class Begin_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long a, b;
        double geo;

        System.out.println("2 ta musbat son kiriting: ");
        a = in.nextLong();
        b = in.nextLong();

        geo = Math.sqrt(a * b);

        System.out.println(a + " va " + b + " ning o'rta geometrigi= " + geo);
    }
}

class Begin_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long a, b;
        double sum;     //+
        double mul;     //* multiplication
        double squ1, squ2;     //^2 square, kvadrati

        System.out.println("2 ta musbat son kiriting: ");
        a = in.nextLong();
        b = in.nextLong();

        sum = a + b;
        mul = a * b;
        squ1 = a * a;
        squ2 = b * b;

        System.out.println("a + b= " + sum);
        System.out.println("a * b= " + mul);
        System.out.println("a^2= " + squ1);
        System.out.println("b^2= " + squ2);
    }
}

class Begin_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a, b;
        double sum;         // +
        double mul;         // *
        double mod1, mod2;  // | x |

        System.out.println("2 ta son kiriting: ");
        a = in.nextDouble();
        b = in.nextDouble();

        sum = a + b;
        mul = a * b;
        mod1 = Math.abs(a);
        mod2 = Math.abs(b);

        System.out.println("a+b= " + sum);
        System.out.println("a*b= " + mul);
        System.out.println("|a|= " + mod1);
        System.out.println("|b|= " + mod2);

    }
}

class Begin_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a, b, c, P;

        System.out.println("To'g'ri 3burchakning katetlari (a,b): ");
        a = in.nextDouble();
        b = in.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));   // Math.sqrt( a * a + b * b )
        P = a + b + c;

        System.out.println("To'g'ri 3burchakning gipotenuzasi= " + c);
        System.out.println(" To'g'ri 3burchakning perimetri=    " + P);

    }
}

class Begin_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r1, r2;
        double s1, s2, s3;

        System.out.println("Umumiy markazga ega bo'lgan 2 ta aylana radiusi (r1, r2): ");
        r1 = in.nextInt();
        r2 = in.nextInt();

        s1 = Math.PI * r1;
        s2 = Math.PI * r2;
        s3 = Math.PI * (r1 - r2);

        if (r1 > r2) {
            System.out.println("Ularning yuzalari= " + s1 + " , " + s2);
            System.out.println("Yuzalari ayirmasi= " + s3);
        } else Begin_13.main(new String[]{});               /// JORIY METODNI QAYTA CHAQIRADI

    }
}

class Begin_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double L;       // aylana uzunligi
        double R;       // radiusi
        double S;       // yuzasi

        System.out.print("Aylana uzunligi: ");
        L = in.nextDouble();

        R = L / (2 * Math.PI);
        L = 2 * Math.PI * R;
        S = Math.PI * (R * R);

        System.out.println("Aylana radiusi= " + R);
        System.out.println("Aylana yuzasi= " + S);

    }
}

class Begin_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double S, d, R, PI = 3.14, L;

        System.out.print("Aylana yuzasi: ");
        S = in.nextDouble();

        R = Math.sqrt(S / PI);
        d = 2. * R;

        System.out.println("Aylana diametri= " + d);
        System.out.println("Aylana radiusi=  " + R);
    }
}

class Begin_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x1, x2;
        System.out.println("2 ta son kiriting: ");
        x1 = in.nextInt();
        x2 = in.nextInt();

        System.out.println("Sonlar o'qidagi nuqtalar orasidagi masofa= " + Math.abs(x2 - x1));
    }
}

class Begin_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;

        System.out.println("Sonlar o'qida a, b, c nuqtalarni kiriting: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        System.out.println(a + " va " + c + " kesmalar uzunligi= " + Math.abs(c - a));
        System.out.println(b + " va " + c + " kesmalar uzunligi= " + Math.abs(c - b));
        System.out.println("Kesmalar uzunligi yig'indisi= " + (Math.abs(c - a) + Math.abs(c - b)));
    }
}

class Begin_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c, ac, bc;

        System.out.println("a, b, c: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        ac = Math.abs(c - a);
        bc = Math.abs(b - c);

        System.out.println("Ko'paytmasi= " + ac * bc);
    }
}

class Begin_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x1, y1;
        int x2, y2;

        System.out.println("a nuqta koordinatalari (x1:y1) : ");
        x1 = in.nextInt();
        y1 = in.nextInt();
        System.out.println("b nuqta koordinatalari (x2:y2) : ");
        x2 = in.nextInt();
        y2 = in.nextInt();

        System.out.println("To'g'ri 4burchak perimetri= " + ((Math.abs(x2 - x1)) + Math.abs(y2 - y1) * 2));
        System.out.println("To'g'ri 4burchak yuzasi= " + ((Math.abs(x2 - x1)) * Math.abs(y2 - y1)));
    }
}

class Begin_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x1, y1, x2, y2;
        double f;

        System.out.println("Tekislikda berilgan a nuqta koordinatalari: ");
        x1 = in.nextInt();
        y1 = in.nextInt();
        System.out.println("Tekislikda berilgan b nuqta koordinatalari: ");
        x2 = in.nextInt();
        y2 = in.nextInt();

        f = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("Tekislikda berilgan 2 nuqta orasidagi masofa= " + f);
    }
}

class Begin_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x1, y1, x2, y2, x3, y3;
        double a, b, c, S, p;

        System.out.println("a nuqta koordinatalari: ");
        x1 = in.nextInt();
        y1 = in.nextInt();

        System.out.println("b nuqta koordinatalari: ");
        x2 = in.nextInt();
        y2 = in.nextInt();

        System.out.println("c nuqta koordinatalari: ");
        x3 = in.nextInt();
        y3 = in.nextInt();

        a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        b = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        c = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));

        p = (a + b + c) / 2;
        S = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Uchburchak yuzasi= " + S);
        System.out.println("Uchburchak perimetri= " + p);
    }
}

class Begin_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, a2, b, b2, c;

        System.out.print("a: ");
        a = in.nextInt();
        System.out.print("b: ");
        b = in.nextInt();
        a2 = a;
        b2 = b;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("1-variant: ");
        System.out.print(a + "\t");
        System.out.println(b);

        System.out.println("2-variant: ");
        c = a2;
        a2 = b2;
        b2 = c;
        System.out.print(a2 + "\t");
        System.out.println(b2);

    }
}

class Begin_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("a, b, c: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int a2 = a, b2 = b, c2 = c;
        /// 1 2 3 > 3 1 2

        a += b;
        b = a - b;
        a -= b;
        a += c;
        c = a - c;
        a -= c;
        System.out.println("1-variant: " + a + ", " + b + ", " + c);

        b = a2;
        c = b2;
        a = c2;
        System.out.print("2-variant: " + a + ", " + b + ", " + c);

        a = a + b + c;
        b = a - b - c;
        c = a - b - c;
        a = a - b - c;
        System.out.print("3-variant: " + a + ", " + b + ", " + c);
        in.close();
    }
}

class Begin_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, a2, b, b2, c, c2;

        System.out.print("a: ");        a = in.nextInt();
        System.out.print("b: ");        b = in.nextInt();
        System.out.print("c: ");        c = in.nextInt();

        a += b;
        b = a - b;
        a -= b;

        b += c;
        c = b - c;
        b -= c;

        System.out.println(a + ", " + b + ", " + c);

        a = a + b + c;
        c = a - b - c;
        b = a - b - c;
        a = a - b - c;
        System.out.println(a + ", " + b + ", " + c);
        in.close();
    }
}

class Begin_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("x= ");
        var x = in.nextFloat();
        var y = 3 * Math.pow(x, 6) - 6 * Math.pow(x, 2) - 7;
        System.out.println(3 + " * " + x + "^6 - 6 * " + x + "^2 - 7 = " + y);
    }
}

class Begin_26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x: ");
        var x = in.nextFloat();
        var y = 4 * Math.pow((x - 3), 6) - 7 * Math.pow((x - 3), 3) + 2;
        System.out.println(4 + " * " + "(" + x + " - 3)^6 - 7 * (" + x + " - 3)^3 + 2 = " + y);
    }
}

class Begin_27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("A: ");
        var A = in.nextDouble();

        System.out.println(
                A + "^2= " + Math.pow(A, 2) + ", \t" +
                        A + "^4= " + Math.pow(A, 4) + ", \t" +
                        A + "^8= " + Math.pow(A, 8)
        );
    }
}

class Begin_28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("A: ");
        var A = in.nextDouble();

        System.out.println(
                A + "^2= " + Math.pow(A, 2) + ", \t" +
                        A + "^3= " + Math.pow(A, 3) + ", \t" +
                        A + "^5= " + Math.pow(A, 5)
        );
    }
}

class Begin_29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("alfa burchakni gradusda kiriting: ");
        var aGrad = in.nextFloat();

        System.out.print("alfa burchak radianda= ");
        System.out.println(Math.toRadians(aGrad));
    }
}

class Begin_30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("alfa burchakni radianda kiritng: ");
        var a = in.nextFloat();

        System.out.println("alfa burchak gradusda= " + Math.toDegrees(a));
    }
}

class Begin_31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Farengeyt temperaturani kiriting: ");
        var tF = in.nextFloat();
        var tC = (tF - 32) * 5 / 9;
        System.out.println("Temperatura celsiyda= " + tC);
    }
}

class Begin_32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Celsiy gradus= ");
        var tC = in.nextFloat();
        var tF = 9 / 5 * tC + 32;
        System.out.println("Farengeyt gradus= " + tF);
    }
}

class Begin_33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Qancha kg konfet oldinggiz: ");
        var x = in.nextFloat();

        System.out.print(x + " kg konfet qancha turarkan: ");
        var A = in.nextFloat();
        var konfetNarhi = (A / x);

        System.out.println(x + " kg konfet " + A + " so'm bo'lsa, 1 kg konfet narhi= " + konfetNarhi + " so'm");

        System.out.print("Yana qancha kg konfet olmoqchisiz: ");
        var Y = in.nextFloat();
        var yKgNarhi = (Y * konfetNarhi);
        System.out.println(Y + " kg konfet narhi " + yKgNarhi + " so'm");
        System.out.println("Jami= " + (yKgNarhi + konfetNarhi) + " so'm");
    }
}

class Begin_34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Qancha kg shokolad oldinggiz: ");
        var x = in.nextFloat();

        System.out.print(x + " kg shokolad narhi: ");
        var a = in.nextFloat();
        var shokoladNarhi = (a / x);

        System.out.print("Qancha kg konfet oldinggiz: ");
        var y = in.nextFloat();

        System.out.print(y + " kg konfet narhi: ");
        var b = in.nextFloat();
        var konfetNarhi = (b / y);

        System.out.println("1 kg shokolad 1 kg konfetdan " + (shokoladNarhi - konfetNarhi) + " so'm qimmat");
    }
}

class Begin_35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Qayiq tezligi: ");
        var v = in.nextFloat();

        System.out.print("Daryo oqimi tezligi: ");
        var u = in.nextFloat();

        System.out.print("Qayiqning daryo oqimi bo'yicha harakatlanish vaqti: ");
        var t1 = in.nextFloat();

        System.out.print("Qayiqning oqimga qarshi harakatlanish vaqti: ");
        var t2 = in.nextFloat();

        float S = t1 * (u + v) + t2 * (v - u);

        System.out.println("Qayiq bosib o'tgan yo'l= " + S);
    }
}

class Begin_36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("1-avtomobil tezligi: ");
        var v1 = in.nextFloat();

        System.out.print("2-avtomobil tezligi: ");
        var v2 = in.nextFloat();

        System.out.print("1- va 2- avtolar orasidagi masofa: ");
        var S = in.nextFloat();

        System.out.print("Qancha vaqt uzoqlashdi: ");
        var T = in.nextFloat();

        var masofa = v1 * T + v2 * T + S;

        System.out.println(T + " vaqtdan keyin ular orasidagi masofa= " + masofa);
    }
}

class Begin_37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("1-avto tezligi: ");
        var v1 = in.nextFloat();

        System.out.print("2-avto tezligi: ");
        var v2 = in.nextFloat();

        System.out.print("ular orasidagi masofa: ");
        var s = in.nextFloat();

        System.out.print("Qancha vaqt bir-biriga qarab harakatlandi: ");
        var T = in.nextFloat();

        float S = s - (v1 * T + v2 * T);
        System.out.print(T + " vaqtdan keyin ular orasidagi masofa : " + S);
    }
}

class Begin_38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float a, b, x;

        System.out.print("a: ");
        a = in.nextFloat();

        System.out.print("b: ");
        b = in.nextFloat();

        // a * x + b = 0
        // 5 * x + 6 = 0;
        // 0 - 6 = -6
        // -6 / 5 = -1.2
        // 5 * -1.2 + 6 =

//        x = (0 - b) / a;
        x = -b / a;
        System.out.println(a + " * (" + x + ") + " + b + " = 0");
        System.out.println("x = (" + x + ")");
    }
}

class Begin_39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double A, B, C, D;
        double x1, x2;

        System.out.print("A: ");
        A = in.nextDouble();
        if (A == 0) {
            System.out.println("A 0 dan farqli bo'lishi kerak!");
            main(args);
        }

        System.out.print("B: ");
        B = in.nextDouble();

        System.out.print("C: ");
        C = in.nextDouble();

        D = Math.pow(B, 2) - (4 * A * C);
        x1 = (-B + Math.sqrt(D)) / (2 * A);
        x2 = (-B - Math.sqrt(D)) / (2 * A);

        System.out.println("A * x^2 + B * x + C = 0");
        System.out.println("x1= " + x1 + "\t x2= " + x2);
    }
}

class Begin_40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("a1, b1, c1: ");
        var a1 = in.nextFloat();
        var b1 = in.nextFloat();
        var c1 = in.nextFloat();

        System.out.println("a2, b2, c2: ");
        var a2 = in.nextFloat();
        var b2 = in.nextFloat();
        var c2 = in.nextFloat();

        var d = (a1 * b2 - a2 * b1);
        var x = (c1 * b2 - c2 * b1) / d;
        var y = (a1 * c2 - a2 * c1) / d;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}