import java.util.Scanner;

public class n2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int award = 0;
        if (a == b) {
            if (b == c)
                award = 10000 + a * 1000;
            else
                award = 1000 + a * 100;
        } else if (a == c) {
            award = 1000 + a * 100;
        } else if (b == c)
            award = 1000 + b * 100;
        else {
            if (a > award)
                award = a;
            if (b > award)
                award = b;
            if (c > award)
                award = c;
            award *= 100;
        }
        System.out.println(award);

    }
}
