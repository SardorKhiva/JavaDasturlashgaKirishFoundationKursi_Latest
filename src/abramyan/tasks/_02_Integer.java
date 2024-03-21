/**
 * @Project name: JavaLatest
 * @Description:
 * @Author: Leader_PC
 * @Date : 2023-12-11 22:18
 **/

package abramyan.tasks;

import java.util.Random;
import java.util.Scanner;

public class _02_Integer {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("1-30 gacha oraliqdagi Integer masalasidan birini tanlang: ");
        int x = in.nextInt();

        if (x > 0 && x < 31) {
            switch (x) {
                case 1: {
                    Integer_01.main(new String[]{});
                    break;
                }
                case 2: {
                    Integer_02.main(new String[]{});
                    break;
                }
                case 3: {
                    Integer_03.main(new String[]{});
                    break;
                }
                case 4: {
                    Integer_04.main(new String[]{});
                    break;
                }
                case 5: {
                    Integer_05.main(new String[]{});
                    break;
                }
                case 6: {
                    Integer_06.main(new String[]{});
                    break;
                }
                case 7: {
                    Integer_07.main(new String[]{});
                    break;
                }
                case 8: {
                    Integer_08.main(new String[]{});
                    break;
                }
                case 9: {
                    Integer_09.main(new String[]{});
                    break;
                }
                case 10: {
                    Integer_10.main(new String[]{});
                    break;
                }
                case 11: {
                    Integer_11.main(new String[]{});
                    break;
                }
                case 12: {
                    Integer_12.main(new String[]{});
                    break;
                }
                case 13: {
                    Integer_13.main(new String[]{});
                    break;
                }
                case 14: {
                    Integer_14.main(new String[]{});
                    break;
                }
                case 15: {
                    Integer_15.main(new String[]{});
                    break;
                }
                case 16: {
                    Integer_16.main(new String[]{});
                    break;
                }
                case 17: {
                    Integer_17.main(new String[]{});
                    break;
                }
                case 18: {
                    Integer_18.main(new String[]{});
                    break;
                }
                case 19: {
                    Integer_19.main(new String[]{});
                    break;
                }
                case 20: {
                    Integer_20.main(new String[]{});
                    break;
                }
                case 21: {
                    Integer_21.main(new String[]{});
                    break;
                }
                case 22: {
                    Integer_22.main(new String[]{});
                    break;
                }
                case 23: {
                    Integer_23.main(new String[]{});
                    break;
                }
                case 24: {
                    Integer_24.main(new String[]{});
                    break;
                }
                case 25: {
                    Integer_25.main(new String[]{});
                    break;
                }
                case 26: {
                    Integer_26.main(new String[]{});
                    break;
                }
                case 27: {
                    Integer_27.main(new String[]{});
                    break;
                }
                case 28: {
                    Integer_28.main(new String[]{});
                    break;
                }
                case 29: {
                    Integer_29.main(new String[]{});
                    break;
                }
                case 30: {
                    Integer_30.main(new String[]{});
                    break;
                }
            }
        } else {
            System.out.println("Bunday raqamli integer masala yo'q!");
            main(args);
        }

    }
}

class Integer_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Uzunlik, sm: ");
        var l = in.nextInt();
        System.out.println("Uzunlik metrda= " + l / 100);
    }
}

class Integer_02 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("Massa, kg: ");
        var massa = in.nextInt();
        System.out.println("Massa, tonna: " + massa / 1000);
    }
}

class Integer_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("File size in byte: ");
        var SizeByte = in.nextInt();
        System.out.println("File size in kibibyte: " + SizeByte / 1024);
    }
}

class Integer_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("a kesma: ");
        var a = in.nextInt();

        System.out.print("b kesma: ");
        var b = in.nextInt();

        System.out.println("a kesma b kesmada " + (a / b) + " marta joylashgan");
    }
}

class Integer_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a kesma: ");
        var a = in.nextInt();

        System.out.print("b kesma: ");
        var b = in.nextInt();

        System.out.println("a kesma b kesmada " + (a / b) + " marta joylashgan");
        System.out.println("joylashmay qolgan qismi: " + (a % b));
    }
}

class Integer_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("2 xonali son kiriting: ");
        var son = in.nextInt();

        if (!(son > 9 && son < 100)) {
            System.out.println("Son 2 xonali emas!");
            main(args);
        }

        System.out.println("10 liklar xonasidagi raqami: " + son / 10);
        System.out.println("1 liklar xonasidagi raqami: " + son % 10);
    }
}

class Integer_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int son, s = 0;

        do {
            System.out.print("2 xonali son kiriting: ");
            son = in.nextInt();
            s = (son / 10) + (son % 10);
        } while (son < 10 || son > 99);

        System.out.println("Sonning raqamlari yig'indisi: " + s);
    }
}

