
import java.util.*;

class a {

    public static void main(String[] args) {
        int org, num, temp, last, digit = 0, sum = 0;
        Scanner a = new Scanner(System.in);
        num = a.nextInt();
        org = num;
        temp = num;
        while (temp != 0) {
            temp /= 10;
            digit++;
        }
        while (org != 0) {
            last = org % 10;
            sum += Math.pow(last, digit);
            org /= 10;
        }
        if (sum == num) {
            System.out.println("amst"); 
        }else {
            System.out.println("nooamst");
        }
    }
}
