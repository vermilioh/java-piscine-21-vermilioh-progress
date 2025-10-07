package ex02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        int coffeeRequest = 0;
        while (number != 42) {
            number = scan.nextInt();
            if (isNumberPrime(sumOfDigits(number))) {
                coffeeRequest++;
            }
        }
        System.out.println("Count of coffee-request – " + coffeeRequest);


    }

    public static int sumOfDigits(int digit) {
        int sum = 0;

        while (digit > 0) {
            sum += digit % 10;
            digit /= 10;
        }

        return sum;
    }

    public static boolean isNumberPrime(int number) {
        if (number != 2) {
            if(number <= 1){
                return false;
            }

            for (int i = 2; i < Math.sqrt(number) + 1; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
