package practice22;

public class RPNCalculatorTest {
    public static void main(String[] args) {
        RPNCalculator calc = new RPNCalculator();

        System.out.println("=== Тестирование RPN калькулятора ===");


        try {
            double r = calc.evaluate("2 3 +");
            System.out.println("2 3 + = " + r + " (ожидалось 5)");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            double r = calc.evaluate("5 1 2 + 4 * + 3 -");
            System.out.println("5 1 2 + 4 * + 3 - = " + r + " (ожидалось 14)");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            double r = calc.evaluate("10 3 /");
            System.out.println("10 3 / = " + r + " (ожидалось ~3.333)");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //недостаточно операндов
        try {
            calc.evaluate("2 3 + *");
            System.out.println("ОШИБКА: должно было быть исключение!");
        } catch (Exception e) {
            System.out.println("Правильно: " + e.getMessage());
        }

        //деление на ноль
        try {
            calc.evaluate("5 0 /");
            System.out.println("ОШИБКА: должно было быть исключение!");
        } catch (Exception e) {
            System.out.println("Правильно: " + e.getMessage());
        }

        System.out.println("=== Тестирование завершено ===");
    }
}