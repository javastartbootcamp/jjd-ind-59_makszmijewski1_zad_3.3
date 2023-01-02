package pl.javastart.task;

public class SampleClass {

    final static double PI = 3.14;

    public boolean isEven(int value) {
        return value % 2 == 0;
    }

    public boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public double circleField(double radius) {
        return radius * radius * PI;
    }

    public int power(int value) {
        return value * value;
    }

}
