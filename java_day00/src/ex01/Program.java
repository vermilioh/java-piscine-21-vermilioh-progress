package ex01;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (num <= 1) {
            System.out.print("IllegalArgument");
            System.exit(-1);
        }

        int steps = 0;
        boolean result = true;

        if (num == 2) {
            steps++;
        } else {
            int sqrt = (int) Math.sqrt(num);

            for (int i = 2; i <= sqrt + 1; i++) {
                steps++;
                if (num % i == 0) {
                    result = false;
                    break;

                }
            }
        }

        System.out.print(result + " " + steps);
    }
}
