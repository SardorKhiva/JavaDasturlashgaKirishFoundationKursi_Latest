/**
 * @Project name: JavaDasturlashgaKirishFoundationKursi_Latest
 * @Description: Abramyandan tanlash operatori
 * @Author: Leader_PC
 * @Date : 2024-01-16 08:41
 **/

package abramyan.tasks;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        String kunNomi = "";

        System.out.print("Hafta kuni tartib raqamini kiriting: ");
        var hafta = in.nextInt();

        switch (hafta) {
            case 1: {
                kunNomi = "dushanba";
                break;
            }
            case 2: {
                kunNomi = "seshanba";
                break;
            }
            case 3: {
                kunNomi = "chorshanba";
                break;
            }
            case 4: {
                kunNomi = "payshanba";
                break;
            }
            case 5: {
                kunNomi = "juma";
                break;
            }
            case 6: {
                kunNomi = "shanba";
                break;
            }
            case 7: {
                kunNomi = "yakshanba";
                break;
            }
            default: {
                kunNomi = "bunday hafta kuni yo'q";
                break;
            }
        }

        System.out.println(kunNomi);
        main(args);
    }
}

class Switch_02 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        byte baho;
        String str = "";

        System.out.print("Baho: ");
        baho = in.nextByte();

        switch (baho) {
            case 1: {
                str = "yomon";
                break;
            }
            case 2: {
                str = "qoniqarsiz";
                break;
            }
            case 3: {
                str = "qoniqarli";
                break;
            }
            case 4: {
                str = "yaxshi";
                break;
            }
            case 5: {
                str = "a'lo";
                break;
            }
            default: {
                str = "bunday baho yo'q";
            }
        }

        System.out.println(str + '\n');
        main(args);
    }
}

class Switch_03 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        byte oyRaqami = 0;
        String fasl = "";

        System.out.print("Oy tartib raqamini kiriting: ");
        oyRaqami = in.nextByte();

        switch (oyRaqami) {
            case 12:
            case 1:
            case 2: {
                fasl = "qish";
                break;
            }
            case 3:
            case 4:
            case 5: {
                fasl = "bahor";
                break;
            }
            case 6:
            case 7:
            case 8: {
                fasl = "yoz";
                break;
            }
            case 9:
            case 10:
            case 11: {
                fasl = "kuz";
                break;
            }
            default: {
                fasl = "bunday tartib raqamli oy yo'q";
            }
        }

        System.out.println(fasl);
        main(args);
    }
}

class Switch_04 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        byte oyKuni = 0;
        byte oyRaqami = 0;

        System.out.print("Oy raqami: ");
        oyRaqami = in.nextByte();

        switch (oyRaqami) {
            // 31 kunlik oylar: 1, 3, 5, 7, 8, 10, 12
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                oyKuni = 31;
                break;
            }

            // 30 kunlik oylar: 4, 6, 9, 11
            case 4:
            case 6:
            case 9:
            case 11: {
                oyKuni = 30;
                break;
            }

            // 28/29 kunlik oylar: 2
            case 2: {
                oyKuni = 29;
                break;   // 2024 uchun
            }

            default: {
                oyKuni = 0;
            }
        }

        System.out.println(oyRaqami + "-oyda " + oyKuni + " kun bor");
        main(args);
    }
}

class Switch_05 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        char amal;
        double a, b, res = 0;

        System.out.println("son, amal, son, natija");

        System.out.print("a: ");
        a = in.nextDouble();
        System.out.print("Amallar: + * - / % ^: ");
        amal = in.next().charAt(0);
        System.out.print("b: ");
        b = in.nextDouble();

        switch (amal) {
            case '+': {
                res = a + b;
                break;
            }
            case '-': {
                res = a - b;
                break;
            }
            case '*': {
                res = a * b;
                break;
            }
            case '/': {
                res = a / b;
                break;
            }
            case '^': {
                res = Math.pow(a, b);
                break;
            }
            case '%': {
                res = a % b;
                break;
            }
            default: {
                System.out.println("Bunday arifmetik amal yo'q");
            }
        }
        System.out.println("=" + res);
    }
}

class Switch_06 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        byte metr = 0;
        double uzunlik = 0;

        System.out.print("Kesma uzunligi: ");
        uzunlik = in.nextDouble();

        System.out.println("1-detsimetr, 2-km, 3-m, 4-mm, 5-sm");
        System.out.print("Kesma qaysi birlikda o'lchangan: ");
        metr = in.nextByte();

        switch (metr) {
            case 1: {
                uzunlik /= 10;
                break;
            }
            case 2: {
                uzunlik *= 1000;
                break;
            }
            case 3: {
                uzunlik *= 1;
                break;
            }
            case 4: {
                uzunlik /= 1000;
                break;
            }
            case 5: {
                uzunlik /= 100;
                break;
            }
            default: {
                System.out.println("Bunday birlik yo'q");
            }
        }
        System.out.println(" = " + uzunlik + " metr");
        main(args);
    }
}

