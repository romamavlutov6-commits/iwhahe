package practice25;

import java.util.regex.Pattern;

public class Task4 {
    public static boolean isValidDate(String input) {
        return Pattern.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|[2-9][0-9])[0-9][0-9]$", input);
    }

    public static void main(String[] args) {
        System.out.println(isValidDate("29/02/2000"));
        System.out.println(isValidDate("30-04-2003"));
    }
}