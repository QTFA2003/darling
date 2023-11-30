package main;

import java.io.*;
import java.util.regex.*;

class PasswordValidator {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("config/password.in"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("config/res.out"));
            String line;

            while (null != (line = reader.readLine())) {
                if (isValidPassword(line)) {
                    writer.write("VALID\n");
                } else {
                    writer.write("INVALID\n");
                }
            }

            reader.close();
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8 ) {
            return false;
        }

         //Kiểm tra có ít nhất một chữ in hoa
        if (!Pattern.compile("[A-Z]").matcher(password).find()) {
            return false;
        }

        // Kiểm tra có ít nhất một chữ in thường
        if (!Pattern.compile("[a-z]").matcher(password).find()) {
            return false;
        }

        // Kiểm tra có ít nhất một số
        if (!Pattern.compile("[0-9]").matcher(password).find()) {
            return false;
        }

        // Kiểm tra có ít nhất một kí tự đặc biệt
        if (!Pattern.compile("[!@#$%^&*()-+]").matcher(password).find()) {
            return false;
        }

        // Kiểm tra hai kí tự cạnh nhau không giống nhau
        for (int i = 0; i < password.length() - 1; i++) {
            if (password.charAt(i) == password.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }
}
