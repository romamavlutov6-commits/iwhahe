package practice25;

import java.util.regex.Pattern;

public class Task6 {
    public static boolean isStrongPassword(String input) {
        return Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d_]{8,}$", input);
    }

    public static void main(String[] args) {
        System.out.println(isStrongPassword("F032_Password"));
        System.out.println(isStrongPassword("A007"));
    }
}