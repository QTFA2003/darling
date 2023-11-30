package main;

import java.util.Scanner;

public class Time {
    private int second, minute, hour;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private int sum() {
        return  hour * 3600 + minute * 60 + second;
    }

    private void output() {
        System.out.println(hour + " " + minute + " " + second);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Time[] a = new Time[n];
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            a[i] = new Time(h, m, s);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i].sum() > a[j].sum()) {
                    Time tmp  = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            a[i].output();
        }
    }
}
