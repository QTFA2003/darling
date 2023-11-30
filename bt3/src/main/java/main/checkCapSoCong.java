package main;

import java.util.Scanner;

class checkCapSoCong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int a = 1; a <= t; a++) {
            int n = scanner.nextInt();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextLong();
            }
            if (check(n, arr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }

    private static boolean check(int n, long arr[]) {
        long cong_sai = arr[1] - arr[0];
        for (int i = 2; i < n; i++) {
            if (arr[i] - arr[i - 1] != cong_sai)
                return false;
        }
        return true;
    }
}
