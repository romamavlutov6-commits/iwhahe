package practice25;

import java.util.regex.Pattern;

public class Task5 {
    public static boolean isValidEmail(String input) {
        return Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", input);
    }

    public static void main(String[] args) {
        System.out.println(isValidEmail("user@example.com"));
        System.out.println(isValidEmail("@my.ru"));
    }
}