class Integer_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int son, revers;
        do {
            System.out.print("2 xonali son kiriting: ");
            son = in.nextInt();
        } while (son < 10 || son > 100);

        revers = (son % 10) * 10 + son / 10;

        System.out.println("Natija: " + revers);
    }
}

class Integer_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int son;

        do {
            System.out.print("3 xonali son kiriting: ");
            son = in.nextInt();
        } while (son > 999 || son < 100);

        System.out.println("100 lar xonasidagi raqam: " + son / 100);
    }
}

class Integer_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int son;

        do {
            System.out.print("3 xonali son kiriting: ");
            son = in.nextInt();
        } while (son > 999 || son < 100);

        System.out.println("1 liklar xonasidagi raqam: " + son % 10);
        System.out.println("10 liklar xonasidagi raqam: " + (son / 10) % 10);

    }
}

class Integer_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int son, sum = 0;

        do {
            System.out.print("3 xonali son kiriting: ");
            son = in.nextInt();
        } while (son > 999 || son < 100);

//        int sum = (son / 100) + ( son / 10 ) % 10 + (son % 10);
        sum = son / 100 +           // 100
                son / 10 % 10 +     // 10
                son % 10;           // 1

        System.out.println("raqamlari yig'indisi: " + sum);
    }
}

class Integer_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int son, teskari;

        do {
            System.out.println("3 xonali son kiriting: ");
            son = in.nextInt();
        } while (son > 999 || son < 100);

        teskari = son % 10 * 100 +             // 123 => 3 * 100 +
                son / 10 % 10 * 10 +         // 123 => 2 * 10 +
                son / 100;                   // 123 => 3

        System.out.println(teskari);

    }
}

class Integer_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int son, natija;
        do {
            System.out.println("3 xonali son kiriting: ");
            son = in.nextInt();
        } while (son > 999 || son < 100);

        // 123 => 231

        natija = ((son / 10 % 10) * 100) +      // 123 => 2 * 100 +
                ((son % 10) * 10) +            // 123 => 3 * 10
                (son / 100);                     // 123 => 1

        System.out.println(son + " => " + natija);
    }
}

class Integer_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int son, natija;

        do {
            System.out.print("3 xonali son kiriting: ");
            son = in.nextInt();
        } while (son > 999 || son < 100);

        // 123 => 312
        natija = son % 10 * 100 +   // 123 => 3 * 100
                son / 100 * 10 +   // 123 => 1 * 10
                son / 10 % 10;     // 123 => 2

        System.out.println("Natija: " + natija);
    }
}

class Integer_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var rand = new Random();

        int son, natija;

        System.out.print("3 xonali son: ");
//            son = in.nextInt();

        son = rand.nextInt(900) + 100;
        System.out.print(son);

        // 123 => 213
        natija = son / 10 % 10 * 100 +     // 123 => 2 * 100
                son / 100 * 10 +          // 123 => 1 * 10
                son % 10;                 // 123 => 3

        System.out.println(" => " + natija);

        try {
            Thread.sleep(1000);
            main(args);
        } catch (InterruptedException e) {
        }
    }
}

class Integer_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int son, natija;

        do {
            System.out.print("3 xonali son kiriting: ");
            son = in.nextInt();
        } while (son > 999 || son < 100);

        // 123 => 132
        natija = son / 100 * 100 +        // 123 => 1 * 100
                son % 10 * 10 +          // 123 => 3 * 10
                son / 10 % 10;           // 123 => 2

        System.out.println("Natija: " + natija);
    }
}

class Integer_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int son, yuzlikRaqam;

        do {
            System.out.print("4 xonali son kiriting: ");
            son = in.nextInt();
        } while (son < 1000);

        // 1234 => 2
        yuzlikRaqam = son / 100 % 10;

        System.out.println("100lar xonasidagi raqam: " + yuzlikRaqam);
        main(args);
    }
}

class Integer_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int son, minglikRaqam;

        do {
            System.out.print("999 dan katta son kiriting: ");
            son = in.nextInt();
        } while (son < 1000);

        // 1234 1
        // 12345 2
        minglikRaqam = son / 1000 % 10;

        System.out.println("1000liklar xonasidagi raqam: " + minglikRaqam);
        main(args);
    }
}

class Integer_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;      // kunBoshi

        System.out.print("Kun boshidan boshlab necha soniya o'tganini kiriting: ");
        n = in.nextInt();

        System.out.println("Kun boshidan boshlab " + (n / 60) + " daqiqa o'tibdi");
        main(args);
    }
}

