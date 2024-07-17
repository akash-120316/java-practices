
import java.util.*;

class HelloWorld {

    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, num, i;
        System.out.println("enter num");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        for (i = 0; i < num; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
        }

    }
}
