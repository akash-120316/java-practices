
import java.util.*;

class a {

    public static void main(String[] args) {
        int org, num, temp, last, digit = 0, sum = 0;
        Scanner a = new Scanner(System.in);
        org = a.nextInt();

        while (org != 0) {
            last = org % 10;
            sum += last;
            org /= 10;
        }

        System.out.println("sum of digit is: " + sum);
    }
}
