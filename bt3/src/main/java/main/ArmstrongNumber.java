package main;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase; i++) {
            long number = scanner.nextInt();
            if (check(number)) {
                System.out.println(1);
            } else
                System.out.println(0);
        }
        scanner.close();
    }

    public static boolean check(long number) {
        long sum = 0;
        int count = String.valueOf(number).length();
//        long a = number;
        while (number > 0) {
            long temp = number % 10;
            sum = sum + (long)Math.pow(temp, count);
            number = number / 10;
        }
        return sum == number;
    }
}