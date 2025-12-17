package practice25;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task2 {
    public static void main(String[] args) {
        String text = "25,98 USD, 1000 RUB, 0,004 EU";
        Pattern pattern = Pattern.compile("\\d+[,\\.]?\\d*\\s*(USD|RUB|EU)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}