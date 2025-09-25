package Codechef;
class Calculator {

    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class OverloadTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(10, 20));        // 30
        System.out.println(calc.add(10.5, 20.3));    // 30.8
        System.out.println(calc.add(1, 2, 3));       // 6
    }
}

