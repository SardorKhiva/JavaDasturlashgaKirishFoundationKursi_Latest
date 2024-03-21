/**
 * @Project name: JavaDasturlashgaKirishFoundationKursi_Latest
 * @Description:
 * @Author: Leader_PC
 * @Date : 2024-01-17 21:14
 **/

package abramyan.tasks;

import java.util.Scanner;

import static abramyan.tasks.For_21.fact;

public class _06_For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k, n;

        System.out.print("Qaysi sonni chiqarmoqchisiz: ");
        k = in.nextInt();
        System.out.print(k + " ni necha marta ekranga chiqarmoqchisiz: ");
        n = in.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                System.out.println(i + "): " + k);
            }
        }
    }
}

class For_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, soni = 0;

        System.out.print("a: ");
        a = in.nextInt();
        System.out.print("b: ");
        b = in.nextInt();

        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(++soni + "): " + i + "\n");

            }
        } else {
            System.out.println("a b dan kichik bo'lsin!");
        }
        main(args);
    }
}

class For_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, soni = 0;

        System.out.print("a < b, a: ");
        a = in.nextInt();
        System.out.print("a < b, b: ");
        b = in.nextInt();

        if (a < b) {
            for (int i = b - 1; i > a; i--) {
                System.out.println(++soni + "): " + i);
            }
        }

    }
}

class For_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("1 kg konfet narhi: ");
        var konfetNarhi = in.nextFloat();

        if (konfetNarhi > 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " kg konfet narhi= " + i * konfetNarhi);
            }
        }

        main(args);
    }
}

class For_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float konfetNarhi;

        System.out.print("1 kg konfet narhi: ");
        konfetNarhi = in.nextFloat();

        if (konfetNarhi > 0) {
            for (float i = 1f;
                 i <= 10f;
                 i++) {
                System.out.println(i / 10f + " kg konfet narhi= " + Math.ceil(i / 10f * konfetNarhi));
            }
        }
    }
}

class For_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("1 kg konfet narhi: ");
        var konfetNarh = in.nextFloat();

        if (konfetNarh > 0) {
            for (float i = 12f; i <= 20f; i += 2f) {
                System.out.println(i / 10 + " kg konfet narhi= " + i / 10 * konfetNarh);
            }
        }

    }
}

class For_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, sum = 0;

        System.out.print("a: ");
        a = in.nextInt();
        System.out.print("b: ");
        b = in.nextInt();

        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else {
            System.out.println(a + " soni " + b + " dan katta bo'lishi kerak");
        }

        System.out.println("Summa= " + sum + '\n');
        main(args);
    }
}

class For_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, k = 1;

        System.out.print("a: ");
        a = in.nextInt();
        System.out.print("b: ");
        b = in.nextInt();

        if (a < b) {
            for (int i = a; i <= b; i++) {
                k *= i;
            }
        } else {
            System.out.println("a b dan kichik bo'lishi kerak");
        }

        System.out.println("Natija: " + k);

    }
}

class For_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, sum = 0;

        System.out.print("a: ");
        a = in.nextInt();
        System.out.print("b: ");
        b = in.nextInt();

        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum = sum + i * i;
            }
        } else {
            System.out.println("a b dan kichik bo'lsin");
        }

        System.out.println("Kvadratari yig'indisi: " + sum);

    }
}

class For_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        double S = 0;

        System.out.print("Limit, n: ");
        n = in.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                S = S + 1. / i;
                System.out.print("1/" + i);
                if (i < n) {
                    System.out.print(" + ");
                }
            }
        }

        System.out.printf(" = %.2f\n", S);     // . dan keyin 2 xona
        main(args);

    }
}

class For_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        double S = 0;

        System.out.print("n: ");
        n = in.nextInt();

        if (n > 0) {
            for (int i = 0; i <= n; i++) {
                System.out.print("(" + n + " + " + i + ")^2");
                S = S + Math.pow((n + i), 2);

                if (i < n) {
                    System.out.print(" + ");
                }
            }
        }

        System.out.printf(" = %.3f\n", S);
        main(args);

        // n = 5
        // S = n^2 + (n+1)^2 + (n+2)^2 + ... + (2 * n)^2
        // S = (5 + 0)^2 + (5+1)^2 + (5+2)^2 + (5+3)^2 + (5+4)^2 + (5+5)^2

    }
}

