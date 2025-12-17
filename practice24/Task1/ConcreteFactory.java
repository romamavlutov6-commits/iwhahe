package practice24.Task1;

public class ConcreteFactory implements ComplexAbstractFactory {
    public Complex createComplex() {
        return new Complex(0, 0);
    }

    public Complex createComplex(int real, int imaginary) {
        return new Complex(real, imaginary);
    }
}