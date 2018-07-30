import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sand {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        if (num == 0) {
            System.out.println("10000.00");
        }
        else if (num > 0) {
            for (int n = 1; n <= num; n++){
                int No = in.nextInt();
                list.add(No);
            }
            Collections.sort(list);
            double s = 0;
            double temp = 0;
            s += (list.get(0) - temp) * (list.get(0) - temp) / 2.00;
            temp = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                s += (list.get(i) - temp) * (list.get(i) - temp) / 4.00;
                temp = list.get(i);
            }
            s += (100.00 - list.get(list.size() - 1)) * (100.00 - list.get(list.size() - 1)) / 2.00;
            System.out.println(s);
        }
    }
}