class Switch_07 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        byte birlik = 0;
        double massa = 0, result = 0;

        System.out.print("Massa: ");
        massa = in.nextDouble();
        System.out.println("1-kg, 2-milligramm, 3-gramm, 4-tonna, 5-sentiner");
        System.out.print("Qaysi birlikda: ");
        birlik = in.nextByte();

        switch (birlik) {
            case 1: {
                result = massa;
                break;
            }
            case 2: {
                result = massa / 1_000_000;
                break;
            }
            case 3: {
                result = massa / 1_000;
                break;
            }
            case 4: {
                result = massa * 1_000;
                break;
            }
            case 5: {
                result = massa * 10;
                break;
            }
            default: {
                System.out.println("Bunday birlik yo'q");
            }
        }

        System.out.println(massa + " = " + result + " kg");
        main(args);
    }
}

class Switch_08 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        int day, month;
        String[] oy = {"yanvar", "fevral", "mart", "aprel", "may", "iyun",
                "iyul", "avgust", "sentyabr", "oktyabr", "noyabr", "dekabr"};
        String oyStr = "";
        System.out.print("Kun: ");
        day = in.nextInt();
        System.out.print("Oy: ");
        month = in.nextInt();

        // kun va oyni to'g'riligini tekshirib qo'yamiz:
        boolean oySoni = (month > 0 && month < 13);
        boolean oy31 = day > 0 && day < 32;
        boolean oy30 = day > 0 && day < 31;
        boolean oy28 = day > 0 && (day < 29);

        switch (month) {
            case 1 -> {
                if (oy31) oyStr = oy[0];
            }

            case 2 -> {
                if (oy28) {
                    oyStr = oy[1];
                } else if (day == 29) {
                    oyStr = oy[1] + " kabisa yil";
                }
            }
            case 3 -> {
                if (oy31)
                    oyStr = oy[2];
            }
            case 4 -> {
                if (oy30)
                    oyStr = oy[3];
            }
            case 5 -> {
                if (oy31)
                    oyStr = oy[4];
            }
            case 6 -> {
                if (oy31)
                    oyStr = oy[5];
            }
            case 7 -> {
                if (oy31)
                    oyStr = oy[6];
            }
            case 8 -> {
                if (oy31)
                    oyStr = oy[7];
            }
            case 9 -> {
                if (oy30)
                    oyStr = oy[8];
            }
            case 10 -> {
                if (oy31)
                    oyStr = oy[9];
            }
            case 11 -> {
                if (oy30)
                    oyStr = oy[10];
            }
            case 12 -> {
                if (oy31)
                    oyStr = oy[11];
            }
        }

        if (oySoni) // agar oy sanasi to'g'ri bo'lsa
        {
            if (oy28) {
                System.out.println(day + "-" + oyStr);
            } else if (oy30) {
                System.out.println(day + "-" + oyStr);
            } else if (oy31) {
                System.out.println(day + "-" + oyStr);
            }
        }

        main(args);
    }

}

class Switch_09 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        int month; // ваш текущий месяц (январь = 1, февраль = 2 и так далее)
        int day; // ваш текущий день

        System.out.print("kun: ");
        day = in.nextInt();
        System.out.print("oy: ");
        month = in.nextInt();

        int daysInMonth = daysInMonth(month);

        if (day < daysInMonth) {
            day++;
        } else {
            day = 1;
            month = (month % 12) + 1;
            // Здесь вы также можете увеличить год, если это необходимо
        }

        System.out.println(day + "." + month);
        main(args);
    }

    private static int daysInMonth(int month) {
        // oyda qancha kun borligini qaytaradi
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28; // Игнорируем високосные года для простоты примера
            default -> -1; // Некорректный месяц
        };

    }
}

class Switch_09_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int day, month, year;

        System.out.print("Kunni kiriting: ");
        day = in.nextInt();
        System.out.print("Oyni kiriting: ");
        month = in.nextInt();
        System.out.print("Yilni kiriting: ");
        year = in.nextInt();

        // agar sana 31.12 bo'lsa keyingi yilga o'tsin:
        if (day == 31 && month == 12) {
            year++;
        }

        day++;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (day > 31) {
                    day = 1;
                    month++;
                }
            }
            case 4, 6, 9, 11 -> {
                if (day > 30) {
                    day = 1;
                    month++;
                }
            }
            case 2 -> {
                if (day > 28) {
                    day = 1;
                    month++;
                }
            }
            default -> System.out.println("Bunday sana qayerda ko'rgansiz?");
        }

        // oy raqami 1 - 12 oraliqda bo'lishi uchun:
        if (month > 12)
            month = (month % 12);

        System.out.println(day + "." + month + "." + year);

        main(args);
    }
}

