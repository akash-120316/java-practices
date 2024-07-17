
import java.util.*;

class A {

    public static void main(String args[]) {
        int num, rev = 0, tem;
        Scanner a = new Scanner(System.in);
        num = a.nextInt();
        while (num != 0) {
            tem = num % 10;
            rev = rev * 10 + tem;
            num /= 10;
        }
        System.out.print(rev);
    }
}
