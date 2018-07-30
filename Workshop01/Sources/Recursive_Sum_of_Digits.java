import java.util.Scanner;

public class Recursive_Sum_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(sod(a));
    }

    public static int sod(int input){
        // String st =  Integer.toString(input);
        int s = 0;
        while (input > 0) {
            s += input % 10;
            input = input / 10;
        }
        if (s < 10) {
            return s;
        }
        else {
            return sod(s);
        }
    }
}
