package main;

import java.util.Scanner;

public class BeautifulNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long testCase = scanner.nextLong();
        for (int i = 1; i <= testCase; i++) {
            long number = scanner.nextLong();
            boolean isBeautifulNumber = checkBeautifulNumber(number);
            if (isBeautifulNumber) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        scanner.close();
    }

    public static boolean checkBeautifulNumber(long number) {
        long sum = 0;

        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum == number;
    }
}

