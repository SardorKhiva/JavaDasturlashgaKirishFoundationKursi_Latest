/**
 * @Project name: JavaDasturlashgaKirishFoundationKursi_Latest
 * @Description: har xil tipli massiv
 * @Author: Leader_PC
 * @Date : 2024-01-24 20:25
 **/

package harxil;

import java.util.Arrays;

public class ObjectArrayDemo {
    public static void main(String[] args) {
        Object[] obyekt = new Object[]{"Kitob", 123, 12.23, 12L, 'a'};
        System.out.println(Arrays.toString(obyekt));

        for (Object s: obyekt) {
            System.out.print(s + " ");
        }
    }
}
