/**
 * @Project name: JavaDasturlashgaKirishFoundationKursi_Latest
 * @Description:
 * @Author: Leader_PC
 * @Date : 2024-03-05 20:47
 **/

package otabek.oktamjondan;

public class ClassDemo21 {
    public static void main(String[] args) {
//        Scanner in = new Scanner (System.in);
        Demo001 demo001 = new Demo001();
        demo001.set_Text();     // obyekt hosil qilib static emas metodni chaqirish
        Demo001.setText();      // obyekt hosil qilmay static metodni chaqirish
    }
}

class Demo001 {
    public static void setText() {
        System.out.println("Bu Demo001 classining setText static void metodi");
    }

    public void set_Text(){
        System.out.println("Bu Demo001 classining setText void metodi");
    }
}