class Integer_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;      // kunBoshi

        System.out.print("Kun boshidan boshlab necha soniya o'tganini kiriting: ");
        n = in.nextInt();

        System.out.println("Kun boshidan boshlab " + (n / 3600) + " soat o'tibdi\n");
        main(args);
    }
}

class Integer_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;      // kunBoshi

        System.out.print("Kun boshidan boshlab necha soniya o'tganini kiriting: ");
        n = in.nextInt();

        System.out.println("Kun boshidan boshlab " + (n / 60) + " daqiqa va " + (n % 60) + " soniya o'tibdi\n");
        main(args);
    }
}

class Integer_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;      // kunBoshi

        System.out.print("Kun boshidan boshlab necha soniya o'tganini kiriting: ");
        n = in.nextInt();

        if (n >= 3600) {
            System.out.println("Kun boshidan boshlab " + (n / 3600) + " soat va " + (n % 60) + " soniya o 'tibdi\n");
        } else {
            System.out.println(" Kun boshidan boshlab 0 soat va " + n + " soniya o'tibdi");
        }

        System.out.println();
        main(args);
    }
}

class Integer_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int soat, daqiqa = 0, soniya = 0;

        System.out.println("Kun boshidan boshlab qancha soniya o'tgan: ");
        var n = in.nextInt();

        // 3666 soniya = 1 soat, 1 daqiqa, 6 soniya

        soat = n / 3600;  // 1-usul

//        daqiqa = (n - soat * 60) / 3600;      // 1- usul
        daqiqa = n % 3600 / 60;             // 2- usul

//        soniya = n - (daqiqa * 60 + soat * 3600); // 1-usul
        soniya = n % 3600 % 60; // 2-usul

        System.out.println("Soat= " + soat);
        System.out.println("Daqiqa= " + daqiqa);
        System.out.println("Soniya= " + soniya);

//        System.out.println(n + "soniya =" + soat + " soat, " + daqiqa + " daqiqa, " + soniya + " soniya");
        main(args);
    }
}

class Integer_24 {   // commentga olingani ham oddiyroq usulda, commentsiz holatda 1-365 gacha o'zi kiritib chiqadi

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int k;

        /*
        do {
            System.out.print("1-365 oraliqda yil kunini kiriting: ");
            k = in.nextInt();
        } while (k < 1 || k > 365);
         */

//        k = rnd.nextInt(365) + 1;

        try {
            for (int i = 1; i < 366; i++) {
                k = i;
                getK(k);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
        }

//        main(args);

    }

    public static void getK(int k) {
        String[] hafta = {"yakshanba", "dushanba", "seshanba", "chorshanba", "payshanba", "juma", "shanba"};

        switch (k % 7) {
            case 0: {
                System.out.println("Yilning " + k + "-kuni " + hafta[0]);
                break;
            }
            case 1: {
                System.out.println("Yilning " + k + "-kuni " + hafta[1]);
                break;
            }
            case 2: {
                System.out.println("Yilning " + k + "-kuni " + hafta[2]);
                break;
            }
            case 3: {
                System.out.println("Yilning " + k + "-kuni " + hafta[3]);
                break;
            }
            case 4: {
                System.out.println("Yilning " + k + "-kuni " + hafta[4]);
                break;
            }
            case 5: {
                System.out.println("Yilning " + k + "-kuni " + hafta[5]);
                break;
            }
            case 6: {
                System.out.println("Yilning " + k + "-kuni " + hafta[6]);
                break;
            }

        }
//        System.out.println();
    }
}

class Integer_25 {
    private static final String h[] = {"Yakshanba", "Dushanba", "Seshanba", "Chorshanba", "Payshanba", "Juma", "Shanba"};    // hafta kunlari nomi

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 365; i++) {
            goDate(i);
        }
    }

    public static void goDate(int k) {
        switch (k % 7) {
            case 0: {
                System.out.println("Yilning " + k + "-kuni " + h[3]);
                break;
            }
            case 1: {
                System.out.println("Yilning " + k + "-kuni " + h[4]);
                break;
            }
            case 2: {
                System.out.println("Yilning " + k + "-kuni " + h[5]);
                break;
            }
            case 3: {
                System.out.println("Yilning " + k + "-kuni " + h[6]);
                break;
            }
            case 4: {
                System.out.println("Yilning " + k + "-kuni " + h[0]);
                break;
            }
            case 5: {
                System.out.println("Yilning " + k + "-kuni " + h[1]);
                break;
            }
            case 6: {
                System.out.println("Yilning " + k + "-kuni " + h[2]);
                break;
            }
        }
    }
}

