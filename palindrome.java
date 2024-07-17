
import java.util.*;

class HelloWorld {

    public static void main(String[] args) {
        String str, revstr = "";
        int len, i;
        System.out.println("enter STRING \n");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        len = str.length();
        for (i = str.length() - 1; i >= 0; i--) {
            revstr = revstr + str.charAt(i);
        }

        if (str.toLowerCase().equals(revstr.toLowerCase())) {
            System.out.println("it is palinfroe");
        } else {
            System.out.println("nott");
        }
    }
}
