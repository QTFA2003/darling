package main;


import java.math.BigInteger;
import java.util.Scanner;

class giaiThua {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 1; i <= testCase; i++) {
            int number = scanner.nextInt();
            System.out.println(calculateFactorial(number));
        }
        scanner.close();

    }

    public static BigInteger calculateFactorial(int number) {
        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