class Integer_26 {
    private static final String[] h = {"", "dushanba", "seshanba", "chorshanba", "payshanba", "juma", "shanba", "yakshanba"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 1; i < 366; i++) {
            goDate(i);
        }
    }

    private static void goDate(int i) {

        switch (i % 7 + 1) {
            case 1: {
                System.out.println("Yilning " + i + "-kuni " + h[1]);
                break;
            }
            case 2: {
                System.out.println("Yilning " + i + "-kuni " + h[2]);
                break;
            }
            case 3: {
                System.out.println("Yilning " + i + "-kuni " + h[3]);
                break;
            }
            case 4: {
                System.out.println("Yilning " + i + "-kuni " + h[4]);
                break;
            }
            case 5: {
                System.out.println("Yilning " + i + "-kuni " + h[5]);
                break;
            }
            case 6: {
                System.out.println("Yilning " + i + "-kuni " + h[6]);
                break;
            }
            case 7: {
                System.out.println("Yilning " + i + "-kuni " + h[7]);
                break;
            }

        }
    }
}

class Integer_27 {
    private static final String[] h = {"", "dushanba", "seshanba", "chorshanba", "payshanba", "juma", "shanba", "yakshanba"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 1; i < 366; i++) {
            getDate(i);
        }

    }

    private static void getDate(int i) {

        switch ((i + 5) % 7 + 1) {
            case 1: {
                System.out.println("Yilning " + i + "-kuni " + h[1]);
                break;
            }
            case 2: {
                System.out.println("Yilning " + i + "-kuni " + h[2]);
                break;
            }
            case 3: {
                System.out.println("Yilning " + i + "-kuni " + h[3]);
                break;
            }
            case 4: {
                System.out.println("Yilning " + i + "-kuni " + h[4]);
                break;
            }
            case 5: {
                System.out.println("Yilning " + i + "-kuni " + h[5]);
                break;
            }
            case 6: {
                System.out.println("Yilning " + i + "-kuni " + h[6]);
                break;
            }
            case 7: {
                System.out.println("Yilning " + i + "-kuni " + h[7]);
                break;
            }

        }
    }
}

class Integer_28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, k;

        do {
            System.out.print("Yil kunini kiriting: ");
            k = in.nextInt();
        } while (k > 365 || k < 1);

        do {
            System.out.print("Yilning 1-kuni haftaning qaysi kuniga to'g'ri keladi: ");
            n = in.nextInt();
        } while (n > 7 || n < 1);

        int natija = kun(k, n);

        System.out.println("Yilning " + k + "-kuni haftaning " + nomi(natija) + " kuniga to'g'ri keldi");
    }

    static int kun(int k, int n) {
        return ((k + n - 2) % 7 + 1);
    }

    private static String nomi(int k) {
        String K = "";
        switch (k) {
            case 1: {
                K = "dushanba";
                break;
            }
            case 2: {
                K = "seshanba";
                break;
            }
            case 3: {
                K = "chorshanba";
                break;
            }
            case 4: {
                K = "payshanba";
                break;
            }
            case 5: {
                K = "juma";
                break;
            }
            case 6: {
                K = "shanba";
                break;
            }
            case 7: {
                K = "yakshanba";
            }
        }
        return K;
    }
}

class Integer_29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        int yuza, kvYuza;
        int joylashganQismi, joylashmaganQismi;

        System.out.print("4burchakning a tomoni: ");
        a = in.nextInt();

        System.out.print("4burchakning b tomoni: ");
        b = in.nextInt();

        System.out.print("4burchak ichida joylashgan kvadrat tomoni: ");
        c = in.nextInt();

        kvYuza = c * c;                                         // kvadrat  yuzasi
        yuza = a * b;                                           // 4 burchak yuzasi
        joylashganQismi = yuza / kvYuza;                        // kvadratlar joylashgan qismi soni
        var kvLarYuzasi = joylashganQismi * kvYuza;  // joylashgan kvadratlar jami yuzasi
        joylashmaganQismi = yuza - kvYuza * joylashganQismi;    // kvadratlar joylashmagan qismi yuzasi

        System.out.println("4burchakning yuzasi= " + yuza);
        System.out.println("Kvadrat yuzasi= " + kvYuza);
        System.out.println("Kvadratlar joylashgan qismi yuzasi= " + joylashganQismi);
        System.out.println("Kvadratlar joylashmagan qismi yuzasi= " + joylashmaganQismi);
    }
}

class Integer_30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Yilni kiriting: ");
        var yil = in.nextInt();

        var asr = yil / 100 + 1;

        if (yil >= 0) {
            System.out.println("Milodiy " + yil + "-yil = " + asr + "-asr");
        } else {
            System.out.println("Miloddan oldingi " + Math.abs(yil) + "-yil == " + Math.abs(asr) + "-asr");
        }
        main(args);
    }
}