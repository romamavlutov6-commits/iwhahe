package practice25;


import java.util.regex.Pattern;

public class Task3 {
    public static boolean hasDigitWithoutPlus(String input) {
        String regex = "\\d(?!\\s*\\+)"; // цифра, после которой НЕТ пробелов и +
        return Pattern.compile(regex).matcher(input).find();
    }

    public static void main(String[] args) {
        System.out.println(hasDigitWithoutPlus("(1 + 8) – 9 / 4"));
        System.out.println(hasDigitWithoutPlus("6 / 5 – 2 * 9"));
    }
}