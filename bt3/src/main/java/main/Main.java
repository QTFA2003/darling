package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String fileName = "DATA.in";
        int sum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                sum += sumIntegersInString(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    }

    private static int sumIntegersInString(String input) {
        int sum = 0;
        // Sử dụng regex để tìm và lọc ra các số nguyên
        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            try {
                // Parse từng số và cộng vào tổng
                sum += Integer.parseInt(matcher.group());
            } catch (NumberFormatException e) {
                // Bỏ qua nếu không thể chuyển đổi thành số nguyên
            }
        }
        return sum;
    }
}
