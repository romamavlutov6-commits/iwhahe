package practice22;

import java.util.*;

public class RPNCalculator {
    private Stack<Double> stack;

    public RPNCalculator() {
        stack = new Stack<>();
    }

    public double evaluate(String expression) {
        stack.clear();
        String[] tokens = expression.split("\\s+");

        for (String token : tokens) {
            if (token.isEmpty()) continue;

            if (isNumber(token)) {
                stack.push(Double.parseDouble(token));
            } else if (isOperator(token)) {
                performOperation(token);
            } else {
                throw new IllegalArgumentException("Неизвестный токен: " + token);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Некорректное выражение");
        }

        return stack.pop();
    }

    public void clear() {
        stack.clear();
    }

    private boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/") ||
                token.equals("^") || token.equals("%");
    }

    private void performOperation(String operator) {
        if (stack.size() < 2) {
            throw new IllegalArgumentException("Недостаточно операндов для операции: " + operator);
        }

        double b = stack.pop();
        double a = stack.pop();
        double result;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) throw new ArithmeticException("Деление на ноль");
                result = a / b;
                break;
            case "^":
                result = Math.pow(a, b);
                break;
            case "%":
                if (b == 0) throw new ArithmeticException("Остаток от деления на ноль");
                result = a % b;
                break;
            default:
                throw new IllegalArgumentException("Неизвестный оператор: " + operator);
        }

        stack.push(result);
    }
}