class For_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        double S = 0;

        System.out.print("n: ");
        n = in.nextInt();

        if (0 < n) {
            for (int i = 1, j = 1; i <= n; i++) {
                S = S + (j * 10 + i) / 10.;
                if (i % 10 == 0) j++;
                System.out.print(j + "." + i);

                if (i < n) {
                    System.out.print(" + ");
                }
            }
        }

        System.out.printf(" = %.3f\n", S);
    }
}

class For_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double sum = 0;

        System.out.print("n: ");
        var n = in.nextInt();

        if (0 < n) {
            for (int i = 1; i <= n; i++) {
//                bigSum = new BigDecimal(i + "0.1");                 // sum = 1.1 + 1.2 + ...
                int ishora = (i % 2 == 1) ? 1 : (-1);
                sum = sum + (1 + i / 10.0) * ishora;
            }
        }

        // Java da haqiqiy sonlarni 10 li kasr qismida noaniqliklar bo'lishi mumkinligi uchun
        // . dan keyin 1 xonani chiqaramiz, shu eng optimal yo'l menimcha:
        System.out.printf("%.1f", sum);

        System.out.println();
        main(args);
        in.close();     // skaner classidan olingan obyektni yopamiz
    }
}

class For_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long N, n, sum = 0;

        System.out.print("n^2, n: ");
        n = in.nextLong();
        var n2 = n;

        n = 2 * n - 1;

        if (0 < n) {
            for (N = 1; N <= n; N += 2) {
                sum += N;
                System.out.print(N + " ");
            }
        }
        System.out.println("\n" + n2 + "^2 = " + sum + '\n');
        main(args);
        in.close();
    }
}

class For_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n, k = 1;
        double a;

        System.out.print("a^n, a: ");
        a = in.nextDouble();
        System.out.print("a^n, n: ");
        n = in.nextLong();

        System.out.printf("%.0f", a);
        System.out.print("^" + n + " = ");
        if (0 < n) {
            for (int i = 1; i <= n; i++) {
                k *= a;
            }
        }
        System.out.println(k);

        System.out.println();
        main(args);
        in.close();
    }
}

class For_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // a^1 ... a^n
        System.out.print("a^n, a: ");
        var a = in.nextDouble();

        System.out.print("a^n, n: ");
        var n = in.nextInt();
        var result = 1.;

        // pow metodi orqali:
        /*
        if (0 < n) {
            for (int i = 1; i <= n; i++) {
                result = Math.pow(a, i);
                System.out.println(a + "^" + i + " = " + result);
            }
        }
        */

        // mustaqil usul:
        if (0 < n) {
            for (int i = 1; i <= n; i++) {
                result *= a;
                System.out.println(a + "^" + i + " = " + result);
            }
        }

        System.out.println();
        main(args);
        in.close();
    }
}

class For_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("a^n, a: ");
        var a = in.nextDouble();
        System.out.print("a^n, n: ");
        var n = in.nextLong();
        var sum = 1 + a;            //  = a^0 + a^1

        if (0 < n) {
            var temp = 1.0;
            for (int i = 1; i <= n; i++) {
                sum += temp *= a;
                System.out.println(a + "^" + i + " = " + temp);
            }
        }

        System.out.println(a + "^" + 0 + " + ... + " + a + "^" + n + " = " + sum);

        System.out.println();
        main(args);
        in.close();
    }
}

class For_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("a^n, a: ");
        var a = in.nextDouble();
        System.out.print("a^n, n: ");
        var n = in.nextLong();
        var sum = 0.0;
        var ishora = 1;

        /*
        a=2, n=3, a^0 - a^1 + a^2 - a^3 = 1 - 2 + 4 - 8 = -5
        a=2, n=4, a^0 - a^1 + a^2 - a^3 + a^4 = 1 - 2 + 4 - 8 + 16 = 11
        a=2, n=5, a^0 - a^1 + a^2 - a^3 + a^4 - a^5 = 1 - 2 + 4 - 8 + 16 - 32 = -21
         */
        if (0 < n) {
            for (int i = 0; i <= n; i++) {
                // if o'rniga ternar operator ishlatamiz:
                // agar i juft bo'lsa sum += a^i, aksincha bo'lsa sum -= a^i :
                sum = (i % 2 == 0) ? (sum += Math.pow(a, i)) : (sum -= Math.pow(a, i));
            }
        }
        System.out.println(sum);

        System.out.println();
        main(args);
        in.close();
    }
}

class For_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n!, n: ");
        var n = in.nextLong();
        var f = 1L;

        if (0 < n) {
            for (long i = 1; i <= n; i++) {
                f *= i;
                System.out.println(i + "! = " + f);
            }
        }

        System.out.println();
        main(args);
        in.close();
    }
}

