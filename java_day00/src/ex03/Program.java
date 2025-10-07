package ex03;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "";
        int numberOfWeek = 0;
        while (!input.equals("42")) {
            input = scan.next();
            int checkNumberOfWeek = scan.nextInt();
            if (checkNumberOfWeek - 1 == numberOfWeek) {
                numberOfWeek++;
                int minScore = 9;
                for (int i = 0; i < 5; i++) {
                    int score = scan.nextInt();
                    if (score < minScore) {
                        minScore = score;
                    }
                }
                System.out.print("Week " + numberOfWeek + " ");
                for (int i = minScore; i != 0; i--) {
                    System.out.print("=");
                }
                System.out.println(">");

            } else {
                System.out.println("IllegalArgument");
                System.exit(-1);
            }
        }
    }
}
