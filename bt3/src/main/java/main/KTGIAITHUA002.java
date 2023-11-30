package main;

import java.math.BigInteger;

public class KTGIAITHUA002 {
    public static void main(String[] args) {
        int n = 1; // Số chữ số không liên tiếp ở cuối
        int m = 1; // Số m cần tìm

        while (true) {
            BigInteger factorial = calculateFactorial(m);
            String factorialString = factorial.toString();

            if (!hasConsecutiveDigits(factorialString, n)) {
                System.out.println("Số m nhỏ nhất thỏa mãn điều kiện là: " + m);
                break;
            }

            m++;
        }
    }

    // Hàm tính giai thừa của m
    public static BigInteger calculateFactorial(int m) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= m; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // Hàm kiểm tra xem một chuỗi có chứa n chữ số không liên tiếp ở cuối không
    public static boolean hasConsecutiveDigits(String str, int n) {
        int consecutiveCount = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isDigit(str.charAt(i))) {
                consecutiveCount = 0;
            } else {
                consecutiveCount++;
            }

            if (consecutiveCount == n) {
                return true;
            }
        }
        return false;
    }
}
