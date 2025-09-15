package code;

import java.util.Scanner;

interface CubeCalculator {
    int cube(int n); 
}

public class CubeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CubeCalculator cubeCalc = (int n) -> n * n * n;

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Cube of " + number + " is: " + cubeCalc.cube(number));

        sc.close();
    }
}
