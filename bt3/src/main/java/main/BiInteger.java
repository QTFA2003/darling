package main;

import java.math.BigInteger;
import java.util.Scanner;

public class BiInteger {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int testCase = sc.nextInt();

            for (int i = 1; i <= testCase; i++) {
                String number1 = sc.next();
                String number2 = sc.next();

                BigInteger bigInteger1 = new BigInteger(number1);
                BigInteger bigInteger2 = new BigInteger(number2);


                System.out.println(bigInteger1.add(bigInteger2));
            }
            sc.close();
    }
}
