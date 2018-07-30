import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a <= 1) {
            System.out.println("Is Not Prime");
        } else if (a==2) {
            System.out.println("Is Prime");
        } else {
            for (int n = 2; n < a; n++){
                if (a % n == 0) {
                    System.out.println("Is Not Prime");
                    return;
                }
            }
            System.out.println("Is Prime");
        }
    }
}