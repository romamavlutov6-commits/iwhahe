package practice25;

import java.util.regex.Pattern;

public class Task1 {
    public static boolean checkString(String input) {
        return Pattern.matches("abcdefghijklmnopqrstuv18340", input);
    }

    public static void main(String[] args) {
        System.out.println(checkString("abcdefghijklmnopqrstuv18340"));
        System.out.println(checkString("abcdefghijklmnossdfasdpqrstuv18340"));
    }
}