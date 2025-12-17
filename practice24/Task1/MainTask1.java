package practice24.Task1;

public class MainTask1 {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();

        Complex c1 = factory.createComplex();
        Complex c2 = factory.createComplex(5, 3);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
    }
}