class For_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n!, n: ");
        var n = in.nextLong();
        long sum = 0, f = 1;

        if (0 < n) {
            for (long i = 1; i <= n; i++) {
                f = f * i;
                sum = sum + f;

                System.out.print(i + "!");
                if (i < n) {
                    System.out.print(" + ");
                }
                if (i % 10 == 0) {
                    System.out.println();
                }
            }
        }

        System.out.println(" = " + sum);
        System.out.println();
        main(args);
        in.close();
    }
}

// 1 + 1/(1!) + 1/(2!) + ... + 1/(n!)
// 1/(0!) + 1/(1!) + 1/(2!) + ... + 1/(n!)

class For_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n;
        double sum = 0;

        System.out.print("n: ");
        n = in.nextLong();

        if (0 < n) {
            for (long i = 0; i <= n; i++) {
                var temp = 1. / fact(i);    // yengil va tushunarliroq bo'lishi uchun rekursiv metod ishlatamiz
                sum += temp;
                System.out.println(1 + "/" + i + "! = " + temp);    /// i = 0, 1 / 0! = 1
            }
        }

        System.out.println(sum);
        System.out.println();
        main(args);
        in.close();
    }

    // bu factorial metodi joriy package da ko'rinadi, public:
    public static long fact(long i) {
        if (i == 0 || i == 1) {
            return 1;
        } else {
            return i * fact(i - 1);
        }
    }
}

class For_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("x^0 / (0!) + x^1 / (1!) + x^2 / (2!) + ... + x^n / (n!) ");

        long n;
        double sum = 0, x;

        System.out.print("x: ");
        x = in.nextDouble();
        System.out.print("n: ");
        n = in.nextLong();

        if (0 < n) {
            for (long i = 0; i <= n; i++) {
                // asosiy logika, sodda sodda ko'rinishda:
                var surat = Math.pow(x, i);
                var maxraj = fact(i);       // yanada qulaylik uchun for21 dagi fact metodini ishlatamiz :)
                var kasr = surat / maxraj;
                sum += kasr;

                // misolni ko'rib borish uchun:
                System.out.println(x + "^" + i + " / " + i + "! = " + kasr);
                if (i < n) {    // + ko'rinishi uchun:
                    System.out.print(" + ");
                }
            }
        }

        System.out.println(" = " + sum);

        System.out.println();
        main(args);
        in.close();
    }
}

class For_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("   x^1 / (1!) - x^3 / (3!) + x^5 / (5!)  ... n  ");
        // x = 2, n = 3
        // 2^1 / 1! - 2^3 / 3! + 2^5 / 5! - 2^7 / 7!
        // 2 - 1.3(3) + 0.2(6) - 0.0254 = 0.9079

        var ishora = -1;
        double sum = 0;

        System.out.print("x: ");
        var x = in.nextDouble();
        System.out.print("n: ");
        var n = in.nextLong();

        if (0 < n) {
            for (long i = 1; i <= 2 * n + 1; i += 2) {
                ishora *= -1;
                var surat = Math.pow(x, i);     // x^i
                var maxraj = fact(i);            // i!
                var kasr = surat / maxraj;

                sum = sum + ishora * kasr;
            }
        }

        System.out.println("Natija: " + sum);

        System.out.println();
        main(args);
        in.close();
    }
}

class For_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        var ishora = -1;
        double sum = 0;

        System.out.print("x: ");
        var x = in.nextDouble();
        System.out.print("n: ");
        var n = in.nextLong();

        if (0 < n) {
            for (long i = 0; i <= 2 * n; i += 2) {
                ishora *= -1;
                var surat = Math.pow(x, i);     // x^i
                var maxraj = fact(i);            // i!
                var kasr = surat / maxraj;
                sum = sum + ishora * kasr;
            }
        }

        System.out.println("Natija: " + sum);
        System.out.println(Math.cos(x));

        System.out.println();
        main(args);
        in.close();
    }
}

class For_25 {        // x^1 / 1 - x^2 / 2 + x^3 / 3 - ... + x^n / n
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var sum = 0.0;
        var ishora = -1;

        //tekshirish uchun, x=2, n=4: 2 - 2 + 2.6 - 4 = -1.(3)
        System.out.print("x: ");
        var x = in.nextDouble();
        System.out.print("n: ");
        var n = in.nextLong();

