
import java.util.*;

class HelloWorld {

    public static void main(String[] args) {
        int fact = 1, i, num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

    }
}