class Switch_10 {
    public static void main(String[] Sardor) {
        var in = new Scanner(System.in);

        String y;           // yo'nalish;
        String k;         // komanda;

        System.out.println("s-shimol, j-janub, q-sharq, g-g'arb");
        System.out.print("Robotga yo'nalish bering: ");
        y = in.next();  //.charAt(0);

        System.out.println("0-harakatni davom ettir, 1-chapga, 2-o'ngga buril");
        System.out.print("Robotga komanda bering: ");
        k = in.next();

        yunalish(y);
        command(k);
        main(Sardor);   // nshatadiyo odimni yozsom? :)
    }

    private static void yunalish(String y) {
        switch (y) {
            case "s" -> {
                System.out.print("shimolga yo'nalib ");
            }
            case "j" -> {
                System.out.print("janubga yo'nalib");
            }
            case "q" -> {
                System.out.print("sharqqa yo'nalib");
            }
            case "g" -> {
                System.out.print("g'arbga yo'nalib");
            }
        }
        System.out.print(" ");
    }

    private static void command(String k) {
        switch (k) {
            case "0" -> {
                System.out.print("harakatni davom etdi");
            }
            case "1" -> {
                System.out.print("chapga burildi");
            }
            case "2" -> {
                System.out.print("o'ngga burildi");
            }
        }
        System.out.println();
    }
}

class Switch_11 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        char tomon = 's';
        byte komanda = 1;
        boolean tomonOk;
        boolean komandaOk;

        System.out.println("s-shimol, j-janub, q-sharq, g-g'arb");
        System.out.print("Lokator qaysi tomonga qaratilgan: ");
        tomon = in.next().charAt(0);
        System.out.println("0-o'ngga, 1-chapga buril, 2-180gradusga buril");
        komanda = in.nextByte();

        tomonOk = (tomon == 's' || tomon == 'j' || tomon == 'q' || tomon == 'g');
        komandaOk = (komanda == 0 || komanda == 1 || komanda == 2);

        if (komandaOk && tomonOk) {
            System.out.print("Lokator ");
            towards(tomon);
            command(komanda);
        }
        main(args);
    }

    private static void towards(char tomon) {
        switch (tomon) {
            case 's' -> {
                System.out.print("shimolga qarab");
            }
            case 'j' -> {
                System.out.print("janubga qarab");
            }
            case 'q' -> {
                System.out.print("sharqqa qarab");
            }
            case 'g' -> {
                System.out.print("g'arbga qarab");
            }
        }
        System.out.print(" ");  // 2 metod orasida probel
    }

    private static void command(byte komanda) {
        switch (komanda) {
            case 0 -> {
                System.out.print("o'ngga burildi");
            }
            case 1 -> {
                System.out.print("chapga burildi");
            }
            case 2 -> {
                System.out.print("qarama-qarshi tomonga burildi");
            }
        }
        System.out.println();   // new line
    }
}

class Switch_12 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        byte doiraElementi;
        boolean elementOk = false;

        System.out.print("Doira elementini tanlang:\t");
        System.out.println("1-radius, 2-diametr, 3-uzunlik, 4-yuza");
        doiraElementi = in.nextByte();

        // faqat mavjud bo'lgan element tanlanganligini tekshirish:
        elementOk = (doiraElementi == 1 || doiraElementi == 2 || doiraElementi == 3 || doiraElementi == 4);

        if (elementOk) {
            amal(doiraElementi);
        }
        main(args);
    }

    private static void amal(byte doiraElementi) {
        float R = 1;                // radius
        float D = 2 * R;            // diametr
        float L = 2f * 3.14f * R;   // uzunlik
        float S = 3.14f * R * R;    // yuza
        R = D / 2f;

        switch (doiraElementi) {
            case 1 -> {
                System.out.print("Doiraning radiusini kiriting: ");
                R = in.nextFloat();
                System.out.println("Doiraning diametri= " + D);
                System.out.println("Doiraning uzunligi= " + L);
                System.out.println("Doiraning yuzasi= " + S);
            }
            case 2 -> {
                System.out.print("Doiraning diametrini kiriting: ");
                D = in.nextFloat();
                System.out.println("Doiraning radiusi= " + R);
                System.out.println("Doiraning uzunligi= " + L);
                System.out.println("Doiraning yuzasi= " + S);
            }
            case 3 -> {
                System.out.println("Doiraning uzunligini kiriting: ");
                L = in.nextFloat();
                System.out.println("Doiraning yuzasi= " + S);
                System.out.println("Doiraning radiusi= " + R);
                System.out.println("Doiraning diametri= " + D);
            }
            case 4 -> {
                System.out.println("Doiraning yuzasini kiriting: ");
                S = in.nextFloat();
                System.out.println("Doiraning diametri= " + D);
                System.out.println("Doiraning radiusi= " + R);
                System.out.println("Doiraning uzunligi= " + L);
            }
        }
    }
}

        // TODO: switch13 dan 20 gacha ishlash kerak!
class Switch_13 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

    }
}

class Switch_14 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

    }
}

class Switch_15 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

    }
}

class Switch_16 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

    }
}

class Switch_17 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

    }
}

class Switch_18 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

    }
}

class Switch_19 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

    }
}

class Switch_20 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

    }
}