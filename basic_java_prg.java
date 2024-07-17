//Question
//   1.Write a program that calculates the sum of even numbers from 1 to 10 using a while loop.
//   2.Write a program that prints the multiples of 3 from 1 to 30 using a do-while loop.
//   3.Write a program that asks the user to guess a number between 1 and 10. The program should keep asking until the user guesses the correct number using a do-while loop.
//   4.Write a program that checks if a given number is a prime number. The program should keep asking for a number until the user enters a negative number. Use a while loop to keep asking for numbers and if-else statements to check if the number is prime.
//   5.steps to solve last question
//     Use a while loop to repeatedly ask the user for a number.
//     If the user enters a negative number, break the loop.
//     Use if-else statements to check if the entered number is prime.
//     Print the result for each entered number.
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

////1.
        // int sum = 0, a = 0;
        // while (a <= 10) {
        //     if (a % 2 == 0) {
        //         sum += a;
        //     }
        //     a++;
        // }
        // System.out.println(sum);

////2.
        // int i = 1;
        // do {
        //     if (i % 3 == 0) {
        //         System.out.println(i);
        //     }
        //     i++;
        // } while (i <= 30);

//3.
        // int num = 7;
        // Scanner sc = new Scanner(System.in);
        // do {
        //     int guess = sc.nextInt();
        //     if (num == guess) {
        //         System.out.println("congrats");
        //         break;
        //     } else {
        //         System.out.println("try again");
        //     }
        // } while (num != 10000000);

//4.
        // Scanner sc = new Scanner(System.in);
        // while (2 != 3) {
        //     int num = sc.nextInt();
        //     if (num == 2) {
        //         System.out.println("universal");
        //     } else if (num >= 1) {
        //         int m = num / 2;

        //         int flag = 0;
        //         for (int i = 2; i <= m; i++) {
        //             if (num % i == 0) {
        //                 flag = 1;
        //             }
        //         }
        //         if (flag == 1) {
        //             System.out.println("nopeime");
        //         } else {
        //             System.out.println("prime");
        //         }
        //     } else {
        //         break;
        //     }
        // }

//5.
        // Scanner sc = new Scanner(System.in);
        // while (2 != 100) {
        //     int num = sc.nextInt();
        //     if (num >= 0) {
        //         System.out.println(num);
        //     } else {
        //         System.out.println("entered a negative num");
        //         break;
        //     }
        // }
    }
}
