package practice23.Task3;

import java.util.Scanner;

public class all {
    interface Expression {
        double evaluate(double x);
    }

    static class Const implements Expression {
        private final double value;

        public Const(double value) {
            this.value = value;
        }

        @Override
        public double evaluate(double x) {
            return value;
        }
    }

    static class Variable implements Expression {
        private final String name;

        public Variable(String name) {
            this.name = name;
        }

        @Override
        public double evaluate(double x) {
            return x;
        }
    }

    static abstract class BinaryOperation implements Expression {
        protected final Expression left;
        protected final Expression right;

        public BinaryOperation(Expression left, Expression right) {
            this.left = left;
            this.right = right;
        }
    }

    static class Add extends BinaryOperation {
        public Add(Expression left, Expression right) {
            super(left, right);
        }

        @Override
        public double evaluate(double x) {
            return left.evaluate(x) + right.evaluate(x);
        }
    }

    static class Subtract extends BinaryOperation {
        public Subtract(Expression left, Expression right) {
            super(left, right);
        }

        @Override
        public double evaluate(double x) {
            return left.evaluate(x) - right.evaluate(x);
        }
    }

    static class Multiply extends BinaryOperation {
        public Multiply(Expression left, Expression right) {
            super(left, right);
        }

        @Override
        public double evaluate(double x) {
            return left.evaluate(x) * right.evaluate(x);
        }
    }

    static class Divide extends BinaryOperation {
        public Divide(Expression left, Expression right) {
            super(left, right);
        }

        @Override
        public double evaluate(double x) {
            return left.evaluate(x) / right.evaluate(x);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        scanner.close();

        Expression expr = new Add(
                new Subtract(
                        new Multiply(new Variable("x"), new Variable("x")),
                        new Multiply(new Const(2), new Variable("x"))
                ),
                new Const(1)
        );

        double result = expr.evaluate(x);
        System.out.println("Result: " + result);
    }
}