        if (0 < n) {
            for (long i = 1; i <= n; i++) {
                ishora *= -1;
                var kasr = Math.pow(x, i) / i;
                System.out.println(x + "^" + i + "/" + i + " = " + kasr);
                sum += ishora * kasr;
            }
        }
        System.out.println("Summa = " + sum);

        System.out.println();
        main(args);
        in.close();
    }
}

// x^1 / 1 - x^3 / 3 + x^5 / 5
class For_26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n, i, ishora = -1;
        long j;                     // + - ko'rsatib borish uchun juft toqlikni ifodalaydi
        double x, sum = 0;
        char[] sign = {'-', '+'};   // + - ishora j bilan ishlaydi

        System.out.print("x: ");
        x = in.nextDouble();
        System.out.print("n: ");
        n = in.nextLong();

        if (0 < n) {
            for (i = 1, j = 1; i <= 2 * n + 1; i += 2, j++) {
                ishora *= -1;
                var kasr = Math.pow(x, i) / i;
                sum += kasr * ishora;
                // misolni to'liq ko'rib borish uchun:
                System.out.println(x + "^" + i + "/" + i + " = " + kasr);
                if (i < 2 * n + 1) {
                    System.out.println((j % 2 == 0) ? sign[1] : sign[0]);
                }
            }
        }
// tekshirish uchun, x=2, n=3: 2^1/1 - 2^3/3 + 2^5/5 - 2^7/7
// 2 - 2.(6) + 6.4 - 18.2857 = -12.55238095238095
        System.out.println("Summa = " + sum);
        System.out.println();
        main(args);
        in.close();
    }
}

// TODO for 27 ~ 40 gacha ishlash kerak, biroz murakkabroq
class For_27 {
    // x + (1 * x^3 / (2 * 3)) + 1 * 3 * x^5 / (2*4*5) + ... + 1*3*...(2*n-1) * x^2n+1 / (2*4*...*(2*n)*(2*n+1))
    // x = 5, n = 4
    /*
        (1 * 5^3 / 2 * 3)  = 125
      +
      
        (1 * 3 * 5^5 / 2 * 4 * 5) =
      +
        (1 * 3 * 5 * 5^7 / 2 * 4 * 6 * 7)
      +
        (1 * 3 * 5 * 7 * 5^9 / 2 * 4 * 6 * 8 * 9)
    */
    /*
        /// soddaroq ko'rinishi: x = 5, n = 4
        (1 * 5^3 / 2 * 3)  = 125 / 6
      +
        (3 * 5^5 / 2 * 4 * 5) = 9375 / 40
      +
        (3 * 5 * 5^7 / 2 * 4 * 6 * 7)   = 1'171'875 / 336
      +
        (3 * 5 * 7 * 5^9 / 2 * 4 * 6 * 8 * 9)   = 205'078'125 / 3'456
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        System.out.print("x haqiqiy son: ");        double x = in.nextDouble(); // Значение переменной x
//        System.out.print("n butun son: ");          int n = in.nextInt(); // Количество итераций
//        long i, j, k;
//        long suratKopaytma = 1;

//        for (i = 1, j = 2; i <= n; i++) {
//            for (k = 1; k <= i; k++) {
//                suratKopaytma = (2 * k) - 1;
//                System.out.print(suratKopaytma + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println(suratKopaytma);

        double x = 5.0; // Значение x
        int n = 4; // Количество итераций

        double sum = 0;
        double factorial = 1;

        for (int i = 0;
             i <= n;
             i++) {
            double numerator = 1;
            for (int j = 1;
                 j <= 2 * i + 1;
                 j++) {
                numerator *= x;
            }

            double denominator = 1;
            for (int j = 1;
                 j <= 2 * i + 1;
                 j++) {
                denominator *= j;
            }

            sum += numerator / denominator;
        }

        System.out.println("Сумма: " + sum);
        in.close();
    }
}

class For_28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        main(args);
        in.close();
    }
}

class For_29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        main(args);
        in.close();
    }
}

class For_30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        main(args);
        in.close();
    }
}

class For_31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        main(args);
        in.close();
    }
}

class For_32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        main(args);
        in.close();
    }
}

class For_33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        main(args);
        in.close();
    }
}

class For_34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        main(args);
        in.close();
    }
}

class For_35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        main(args);
        in.close();
    }
}

class For_36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        main(args);
        in.close();
    }
}

class For_37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        main(args);
        in.close();
    }
}

class For_38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        main(args);
        in.close();
    }
}

class For_39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        main(args);
        in.close();
    }
}

class For_40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        main(args);
        in.close();
    }
}